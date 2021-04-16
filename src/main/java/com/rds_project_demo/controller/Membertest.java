package com.rds_project_demo.controller;

import com.rds_project_demo.Member.Member;
import com.rds_project_demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RequestMapping("/member")
@RestController
public class Membertest {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/select") // READ
    public List<Member> selectAll(){
        return memberRepository.findAll();
}
    @GetMapping("/select/{id}") // READ
    public Member selectOne(@PathVariable("id") long id){
        return memberRepository.findById(id).orElse(null);
    }

    int intParser(String age){
        try{
            return Integer.parseInt(age);
        } catch(ClassCastException e){
            e.printStackTrace();
            return 0;
        }
    }
}
