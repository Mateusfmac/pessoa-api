package br.com.vemser.pessoaapi.dto;


import br.com.vemser.pessoaapi.entity.Sexo;
import lombok.Data;

@Data
public class DadosPessoaisDTO {
    private String cnh;
    private String cpf;
    private String nome;
    private String nomeMae;
    private String nomePai;
    private String rg;
    private Sexo sexo;
    private String tituloEleitor;
}
