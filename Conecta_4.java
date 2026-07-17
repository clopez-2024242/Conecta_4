package org.carloslopez.sistema;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conecta4CarlosLopez {

    private static InputStreamReader tecla = new InputStreamReader(System.in);
    private static BufferedReader lectura = new BufferedReader(tecla);
    private static int[][] tableroDeLaPc = new int[6][7];
    private static int numeroDeJugadas = 0;
	
//matriz del tablero de juego
  private static char [][] dibujoDelEsenario = new char [][] {
		{'#','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','#'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@',' ',' ',' ',' ',' ',' ','@'},
		{'#','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','@','#'}

	};

//matriz de la ficha de Jugador1
    private static char[][] ficha1 = {
        {' ', '#', '#', ' '},
        {'#', '#', '#', '#'},
        {'#', '#', '#', '#'},
        {' ', '#', '#', ' '}
    };


//matriz de la ficha de Jugador2
    private static char[][] ficha2 = {
        {' ', '%', '%', ' '},
        {'%', '%', '%', '%'},
        {'%', '%', '%', '%'},
        {' ', '%', '%', ' '}
    };

/**
*Esta parte es la que contiene el menu para decidir que se realizara, si jugar o salir del juego
*@param 1 para jugar, 0 para salir
*@return jugarConecta4
*/

    public static void main(String[] args) throws IOException {
        int opcionMenu = 0;
        do {
			//muestra las opciones del menu
            System.out.print("\n\t" + "---- Conecta 4 ----" + "\n\t" + "\t 1. JUGAR. 0. SALIR: ");
            opcionMenu = Integer.parseInt(lectura.readLine());
            switch (opcionMenu) {
                case 0:
					//mensaje si se decide salir
                    System.out.print("Ha elegido salir. Vuelve pronto!");
                break;
                case 1:
					//opcion de jugar
                    jugarConecta4();
				break;
            }
        } while (opcionMenu != 0);
    }//public static void main

/**
*Esta parte es la que se encarga de dibujar el tablero del juego
*@return dibujoDelEsenario
*/
    private static void dibujarTablero(char[][] dibujoDelEsenario) {
        for (int i = 0; i < dibujoDelEsenario.length; i++) {
            for (int j = 0; j < dibujoDelEsenario[i].length; j++) {
                System.out.print(dibujoDelEsenario[i][j] + " ");
            }
            System.out.println();
        }
    }//dibujarTablero

/**
*Esta parte es la que se encarga de dibujar las piezas del juego
*@return ficha1 y ficha2
*/

    public static void dibujarPieza(char[][] pieza, int posicion) {
        int columna = (posicion - 1) % 7;
        int fila = encontrarFilaDisponible(columna);
        if (fila != -1) {
            // Dibuja la pieza en la posición calculada
            int y = 2 + fila * 7;
            int x = 2 + columna * 7;
            for (int i = 0; i < pieza.length; i++) {
                for (int j = 0; j < pieza[i].length; j++) {
                    dibujoDelEsenario[y + i][x + j] = pieza[i][j];
                }
            }
            tableroDeLaPc[fila][columna] = (pieza == ficha2) ? 1 : 2;
            numeroDeJugadas++;
				//mensajes para verificar cual de los dos jugadores es el ganador
            if (verificarGanador(fila, columna)) {
                dibujarTablero(dibujoDelEsenario);
                String ganador = (numeroDeJugadas % 2 == 0) ? "Jugador 1" : "Jugador 2";
                System.out.println("\n¡" + ganador + " ha ganado!");
                System.exit(0);
            }
        }
    }//dibujarPieza

/**
*Esta parte es la que se encarga de verificar si alguno de los jugadores ha ganado
*@return true
*/

    private static boolean verificarGanador(int fila, int columna) {
        int jugador = tableroDeLaPc[fila][columna];
        // Verificar horizontal
        int contador = 0;
        for (int j = 0; j < 7; j++) {
            if (tableroDeLaPc[fila][j] == jugador) {
                contador++;
                if (contador == 4) return true;
            } else {
                contador = 0;
            }
        }

		/**
		*Ganar de forma vertical
		*@return true
		*/

        contador = 0;
        for (int i = 0; i < 6; i++) {
            if (tableroDeLaPc[i][columna] == jugador) {
                contador++;
                if (contador == 4) return true;
            } else {
                contador = 0;
            }
        }

        /**
		*Ganar de forma diagonal hacia arriba
		*@return true
		*/

        contador = 0;
        int filaInicio = fila;
        int columnaInicio = columna;
        while (filaInicio > 0 && columnaInicio > 0) {
            filaInicio--;
            columnaInicio--;
        }
        while (filaInicio < 6 && columnaInicio < 7) {
            if (tableroDeLaPc[filaInicio][columnaInicio] == jugador) {
                contador++;
                if (contador == 4) return true;
            } else {
                contador = 0;
            }
            filaInicio++;
            columnaInicio++;
        }

        /**
		*Ganar de forma diagonal hacia abajo
		*@return true
		*/
		
        contador = 0;
        filaInicio = fila;
        columnaInicio = columna;
        while (filaInicio < 5 && columnaInicio > 0) {
            filaInicio++;
            columnaInicio--;
        }
        while (filaInicio >= 0 && columnaInicio < 7) {
            if (tableroDeLaPc[filaInicio][columnaInicio] == jugador) {
                contador++;
                if (contador == 4) return true;
            } else {
                contador = 0;
            }
            filaInicio--;
            columnaInicio++;
        }

        return false;
    }//verificarGanador

/**
*Esta parte es la que se encarga de comprobar una fila desocupada para colocar una pieza, si esta disponible retorna un Fila, pero si la fila esta llena, con 6 piezas ya colocadas, entonces retorna un -1
*@return fila
*@return -1
*/

    private static int encontrarFilaDisponible(int columna) {
        for (int fila = 5; fila >= 0; fila--) {
            if (tableroDeLaPc[fila][columna] == 0) {
                return fila;
            }
        }
        return -1;
    }//encontrarFilaDisponible

/**
*esta parte se encarga de la logica del juego, te indica las columnas que podrias escojer, y si alguna de estas esta ocupada te lo hace saber con un mensaje de error, igual cuando escojes un valor superior a los disponibles.
*@return false
*@return true
*/

    private static void jugarConecta4() throws IOException {
        int columna;
        boolean turnoJugador1 = true;
        while (true) {
            dibujarTablero(dibujoDelEsenario);
			// muestra las columnas disponibles 
            System.out.print("\n elige una columna (1-7): ");
            columna = Integer.parseInt(lectura.readLine());
            if (columna < 1 || columna > 7) {
				//si se escoje un valor mayor al de las columnas disponibles
                System.out.println("Columna no valida. Por favor, elige entre 1 y 7.");
            } else {
                if (tableroDeLaPc[0][columna - 1] == 0) {
                    if (turnoJugador1) {
                        dibujarPieza(ficha1, columna);
                        turnoJugador1 = false;
                    } else {
                        dibujarPieza(ficha2, columna);
                        turnoJugador1 = true;
                    }
                } else {
					//mensaje de error cuando las columnas estan llenas
                    System.out.println("Esta columna esta llena. Elije otra.");
                }
            }
			//si se llega a las 42 jugadas y nadie a ganado meustra un Empate
            if (numeroDeJugadas == 42) {
                System.out.println("\n¡Empate!");
                break;
            }
        }
    }//jugarConecta4
}