package com.allstate.speedyclaimsserver.data;

import com.allstate.speedyclaimsserver.domain.Claim;
import com.allstate.speedyclaimsserver.domain.ClaimNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimNoteRepository extends JpaRepository<ClaimNote, Integer> {

   // public ClaimNote findByName(Integer claimNoteId);
}
