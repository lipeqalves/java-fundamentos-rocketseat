package br.com.lipealves.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID >{
    
    Optional<CandidateEntity> findByusernameOrEmail(Object username, String email);
}
