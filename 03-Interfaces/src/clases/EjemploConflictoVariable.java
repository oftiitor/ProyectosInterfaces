package clases;

import interfaces.A;
import interfaces.B;

public class EjemploConflictoVariable implements A, B {

	public void imprimirVariables() {
		System.out.println(A.nombre);
		System.out.println(B.nombre);
	}
	
}