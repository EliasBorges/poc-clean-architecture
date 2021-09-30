package br.com.alura.escola;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Aluno {
    private Cpf cpf;
    private String nome;

    private Email email;
}
