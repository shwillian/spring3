package com.laboro.Home.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Entity
@Data
@Table(name = "pessoa", uniqueConstraints = 
    @UniqueConstraint(columnNames = {"cpf", "email"}))
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 1, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("A")
public class Pessoa {
    private Long id;
    private String nome;
    private String cpf;
    private char sexo;
    private String email;

    @Embedded
    private Address endereco;
}
