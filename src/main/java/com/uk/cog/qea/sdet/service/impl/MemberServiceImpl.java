package com.uk.cog.qea.sdet.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.uk.cog.qea.sdet.assembler.dto.entity.MemberAssemblerBusiness;
import com.uk.cog.qea.sdet.dto.MemberDTO;
import com.uk.cog.qea.sdet.entity.MemberEntity;
import com.uk.cog.qea.sdet.exception.ResourceNotFoundException;
import com.uk.cog.qea.sdet.repository.MemberRepoistery;
import com.uk.cog.qea.sdet.service.MemberService;

@Component
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberRepoistery memberRepoistery;
	@Autowired
	MemberAssemblerBusiness memberAssembler;

	@Override
	@Transactional(readOnly = true)
	public List<MemberDTO> findAll() {
		// TODO Auto-generated method stub
		return memberAssembler.convertToMemberDTOList(memberRepoistery.findAll());
	}

	@Override
	@Transactional(readOnly = true)
	public MemberDTO findById(Long memberId) {
		// TODO Auto-generated method stub
		MemberEntity memberEntity = memberRepoistery.findById(memberId)
				.orElseThrow(() -> new ResourceNotFoundException("Member", "id", memberId));
		return memberAssembler.convertToMemberDTO(memberEntity);
	}

	@Override
	@Transactional
	public MemberDTO save(MemberDTO memberDTO) {
		// TODO Auto-generated method stub
		MemberEntity memberEntity = memberAssembler.convertToMemberEntity(memberDTO);
		return memberAssembler.convertToMemberDTO(memberRepoistery.save(memberEntity));
	}

	@Override
	@Transactional
	public MemberDTO updateMember(Long memberId, MemberDTO memberDTO) {
		// TODO Auto-generated method stub
		MemberEntity memberEntity = memberRepoistery.findById(memberId)
				.orElseThrow(() -> new ResourceNotFoundException("Member", "id", memberId));

		memberEntity.setEmailAddress(memberDTO.getEmailAddress());
		memberEntity.setMobileNumber(memberDTO.getMobileNumber());
		memberEntity.setOtherDetails(memberDTO.getOtherDetails());
		memberEntity.setModifiedDate(new Date());

		MemberEntity updatedmemberEntity = memberRepoistery.save(memberEntity);
		return memberAssembler.convertToMemberDTO(updatedmemberEntity);
	}

	@Override
	@Transactional
	public void delete(Long memberId) {
		// TODO Auto-generated method stub
		MemberEntity memberEntity = memberRepoistery.findById(memberId)
				.orElseThrow(() -> new ResourceNotFoundException("Member", "id", memberId));

		memberRepoistery.delete(memberEntity);

		return;
	}
}
