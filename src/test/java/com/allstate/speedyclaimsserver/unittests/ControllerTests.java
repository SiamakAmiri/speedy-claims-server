package com.allstate.speedyclaimsserver.unittests;


import com.allstate.speedyclaimsserver.controller.ClaimController;
import com.allstate.speedyclaimsserver.data.ClaimNoteRepository;
import com.allstate.speedyclaimsserver.data.ClaimRepository;
import com.allstate.speedyclaimsserver.data.ClaimTaskRepository;
import com.allstate.speedyclaimsserver.domain.Claim;
import com.allstate.speedyclaimsserver.service.ClaimService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
public class ControllerTests {

    @Autowired
    ClaimController claimController;

    @MockBean
    ClaimService claimService;

    @MockBean
    ClaimRepository claimRepository;

    @MockBean
    ClaimNoteRepository claimNoteRepository;

    @MockBean
    ClaimTaskRepository claimTaskRepository;

    @BeforeEach
    public void runFirst() {
        Mockito.when(claimService.countClaims())
                .thenReturn(116);
        Mockito.when(claimService.getClaimById(1))
                .thenReturn(new Claim());
    }


    @Test
    public void checkThatNumberOfClimsIsAMapWithAKeyOfVolume() {
        Map<String,String> result = claimController.getNumberOfClaims();
        assertEquals("116", result.get("volume"));
    }

    @Test
    public void checkThatNumberOfClimsIsAMapWithAKeyOfVolume2() {
        Map<String,String> result = claimController.getNumberOfClaims();
        assertEquals("116", result.get("volume"));
    }

}

