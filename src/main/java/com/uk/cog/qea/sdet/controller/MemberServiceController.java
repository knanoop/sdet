package com.uk.cog.qea.sdet.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.uk.cog.qea.sdet.assembler.vo.dto.MemberAssemblerService;
import com.uk.cog.qea.sdet.dto.MemberDTO;
import com.uk.cog.qea.sdet.service.MemberService;
import com.uk.cog.qea.sdet.vo.MemberVO;

@RestController
@RequestMapping("/api")
public class MemberServiceController {

	@Autowired
	private MemberService memberService;
	@Autowired
	MemberAssemblerService memberAssembler;

	@GetMapping("/members")
	public ResponseEntity<List<MemberVO>> getMembers() {

		List<MemberVO> membersVO = memberAssembler.convertToMemberVOList(memberService.findAll());
		if (membersVO.isEmpty()) {
			return new ResponseEntity<List<MemberVO>>(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<MemberVO>>(membersVO, HttpStatus.OK);
	}

	@GetMapping("/members/{id}")
	public ResponseEntity<MemberVO> getMemberById(@PathVariable(value = "id") Long memberId) {
		MemberVO memberVO = memberAssembler.convertToMemberVO(memberService.findById(memberId));
		return new ResponseEntity<MemberVO>(memberVO, HttpStatus.OK);
	}

	@PostMapping("/members")
	public ResponseEntity<MemberVO> createMember(@Valid @RequestBody MemberVO memberVO,
			UriComponentsBuilder uriComponentsBuilder) {
		MemberDTO memberDTO = memberAssembler.convertToMemberDTO(memberVO);
		memberVO = memberAssembler.convertToMemberVO(memberService.save(memberDTO));
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uriComponentsBuilder.path("/members/{id}").buildAndExpand(memberVO.getId()).toUri());
		return new ResponseEntity<MemberVO>(memberVO, headers, HttpStatus.CREATED);
	}

	@PutMapping("/members/{id}")
	public ResponseEntity<MemberVO> updateMember(@PathVariable(value = "id") Long memberId,
			@Valid @RequestBody MemberVO memberVO) {
		MemberDTO memberDTO = memberAssembler.convertToMemberDTO(memberVO);
		memberVO = memberAssembler.convertToMemberVO(memberService.updateMember(memberId, memberDTO));
		return new ResponseEntity<MemberVO>(memberVO, HttpStatus.OK);
	}

	@DeleteMapping("/members/{id}")
	public ResponseEntity<MemberVO> deleteMember(@PathVariable(value = "id") Long memberId) {
		memberService.delete(memberId);
		return new ResponseEntity<MemberVO>(HttpStatus.OK);
	}
}
