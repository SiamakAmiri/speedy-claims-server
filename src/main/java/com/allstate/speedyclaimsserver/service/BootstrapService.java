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


            // ===============================================================

            Claim claim1 = new Claim(null, 3281, "Mr", "Simon", "Smith", "motor", "", "Nissan", "Juke", 2018, "", "", LocalDate.of(2022, 05, 19), 400.00, "backed into lamp post", "claimed that the lamp post wasn't there the last time they looked", "new");
            //ClaimNote claimNote1 = new ClaimNote(null, "Motor: Claim Note Text 1", LocalDate.now(), claim1);
            //ClaimTask claimTask1 = new ClaimTask(null, "Motor: Claim Task Text 1", "Open", claim1);

            List<ClaimNote> claimNoteList1 = new ArrayList<>();
           // claimNoteList1.add(claimNote1);
            //claim1.setClaimNoteList(claimNoteList1);

            List<ClaimTask> claimTaskList1 = new ArrayList<>();
            //claimTaskList1.add(claimTask1);
            //claim1.setClaimTaskList(claimTaskList1);

            claimRepository.save(claim1);

            // ===============================================================

            Claim claim2 = new Claim(null, 4406, "Mrs", "Jane", "Jones", "pet", "", "", "", 0000, "dog", "Border collie", LocalDate.of(2022, 05, 20), 260.00, "cut on front left paw", "", "paid");
            //ClaimNote claimNote2 = new ClaimNote(null, "Pet: Claim Note Text 2", LocalDate.now(), claim2);
            //ClaimTask claimTask2 = new ClaimTask(null, "Pet: Claim Task Text 2", "Open", claim2);

            List<ClaimNote> claimNoteList2 = new ArrayList<>();
            //claimNoteList2.add(claimNote2);
            //claim2.setClaimNoteList(claimNoteList2);

            List<ClaimTask> claimTaskList2 = new ArrayList<>();
            //claimTaskList2.add(claimTask2);
            //claim2.setClaimTaskList(claimTaskList2);

            claimRepository.save(claim2);

            // ===============================================================

            Claim claim3 = new Claim(null, 9191, "Dr", "Geraldine", "Green", "motor", "", "Citroen", "Berlingo", 2021, "", "", LocalDate.of(2022, 05, 20), 380.00, "skidded on ice", "Had been snowing all morning", "rejected");
            //ClaimNote claimNote3 = new ClaimNote(null, "Motor: Claim Note Text 3", LocalDate.now(), claim3);
            //ClaimTask claimTask3 = new ClaimTask(null, "Motor: Claim Task Text 3", "Closed", claim3);

            List<ClaimNote> claimNoteList3 = new ArrayList<>();
            //claimNoteList3.add(claimNote3);
            //claim3.setClaimNoteList(claimNoteList3);

            List<ClaimTask> claimTaskList3 = new ArrayList<>();
            //claimTaskList3.add(claimTask3);
            //claim3.setClaimTaskList(claimTaskList3);

            claimRepository.save(claim3);

            // ===============================================================

            Claim claim4 = new Claim(null, 1200, "Prof.", "Clive", "Cole", "property", "", "", "", 0000, "", "", LocalDate.of(2022, 05, 21), 200.00, "damage from flood", "15 Acacia Avenue, Sometown", "open");
            //ClaimNote claimNote3 = new ClaimNote(null, "Motor: Claim Note Text 3", LocalDate.now(), claim3);
            //ClaimTask claimTask3 = new ClaimTask(null, "Motor: Claim Task Text 3", "Closed", claim3);

            List<ClaimNote> claimNoteList4 = new ArrayList<>();
            //claimNoteList3.add(claimNote3);
            //claim3.setClaimNoteList(claimNoteList3);

            List<ClaimTask> claimTaskList4 = new ArrayList<>();
            //claimTaskList3.add(claimTask3);
            //claim3.setClaimTaskList(claimTaskList3);

            claimRepository.save(claim4);

            // ===============================================================
            Claim claim5 = new Claim(null, 1655, "Miss.", "Wanda", "Web", "property", "27 Summer View, Differentown", "", "", 0000, "", "", LocalDate.of(2022, 05, 22), 300.00, "window broken by neighbour's child playing football", "15 Acacia Avenue, Sometown", "rejected");
            //ClaimNote claimNote3 = new ClaimNote(null, "Motor: Claim Note Text 3", LocalDate.now(), claim3);
            //ClaimTask claimTask3 = new ClaimTask(null, "Motor: Claim Task Text 3", "Closed", claim3);

            List<ClaimNote> claimNoteList5 = new ArrayList<>();
            //claimNoteList3.add(claimNote3);
            //claim3.setClaimNoteList(claimNoteList3);

            List<ClaimTask> claimTaskList5 = new ArrayList<>();
            //claimTaskList3.add(claimTask3);
            //claim3.setClaimTaskList(claimTaskList3);

            claimRepository.save(claim5);

            // ===============================================================
            Claim claim6 = new Claim(null, 3282, "Mr", "Simona", "Smith", "motor", "", "Nissan", "Juke", 2018, "", "", LocalDate.of(2022, 05, 19), 400.00, "backed into lamp post", "claimed that the lamp post wasn't there the last time they looked", "new");
            //ClaimNote claimNote3 = new ClaimNote(null, "Motor: Claim Note Text 3", LocalDate.now(), claim3);
            //ClaimTask claimTask3 = new ClaimTask(null, "Motor: Claim Task Text 3", "Closed", claim3);

            List<ClaimNote> claimNoteList6 = new ArrayList<>();
            //claimNoteList3.add(claimNote3);
            //claim3.setClaimNoteList(claimNoteList3);

            List<ClaimTask> claimTaskList6 = new ArrayList<>();
            //claimTaskList3.add(claimTask3);
            //claim3.setClaimTaskList(claimTaskList3);

            claimRepository.save(claim6);

            // ===============================================================
            Claim claim7 = new Claim(null, 4407, "Mrs", "Lisa", "King", "pet", "", "", "", 0000, "dog", "Border collie", LocalDate.of(2022, 05, 20), 240.00, "cut on front left paw", "claimed that the lamp post wasn't there the last time they looked", "paid");
            //ClaimNote claimNote3 = new ClaimNote(null, "Motor: Claim Note Text 3", LocalDate.now(), claim3);
            //ClaimTask claimTask3 = new ClaimTask(null, "Motor: Claim Task Text 3", "Closed", claim3);

            List<ClaimNote> claimNoteList7 = new ArrayList<>();
            //claimNoteList3.add(claimNote3);
            //claim3.setClaimNoteList(claimNoteList3);

            List<ClaimTask> claimTaskList7 = new ArrayList<>();
            //claimTaskList3.add(claimTask3);
            //claim3.setClaimTaskList(claimTaskList3);

            claimRepository.save(claim7);

            // ===============================================================
            Claim claim8 = new Claim(null, 9192, "Dr", "Emma", "Hamilton", "motor", "", "Citroen", "Berlingo", 2021, "", "", LocalDate.of(2022, 05, 20), 380.00, "skidded on ice", "Had been snowing all morning", "rejected");
            //ClaimNote claimNote3 = new ClaimNote(null, "Motor: Claim Note Text 3", LocalDate.now(), claim3);
            //ClaimTask claimTask3 = new ClaimTask(null, "Motor: Claim Task Text 3", "Closed", claim3);

            List<ClaimNote> claimNoteList8 = new ArrayList<>();
            //claimNoteList3.add(claimNote3);
            //claim3.setClaimNoteList(claimNoteList3);

            List<ClaimTask> claimTaskList8 = new ArrayList<>();
            //claimTaskList3.add(claimTask3);
            //claim3.setClaimTaskList(claimTaskList3);

            claimRepository.save(claim8);

            // ===============================================================

            Claim claim9 = new Claim(null, 1201, "Prof.", "Peter", "Brown", "property", "15 Acacia Avenue, Sometown", "", "", 0000, "", "", LocalDate.of(2022, 05, 21), 200.00, "damage from flood", "Had been snowing all morning", "open");
            //ClaimNote claimNote3 = new ClaimNote(null, "Motor: Claim Note Text 3", LocalDate.now(), claim3);
            //ClaimTask claimTask3 = new ClaimTask(null, "Motor: Claim Task Text 3", "Closed", claim3);

            List<ClaimNote> claimNoteList9 = new ArrayList<>();
            //claimNoteList3.add(claimNote3);
            //claim3.setClaimNoteList(claimNoteList3);

            List<ClaimTask> claimTaskList9 = new ArrayList<>();
            //claimTaskList3.add(claimTask3);
            //claim3.setClaimTaskList(claimTaskList3);

            claimRepository.save(claim9);

            // ===============================================================

            Claim claim10 = new Claim(null, 1656, "Miss", "Wanda", "Web", "property", "27 Summer View, Differentown", "", "", 0000, "", "", LocalDate.of(2022, 05, 21), 300.00, "window broken by neighbour's child playing football", "Had been snowing all morning", "rejected");
            //ClaimNote claimNote3 = new ClaimNote(null, "Motor: Claim Note Text 3", LocalDate.now(), claim3);
            //ClaimTask claimTask3 = new ClaimTask(null, "Motor: Claim Task Text 3", "Closed", claim3);

            List<ClaimNote> claimNoteList10 = new ArrayList<>();
            //claimNoteList3.add(claimNote3);
            //claim3.setClaimNoteList(claimNoteList3);

            List<ClaimTask> claimTaskList10 = new ArrayList<>();
            //claimTaskList3.add(claimTask3);
            //claim3.setClaimTaskList(claimTaskList3);

            claimRepository.save(claim10);

            // ===============================================================
            Claim claim11 = new Claim(null, 3283, "Mr", "Simonb", "Smith", "motor", "", "Nissan", "Juke", 2018, "", "", LocalDate.of(2022, 05, 18), 400.00, "backed into lamp post", "Had been snowing all morning", "new");
            //ClaimNote claimNote3 = new ClaimNote(null, "Motor: Claim Note Text 3", LocalDate.now(), claim3);
            //ClaimTask claimTask3 = new ClaimTask(null, "Motor: Claim Task Text 3", "Closed", claim3);

            List<ClaimNote> claimNoteList11 = new ArrayList<>();
            //claimNoteList3.add(claimNote3);
            //claim3.setClaimNoteList(claimNoteList3);

            List<ClaimTask> claimTaskList11 = new ArrayList<>();
            //claimTaskList3.add(claimTask3);
            //claim3.setClaimTaskList(claimTaskList3);

            claimRepository.save(claim11);

            // ===============================================================

            Claim claim12 = new Claim(null, 4408, "Mr", "Jayne", "Workman", "pet", "", "", "", 0000, "dog", "Border collie", LocalDate.of(2022, 05, 20), 240.00, "cut on front left paw", "Had been snowing all morning", "paid");
            //ClaimNote claimNote3 = new ClaimNote(null, "Motor: Claim Note Text 3", LocalDate.now(), claim3);
            //ClaimTask claimTask3 = new ClaimTask(null, "Motor: Claim Task Text 3", "Closed", claim3);

            List<ClaimNote> claimNoteList12 = new ArrayList<>();
            //claimNoteList3.add(claimNote3);
            //claim3.setClaimNoteList(claimNoteList3);

            List<ClaimTask> claimTaskList12 = new ArrayList<>();
            //claimTaskList3.add(claimTask3);
            //claim3.setClaimTaskList(claimTaskList3);

            claimRepository.save(claim12);

            // ===============================================================

        }
    }

}
