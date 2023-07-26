package entidade;

public class AcompanhamentoAdicional  {

	private Double recheioExtra = 5.0;
	private Double refrigerante = 5.0;
	private Double precoAdicional = 0.0;
	private Double taxaEntrega = 5.0;
	
	
	
	 public AcompanhamentoAdicional() {
			 
		
		 
	
	}
	 
	 
	public Double getRecheioExtra() {
		return recheioExtra;
	}
	
	public void setRecheioExtra(Double recheioExtra) {
		this.recheioExtra = recheioExtra;
	}

	public Double getRefrigerante() {
		return refrigerante;
	}

	public void setRefrigerante(Double refrigerante) {
		this.refrigerante = refrigerante;
	}

	public Double getTaxaEntrega() {
		return taxaEntrega;
	}



	public void setTaxaEntrega(Double taxaEntrega) {
		this.taxaEntrega = taxaEntrega;
	}



	public Double getPrecoAdicional() {
		return precoAdicional;
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
	
	
	public void executarMetodos(Boolean addRecheioExtra , Boolean addRefrigerante, Boolean  AddTaxaEntrega ) {	
		
		
		if(addRecheioExtra) {				
			
			addRecheioExtra();		
			
		}
		if(addRefrigerante) {				
			 			
			 addRefrigerante();
			
		}
		if(AddTaxaEntrega) {				
			
			AddTaxaEntrega();
		}
		
}
	
	
	
	
	
	
	
}
