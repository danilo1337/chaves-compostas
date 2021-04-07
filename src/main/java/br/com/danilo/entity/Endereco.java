package br.com.danilo.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.danilo.enumerator.EstadoEnum;
import lombok.Data;

@Data
@Table(name = "endereco")
@Entity
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String logradouro;
	private String numero;
	private String cidade;

	@Enumerated(EnumType.STRING)
	private EstadoEnum estado;
}
