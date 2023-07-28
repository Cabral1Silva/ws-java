import entidade.Pizza;


import entidade.enums.SaboresComum;
import entidade.enums.SaboresEspecial;
import entidade.enums.SaboresVegano;

import entidade.AcompanhamentoAdicional;
public class man {
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pizza massa = new Pizza(false, SaboresComum.PORTUGUESA);
		Pizza massa01 = new Pizza(true, SaboresVegano.ALHO_E_OLEO);
		
	
		
		massa.massaPizza();
		System.out.println(massa);
		System.out.println(massa01);
		
		AcompanhamentoAdicional  adicional = new AcompanhamentoAdicional();
		adicional.executarMetodos(true, true, true);
		System.out.println(adicional.totalAdicional());
		
		
	}

}
