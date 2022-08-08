package com.allstate.speedyclaimsserver.domain;

import javax.persistence.*;

@Entity
@Table(name ="claimtask")
public class ClaimTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer claimTaskId;

    String taskText;
    String taskStatus;

    @ManyToOne
    Claim createdClaim;

    public ClaimTask() {
    }

    public ClaimTask(Integer claimTaskId, String taskText, String taskStatus, Claim createdClaim) {
        this.claimTaskId = claimTaskId;
        this.taskText = taskText;
        this.taskStatus = taskStatus;
        this.createdClaim = createdClaim;
    }

    public Integer getClaimTaskId() {
        return claimTaskId;
    }

    public void setClaimTaskId(Integer claimTaskId) {
        this.claimTaskId = claimTaskId;
    }

    public String getTaskText() {
        return taskText;
    }

    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Claim getCreatedClaim() {
        return createdClaim;
    }

    public void setCreatedClaim(Claim createdClaim) {
        this.createdClaim = createdClaim;
    }
}
