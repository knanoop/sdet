package com.uk.cog.qea.sdet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uk.cog.qea.sdet.assembler.vo.dto.MemberAssemblerService;
import com.uk.cog.qea.sdet.dto.MemberDTO;
import com.uk.cog.qea.sdet.service.MemberService;
import com.uk.cog.qea.sdet.util.MemberUtil;
import com.uk.cog.qea.sdet.vo.MemberVO;

@Controller
public class WebController {

	@Autowired
	private MemberService memberService;

	@Autowired
	MemberAssemblerService memberAssembler;

	@Autowired
	MemberUtil memberUtil;

	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}

	@GetMapping("/members")
	public String getMembers(Model model) {
		List<MemberVO> members = memberAssembler.convertToMemberVOList(memberService.findAll());
		model.addAttribute("members", members);
		return "members";
	}

	@GetMapping("/member")
	public String getMembers(@RequestParam("memberId") Long memberId, Model model) {
		if (memberId != 0L) {
			MemberVO memberVO = memberAssembler.convertToMemberVO(memberService.findById(memberId));
			model.addAttribute("member", memberVO);
		} else {
			MemberVO memberVO = new MemberVO();
			memberVO.setId(0l);
			model.addAttribute("member", memberVO);
		}

		return "member";
	}

	@PostMapping("/member")
	public String saveOrUpdate(@ModelAttribute("member") MemberVO memberVO, Model model) {
		MemberDTO memberDTO = memberAssembler.convertToMemberDTO(memberVO);
		memberService.save(memberDTO);
		if (memberVO.getId() != 0L)
			model.addAttribute("message",
					"The details for member "
							+ memberUtil.convertToFullName(memberVO.getFirstName(), memberVO.getLastName())
							+ "has been updated.");
		else
			model.addAttribute("message",
					"The details for the new member "
							+ memberUtil.convertToFullName(memberVO.getFirstName(), memberVO.getLastName())
							+ "has been updated.");
		return "redirect:/members";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("memberId") Long memberId, Model model) {
		memberService.delete(memberId);
		model.addAttribute("message", "The requested details were completely removed. ");
		return "redirect:/members";
	}
}
