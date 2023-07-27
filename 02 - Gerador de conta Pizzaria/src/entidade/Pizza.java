package entidade;

import entidade.enums.SaboresComum;

public class Pizza {
	
	private Double  preco;
	private Boolean vegano; // verificar se é vegano ou não
	private SaboresComum sabores;
	
	
	
	public Pizza(Boolean vegano,SaboresComum sabores ) {
		
		//  quando for instanciado o construtor precisa sabe se é vegano ou não 
		// o preco não é necessario pois ja esta definido apesar de mudar se for vegano ou não!
		
		this.vegano = vegano; 
		if(this.vegano) {
			this.preco = 100.00;
		}else {
			this.preco = 50.00;
		}	
		
		
		this.sabores = sabores;
		
		
	}
	
	
	
	public SaboresComum getSabores() {
		return sabores;
	}



	

	public void massaPizza(){			
		
		System.out.println(this.preco);
		
	}
	
	
	public String toString() {
		
		String tipoMassa = vegano? "Massa Vegana" : "Massa Tradicional";
		return "Pizza: " + tipoMassa + ", Sabor: " + sabores;
		
	}

}
