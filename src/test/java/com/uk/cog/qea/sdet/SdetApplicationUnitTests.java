package com.uk.cog.qea.sdet;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.modelmapper.ModelMapper;

import com.uk.cog.qea.sdet.dto.MemberDTO;
import com.uk.cog.qea.sdet.entity.MemberEntity;
import com.uk.cog.qea.sdet.vo.MemberVO;

public class SdetApplicationUnitTests {

	ModelMapper modelMapper = new ModelMapper();

	@Test
	public void whenConvertMemberVOToMemberDTO_thenCorrect() {
		Date date = new Date();
		MemberVO memberVO = new MemberVO();
		memberVO.setId(Long.valueOf(1));
		memberVO.setFirstName("Thirunavukkarasu");
		memberVO.setLastName("Soundararajan");
		memberVO.setEmailAddress("thiru@test.com");
		memberVO.setMobileNumber("+91 8944789447");
		memberVO.setShortDetails("Java, J2EE, Spring");
		memberVO.setOtherDetails("To see the full stack trace of the errors, re-run Maven with the -e switch");
		memberVO.setCreatedDate(date);
		memberVO.setModifiedDate(date);
		MemberDTO memberDTO = modelMapper.map(memberVO, MemberDTO.class);
		assertEquals(memberVO.getId(), memberDTO.getId());
		assertEquals(memberVO.getFirstName(), memberDTO.getFirstName());
		assertEquals(memberVO.getLastName(), memberDTO.getLastName());
		assertEquals(memberVO.getEmailAddress(), memberDTO.getEmailAddress());
		assertEquals(memberVO.getMobileNumber(), memberDTO.getMobileNumber());
		assertEquals(memberVO.getShortDetails(), memberDTO.getShortDetails());
		assertEquals(memberVO.getOtherDetails(), memberDTO.getOtherDetails());
		assertEquals(memberVO.getCreatedDate(), memberDTO.getCreatedDate());
		assertEquals(memberVO.getModifiedDate(), memberDTO.getModifiedDate());
	}

	@Test
	public void whenConvertMemberDTOToMemberVO_thenCorrect() {
		Date date = new Date();
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(Long.valueOf(1));
		memberDTO.setFirstName("Thirunavukkarasu");
		memberDTO.setLastName("Soundararajan");
		memberDTO.setEmailAddress("thiru@test.com");
		memberDTO.setMobileNumber("+91 8944789447");
		memberDTO.setShortDetails("Java, J2EE, Spring");
		memberDTO.setOtherDetails("To see the full stack trace of the errors, re-run Maven with the -e switch");
		memberDTO.setCreatedDate(date);
		memberDTO.setModifiedDate(date);
		MemberVO memberVO = modelMapper.map(memberDTO, MemberVO.class);
		assertEquals(memberDTO.getId(), memberVO.getId());
		assertEquals(memberDTO.getFirstName(), memberVO.getFirstName());
		assertEquals(memberDTO.getLastName(), memberVO.getLastName());
		assertEquals(memberDTO.getEmailAddress(), memberVO.getEmailAddress());
		assertEquals(memberDTO.getMobileNumber(), memberVO.getMobileNumber());
		assertEquals(memberDTO.getShortDetails(), memberVO.getShortDetails());
		assertEquals(memberDTO.getOtherDetails(), memberVO.getOtherDetails());
		assertEquals(memberDTO.getCreatedDate(), memberVO.getCreatedDate());
		assertEquals(memberDTO.getModifiedDate(), memberVO.getModifiedDate());
	}

	@Test
	public void whenConvertMemberDTOToMemberEntity_thenCorrect() {
		Date date = new Date();
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(Long.valueOf(1));
		memberDTO.setFirstName("Thirunavukkarasu");
		memberDTO.setLastName("Soundararajan");
		memberDTO.setEmailAddress("thiru@test.com");
		memberDTO.setMobileNumber("+91 8944789447");
		memberDTO.setShortDetails("Java, J2EE, Spring");
		memberDTO.setOtherDetails("To see the full stack trace of the errors, re-run Maven with the -e switch");
		memberDTO.setCreatedDate(date);
		memberDTO.setModifiedDate(date);
		MemberEntity memberEntity = modelMapper.map(memberDTO, MemberEntity.class);
		assertEquals(memberDTO.getId(), memberEntity.getId());
		assertEquals(memberDTO.getFirstName(), memberEntity.getFirstName());
		assertEquals(memberDTO.getLastName(), memberEntity.getLastName());
		assertEquals(memberDTO.getEmailAddress(), memberEntity.getEmailAddress());
		assertEquals(memberDTO.getMobileNumber(), memberEntity.getMobileNumber());
		assertEquals(memberDTO.getShortDetails(), memberEntity.getShortDetails());
		assertEquals(memberDTO.getOtherDetails(), memberEntity.getOtherDetails());
		assertEquals(memberDTO.getCreatedDate(), memberEntity.getCreatedDate());
		assertEquals(memberDTO.getModifiedDate(), memberEntity.getModifiedDate());
	}

	@Test
	public void whenConvertMemberEntityToMemberDTO_thenCorrect() {
		Date date = new Date();
		MemberEntity memberEntity = new MemberEntity();
		memberEntity.setId(Long.valueOf(1));
		memberEntity.setFirstName("Thirunavukkarasu");
		memberEntity.setLastName("Soundararajan");
		memberEntity.setEmailAddress("thiru@test.com");
		memberEntity.setMobileNumber("+91 8944789447");
		memberEntity.setShortDetails("Java, J2EE, Spring");
		memberEntity.setOtherDetails("To see the full stack trace of the errors, re-run Maven with the -e switch");
		memberEntity.setCreatedDate(date);
		memberEntity.setModifiedDate(date);
		MemberDTO memberDTO = modelMapper.map(memberEntity, MemberDTO.class);
		assertEquals(memberEntity.getId(), memberDTO.getId());
		assertEquals(memberEntity.getFirstName(), memberDTO.getFirstName());
		assertEquals(memberEntity.getLastName(), memberDTO.getLastName());
		assertEquals(memberEntity.getEmailAddress(), memberDTO.getEmailAddress());
		assertEquals(memberEntity.getMobileNumber(), memberDTO.getMobileNumber());
		assertEquals(memberEntity.getShortDetails(), memberDTO.getShortDetails());
		assertEquals(memberEntity.getOtherDetails(), memberDTO.getOtherDetails());
		assertEquals(memberEntity.getCreatedDate(), memberDTO.getCreatedDate());
		assertEquals(memberEntity.getModifiedDate(), memberDTO.getModifiedDate());
	}
}
