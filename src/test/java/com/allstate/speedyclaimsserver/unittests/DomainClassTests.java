package com.allstate.speedyclaimsserver.unittests;

import com.allstate.speedyclaimsserver.domain.Claim;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DomainClassTests {

    @Test
    public void testEqualityForClaim() {

        //GIVEN we have 2 claims
        Claim claim1 = new Claim();
        Claim claim2 = new Claim();

        //WHEN both claims have the same claim ID
        claim1.setClaimId(123);
        claim2.setClaimId(123);

        //THEN the claims should be equal
        assertEquals(claim1, claim2);
        //OR COULD DO
        // assertTrue(claim1.equals(claim2));


    }


}