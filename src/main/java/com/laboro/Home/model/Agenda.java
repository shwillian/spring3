package com.laboro.Home.model;

import com.laboro.Home.model.enums.WorkCategory;

import java.time.LocalDateTime;

import javax.persistence.Entity;

@Entity
public class Agenda {
    private String cliente;
    private LocalDateTime dataAgendamento;
    private Servico tipoServico;
    private Double preco;
}
