package com.allstate.speedyclaimsserver.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name ="claimnote")
public class ClaimNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="claim_note_id")
    private Integer claimNoteId;

    @Column(name="note_text")
    private String noteText;

    @Column(name="note_created_date_time")
    private LocalDate noteCreatedDateTime;

    @ManyToOne
    private Claim createdClaim;

    public ClaimNote() {
    }

    public ClaimNote(Integer claimNoteId, String noteText, LocalDate noteCreatedDateTime, Claim createdClaim) {
        this.claimNoteId = claimNoteId;
        this.noteText = noteText;
        this.noteCreatedDateTime = noteCreatedDateTime;
        this.createdClaim = createdClaim;
    }


    public Integer getClaimNoteId() {
        return claimNoteId;
    }

    public void setClaimNoteId(Integer claimNoteId) {
        this.claimNoteId = claimNoteId;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public LocalDate getNoteCreatedDateTime() {
        return noteCreatedDateTime;
    }

    public void setNoteCreatedDateTime(LocalDate noteCreatedDateTime) {
        this.noteCreatedDateTime = noteCreatedDateTime;
    }

    @JsonIgnore
    public Claim getCreatedClaim() {
        return createdClaim;
    }

    public void setCreatedClaim(Claim createdClaim) {
        this.createdClaim = createdClaim;
    }
}
