package com.allstate.speedyclaimsserver.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name ="claim")
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="claim_id")
    private Integer claimId;

    @Column(name="policy_number")
    private Integer policyNumber;

    @Column(name="title")
    private String title;

    @Column(name="first_name")
    private String firstName;


    private String surname;

    @Column(name="type")
    private String type;

    @Column(name="property_address")
    private String propertyAddress;

    private String make;
    private String model;
    private Integer year;

    @Column(name="animal_type")
    private String animalType;

    @Column(name="animal_breed")
    private String animalBreed;

    @Column(name="claim_open_date")
    private LocalDate claimOpenDate;

    @Column(name="estimated_value")
    private Double estimatedValue;

    @Column(name="claim_reason")
    private String claimReason;

    @Column(name="incident_description")
    private String incidentDescription;

    @Column(name="claim_status")
    private String claimStatus;

   /* @OneToMany(cascade = CascadeType.ALL)
    List<ClaimNote> claimNoteList;

    @OneToMany(cascade = CascadeType.ALL)
    List<ClaimTask> claimTaskList;*/


    public Claim() {
    }

    public Claim(Integer claimId, Integer policyNumber, String title, String firstName, String surname, String type, String propertyAddress, String make, String model, Integer year, String animalType, String animalBreed, LocalDate claimOpenDate, Double estimatedValue, String claimReason, String incidentDescription, String claimStatus) {
        this.claimId = claimId;
        this.policyNumber = policyNumber;
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
        this.type = type;
        this.propertyAddress = propertyAddress;
        this.make = make;
        this.model = model;
        this.year = year;
        this.animalType = animalType;
        this.animalBreed = animalBreed;
        this.claimOpenDate = claimOpenDate;
        this.estimatedValue = estimatedValue;
        this.claimReason = claimReason;
        this.incidentDescription = incidentDescription;
        this.claimStatus = claimStatus;
        //this.claimNoteList = claimNoteList;
        //this.claimTaskList = claimTaskList;
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

    public void setClaimOpenDate(LocalDate claimOpenDate) {
        this.claimOpenDate = claimOpenDate;
    }

    public Double getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(Double estimatedValue) {
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



    @Override
    public String toString() {
        return "Claim{" +
                "claimId=" + claimId +
                ", policyNumber=" + policyNumber +
                ", title='" + title + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", type='" + type + '\'' +
                ", propertyAddress='" + propertyAddress + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", animalType='" + animalType + '\'' +
                ", animalBreed='" + animalBreed + '\'' +
                ", claimOpenDate=" + claimOpenDate +
                ", estimatedValue=" + estimatedValue +
                ", claimReason='" + claimReason + '\'' +
                ", incidentDescription='" + incidentDescription + '\'' +
                ", claimStatus='" + claimStatus + '\'' +
              '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Claim claim = (Claim) o;
        return Objects.equals(claimId, claim.claimId) && Objects.equals(policyNumber, claim.policyNumber) && Objects.equals(title, claim.title) && Objects.equals(firstName, claim.firstName) && Objects.equals(surname, claim.surname) && Objects.equals(type, claim.type) && Objects.equals(propertyAddress, claim.propertyAddress) && Objects.equals(make, claim.make) && Objects.equals(model, claim.model) && Objects.equals(year, claim.year) && Objects.equals(animalType, claim.animalType) && Objects.equals(animalBreed, claim.animalBreed) && Objects.equals(claimOpenDate, claim.claimOpenDate) && Objects.equals(estimatedValue, claim.estimatedValue) && Objects.equals(claimReason, claim.claimReason) && Objects.equals(incidentDescription, claim.incidentDescription) && Objects.equals(claimStatus, claim.claimStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(claimId, policyNumber, title, firstName, surname, type, propertyAddress, make, model, year, animalType, animalBreed, claimOpenDate, estimatedValue, claimReason, incidentDescription, claimStatus);
    }
}
