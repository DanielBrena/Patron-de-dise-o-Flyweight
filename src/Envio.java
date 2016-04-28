import java.util.ArrayList;
import java.util.List;

public class Envio {
	private List<Vehiculo> vehiculos;
	private List<Integer> precios;
	
	public Envio(){
		this.vehiculos = new  ArrayList<>();
		this.precios = new ArrayList<>();
	}
	
	public void agregarOpciones(String nombre, Integer precio, Fabrica fabrica){
		this.vehiculos.add(fabrica.getOpcion(nombre));
		this.precios.add(precio);
	}
	
	public void mostrar(){
		for(int i = 0; i< this.vehiculos.size(); i++){
			this.vehiculos.get(i).mostrarInformacion(this.precios.get(i));
			System.out.println(this.vehiculos.get(i));
			System.out.println();
		}
	}
}
