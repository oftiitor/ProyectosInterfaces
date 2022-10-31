package modelos;

import interfaces.Cuenta;

public class Cliente implements Cuenta {
	
	/* ATRIBUTOS */
	private String nombreCliente;
	private int numeroCuenta;
	
	/* CONSTRUCTORES */
	public Cliente() {
		
	}
	
	public Cliente(String nombre, int num) {
		this.nombreCliente = nombre;
		this.numeroCuenta = num;
	}
	
	/* GETTERS Y SETTERS */
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	/* MÉTODOS DE LAS INTERFACES */
	@Override
	public void mostrarDetalleCuenta() {
		System.out.println("CUENTA:\n" + mostrarDetalleCliente() + ":");
		System.out.println(" · Código IFS: " + codigoIfs);
		System.out.println(" · Número de cuenta: " + numeroCuenta);
	}

	@Override
	public String mostrarDetalleCliente() {
		return " · Nombre del cliente: " + nombreCliente;
	}
}