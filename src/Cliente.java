
public class Cliente {
	public static void main(String[] args){
		Fabrica fabrica = new Fabrica();
		Envio envio = new Envio();
		envio.agregarOpciones("ford", 10000, fabrica);
		envio.agregarOpciones("chevy", 50000, fabrica);
		envio.agregarOpciones("chevy", 60000, fabrica);
		envio.agregarOpciones("asus", 60000, fabrica);
		
		envio.mostrar();
		
	}
}
