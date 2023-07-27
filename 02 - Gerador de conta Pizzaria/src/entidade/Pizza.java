package entidade;

import entidade.enums.SaboresComum;
import entidade.enums.SaboresVegano;


// falta resolver como escolher o tipo do sabor vegano ou comum

public class Pizza {
	
	private Double  preco;
	private Boolean vegano; // verificar se é vegano ou não
	private SaboresComum sabores;
	private SaboresVegano SaboresVegano;
	
	
	
	
	public Pizza(Boolean vegano, SaboresComum sabores ) {
		
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
	
public Pizza(Boolean vegano, SaboresVegano SaboresVegano ) {
		
		//  quando for instanciado o construtor precisa sabe se é vegano ou não 
		// o preco não é necessario pois ja esta definido apesar de mudar se for vegano ou não!
		
		this.vegano = vegano; 
		if(this.vegano) {
			this.preco = 100.00;
			
		}else {
			this.preco = 50.00;
		}			
		
		this.SaboresVegano = SaboresVegano;
		
	}
	
	
	
	



	public SaboresVegano getSaboresVegano() {
	return SaboresVegano;
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
