package com.allstate.speedyclaimsserver.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="claimnote")
public class ClaimNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer claimNoteId;

    String noteText;
    Date noteCreatedDateTime;

    @ManyToOne
    Claim createdClaim;

    public ClaimNote() {
    }

    public ClaimNote(Integer claimNoteId, String noteText, Date noteCreatedDateTime, Claim createdClaim) {
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

    public Date getNoteCreatedDateTime() {
        return noteCreatedDateTime;
    }

    public void setNoteCreatedDateTime(Date noteCreatedDateTime) {
        this.noteCreatedDateTime = noteCreatedDateTime;
    }

    public Claim getCreatedClaim() {
        return createdClaim;
    }

    public void setCreatedClaim(Claim createdClaim) {
        this.createdClaim = createdClaim;
    }
}
