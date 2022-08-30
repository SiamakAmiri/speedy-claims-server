package com.allstate.speedyclaimsserver.integrationtests;

import com.allstate.speedyclaimsserver.data.ClaimNoteRepository;
import com.allstate.speedyclaimsserver.data.ClaimRepository;
import com.allstate.speedyclaimsserver.data.ClaimTaskRepository;
import com.allstate.speedyclaimsserver.domain.Claim;
import com.allstate.speedyclaimsserver.domain.ClaimNote;
import com.allstate.speedyclaimsserver.dtos.ClaimDTO;
import com.allstate.speedyclaimsserver.service.ClaimService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JsonContentAssert;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.Mockito.*;


@SpringBootTest
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
@AutoConfigureMockMvc
public class ClaimsTesting<UserRepository> {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @MockBean
    private ClaimRepository claimRepository;

    @MockBean
    private ClaimNoteRepository claimNoteRepository;

    @MockBean
    private ClaimTaskRepository claimTaskRepository;


    @MockBean
    ClaimService claimService;

    @Autowired
    Jackson2ObjectMapperBuilder mapperBuilder;

    //@MockBean
    //UserRepository userRepository;



    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }


    @Test
    public void checkNewClaimsAreAddedToDatabase() throws Exception {

        ClaimDTO newClaim = new ClaimDTO();
        //newClaim.setClaimId();
        newClaim.setPolicyNumber(1200);
        newClaim.setTitle("Prof.");
        newClaim.setFirstName("Clive");
        newClaim.setSurname("Cole");
        newClaim.setInsuranceType("property");
        newClaim.setPropertyAddress("15 Acacia Avenue, Sometown");
        newClaim.setMake("");
        newClaim.setModel("");
        newClaim.setYear(9999);
        newClaim.setAnimalType("");
        newClaim.setAnimalBreed("");
        newClaim.setIncidentDate(LocalDate.now());
        newClaim.setEstimatedValue(200);
        newClaim.setClaimReason("damage from flood");
        newClaim.setIncidentDescription("description of damage from flood");
        newClaim.setClaimStatus("open");
        newClaim.setLcn(null);
        newClaim.setLct(null);



        //ObjectMapper om = new ObjectMapper();
        //String json = om.writeValueAsString(newClaim);

        ObjectMapper objectMapper = mapperBuilder.build();
        String json = objectMapper.writeValueAsString(newClaim);


        RequestBuilder request = MockMvcRequestBuilders
                .post("/api/claim")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(json);

        Claim databaseResponse = newClaim.toClaim();
        databaseResponse.setClaimId(1);

        Mockito.when(claimRepository.save(any())).thenReturn(databaseResponse);


        ResultActions result = mockMvc.perform(request)
                .andExpect(status().isOk());


        //String responseJson = result.andReturn().getResponse().getContentAsString();
        //String expectedJson = objectMapper.writeValueAsString(databaseResponse);
        //System.out.println(responseJson);
        //System.out.println(expectedJson);
        //JsonContentAssert jsonAssert = new JsonContentAssert(Claim.class, expectedJson);
        //jsonAssert.isEqualToJson(responseJson);


        //ArgumentCaptor<Claim> capturedClaim
                //= ArgumentCaptor.forClass(Claim.class);

        //Mockito.verify(claimRepository)
                //.save(capturedClaim.capture());


        //Claim cl = capturedClaim.getValue();
        //assertEquals("property", cl.getInsuranceType());











        //======================================================================================
        // Remove the bleow logic


        // Mockito.verify(claimRepository).save(newClaim.toClaim());



        //============
        //Mockito.verify(claimRepository).save(capturedClaim.capture());
        //assertEquals("property", capturedClaim.getValue().getClaimId());

        //========================
/*
        Claim expectedClaim = new Claim();
        expectedClaim.setPolicyNumber(1200);
        expectedClaim.setFirstName("Clive");
        expectedClaim.setSurname("Cole");
        expectedClaim.setInsuranceType("property");
        expectedClaim.setPropertyAddress("15 Acacia Avenue, Sometown");
        expectedClaim.setMake("");
        expectedClaim.setModel("");
        expectedClaim.setYear(9999);
        expectedClaim.setAnimalType("");
        expectedClaim.setAnimalBreed("");
        expectedClaim.setIncidentDate(LocalDate.now());
        expectedClaim.setIncidentAmount(200.00);
        expectedClaim.setClaimReason("damage from flood");
        expectedClaim.setIncidentDescription("description of damage from flood");
        expectedClaim.setClaimStatus("open");
        expectedClaim.setClaimId(1111);


        String expectedJSON = om.writeValueAsString(expectedClaim);



        ArgumentCaptor<Claim> capturedClaim = ArgumentCaptor.forClass(Claim.class);*/









    }


    }
