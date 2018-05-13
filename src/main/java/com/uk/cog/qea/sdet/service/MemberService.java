package com.uk.cog.qea.sdet.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uk.cog.qea.sdet.dto.MemberDTO;

@Service
public interface MemberService {

	List<MemberDTO> findAll();

	MemberDTO findById(Long memberId);

	MemberDTO save(MemberDTO memberDTO);

	MemberDTO updateMember(Long memberId, MemberDTO memberDTO);

	void delete(Long memberId);

}
