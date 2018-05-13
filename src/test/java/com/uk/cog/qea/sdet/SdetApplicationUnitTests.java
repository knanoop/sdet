package com.uk.cog.qea.sdet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.uk.cog.qea.sdet.dto.MemberDTO;
import com.uk.cog.qea.sdet.vo.MemberVO;

public class SdetApplicationUnitTests {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
    MemberDTO memberDTO;
	
	@Autowired
	MemberVO memberVO;
	
	
	    @Test
	    public void whenConvertMemberDTOEntityToMemberVO_thenCorrect() {
	    	
	        memberDTO.setId(Long.valueOf(1));
//	        memberDTO.setTitle(randomAlphabetic(6));
//	        memberDTO.setUrl("www.test.com");
	 
	        MemberVO memberVO = modelMapper.map(memberDTO, MemberVO.class);
	        assertEquals(memberDTO.getId(), memberVO.getId());
//	        assertEquals(memberDTO.getTitle(), memberVO.getTitle());
//	        assertEquals(memberDTO.getUrl(), memberVO.getUrl());
	    }
	 
	    @Test
	    public void whenConvertMemberVOToMemberDTOEntity_thenCorrect() {
//	        MemberVO memberVO = new MemberVO();
//	        memberVO.setId(Long.valueOf(1));
//	        memberVO.setTitle(randomAlphabetic(6));
//	        memberVO.setUrl("www.test.com");
//	 
//	        MemberDTO memberDTO = modelMapper.map(memberVO, MemberDTO.class);
//	        assertEquals(memberVO.getId(), memberDTO.getId());
//	        assertEquals(memberVO.getTitle(), memberDTO.getTitle());
//	        assertEquals(memberVO.getUrl(), memberDTO.getUrl());
	    }
}
