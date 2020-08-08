package com.chatbot.web.member;

import org.springframework.data.jpa.repository.JpaRepository;

interface MemberRepository extends JpaRepository<Member, Long>, IMemberRepository {

}
