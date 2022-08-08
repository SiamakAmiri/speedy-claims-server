package com.allstate.speedyclaimsserver.controller;

import com.allstate.speedyclaimsserver.domain.Claim;
import com.allstate.speedyclaimsserver.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("/api/claim")
public class ClaimController {

    @Autowired
    private ClaimService claimService;


    @GetMapping()
    public List<Claim> getAllClaim() {
        return claimService.getAllClaim().stream()
                .map(c -> new Claim())
                .collect(Collectors.toList());
    }


    @PostMapping
    public Claim newClaim(@RequestBody Claim newClaim) {
        return claimService.addClaim(newClaim);
    }


}
