package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "Claim")
@Entity
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date claimDate;
    private double claimAmount;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MEMBER_ID")
    private Member member;


    public Claim(Date claimDate, double claimAmount, Member member) {
        this.claimDate = claimDate;
        this.claimAmount = claimAmount;
        this.member = member;
    }
    public Claim(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
