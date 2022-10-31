package modelos;

import interfaces.Cuenta;
import interfaces.Deposito;

public class Cliente implements Cuenta, Deposito{

	@Override
	public void detalleDeposito() {
		System.out.println("Detalles depósito:");
	}

	@Override
	public void detallesCuenta() {
		System.out.println("Detalles cuenta:");
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Mostrando ...");
	}
	
	public boolean metodoNuevoClaseCliente() {
		return false;
	}
}