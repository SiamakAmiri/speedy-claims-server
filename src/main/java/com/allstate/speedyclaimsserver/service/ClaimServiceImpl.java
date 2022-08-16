package com.allstate.speedyclaimsserver.service;

import com.allstate.speedyclaimsserver.data.ClaimRepository;
import com.allstate.speedyclaimsserver.domain.Claim;
import com.allstate.speedyclaimsserver.dtos.ClaimDTO;
import com.allstate.speedyclaimsserver.exceptions.ClaimNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ClaimServiceImpl implements ClaimService{


    @Autowired
    private ClaimRepository claimRepository;

    Logger logger = LoggerFactory.getLogger(ClaimService.class);

    @Override
    public List<Claim> getAllClaim(){

        System.out.println("Inside ClaimServiceImpl");
        return claimRepository.findAll();
    }

    @Override
    public int countClaims() {
        return claimRepository.findAll().size();
    }

    @Override
    public Claim addClaim(ClaimDTO newClaim) {

        return claimRepository.save(newClaim.toClaim());
    }




    @Override
    public Claim getClaimById(Integer claimId) {

        System.out.println("Inside getClaimById");
        Optional<Claim> optionalClaim =  claimRepository.findById(claimId);

        if (optionalClaim.isPresent()) {
            return optionalClaim.get();
        }

        logger.info("There is no claim with a claim ID of " + claimId);
        throw new ClaimNotFoundException("There is no claim with a claim Id of " + claimId);
    }

    @Override
    public Claim getClaimByPolicyNumber(Integer policyNumber) {
        Optional<Claim> optionalClaim =  claimRepository.findById(policyNumber);

        if (optionalClaim.isPresent()) {
            return optionalClaim.get();
        }

        logger.info("There is no claim with a policy number of " + policyNumber);
        throw new ClaimNotFoundException("There is no claim with a policy number of " + policyNumber);
    }

    @Override
    public Claim getClaimBySurname(String surname) {
        Optional<Claim> optionalClaim = claimRepository.findBySurname(surname);

        if (optionalClaim.isPresent()) {
            return optionalClaim.get();
        }

        logger.info("There is no claim with a surname of " + surname);
        throw new ClaimNotFoundException("There is no claim with a surname of " + surname);
    }


    @Override
    public Claim updateClaim(Integer claimId, Map<String, String> data) {
        Claim claim = getClaimById(claimId);
        if (data.containsKey("firstName")) claim.setFirstName(data.get("firstName"));
        if (data.containsKey("surname")) claim.setSurname(data.get("surname"));
        if (data.containsKey("insuranceType")) claim.setInsuranceType(data.get("insuranceType"));
        if (data.containsKey("propertyAddress")) claim.setPropertyAddress(data.get("propertyAddress"));
        if (data.containsKey("make")) claim.setMake(data.get("make"));
        if (data.containsKey("model")) claim.setModel(data.get("model"));
        if (data.containsKey("year")) claim.setYear(Integer.parseInt(data.get("year")));
        if (data.containsKey("animalType")) claim.setAnimalType(data.get("animalType"));
        if (data.containsKey("animalBreed")) claim.setAnimalBreed(data.get("animalBreed"));
        if (data.containsKey("incidentDate")) claim.setIncidentDate(LocalDate.parse(data.get("incidentDate")));
        if (data.containsKey("incidentAmount")) claim.setIncidentAmount(Double.parseDouble(data.get("incidentAmount")));
        if (data.containsKey("claimReason")) claim.setClaimReason(data.get("claimReason"));
        if (data.containsKey("incidentDescription")) claim.setIncidentDescription(data.get("incidentDescription"));
        if (data.containsKey("claimStatus")) claim.setClaimStatus(data.get("claimStatus"));

        return claimRepository.save(claim);
    }



}
