package control;

import java.util.Random;
import modelo.Persona;

public class Ejercicios {

	public static void main(String[] args) {
		Persona juan;
		juan = new Persona("1234","juan palomo", 20);
		//Persona persona1 = new Persona();
		int pasos = juan.caminar(20);
		//Llamar al metodo listaIntervalosEntero
		Ejercicios ejercicio = new Ejercicios();
		int x = 10;
		int y = 30;
		ejercicio.listaIntervaloEntero(x, y);
		System.out.println();
		
		//si es static puedes hacerlo de la siguiente manera
		Ejercicios.pruebasAPI();
		/*
		 * sin static en el metodo purebaAPI()
		 * 
		 * new Ejercicios().pruebaAPI();.
		 * 
		 * ó
		 * 
		 * Ejercicios ejer = new Ejercicios()
		 * ejer.pruebaAPI();
		*/
		System.out.println("fin del programa " + pasos);
		
		//Ejercicio 10-10-2018
		System.out.println("Convierte cadena en entero");
		String cadena = "2756";
		System.out.println(ejercicio.convierteCadenaAEntero(cadena));
		
		//Ejercicio Fibonacci
		System.out.println("Dado un numero, imprimir tantos numeros de la Serie de Fibonacci ");
		int contador = 10;
		ejercicio.serieFibonacci(contador);
		
		//factorial de un numero dado
		System.out.println("factorial de un numero");
		int numFactorial = 7;
		System.out.println(ejercicio.factorial(numFactorial));
		
		/*
		 * =================
		 * Clase.estatico
		 * objeto.noestatico
		 * =================
		 */
		
		//numero menor con metodo static y no static
		int num1 = 1, num2 = 1, num3 = 4, num4 = 2;
		int menor = Ejercicios.numeroMenor(num1, num2, num3, num4);
		//static
		System.out.println("Primer metodo menor");
		System.out.println(ejercicio.numeroMenor(num1, num2, num3));
		//no static
		System.out.println("segundo metodo menor 4 parametros");
		System.out.println(menor);
		
		/*
		 * ==========================================================
		 * 			  variable longitud de los arrays
		 * ==========================================================
		 */
		
		int longitudArray = 30;
		
		//array de numeros aleatorios
		System.out.println("array de numeros aleatorios");
		int[] misAleatorios = new int[longitudArray];		
		misAleatorios = ejercicio.generaAleatorios(longitudArray);
		
		//numero aleatorios por consola
		System.out.println("Imprimir numeros aleatorios por consola");
		int numerosAleatorios = 30;
		ejercicio.imprimirAleatorios(numerosAleatorios);
		
		//numero aleatorios entre un inferior y superior
		System.out.println("numeros aleatorios comprendidos en un rango dentro de un array");
		int[] arrayAleatorios = new int[longitudArray];
		int rangoInferior = 100;
		int rangoSuperior = 500;
		arrayAleatorios = ejercicio.generaListaAleatorios(longitudArray, rangoInferior, rangoSuperior);
		
		//estadistica de numero de veces que sale un numero
		int[] estadistica = ejercicio.generaEstadisticaAparicion(1000, 5, 10);
		
		//lista de personas
		Persona[] lista = ejercicio.listaPersonas(10);
		
		//Ejercicio 1
		
		float saldo = 15.92f;
		float[] movimientos = {500f, -100.25f, -50.36f, -250.78f, 100.50f};
	
		System.out.println("el saldo actual es: " + ejercicio.calcularSaldoFinal(saldo, movimientos));
		
		//Ejercicio 2
		
		int rango = 5;
		int inf = 10;
		int sup = 20;
		System.out.println("La media es: " + ejercicio.ejercicio2(rango, inf, sup));
		
		
		//pruebaCadenas
		ejercicio.pruebaCadenas();

		
		/*
		 * ===========================================
		 *           MATRICES
		 * ===========================================
		 * 
		 * usar generador
		 * float[][] matriz = ejercicio.generarMatriz(filas, columnas, inferior, superior);
		 * 
		 */
		
		//resumenVendedor
		float[][] matriz = ejercicio.generarMatriz(3, 12, 1, 15);
		float[] resumenVendedor = ejercicio.resumenVendedor(matriz);
		
		System.out.println("FIN DEL PROGRAMA");
	}
	
