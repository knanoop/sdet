package com.uk.cog.qea.sdet.assembler.dto.entity;

import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import java.lang.reflect.Type;
import org.springframework.beans.factory.annotation.Autowired;

import com.uk.cog.qea.sdet.dto.MemberDTO;
import com.uk.cog.qea.sdet.entity.MemberEntity;

public class MemberAssemblerBusiness {

    @Autowired
    private ModelMapper modelMapper;
    
	public MemberEntity convertToMemberEntity(MemberDTO memberDTO) {
		Date date = new Date();
		MemberEntity memberEntity = modelMapper.map(memberDTO, MemberEntity.class);
		memberEntity.setCreatedDate(date);
		memberEntity.setModifiedDate(date);
		return memberEntity;
	}

	public MemberDTO convertToMemberDTO(MemberEntity memberEntity) {
		MemberDTO memberDTO = modelMapper.map(memberEntity, MemberDTO.class);
		return memberDTO;
	}
	
	public List<MemberEntity> convertToMemberEntityList(List<MemberDTO> memberDTO) {
		Type memberEntityListType = new TypeToken<List<MemberEntity>>() {}.getType();
		List<MemberEntity> memberEntity = modelMapper.map(memberDTO, memberEntityListType);
		return memberEntity;
	}
	
	public List<MemberDTO> convertToMemberDTOList(List<MemberEntity> memberEntity) {
		Type memberDTOListType = new TypeToken<List<MemberDTO>>() {}.getType();
		List<MemberDTO> memberDTO = modelMapper.map(memberEntity, memberDTOListType);
		return memberDTO;
	}
}
