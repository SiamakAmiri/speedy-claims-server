package com.allstate.speedyclaimsserver.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="claim")
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToMany(cascade = CascadeType.ALL)
    List<ClaimNote> claimNoteList;

    @OneToMany(cascade = CascadeType.ALL)
    List<ClaimTask> claimTaskList;


    public Claim() {
    }

    public Claim(Integer claimId, Integer policyNumber, String firstName, String surname, String insuranceType, String propertyAddress, String make, String model, Integer year, String animalType, String animalBreed, LocalDate incidentDate, double incidentAmount, String claimReason, String incidentDescription, String claimStatus, List<ClaimNote> claimNoteList, List<ClaimTask> claimTaskList) {
        this.claimId = claimId;
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
        this.claimNoteList = claimNoteList;
        this.claimTaskList = claimTaskList;
    }






}
