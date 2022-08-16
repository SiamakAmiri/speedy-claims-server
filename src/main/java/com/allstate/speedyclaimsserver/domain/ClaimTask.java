package com.allstate.speedyclaimsserver.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "ClaimTask{" +
                "claimTaskId=" + claimTaskId +
                ", taskText='" + taskText + '\'' +
                ", taskStatus='" + taskStatus + '\'' +
                ", createdClaim=" + createdClaim +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClaimTask claimTask = (ClaimTask) o;
        return Objects.equals(claimTaskId, claimTask.claimTaskId) && Objects.equals(taskText, claimTask.taskText) && Objects.equals(taskStatus, claimTask.taskStatus) && Objects.equals(createdClaim, claimTask.createdClaim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(claimTaskId, taskText, taskStatus, createdClaim);
    }
}
