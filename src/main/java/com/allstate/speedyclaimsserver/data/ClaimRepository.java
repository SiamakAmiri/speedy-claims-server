package com.allstate.speedyclaimsserver.data;

import com.allstate.speedyclaimsserver.domain.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Integer> {

    public Optional<Claim> findBySurname(String surname);
    public Optional<Claim> findByPolicyNumber(Integer policyNmber);

}
