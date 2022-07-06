package com.example.hellospring.repository;

import com.example.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //JpaRepository make a SQL Query like [ select m from Member m where m.name = ? ]
    //For example, findByEmail(), findByNumber()...
    //Paging
    @Override
    Optional<Member> findByName(String name);

}
