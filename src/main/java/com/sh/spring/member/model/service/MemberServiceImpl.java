package com.sh.spring.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sh.spring.member.model.dao.MemberDao;
import com.sh.spring.member.model.dto.Member;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired // 의존주입해달라
	private MemberDao memberDao;

	@Override
	public int insertMember(Member member) {
		return memberDao.insertMember(member);
	}
}
