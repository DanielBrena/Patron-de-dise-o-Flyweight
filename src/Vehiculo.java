
public class Vehiculo {
	private String nombre;
	private String descripcion;
	private Integer precioEstandar;
	
	public Vehiculo(String nombre){
		this.nombre = nombre;
		this.descripcion = "Descripcion del " + nombre;
		this.precioEstandar = 100000;
	}
	
	public void mostrarInformacion(Integer precioVenta){
		System.out.println("Opciones");
		System.out.println("Nombre: " +this.nombre );
		System.out.println(this.descripcion);
		System.out.println("Precio estandar: " + this.precioEstandar);
		System.out.println("Precio venta: " + precioVenta);
	}
	
}