	/*
	 * 11/10/2018
	 * Serie fibonacci
	 */
	
	public void serieFibonacci (int cuantos) {
		int primero = 0;
		int segundo = 1;
		int x = 0;
		for (int i = 0; i < cuantos; i++) {
			System.out.print(primero + ", ");
			x = primero + segundo;
			primero = segundo;
			segundo = x;
		}
		System.out.println();
	}
	
	/*
	 * 11/10/2018
	 * Crear un metodo que, dado un numero entero, devuelva su factorial
	 */
	
	public int factorial (int numero) {
		int resultado = numero;
		while (numero != 1) {
			numero--;
			resultado = resultado * numero;
		}
		return resultado;
	}
	
	/*
	 * 11/10/2018
	 * Crear un metodo que, dado tres numeros decimales, devuelva el menor de ellos.
	 */
	
	public int numeroMenor (int x, int y, int z) {
		if(x < y)
			if (x < z) 
				return x;
			else
				return z;
		else if (y < z)
			return y;
		else 
			return z;
	}
	
	//Sobrecarga
	
	public static int numeroMenor (int x, int y, int z, int w) {
		/*
		 * x < y < z < w return x
		 * 	x < y < z > w return w
		 */
		if(x < y)
			if (x < z)
				if (x < w)
					return x;
				else
					return w;
			else if (z < w)
				return z;
			else
				return w;
		else if (y < z)
			if (y < w)
				return y;
			else
				return w;
		else if (z < w)
			return z;
		else 
			return w;
	}
	
	/*
	 * Dado una cadena , devolver el valor en formato de numero
	 * entero correspondiente, si es compatible
	 */
	
	public Integer convierteCadenaAEntero(String cadena) {
		return Integer.parseInt(cadena);
	}
	
	/*
	 * Mostrar por consola los numeros comprendidos entre dos enteros, a y b
	 */
	
	public void listaIntervaloEntero (int primero, int ultimo) {
		while(primero <= ultimo) {
			System.out.print(primero++ + ", ");
		}
	}
	
	/*
	 * 16/10/2018
	 * Crear un array de dimension n con numeros aleatorios.
	 */
	
