package br.com.lipealves.gestao_vagas.modules.candidate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lipealves.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.lipealves.gestao_vagas.modules.candidate.CandidateRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("candidate")
public class CandidateController {

    @Autowired
    private CandidateRepository candidateRepository;

    @PostMapping("/")
    public @Valid CandidateEntity create(@Valid @RequestBody CandidateEntity candidateEntity){
        // System.out.println("candidato");
        // System.out.println(candidateEntity.getEmail());
        
        return this.candidateRepository.save(candidateEntity);
    }

}
