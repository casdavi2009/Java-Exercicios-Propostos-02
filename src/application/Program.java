package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employ = new Employee();
		
		System.out.print("Nome: ");
		employ.Name = sc.nextLine();
		System.out.print("Sálario Bruto: ");
		employ.GlossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		employ.Tax = sc.nextDouble();
		System.out.println("Funcionário: " + employ.toString());
		
		System.out.print("Qual a porcentagem para aumentar o salário? ");
		employ.IncreaseSalary(sc.nextDouble());
		System.out.println("Dados atualizados: " + employ.toString());
		
		sc.close();
	}

}
