package entidades;

import entidades.enums.NivelTrabalho;

public class Trabalho {

	private String nome;
	private NivelTrabalho nivel;
	private Double salarioBase;
	
	
	
	public Trabalho() {
		
	}
	
	public Trabalho(String nome, NivelTrabalho nivel,Double salarioBase ) {
	
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		
	}
	
	public String getNome() {
		return nome;
	}
	public NivelTrabalho getNivel() {
		return nivel;
	}
	public Double getSalarioBase() {
		return salarioBase;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNivel(NivelTrabalho nivel) {
		this.nivel = nivel;
		
	}
	public void setSalarioBase(Double salarioBase) {
		
		this.salarioBase = salarioBase;
		
	}
	
}
