/* Este programa consiste en jugar piedra, papel o tijera. Va a recibir dos entradas de la opcion que haya elegido cada jugador y evaluara quien gana */
package com.generation; // Se crea una carpeta src y un paquete con este nombre que contenga la clase

import java.util.Scanner; // Se importa paquete java.util

public class Ejercicio4 {
	// Se crea el metodo main
	public static void main( String[] args) {
		/* Se cambian los nombres ambiguos por unos mas significativos */
		Scanner scan = new Scanner(System.in); //Se le pone System.in dentro de los parentesis 
		
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String jugador1 = scan.nextLine();
		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // Es jugador 2 en vez de jugador 1
		//Se quita instancia de Scanner repetida
		String jugador2 = scan.nextLine();
		if (jugador1.equals(jugador2)) { // Se le quita cierre de parentesis adicional y se pone equals() en vez de ==
			System.out.println("Empate");
		} else {
			int ganador = 2;
			switch(jugador1) {
				case "piedra":
					if (jugador2.equals("tijeras")) { // Se sustituye == por equals()
						ganador = 1;
					}
					break; // Se pone un break para evitar sobreescritura de decisiones
				case "papel":
					if (jugador2.equals("piedra")) {// Se sustituye == por equals()
						ganador = 1;
					} // Aqui se debe cerrar el bloque
					break; // Se pone un break para evitar sobreescritura de decisiones
				case "tijeras":// Se le pone una s al final
					if (jugador2.equals("papel")) {
						ganador = 1;
					}
				default:
					break; //Se pone dentro del default en vez del case 'tijera'
			}
			System.out.println("Gana el jugador " + ganador); // Se saca del switch
		}
		scan.close(); // Se cierra la instancia scan
	}
}