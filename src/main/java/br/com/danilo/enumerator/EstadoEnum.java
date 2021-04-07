package br.com.danilo.enumerator;

import java.lang.reflect.Field;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EstadoEnum {
	AC("Acre","AC"),
	AL("Alagoas","AL"),
	AP("Amapa","AP"),
	AM("Amazonas","AM"),
	BA("Bahia", "BA"),
	CE("Ceara","CE"),
	DF("Distrito Federal","DF"),
	ES("Espirito Santo", "ES"),
	GO("Goias","GO"),
	MA("Maranhão", "MA"),
	MT("Mato Grosso","MT"),
	MS("Mato Grosso do Sul","MS"),
	MG("Minas Gerais", "MG"),
	PA("Pará","PA"),
	PB("Paraiba","PB"),
	PR("Paraná","PR"),
	PE("Pernambuco","PE"),
	PI("Piaui","PI"),
	RJ("Rio de Janeiro","RJ"),
	RN("Rio Grande de Norte","RN"),
	RS("Rio Grande do Sul","RS"),
	RO("Rondonia","RO"),
	RR("Roraima","RR"),
	SC("Santa Cataria","SC"),
	SP("São Paulo","SP"),
	SE("Sergipe","SE"),
	TO("Tocantins","TO");

	private final String codigo;
	private final String descricao;
	
	private EstadoEnum(String descricao, String codigo){
		this.codigo = codigo;
		this.descricao = descricao;
		try {
			Field field = this.getClass().getSuperclass().getDeclaredField("name");
			field.setAccessible(true);
			field.set(this, this.codigo);
		}	catch (Exception e) {
			e.printStackTrace();
		}
	}

	@JsonValue
	public String getDescricao() {
		return descricao;
	}
	
}
