package modelo;

import java.time.LocalDate;

//import java.util.Random;


public class Persona {
	
	private String nif;
	private String nombre;
	private LocalDate fecha_nac;
	private int longPaso;
	private char sexo;  // 'M' 'F'
	private Persona[] hijosBiologicos;
	private Persona padre;
	private Persona madre;
	//padre y madre

	//CONSTRUCTOR
	public Persona(String nif, String nombre, int longPaso, char sexo) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.longPaso = longPaso;
		this.fecha_nac = LocalDate.now();
		this.sexo = sexo;
	}

//CONSTRUCTOR VACIO
	public Persona() {
		super();
		this.nif = "12345678F";
		this.nombre = "Anonimo";
		this.longPaso = 33;
		this.fecha_nac = LocalDate.now();
	}


	//GETTERS Y SETTERS
	public String getNif() {
		return nif;
	}



	public void setNif(String nif) {
		this.nif = nif;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public LocalDate getFecha_nac() {
		return fecha_nac;
	}



	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}



	public int getLongPaso() {
		return longPaso;
	}



	public void setLongPaso(int longPaso) {
		this.longPaso = longPaso;
	}


public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

public Persona[] getHijosBiologicos() {
		return hijosBiologicos;
	}

	public void setHijosBiologicos(Persona[] hijosBiologicos) {
		this.hijosBiologicos = hijosBiologicos;
	}

	public Persona getPadre() {
		return padre;
	}

	public void setPadre(Persona padre) {
		if (padre.getSexo() == 'M') {
			this.padre = padre;
		} else {
			System.out.println("Debe introducir un hombre");
		}
	}

	public Persona getMadre() {
		return madre;
	}

	public void setMadre(Persona madre) {
		if (madre.getSexo() == 'F') {
			this.madre = madre;
		} else {
			System.out.println("Debe introducir una mujer");
		}
	}

	//METODO CONTAR PASOS
	public int caminar(int numPasos){
		
		/*Random r = new Random();
		int result = r.nextInt(10);*/
		
		return numPasos * longPaso / 100;
	}

}