	public int[] generaAleatorios (int n) {
		int[] resultado = new int[n];
		Random r = new Random();
		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = r.nextInt(100); 
		}		
		return resultado;
	}
	
	/*
	 * Imprimir n numeros aleatorios
	 */
	
	public void imprimirAleatorios (int n) {
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			System.out.print((r.nextInt(100) + 1) + ", ");
		}
	}
	
	/*
	 * Generar array de n numeros aleatorios comprendidos entre un rango
	 */
	
	public int[] generaListaAleatorios (int n, int inferior, int superior) {
		int[] resultado = new int[n];
		Random r = new Random();
		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = r.nextInt(superior - inferior) + inferior;
		}
		return resultado;
	}
	
	/*
	 * Generar array que cuente el numero de veces que sale de manera aleatoria 
	 * un numero en su respectiva posicion dentro del array
	 */
	
	public int[] generaEstadisticaAparicion(int n, int inferior, int superior) {
		//+1 al indice para que me incluya inferior
		int [] resultado = new int[(superior - inferior) + 1];
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			/*
			 * nextInt(n)=0...(n-1)
			 * Ejemplo superior=10
			 * 		   inferior=5
			 * n = 10 + 1 -5 = 6
			 * r.nextInt(n) dara los numeros de 0 a 5 porque el resultado es de 0 a n -1
			 *              y para que nos de los numeros que queremos sumamos inferior que es 5
			 * pero en el indice del array no nos interesa saber el numero que representa esa posicion
			 * solo el numero del indice donde iria ese numero. Por ejemplo:
			 * resultado[3] = 8
			 */
			System.out.print((r.nextInt(superior + 1 - inferior) + inferior) + ",");
			resultado[r.nextInt(superior + 1 - inferior)]++;
		}
		System.out.println();
		return resultado;
	}
	
	/*
	 * Crear un metodo que devuelva una lista de n personas
	 * se crean las personas con el constructor Personas()
	 */
	
	public Persona[] listaPersonas (int n) {
		Persona[] resultado = new Persona[n];
		Persona persona = new Persona();
		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = persona;
		}
		return resultado;
	}
	
	/*
	 * Saber cuantos caracteres tiene una cadena
	 */
	
	 public void pruebaCadenas() {
		 String nombre = "LAS PALMAS DE GRAN CANARIA";
		 String cadena1 = "abca";
		 String cadena2 = "a1cabbbdsbbb";
		 System.out.println(cadena1.compareTo(cadena2));
		 for (int i = 0; i < nombre.length(); i++) {
			System.out.println(nombre.charAt(i));
		}
	 }
	 
	 /*
	  *Ejercicio 1
	  *Dado un saldo inicial y una lista de movimientos, se pide obtener el saldo final.
	  */
	 
	 public float calcularSaldoFinal (float saldoInicial, float[] movimientos) {
		float resultado = saldoInicial;
		for (int i = 0; i < movimientos.length; i++) {
			resultado += movimientos[i];
		}
		return resultado;
	 }
	 
	 /*
	  *Ejercicio 2
	  *Se pide obtener un método que devuelva la media de  n números aleatorios.
	  */
	 
	public int ejercicio2(int n, int inferior, int superior) {
		int resultado = 0;
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			resultado += r.nextInt(superior - inferior) + inferior;
		}
		/*
		 * conversiones de tipos y lo hace truncando 
		 * ejemplo 7/2=3.5 devolvera a 3 por ser un entero
		 *================================================
		 * 
		 * CASTING= conversion dinamica de tipos
		 *
		 *================================================
		 */
		return resultado / n; 
	 }
	
	/*
	 * 31/10/2018
	 * matriz de venta
	 * vendedor son filas; mes son columnas
	 */
	
	public float[] resumenVendedor (float[][] ventas) {
		float[] resultado = new float[ventas.length];
		for (int i = 0; i < ventas.length; i++) {
			for (int j = 0; j < ventas[i].length; j++) {
				resultado[i] += ventas[i][j];
			}
		}
		return resultado;
	}

	 
	public static void pruebasAPI() {
		//1. Imprime por consola el valor de 2 elevado a 3
		System.out.print(Math.pow(2.0, 3.0));
		//2. Imprime por consola un valor aleatorio entre 1 y 100
		Random r = new Random();
		int valorAleatorio;
		for (int i = 0; i < 10; i++) {
			valorAleatorio = r.nextInt(100);
			System.out.print(valorAleatorio + ", ");
		}
		System.out.println();
		//3. en la cadena "LAS PALMAS DE GRAN CANARIA" IMPRIME "GRAN"
		String cadena = "LAS PALMAS DE GRAN CANARIA";
		cadena = cadena.substring(14, 18);
		System.out.println(cadena);
		/*
		 * otra opcion es:
		 * System.out.println("LAS PALMAS DE GRAN CANARIA".substring(14, 18))
		 */		
	}
	
	/*
	 * Generador de matrices
	 */
	
	public float[][] generarMatriz (int filas, int columnas, int inferior, int superior){
		Random r = new Random();
		float[][] resultado = new float[filas][columnas];
		for (int i = 0; i < resultado.length; i++) {
			for (int j = 0; j < resultado[i].length; j++) {
				resultado[i][j] = r.nextInt(superior - inferior) + inferior;
			}
		}		
		return resultado;
	} 
}
