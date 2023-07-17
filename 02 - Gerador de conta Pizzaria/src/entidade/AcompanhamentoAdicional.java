package entidade;

public class AcompanhamentoAdicional  {

	private Double recheioExtra = 5.0;
	private Double refrigerante = 5.0;
	private Double precoAdicional = 0.0;
	private Double taxaEntrega = 5.0;
	
	
	
	 public AcompanhamentoAdicional(Double recheioExtra, Double refrigerante, Double precoAdicional,
			Double taxaEntrega) {
		super();
		this.recheioExtra = recheioExtra;
		this.refrigerante = refrigerante;
		this.precoAdicional = precoAdicional;
		this.taxaEntrega = taxaEntrega;
		
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
