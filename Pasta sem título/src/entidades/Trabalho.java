package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.NivelTrabalho;

public class Trabalho {

	private String nome;
	private NivelTrabalho nivel;
	private Double salarioBase;
	
	// --------  INICIO /COMPOSICAO DE OBJETOS ----------- 
	private Departamento departamento;
	private List<HoraContrato> contratos  = new ArrayList<>(); // instanciado diretamente na classe - esta em uma lista pois a associações, a classe contrato tem varios contratos;
	// quando tiver uma composição "tem muitos" , nao se deve incluir ao construtor e sim a uma lista e instanciar-la vazia!!!

	
	// NAO CRIAR METODOS GET E SET PARA LISTAS 
	// --------  FIM COMPOSICAO DE OBJETOS ----------- 
	public Trabalho() {
		
	}
	
	public Trabalho(String nome, NivelTrabalho nivel,Double salarioBase, Departamento departamento ) {
	
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
		
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
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
	// dois metodos responvel por fazer ou desfazer uma associação entre trabalhador e contrato.
	
	public void addContrato(HoraContrato contrato) {
		
		 contratos.add(contrato); //contratos é a lista  criada acima/ add é o metodo da lista e contrato é variavel local do tipo HoraContrato.
		
	}
	
	// este metodo vai pega na lista de "contratos" e add um novo "contrato" 
	
	public void removeContrato(HoraContrato contrato) {
		
		contratos.remove(contrato); 
		
	}
	
	// este metodo vai pega na lista de "contratos" e remove um  "contrato"  da lista.
	
	public double renda(int ano, int mes) {
		
		double soma =  salarioBase; // o objetivo é acumular os valores dos contratos nessa variavel! 
		
		// mas o objetivo é somar contratos deste mes e deste ano
		Calendar cal = Calendar.getInstance();
		for (HoraContrato c : contratos) { // 
			cal.setTime(c.getDate());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);// o mes do callendar comeca com 0 entao o motivo do 1, para iniciar o mes apartir do dia 1
			if( ano  == c_ano && mes == c_mes) {
				
				soma += c.valorTotal();
				
			}
			
		}
		
		return soma;
		
		/* Se a intenção fosse somar todos os contratos a logica seria:
		 * 
		 * 	for (HoraContrato c : contratos) {
			
			soma += c.valorTotal();
			}
		
			return soma;
		 * 
		 */
	}

	
	
}
