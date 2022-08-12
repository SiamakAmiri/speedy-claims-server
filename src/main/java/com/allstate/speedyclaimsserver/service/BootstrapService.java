package com.allstate.speedyclaimsserver.service;

import com.allstate.speedyclaimsserver.data.ClaimNoteRepository;
import com.allstate.speedyclaimsserver.data.ClaimRepository;
import com.allstate.speedyclaimsserver.data.ClaimTaskRepository;
import com.allstate.speedyclaimsserver.domain.Claim;
import com.allstate.speedyclaimsserver.domain.ClaimNote;
import com.allstate.speedyclaimsserver.domain.ClaimTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class BootstrapService {

    @Autowired
    ClaimRepository claimRepository;

    @Autowired
    ClaimNoteRepository claimNoteRepository;

    @Autowired
    ClaimTaskRepository claimTaskRepository;

    @PostConstruct
    public void inititalizeData() {

        claimRepository.deleteAll();

        if(claimRepository.findAll().size() == 0) {


            Claim claim1 = new Claim(null, 3281, "Simon", "Smith", "motor", "", "Nissan", "Juke", 2018, "", "", LocalDate.now(), 400.00, "backed into lamp post", "claimed that the lamp post wasn't there the last time they looked", "new", null, null );
            Claim claim2 = new Claim(null, 4406, "Jane", "Jones", "pet", "", "", "", 0000, "dog", "Border collie", LocalDate.now(), 260.00, "cut on front left paw", "", "paid", null, null );

            ClaimNote claimNote1 = new ClaimNote(null, "Claim Note Text 1", LocalDate.now(), claim1);
            ClaimNote claimNote2 = new ClaimNote(null, "Claim Note Text 2", LocalDate.now(), claim2);

            ClaimTask claimTask1 = new ClaimTask(null, "Claim Task Text 1", "Open", claim1);
            ClaimTask claimTask2 = new ClaimTask(null, "Claim Task Text 2", "Open", claim2);

            List<ClaimNote> claimNoteList1 = new ArrayList<>();
            claimNoteList1.add(claimNote1);
            claim1.setClaimNoteList(claimNoteList1);

            List<ClaimTask> claimTaskList1 = new ArrayList<>();
            claimTaskList1.add(claimTask1);
            claim1.setClaimTaskList(claimTaskList1);


            List<ClaimNote> claimNoteList2 = new ArrayList<>();
            claimNoteList2.add(claimNote2);
            claim2.setClaimNoteList(claimNoteList2);

            List<ClaimTask> claimTaskList2 = new ArrayList<>();
            claimTaskList2.add(claimTask2);
            claim2.setClaimTaskList(claimTaskList2);

            claimRepository.save(claim1);
            claimRepository.save(claim2);

        }
    }

}
