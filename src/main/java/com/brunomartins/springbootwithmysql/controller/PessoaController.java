package com.brunomartins.springbootwithmysql.controller;

import com.brunomartins.springbootwithmysql.controller.dto.PessoaDto;
import com.brunomartins.springbootwithmysql.repository.PessoaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    private final PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    public List<PessoaDto> findAll(){
        var pessoas = pessoaRepository.findAll();
        return null;
    }

}
