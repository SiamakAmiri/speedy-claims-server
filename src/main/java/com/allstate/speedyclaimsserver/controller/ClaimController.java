package com.allstate.speedyclaimsserver.controller;

import com.allstate.speedyclaimsserver.domain.Claim;
import com.allstate.speedyclaimsserver.dtos.ClaimDTO;
import com.allstate.speedyclaimsserver.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("/api/claim")
public class ClaimController {

    @Autowired
    private ClaimService claimService;


    @GetMapping()
    public List<ClaimDTO> getAllClaim() {
        return claimService.getAllClaim().stream()
                .map(c -> new ClaimDTO())
                .collect(Collectors.toList());
    }


    @PostMapping
    public Claim newClaim(@RequestBody ClaimDTO claimDTO) {
        return claimService.addClaim(claimDTO);
    }


    @GetMapping()
    public Claim getTheClaim(@RequestParam(value="claimId", required=false) Integer claimId,
                        @RequestParam(value="policyNumber", required=false) Integer policyNumber,
                        @RequestParam(value="surname", required=false) String surname) {
        if (claimId != null) {
            return claimService.getClaimById(claimId);
        }
        else if (policyNumber != null) {
            return claimService.getClaimByPolicyNumber(policyNumber);
        }
        else if (surname != null) {
            return claimService.getClaimBySurname(surname);
        }

        return claimService.getClaimById(claimId);

    }


    @PutMapping("/{claimId}")
    public Claim  updateCLaim(@PathVariable("claimId") Integer claimId,
                                                   @RequestBody Map<String, String> data) {

        return claimService.updateClaim(claimId, data);
    }


}
