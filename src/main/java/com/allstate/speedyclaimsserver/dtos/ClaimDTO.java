package com.allstate.speedyclaimsserver.dtos;

import com.allstate.speedyclaimsserver.domain.Claim;
import com.allstate.speedyclaimsserver.domain.ClaimNote;
import com.allstate.speedyclaimsserver.domain.ClaimTask;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClaimDTO {

    private Integer policyNumber;
    private String firstName;
    private String surname;
    private String insuranceType;
    private String propertyAddress;
    private String make;
    private String model;
    private Integer year;
    private String animalType;
    private String animalBreed;
    private LocalDate incidentDate;
    private double incidentAmount;
    private String claimReason;
    private String incidentDescription;
    private String claimStatus;


    public ClaimDTO() {
    }

    public ClaimDTO(Integer policyNumber, String firstName, String surname, String insuranceType, String propertyAddress, String make, String model, Integer year, String animalType, String animalBreed, LocalDate incidentDate, double incidentAmount, String claimReason, String incidentDescription, String claimStatus) {
        this.policyNumber = policyNumber;
        this.firstName = firstName;
        this.surname = surname;
        this.insuranceType = insuranceType;
        this.propertyAddress = propertyAddress;
        this.make = make;
        this.model = model;
        this.year = year;
        this.animalType = animalType;
        this.animalBreed = animalBreed;
        this.incidentDate = incidentDate;
        this.incidentAmount = incidentAmount;
        this.claimReason = claimReason;
        this.incidentDescription = incidentDescription;
        this.claimStatus = claimStatus;
    }

    public Claim toClaim(){

        return new Claim (null, policyNumber, firstName, surname, insuranceType, propertyAddress, make, model, year, animalType, animalBreed, LocalDate.now(), incidentAmount, claimReason, incidentDescription, claimStatus, new ArrayList<>(), new ArrayList<>());
    }
}
