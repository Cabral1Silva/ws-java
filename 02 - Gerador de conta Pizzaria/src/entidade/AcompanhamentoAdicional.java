package entidade;

public class AcompanhamentoAdicional  {

	private Double recheioExtra = 5.0;
	private Double refrigerante = 5.0;
	private Double precoAdicional = 0.0;
	private Double taxaEntrega = 5.0;
	
	
	
	
	// duvida: fico na duvida se preciso incluir o metodo get ja que 
	
	
	 public void executarMetodos() {
		 
		 addRecheioExtra();
		 addRefrigerante();
		 AddTaxaEntrega();
		 
		 
	    }
	
	


	public void addRecheioExtra() {
		
		System.out.println("Adicionar queijo extra!");
		this.precoAdicional += recheioExtra;
		
	}
	

	public void addRefrigerante() {
		
		System.out.println("Com refrigerante!");
		this.precoAdicional += refrigerante;
		
	}
	
	public void AddTaxaEntrega() {
		System.out.println("Para entrega!");
		this.precoAdicional += taxaEntrega;
	}
	
	public Double totalAdicional() {
		
		return precoAdicional;
	}
	
	
	
	
	
	
	
	
}
