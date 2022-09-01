package com.allstate.speedyclaimsserver.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

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

    @JsonCreator
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

    @Override
    public String toString() {
        return "ClaimNote{" +
                "claimNoteId=" + claimNoteId +
                ", noteText='" + noteText + '\'' +
                ", noteCreatedDateTime=" + noteCreatedDateTime +
                ", createdClaim=" + createdClaim +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClaimNote claimNote = (ClaimNote) o;
        return Objects.equals(claimNoteId, claimNote.claimNoteId) && Objects.equals(noteText, claimNote.noteText) && Objects.equals(noteCreatedDateTime, claimNote.noteCreatedDateTime) && Objects.equals(createdClaim, claimNote.createdClaim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(claimNoteId, noteText, noteCreatedDateTime, createdClaim);
    }
}
