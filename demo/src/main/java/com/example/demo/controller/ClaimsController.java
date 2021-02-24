package com.example.demo.controller;

import com.example.demo.model.Claim;
import com.example.demo.repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/claims")
public class ClaimsController {

    @Autowired
    ClaimRepository claimRepository;

    //test query: localhost:8080/claims/1?before=01/01/2006
    @GetMapping(value = "/{id}")
    public ResponseEntity<List<Claim>> getClaimsByMemberBefore(@PathVariable Long id, @RequestParam(value = "before", required = false) Date before) {
        if (before == null)
            before = new Date();
        List<Claim> claims = claimRepository.findByMember_IdAndClaimDateBefore(id, before);
        return ResponseEntity.ok(claims);
    }

}
