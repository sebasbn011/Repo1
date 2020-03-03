package poo.example;

public class Celular {
	    //atributos de la clase
	private String marca;
	private String modelo;
	private String color;
	private float PixelesCamara;
	private float TamanioMemoriaInterna;
	private float TamanioMemoriaExterna;
	private float MemoriaRam;
	
	// constructor con parámetros
	public Celular(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.PixelesCamara = PixelesCamara;
		this.TamanioMemoriaInterna = TamanioMemoriaInterna;
		this.TamanioMemoriaExterna = TamanioMemoriaExterna;
		this.MemoriaRam = MemoriaRam;
	}
	
	//constructor vacio
	public Celular(){
		
	}
	
	// método hacer llamada
	public void llamar(String nombre){
		System.out.println("LLamando a "+nombre);
	}
	
	//método finalizar llamada
	public void cortarLlamada(){
		System.out.println("Llamada finalizada");
	}
	
	//método para informar de la caracteristicas del celular
	public void informarCaracteristicas(){
		System.out.println(String.format("Celular Marca: %s", marca));
		System.out.println(String.format("Celular  Modelo: %s", modelo));
		System.out.println(String.format("Celular Color: %s", color));	
		System.out.println(String.format("Celular PixelesCamara: %s", PixelesCamara));
		System.out.println(String.format("Celular TamanioMemoriaInterna: %s", TamanioMemoriaInterna));
		System.out.println(String.format("Celular TamanioMemoriaExterna: %s", TamanioMemoriaExterna));
		System.out.println(String.format("Celular MemoriaRam: %s", MemoriaRam));
	}
	
	//getters y Setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public void setPixelesCamara(int PixelesCamara) {
		this.PixelesCamara = PixelesCamara;
		
	}
	public void setTamanioMemoriaInterna(int TamanioMemoriaInterna) {
		this.TamanioMemoriaInterna = TamanioMemoriaInterna;
	}
	public void setTamanioMemoriaExterna(int TamanioMemoriaExterna) {
		this.TamanioMemoriaExterna = TamanioMemoriaExterna;
	}
	public void setMemoriaRam(int MemoriaRam) {
		this.MemoriaRam = MemoriaRam;
	}
}