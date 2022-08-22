package com.allstate.speedyclaimsserver.unittests;

import com.allstate.speedyclaimsserver.data.ClaimNoteRepository;
import com.allstate.speedyclaimsserver.data.ClaimRepository;
import com.allstate.speedyclaimsserver.data.ClaimTaskRepository;
import com.allstate.speedyclaimsserver.domain.Claim;
import com.allstate.speedyclaimsserver.service.ClaimService;
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

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
public class ServiceTests {

    @Autowired
    ClaimService claimService;

    @MockBean
    ClaimRepository claimRepository;

    @MockBean
    ClaimNoteRepository claimNoteRepository;

    @MockBean
    ClaimTaskRepository claimTaskRepository;

    //@MockBean
    //UserRepository userRepository;

    @Test
    public void testNumberOfClaims() {

        List<Claim> claims = new ArrayList<>();

        claims.add(new Claim(null, 3281, "Simon", "Smith", "motor", "", "Nissan", "Juke", 2018, "", "", LocalDate.now(), 400.00, "backed into lamp post", "claimed that the lamp post wasn't there the last time they looked", "new", null, null));
        claims.add(new Claim(null, 4406, "Jane", "Jones", "pet", "", "", "", 0000, "dog", "Border collie", LocalDate.now(), 260.00, "cut on front left paw", "", "paid", null, null));
        claims.add(new Claim(null, 9191, "Geraldine", "Green", "motor", "", "Citroen", "Berlingo", 2021, "", "", LocalDate.now(), 400.00, "skidded on ice", "Had been snowing all morning", "new", null, null));


        Mockito.when(claimRepository.findAll()).thenReturn(claims);

        int result = claimService.countClaims();
        assertEquals(3, result);

    }

}

