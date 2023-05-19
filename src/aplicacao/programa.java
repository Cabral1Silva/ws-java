package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Departamento;
import entidades.Trabalho;
import entidades.enums.NivelTrabalho;


public class programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o  nome do departamento: ");
		String departamentoNome = input.nextLine(); 
		System.out.println("Informe dados do trabalhador: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = input.nextLine();
		System.out.println("Nivel: ");
		String nivelTrabalhador = input.nextLine();
		System.out.println("Salario Base: ");
		double baseSalario = input.nextDouble();
		
		// classe.valueOf(variavel) - 
		// foi instanciado um objeto do tipo trabalho(classe trabalho), que tem como atributo(nome, nivel, baseSalario), sendo que nivel é um tipo enumerado 
		// presente na classe trabalho importado da classe NivelTrabalho e 
		
		Trabalho trabalho = new Trabalho(nomeTrabalhador, NivelTrabalho.valueOf(nivelTrabalhador),baseSalario , new Departamento(departamentoNome)  );
		
		
		
		input.close();

	}

}
