package com.uk.cog.qea.sdet.assembler.vo.dto;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import java.lang.reflect.Type;
import org.springframework.beans.factory.annotation.Autowired;

import com.uk.cog.qea.sdet.dto.MemberDTO;
import com.uk.cog.qea.sdet.vo.MemberVO;

public class MemberAssemblerService {

    @Autowired
    private ModelMapper modelMapper;
    
	public MemberVO convertToMemberVO(MemberDTO memberDTO) {
		MemberVO memberVO = modelMapper.map(memberDTO, MemberVO.class);
		return memberVO;
	}

	public MemberDTO convertToMemberDTO(MemberVO memberVO) {
		MemberDTO memberDTO = modelMapper.map(memberVO, MemberDTO.class);
		return memberDTO;
	}
	
	public List<MemberVO> convertToMemberVOList(List<MemberDTO> memberDTO) {
		Type memberVOListType = new TypeToken<List<MemberVO>>() {}.getType();
		List<MemberVO> memberVO = modelMapper.map(memberDTO, memberVOListType);
		return memberVO;
	}
	
	public List<MemberDTO> convertToMemberDTOList(List<MemberVO> memberVO) {
		Type memberDTOListType = new TypeToken<List<MemberDTO>>() {}.getType();
		List<MemberDTO> memberDTO = modelMapper.map(memberVO, memberDTOListType);
		return memberDTO;
	}
}
