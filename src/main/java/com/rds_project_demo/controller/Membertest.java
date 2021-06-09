package com.rds_project_demo.controller;

import com.rds_project_demo.Member.Member;
import com.rds_project_demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/barcode")
public class Membertest {

    @Autowired
    private MemberRepository memberRepository;

    @CrossOrigin(origins="*")
    @GetMapping("/select") // READ
    public List<Member> selectAll(){
        return memberRepository.findAll();
}

//    @GetMapping("/select/{id}/{age}") // READ
//    public Member selecttwo(@PathVariable("id") long id,@PathVariable("age") int age){
//        return (Member) memberRepository.findByIdAndAge(age,id);
//    }


//    @CrossOrigin(origins="*")
    @PostMapping("/{barcode}") // READ
    @ResponseBody
public List<Member> selectOne(@PathVariable("barcode") String barcode){
        return memberRepository.findBybarcode(barcode);
    }



//
//    @CrossOrigin(origins="*")
//    @GetMapping("/select/{months}") // READ
//    public List<Member> selectOne(@PathVariable("months") int months){
//        return memberRepository.findByMonths(months);
//    }
//


    int intParser(String age){
        try{
            return Integer.parseInt(age);
        } catch(ClassCastException e){
            e.printStackTrace();
            return 0;
        }
    }
}
