package com.laboro.Home.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    String rua;
    String cidade;
    String cep;
    String complemento;
    String bairro;
}
