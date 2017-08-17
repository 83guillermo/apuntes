package clase1;

import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class Prueba {
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("hola mundo");
		
		/*
		int numeroUno = 10;
		int numeroDos = 2;
		int resultado = numeroUno/numeroDos;
		String msj= "el resultado es ";
		System.out.println(msj +resultado);
		*/
		
		String nombre;
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese su nombre :");
		nombre = scanner.nextLine();
		System.out.println("por favor ahora ingrese su apellido :");
		String apellido = scanner.nextLine();
		System.out.println("su nombre y apellido es : " +nombre+" "+apellido);
		
		String numero;
		String numeros;
		
		int numero1;
		int numero2;
		System.out.println("por favor ingrese un numero");
		numero = scanner.nextLine();
		System.out.println("por favor ingrese otro numero");
		numeros = scanner.nextLine();
		
		numero1 = Integer.parseInt(numero);
		numero2 = Integer.parseInt(numeros);
		int r =numero1 + numero2; 
		System.out.println("esta es la suma de ambos numeros : "+r);
		
		
		
		

	}

}
