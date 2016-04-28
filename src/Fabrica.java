import java.util.Map;
import java.util.TreeMap;

public class Fabrica {
	private Map<String, Vehiculo> opciones;
	
	public Fabrica(){
		this.opciones = new TreeMap<>();
	}
	
	public Vehiculo getOpcion(String nombre){
		Vehiculo vehiculo;
		if(this.opciones.containsKey(nombre)){
			return this.opciones.get(nombre);
		}else{
			vehiculo = new Vehiculo(nombre);
			this.opciones.put(nombre, vehiculo);
		}
		return vehiculo;
	}
	
}
