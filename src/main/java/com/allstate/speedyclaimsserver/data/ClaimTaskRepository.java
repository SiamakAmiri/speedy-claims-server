package com.allstate.speedyclaimsserver.data;

import com.allstate.speedyclaimsserver.domain.ClaimNote;
import com.allstate.speedyclaimsserver.domain.ClaimTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimTaskRepository extends JpaRepository<ClaimTask, Integer> {

    //public ClaimTask findByName(Integer claimTaskId);
}
