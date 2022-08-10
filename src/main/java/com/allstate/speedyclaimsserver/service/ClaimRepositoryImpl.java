package com.allstate.speedyclaimsserver.service;

import com.allstate.speedyclaimsserver.data.ClaimRepository;
import com.allstate.speedyclaimsserver.domain.Claim;
import com.allstate.speedyclaimsserver.dtos.ClaimDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimRepositoryImpl implements ClaimService{


    @Autowired
    private ClaimRepository claimRepository;

    @Override
    public List<Claim> getAllClaim(){

        return claimRepository.findAll();
    }

    @Override
    public Claim addClaim(ClaimDTO newClaim) {

        return claimRepository.save(newClaim.toClaim());
    }
}
