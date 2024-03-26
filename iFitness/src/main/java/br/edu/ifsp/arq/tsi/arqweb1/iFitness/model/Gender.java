package br.edu.ifsp.arq.tsi.arqweb1.iFitness.model;

public enum Gender {
	
	MASCULINO("Masculino"),
	FEMININO("Feminino"),
	OUTROS("Outros"),
	PREFIRO_NAO_DIZER("Prefiro não dizer");
	
	private String description;
	
	private Gender(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
