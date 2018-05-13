package com.uk.cog.qea.sdet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uk.cog.qea.sdet.entity.MemberEntity;

@Repository
public interface MemberRepoistery extends JpaRepository<MemberEntity, Long> {

}
