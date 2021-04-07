package br.com.danilo.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.danilo.pk.TelefonePK;
import lombok.Data;

@Data
@Table(name = "telefone")
@Entity
public class Telefone implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TelefonePK id;

}
