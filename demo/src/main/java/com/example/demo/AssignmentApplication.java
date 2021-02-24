package com.example.demo;

import com.example.demo.model.Claim;
import com.example.demo.model.Member;
import com.example.demo.repository.ClaimRepository;
import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class AssignmentApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AssignmentApplication.class, args);
    }

    @Autowired
    ClaimRepository claimRepository;
    @Autowired
    MemberRepository memberRepository;

    @Override
    public void run(String... args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Member member1 = new Member(sdf.parse("01-01-2002"), "Jane", "Doe");
        Member member2 = new Member(sdf.parse("01-01-2002"), "John", "Doe");
        memberRepository.save(member1);
        memberRepository.save(member2);
        claimRepository.save(new Claim(sdf.parse("01-01-2003"), 700, member1));
        claimRepository.save(new Claim(sdf.parse("01-02-2004"), 5400, member1));
        claimRepository.save(new Claim(sdf.parse("01-03-2005"), 800, member1));
        claimRepository.save(new Claim(sdf.parse("01-04-2006"), 100, member1));
        claimRepository.save(new Claim(sdf.parse("01-05-2003"), 200, member2));
        claimRepository.save(new Claim(sdf.parse("01-06-2004"), 1500, member2));
    }
}
