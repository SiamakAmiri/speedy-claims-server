package com.allstate.speedyclaimsserver.service;

import com.allstate.speedyclaimsserver.domain.Claim;
import com.allstate.speedyclaimsserver.dtos.ClaimDTO;

import java.util.List;
import java.util.Map;

public interface ClaimService {

    List<Claim> getAllClaim();
    int countClaims();
    Claim addClaim(ClaimDTO newClaim);
    Claim getClaimById(Integer claimId);
    Claim getClaimByPolicyNumber(Integer policyNumber);
    Claim getClaimBySurname(String surname);
    Claim updateClaim(Integer id, Map<String,String> data);
    Claim deleteClaimById(Integer claimId);

}
