package com.example.demo.repository;

import com.example.demo.model.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long> {
    public List<Claim> findByMember_IdAndClaimDateBefore(Long memberId, Date claimDate);
   
}
