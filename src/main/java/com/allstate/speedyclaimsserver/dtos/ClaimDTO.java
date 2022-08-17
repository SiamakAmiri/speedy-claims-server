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

    private Integer claimId;
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

    public ClaimDTO(Claim claim) {
        this.claimId = claim.getClaimId();
        this.policyNumber = claim.getPolicyNumber();
        this.firstName = claim.getFirstName();
        this.surname = claim.getSurname();
        this.insuranceType = claim.getInsuranceType();
        this.propertyAddress = claim.getPropertyAddress();
        this.make = claim.getMake();
        this.model = claim.getModel();
        this.year = claim.getYear();
        this.animalType = claim.getAnimalType();
        this.animalBreed = claim.getAnimalBreed();
        this.incidentDate = claim.getIncidentDate();
        this.incidentAmount = claim.getIncidentAmount();
        this.claimReason = claim.getClaimReason();
        this.incidentDescription = claim.getIncidentDescription();
        this.claimStatus = claim.getClaimStatus();
    }

    public Claim toClaim(){

        return new Claim (null, policyNumber, firstName, surname, insuranceType, propertyAddress, make, model, year, animalType, animalBreed, LocalDate.now(), incidentAmount, claimReason, incidentDescription, claimStatus, new ArrayList<>(), new ArrayList<>());
    }

    public Integer getClaimId() {
        return claimId;
    }

    public void setClaimId(Integer claimId) {
        this.claimId = claimId;
    }

    public Integer getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(Integer policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public void setAnimalBreed(String animalBreed) {
        this.animalBreed = animalBreed;
    }

    public LocalDate getIncidentDate() {
        return incidentDate;
    }

    public void setIncidentDate(LocalDate incidentDate) {
        this.incidentDate = incidentDate;
    }

    public double getIncidentAmount() {
        return incidentAmount;
    }

    public void setIncidentAmount(double incidentAmount) {
        this.incidentAmount = incidentAmount;
    }

    public String getClaimReason() {
        return claimReason;
    }

    public void setClaimReason(String claimReason) {
        this.claimReason = claimReason;
    }

    public String getIncidentDescription() {
        return incidentDescription;
    }

    public void setIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }
}
