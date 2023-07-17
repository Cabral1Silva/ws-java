import entidade.Pizza;
import entidade.AcompanhamentoAdicional;
public class man {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pizza massa = new Pizza(true);
		massa.massaPizza();
		
		AcompanhamentoAdicional  adicional = new AcompanhamentoAdicional();
		adicional.executarMetodos();
		System.out.println(adicional.totalAdicional());
	}

}
