import entidade.Pizza;
import entidade.AcompanhamentoAdicional;
public class man {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pizza massa = new Pizza(false);
		massa.massaPizza();
		
		AcompanhamentoAdicional  adicional = new AcompanhamentoAdicional();
		adicional.executarMetodos(true, true, true);
		System.out.println(adicional.totalAdicional());
		
		
	}

}
