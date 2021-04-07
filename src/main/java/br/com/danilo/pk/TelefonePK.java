package br.com.danilo.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class TelefonePK implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Short ddd;
	private String numero;
	
	
}
