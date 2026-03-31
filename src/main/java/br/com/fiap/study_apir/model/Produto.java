package br.com.fiap.study_apir.model;

import java.math.BigDecimal;

import lombok.Data;

/*@Data // Gera getters, setters, equals, hashCode, toString e RequiredArgsConstructor automaticamente
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;*/

@Data
public class Produto {
    private final Long id;
    private final String nome;
    private final BigDecimal valor;
}