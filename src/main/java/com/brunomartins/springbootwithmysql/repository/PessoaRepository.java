package com.brunomartins.springbootwithmysql.repository;

import com.brunomartins.springbootwithmysql.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {



}
