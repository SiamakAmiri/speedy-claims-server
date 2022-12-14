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
    private String title;
    private String firstName;
    private String surname;
    private String type;
    private String propertyAddress;
    private String make;
    private String model;
    private Integer year;
    private String animalType;
    private String animalBreed;
    private LocalDate claimOpenDate;
    private double estimatedValue;
    private String claimReason;
    private String incidentDescription;
    private String claimStatus;
    //private List<ClaimNote> lcn;
    //private List<ClaimTask> lct;


    public ClaimDTO() {
    }

    public ClaimDTO(Claim claim) {
        this.claimId = claim.getClaimId();
        this.policyNumber = claim.getPolicyNumber();
        this.title = claim.getTitle();
        this.firstName = claim.getFirstName();
        this.surname = claim.getSurname();
        this.type = claim.getType();
        this.propertyAddress = claim.getPropertyAddress();
        this.make = claim.getMake();
        this.model = claim.getModel();
        this.year = claim.getYear();
        this.animalType = claim.getAnimalType();
        this.animalBreed = claim.getAnimalBreed();
        this.claimOpenDate = claim.getClaimOpenDate();
        this.estimatedValue = claim.getEstimatedValue();
        this.claimReason = claim.getClaimReason();
        this.incidentDescription = claim.getIncidentDescription();
        this.claimStatus = claim.getClaimStatus();
       // this.lcn = claim.getClaimNoteList();
        //this.lct = claim.getClaimTaskList();

    }

    public Claim toClaim(){

        return new Claim (null, policyNumber, title, firstName, surname, type, propertyAddress, make, model, year, animalType, animalBreed, LocalDate.now(), estimatedValue, claimReason, incidentDescription, claimStatus);
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public LocalDate getClaimOpenDate() {
        return claimOpenDate;
    }

    public void setClaimOpenDate(LocalDate incidentDate) {
        this.claimOpenDate = claimOpenDate;
    }

    public double getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(double estimatedValue) {
        this.estimatedValue = estimatedValue;
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

    /*public List<ClaimNote> getLcn() {
        return lcn;
    }

    public void setLcn(List<ClaimNote> lcn) {
        this.lcn = lcn;
    }

    public List<ClaimTask> getLct() {
        return lct;
    }

    public void setLct(List<ClaimTask> lct) {
        this.lct = lct;
    }*/
}
