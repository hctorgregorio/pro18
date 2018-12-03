package control;

import java.util.Random;
import modelo.Persona;

public class Ejercicios {
	
	//Ejercicio 1
	
	private Persona[] personas;
	
	//Ejercicio 2
	public void hijosPersonas(Persona[] personas) {
		
		
		for (int i = 0; i < personas.length; i++) {
			System.out.println("Nombre = " + personas[i].getNombre());
			if(personas[i].getHijosBiologicos() != null) {
				for (int j = 0; j < personas[i].getHijosBiologicos().length; j++) {
					if (personas[i].getHijosBiologicos()[j].getSexo() == 'M') {
						System.out.println("hijo " + j + "= " + personas[i].getHijosBiologicos()[j].getNombre());
					} else {
						System.out.println("hija " + j + "= " + personas[i].getHijosBiologicos()[j].getNombre());
					}
				}
				System.out.println("======================");
			} else {
				System.out.println("No tiene hijos");
				System.out.println("======================");
			}
		}
	}
	
	
	public static void main(String[] args) {
		//private Persona[] personas;
		
		
		/**
		 * ================================================
		 * Declaracion e incializacion de un objeto Persona
		 * ================================================
		 */
		
		/*
		Persona juan;
		juan = new Persona("1234","juan palomo", 20);
		//Persona persona1 = new Persona();
		int pasos = juan.caminar(20);
		*/
		
		Ejercicios ejercicio = new Ejercicios();
		
		/**
		 * ===============================
		 * Llamada a listaIntervalosEntero
		 * ===============================
		 */
		
		/*
		int x = 10;
		int y = 30;
		ejercicio.listaIntervaloEntero(x, y);
		System.out.println();
		*/
		
		/**
		 * ====================
		 * Ejercicio 10-10-2018
		 * ====================
		 */
		
		/*
		System.out.println("Convierte cadena en entero");
		String cadena = "2756";
		System.out.println(ejercicio.convierteCadenaAEntero(cadena));
		*/
		
		/**
		 * ===================
		 * Ejercicio Fibonacci
		 * ===================
		 */
		
		/*
		System.out.println("Dado un numero, imprimir tantos numeros de la Serie de Fibonacci ");
		int contador = 10;
		ejercicio.serieFibonacci(contador);
		*/
		
		/**
		 * ===================
		 * Ejercicio Factorial
		 * ===================
		 */
		
		/*
		System.out.println("factorial de un numero");
		int numFactorial = 7;
		System.out.println(ejercicio.factorial(numFactorial));
		*/
		
		/**
		 * =================
		 * Clase.estatico
		 * objeto.noestatico
		 * =================
		 */
		
		/*
		 * ===================================
		 * Numero menor, sobrecarga de metodos
		 * ===================================
		 
		int num1 = 1, num2 = 1, num3 = 4, num4 = 2;
		
		//static
		System.out.println("Primer metodo menor");
		System.out.println(ejercicio.numeroMenor(num1, num2, num3));
		
		//no static
		System.out.println("segundo metodo menor 4 parametros");
		int menor = Ejercicios.numeroMenor(num1, num2, num3, num4);
		System.out.println(menor);
		*/
		
		/**
		 * ==========================================================
		 * 			  variable longitud de los arrays
		 * ==========================================================
		 */

		//int longitudArray = 30;
		
		/**
		 * =================
		 * generarAleatorios
		 * =================
		 */
		
		/*
		System.out.println("array de numeros aleatorios");
		int[] misAleatorios = new int[longitudArray];		
		misAleatorios = ejercicio.generaAleatorios(longitudArray);
		*/
		
		/**
		 * ==================
		 * imprimirAleatorios
		 * ==================
		 */
		
		/*
		System.out.println("Imprimir numeros aleatorios por consola");
		int numerosAleatorios = 30;
		ejercicio.imprimirAleatorios(numerosAleatorios);
		*/
		
		/**
		 * ======================
		 * generarListaAleatorios
		 * ======================
		 */
		
		/*
		System.out.println("numeros aleatorios comprendidos en un rango dentro de un array");
		int[] arrayAleatorios = new int[longitudArray];
		int rangoInferior = 100;
		int rangoSuperior = 500;
		arrayAleatorios = ejercicio.generaListaAleatorios(longitudArray, rangoInferior, rangoSuperior);
		*/
		
		/**
		 * ===========================
		 * generarEstadisticaAparicion
		 * ===========================
		 */
		
		/*
		int[] estadistica = ejercicio.generaEstadisticaAparicion(1000, 5, 10);
		*/
		
		/**
		 * =============
		 * listaPersonas
		 * =============
		 */
		
		/*
		Persona[] lista = ejercicio.listaPersonas(10);
		*/
		
		/**
		 * ==================
		 * calcularSaldoFinal
		 * ==================
		 */
		
		/*
		float saldo = 15.92f;
		float[] movimientos = {500f, -100.25f, -50.36f, -250.78f, 100.50f};
	
		System.out.println("el saldo actual es: " + ejercicio.calcularSaldoFinal(saldo, movimientos));
		*/
		
		/**
		 * ==========
		 * ejercicio2
		 * ==========
		 */
		
		/*
		int rango = 5;
		int inf = 10;
		int sup = 20;
		System.out.println("La media es: " + ejercicio.ejercicio2(rango, inf, sup));
		*/
		
		/**
		 * =============
		 * pruebaCadenas
		 * =============
		 */
		
		//ejercicio.pruebaCadenas();
		
		/**
		 * =======
		 * esPrimo
		 * =======
		 */
		
		//boolean primo = ejercicio.esPrimo(6);
		
		/**
		 * ============
		 * ordenarArray
		 * ============
		 */
		
		/*
		int[] numerosDesordenados = {5, 3, 7, 9, 2, 1, 6, 4, 5};
		ejercicio.ordenarArray(numerosDesordenados);
		*/
		
		/**
		 * =============
		 * ordenarCadena
		 * =============
		 */
		
		/*
		String[] cadenaDesordenados = {"5", "3", "7", "9", "2", "1", "6", "4", "5"};
		ejercicio.ordenarCadena(cadenaDesordenados);
		*/
		
		/**
		 * ========================================
		 * ************MATRICES********************
		 * ========================================
		 */
		
		/*
		float[][] matrizIrregularFloat = {
				{10.5f, 15.0f, 5.5f, 2.5f, 7.5f, 5.0f, 5.5f, 2.5f, 10.5f, 15.0f, 7.5f, 5.0f},//12
				{5.5f, 2.5f, 7.5f, 5.0f, 5.5f, 2.5f, 10.5f, 15.0f, 7.5f, 5.0f},//10
				{10.5f, 15.0f, 5.5f, 2.5f, 10.5f, 15.0f, 7.5f, 5.0f},//8
				{5.0f, 5.5f, 2.5f, 2.5f, 7.5f, 5.0f, 5.5f, 2.5f, 10.5f, 15.0f, 7.5f}//11
		};
		
		float[][] matrizRegularFloat = {
				{10.5f, 15.0f, 5.5f, 2.5f, 7.5f, 5.0f},//12
				{5.5f, 2.5f, 7.5f, 5.0f, 5.5f, 2.5f},//10
				{10.5f, 15.0f, 5.5f, 2.5f, 10.5f, 15.0f},//8
				{5.0f, 5.5f, 2.5f, 2.5f, 7.5f, 5.0f}//11
		};
		*/
		
		/**
		 * ===============
		 * resumenVendedor
		 * ===============
		 */
		
		//float[] resumenVendedor = ejercicio.resumenVendedor(matrizRegularFloat);
		
		/**
		 * ==============
		 * resumenMensual
		 * ==============
		 */
		
		//float[] resumenMensual = ejercicio.resumenMensual(matrizRegularFloat);
		
		/**
		 * =======================
		 * resumenMensualIrregular
		 * =======================
		 */
		
		//float[] resumenMensualIrregular = ejercicio.resumenMensualIrregular(matrizRegularFloat);
		
		/**
		 * ===============================
		 * *********EXCEPCIONES***********
		 * ===============================
		 */
		
		/**
		 * ================
		 * convierteCadenas
		 * ================
		 */
		
		/*
		String[] cadenasNumericas = {"123" , "63A", "101", "XYZ"};
		int[] cadenaConvertida = ejercicio.convierteCadenas(cadenasNumericas);
		*/
		
		//ejercicio.reloj();
		
		/**
		 * ==========================================
		 * **************REPASO**********************
		 * ==========================================
		 */
		
		/**
		 * =============
		 * invertirLista
		 * =============
		 */
		
		/*
		int[] listaNumeros = {1, 3, 5, 7, 0, 2, 4, 6, 8};
		ejercicio.invertirLista(listaNumeros);
		*/
		
		/**
		 * ======================
		 * mezclarListasOrdenadas
		 * ======================
		 */
		
		//CASO 1 IZQ
		/*
		int[] lista1 = {0, 1, 3, 9};
		int[] lista2 = {1, 2, 3, 4, 5, 6, 7};
		*/
		/*
		int[] lista1 = {1, 2, 3, 4, 5, 6, 7};
		int[] lista2 = {0, 1, 3, 9};
		*/
		/*
		int[] l1 = {0, 1, 3, 9};
		int[] l2 = {1, 2, 3, 4, 5, 6, 7};
		int[] mezcla = ejercicio.mezclarListasOrdenadas(l1, l2);
		*/
		
		/**
		 * ==================
		 * invertirCaracteres
		 * ==================
		 */
		
		/*
		String cadenaEjemplo = "el ejercicio esta bien hecho";
		String cadenaInvertida = ejercicio.invertirCaracteres(cadenaEjemplo);
		*/
		
		int[][] matrizIrregularEnteros = {
				{10, 15, 5, 2, 7},//5
				{0, 11, 3, 8, 4, 1, 2},//7
				{9, 5, 4, 7, 4},//5
				{3, 1, 5, 8}//4
		};
		for (int i = 0; i < matrizIrregularEnteros.length; i++) {
			ejercicio.ordenarArray(matrizIrregularEnteros[i]);
		}
		int[] arrayDeMatrizOrdenado = ejercicio.matrizToArrayOrdenado(matrizIrregularEnteros);
		
		/*
		 * Declara en la clase Ejercicios un array de Personas
		 * 
		 * En la clase Personas delcara un array de Personas que representan los hijos biologicos que tiene.
		 * 
		 * Hacer un commit local al conseguir cada objetivo 1,2
		 * 
		 */
		
		/**
		 * =================================
		 * **********PERSONAS***************
		 * =================================
		 */
		
		Persona juan = new Persona("1", "juan", 20, 'M');
		Persona pepe = new Persona("2", "pepe", 20, 'M');
		Persona lola = new Persona("3", "lola", 20, 'F');
		Persona paca = new Persona("4", "paca", 20, 'F');
		Persona juana = new Persona("5", "juana", 20, 'F');
		Persona jaime = new Persona("6", "jaime", 20, 'M');
		Persona bartola = new Persona("7", "bartola", 20, 'F');
		Persona manolo = new Persona("8", "manolo", 20, 'M');
		Persona padre1 = new Persona("9", "padre1", 20, 'M');
		Persona madre1 = new Persona("10", "madre1", 20, 'M');
		Persona madre2 = new Persona("11", "madre2", 20, 'F');
		
		Persona[] personas = {juan, pepe, lola, paca, juana, jaime, bartola, manolo};
		
		Persona[] hijos1 = {pepe, lola};
		juan.setHijosBiologicos(hijos1);
		Persona[] hijos2 = {juana};
		lola.setHijosBiologicos(hijos2);
		Persona[] hijos3 = {jaime, bartola, manolo};
		juana.setHijosBiologicos(hijos3);
		
		ejercicio.hijosPersonas(personas);
		
		manolo.setPadre(padre1);
		manolo.setMadre(madre1);
		manolo.setMadre(madre2);
		
		System.out.println("El padre de " + manolo.getNombre() + " es " + manolo.getPadre().getNombre());
		System.out.println("La madre de " + manolo.getNombre() + " es " + manolo.getMadre().getNombre());
		
		/**
		 * ======================
		 * mezclaCadenaOrdenada
		 * ======================
		 */
		
		String[][] cadenaMatrizOrdenada = {
				{"a", "c", "e", "g", "i"},
				{"b", "d", "f"},
				{"h", "j"}
		};
		String[] cadenaArrayOrdenado = ejercicio.matrizToArrayOrdenado(cadenaMatrizOrdenada); 		
		
		
		
		
		System.out.println("FIN DEL PROGRAMA");
	}
	
