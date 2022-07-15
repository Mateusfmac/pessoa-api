package br.com.vemser.pessoaapi.exceptions.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Endereco {
    //validacoes nos DTO
    private Integer idEndereco;
    private Integer idPessoa;
    private TipoEndereco tipo;
    private String logradouro;
    private Integer numero;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;
}
