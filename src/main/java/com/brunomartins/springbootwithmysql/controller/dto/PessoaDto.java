package com.brunomartins.springbootwithmysql.controller.dto;

import com.brunomartins.springbootwithmysql.model.Pessoa;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaDto {

    // method to convert Pessoa (entity) to PessoaDto
    public static PessoaDto converter(Pessoa p){
        var pessoa = new PessoaDto();
        pessoa.id = p.getId();
        pessoa.name = p.getNome();
        pessoa.sobrenome = p.getSobrenome();

        return pessoa;
    }

    private Long id;
    private String name;
    private String sobrenome;

}