	/**
	 * ====================
	 * 		METODOS		  
	 * ====================
	 */
	
	public void listaIntervaloEntero (int primero, int ultimo) {
		while(primero <= ultimo) {
			System.out.print(primero++ + ", ");
		}
	}
	
	public Integer convierteCadenaAEntero(String cadena) {
		return Integer.parseInt(cadena);
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
	 
	public boolean esPrimo(int numero) {
		if (numero == 1){
			System.out.print("el numero es 1 o 0");
			return true;
		}
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				System.out.print("El numero no es primo");
				return false;
			}
		}
		System.out.print("el numero es primo");
		return true;
	}
	
	public void ordenarArray (int[] array) {
		int x;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					x = array[i];
					array[i] = array[j];
					array[j] = x;
				}
			}
		}
	}
	
	public void ordenarCadena (String [] cadena) {
		String x;
		for (int i = 0; i < cadena.length - 1; i++) {
			for (int j = i + 1; j < cadena.length; j++) {
				if (cadena[i].compareTo(cadena[j]) > 0) {
					x = cadena[i];
					cadena[i] = cadena[j];
					cadena[j] = x;
				}
			}
		}
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
	/*
	 * 31/10/2018
	 * resumen mensual recorrer por columnas
	 */
	
	
	public float[] resumenMensual (float[][] ventas) {
		String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" };
		float[] resultado = new float[ventas[0].length];
		for (int j = 0; j < ventas[0].length; j++) {
			for (int i = 0; i < ventas.length; i++) {
				resultado[j] += ventas[i][j];
			}
			System.out.println("el resumen del mes de " + meses[j] + " es: " + resultado[j]);
		}
		System.out.println();
		return resultado;
		
		/*
		 * =====================
		 * mi posible solucion
		 * =====================
		 * 	for (int i = 0; i < resultado.length; i++) {
				for (int j = 0; j < ventas.length; j++) {
					resultado[i] += ventas[j][i];
				}
				System.out.println("el resumen del mes de " + meses[i] + " es: " + resultado[i]);
			}
			return resultado;
		 */
	}
	public float[] resumenMensualIrregular (float[][] ventas) {
		String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" };
		float[] resultado = new float[12];
		for (int j = 0; j < ventas[0].length; j++) {
			for (int i = 0; i < ventas.length; i++) {
				try {
					resultado[j] += ventas[i][j];
				} catch (IndexOutOfBoundsException e) {
					resultado[j] += 0;
				}
				
			}
			System.out.println("el resumen del mes de " + meses[j] + " es: " + resultado[j]);
		}
		return resultado;
	}
	
/*		
*/	
	/*
	 * NullPointer
	 * NumberFormat => String x = "6x9"; int numero = Integer.parseInt(x); 
	 * ArrayIndexOutOfBounds
	 */
	
	public int[] convierteCadenas(String[] cadenasNumericas) {
		int [] resultado = new int[cadenasNumericas.length];
		for (int i = 0; i < resultado.length; i++) {
			try {
				resultado[i] = Integer.parseInt(cadenasNumericas[i]);
			} 
			catch (NumberFormatException e) {
				//devuelve -1 si no es convertible
				resultado[i] = -1;
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		return resultado;	
	}
	
	/*
	 * ======================================
	 *            REPASO
	 * ======================================
	 * 
	 * 1º INVERTIR ELEMENTOS DE UNA LISTA (ORDENAR DE MAYOR A MENOR O VICEVERSA)
	 * 
	 * 2º MEZCLAR DOS LISTAS, PREVIAMENTE ORDENADAS
	 * 
	 * 3º INVERTIR LOS CARACTERES DE UNA CADENA
	 * 
	 */
	
	// 1º 
	
	public void invertirLista (int[] lista) {
		int aux;
		for (int i = 0; i < lista.length / 2; i++) {
			aux = lista[i];
			lista[i] = lista[lista.length - 1 - i];
			lista[lista.length - 1 - i] = aux;
		}
	}
	
	// 2º
	
	public int[] mezclarListasOrdenadas (int[] l1, int[] l2) {
		int[] resultado = new int[l1.length + l2.length];
		int i = 0;
		int j = 0;
		
		for (int k = 0; k < resultado.length; k++) {
			try {
				if (l1[i] <= l2[j]) {
					resultado[k] = l1[i];
					i++;
				} else {
					resultado[k] = l2[j];
					j++;
				}
			} catch (IndexOutOfBoundsException e1) {				
				if (l1.length > l2.length ) {
					try {
						resultado[k] = l1[i];
						i++;
					} catch (IndexOutOfBoundsException e2) {
						resultado[k] = l2[j];
					}
				} else {
					try {
						resultado[k] = l2[j];
						j++;
					} catch (IndexOutOfBoundsException e3) {
						resultado[k] = l1[i];
					}
				}
				
			}
		}

		return resultado;
	}
	
	public String invertirCaracteres (String cadena) {
		String resultado = new String();
		System.out.println(cadena.length());
		for (int i = cadena.length() - 1; i >= 0; i--) {
			//resultado += cadena.charAt(i);
			resultado = resultado.concat(cadena.substring(i, i + 1));
		}
		return resultado;
	}
	
	public int[] matrizToArrayOrdenado (int[][] matriz) {

		int[] resultado = new int[0];
		for (int i = 0; i < matriz.length; i++) {
			resultado = mezclarListasOrdenadas(resultado, matriz[i]);
		}
		return resultado;
	}
	
	/**
	 * =============================
	 * 		METODOS PROPIOS
	 * =============================
	 */
	public void reloj() {
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				for (int k = 0; k < 60; k++) {
					try {
						System.out.println(i + ":" + j + ":" + k);
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("Error");;
					}
				}
			}
		}
	}
	
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
	
	public String[] mezclaCadenasOrdenadas(String[] cadena1, String[] cadena2) {
		String[] resultado;
		if (cadena1.length == 1) {
			resultado = new String[cadena1.length + cadena2.length - 1];
		} else {
			resultado = new String[cadena1.length + cadena2.length];
		}
		int i = 0;
		int j = 0;
		
		for (int k = 0; k < resultado.length; k++) {
			try {
				if (cadena1[i].compareTo(cadena2[j]) <= 0) {
					resultado[k] = cadena1[i];
					i++;
				} else {
					resultado[k] = cadena2[j];
					j++;
				}
			} catch (NullPointerException e1) {				
				if (cadena1.length > cadena2.length ) {
					try {
						resultado[k] = cadena1[i];
						i++;
					} catch (NullPointerException e2) {
						resultado[k] = cadena2[j];
					}
				} else {
					try {
						resultado[k] = cadena2[j];
						j++;
					} catch (NullPointerException e3) {
						resultado[k] = cadena1[i];
					}
				}
				
			} catch (IndexOutOfBoundsException e1) {				
				if (cadena1.length > cadena2.length ) {
					try {
						resultado[k] = cadena1[i];
						i++;
					} catch (IndexOutOfBoundsException e2) {
						resultado[k] = cadena2[j];
					}
				} else {
					try {
						resultado[k] = cadena2[j];
						j++;
					} catch (IndexOutOfBoundsException e3) {
						resultado[k] = cadena1[i];
					}
				}
				
			}
		}

		return resultado;
	}
	
	public String[] matrizToArrayOrdenado(String[][] cadenaOrdenada) {
		String[] resultado = new String[1];
		for (int i = 0; i < cadenaOrdenada.length; i++) {
			resultado = mezclaCadenasOrdenadas(resultado, cadenaOrdenada[i]);
		}
		return resultado;
	}
	
}
