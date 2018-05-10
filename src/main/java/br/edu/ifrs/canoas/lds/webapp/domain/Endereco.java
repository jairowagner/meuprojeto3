package br.edu.ifrs.canoas.lds.webapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Endereco  {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String logradouro;
	private Integer numero;
	private String complemento;
	private String cep;
	private String bairro;
	private String uf;

}
