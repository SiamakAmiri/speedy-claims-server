package com.allstate.speedyclaimsserver.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name ="claimtask")
public class ClaimTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="claim_task_id")
    Integer claimTaskId;

    @Column(name="task_text")
    String taskText;

    @Column(name="task_status")
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

    @JsonIgnore
    public Claim getCreatedClaim() {
        return createdClaim;
    }

    public void setCreatedClaim(Claim createdClaim) {
        this.createdClaim = createdClaim;
    }
}
