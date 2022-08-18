package com.allstate.speedyclaimsserver.controller;

import com.allstate.speedyclaimsserver.domain.Claim;
import com.allstate.speedyclaimsserver.dtos.ClaimDTO;
import com.allstate.speedyclaimsserver.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("/api/claim")
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    public List<ClaimDTO> getAllClaim() {
        System.out.println("Inside ClaimController.getAllClaim");
        return claimService.getAllClaim().stream()
                .map(c -> new ClaimDTO(c))
                .collect(Collectors.toList());
    }



    @GetMapping("/volume")
    public Map<String, String> getNumberOfClaims() {
        System.out.println("Inside ClaimController.getNumberOfClaims");
        Integer volume = claimService.countClaims();
        Map<String, String> results = new HashMap<>();
        results.put("volume", volume.toString());
        return results;
    }


    @GetMapping(value ="/{id}", produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public Claim getById(@PathVariable("id") Integer id) {
        return claimService.getClaimById(id);
    }




/*
    @GetMapping(value ="/{surname}", produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public Claim getBySurname(@PathVariable("surname") String surname) {
        return claimService.getClaimBySurname(surname);
    }*/





   @PostMapping
    public Claim newClaim(@RequestBody ClaimDTO claimDTO) {
        return claimService.addClaim(claimDTO);
    }



    @GetMapping()
    public Object getTheClaim(@RequestParam(value="claimId", required=false) Integer claimId,
                        @RequestParam(value="policyNumber", required=false) Integer policyNumber,
                        @RequestParam(value="surname", required=false) String surname) {
        if (claimId != null) {
            return claimService.getClaimById(claimId);
        }
        else if (policyNumber != null) {
            System.out.println("Inside ClaimController.policyNumber");
            return claimService.getClaimByPolicyNumber(policyNumber);
        }
        else if (surname != null) {
            return claimService.getClaimBySurname(surname);
        }

        return getAllClaim(); // claimService.getAllClaim();

    }

    @PutMapping("/{claimId}")
    public Claim  updateCLaim(@PathVariable("claimId") Integer claimId,
                                                   @RequestBody Map<String, String> data) {

        return claimService.updateClaim(claimId, data);
    }


    @DeleteMapping("/{claimId}")
    public Claim  deleteCLaim(@PathVariable("claimId") Integer claimId,
                              @RequestBody Map<String, String> data) {

        return claimService.deleteClaimById(claimId);
    }


}
