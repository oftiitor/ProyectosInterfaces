package tester;

import modelos.Cliente;

public class PruebaInterfacesMultiples {

	public static void main(String[] args) {

	Cliente cliente = new Cliente();
	
	cliente.mostrarDetalles();
	cliente.detallesCuenta();
	cliente.detalleDeposito();
	cliente.metodoNuevoClaseCliente();
	cliente.nuevoMetodo();
		
	}

}