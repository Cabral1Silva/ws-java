package entidade;

public class Pizza {
	
	private Double  preco;
	private Boolean vegano; // verificar se é vegano ou não
	
	
	public Pizza(Boolean vegano) {
		
		//  quando for instanciado o construtor precisa sabe se é vegano ou não 
		// o preco não é necessario pois ja esta definido apesar de mudar se for vegano ou não!
		
		this.vegano = vegano; 
		if(this.vegano) {
			this.preco = 100.00;
		}else {
			this.preco = 50.00;
		}		
	}
	
	public void massaPizza(){			
		
		System.out.println(this.preco);
		
	}

}
