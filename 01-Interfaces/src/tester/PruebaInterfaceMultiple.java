package tester;

import modelos.Cliente;

public class PruebaInterfaceMultiple {

	public static void main(String[] args) {

		Cliente cliente25 = new Cliente("Juan Pedro Gómez Esteban", 8080);
		
		Cliente cliente26 = new Cliente();
		cliente26.setNombreCliente("Javier Magariño");
		cliente26.setNumeroCuenta(5689);
		
		cliente25.mostrarDetalleCuenta();
		cliente26.mostrarDetalleCuenta();
		
	}

}