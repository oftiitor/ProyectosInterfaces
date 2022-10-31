 package interfaces;

public interface Cuenta {

	public void detallesCuenta();
	public void mostrarDetalles();
	
	default public void nuevoMetodo() {
		System.out.println("Este es un nuevo método :)");
	}
	
}