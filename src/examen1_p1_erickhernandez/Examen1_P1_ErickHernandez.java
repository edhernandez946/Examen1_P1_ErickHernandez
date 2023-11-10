package examen1_p1_erickhernandez;

import java.util.Scanner;
import java.util.Random;

public class Examen1_P1_ErickHernandez {

    public static void FightorFlight() {

        Scanner sc = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();

        int maestria;
        int distancia = rand.nextInt(15, 30);
        char continuar;
        int continuarInt;
        int balas = 25;
        int vidaZombie = 25;

        while (true) {
            System.out.println("Ingrese maestria");
            System.out.println("1. Principiante (0% de hit extra");
            System.out.println("2. Intermedio (5% de hit extra");
            System.out.println("3. Experto (15% de hit extra");

            maestria = sc.nextInt();

            if (maestria >= 1 && maestria <= 3) {
                break;
            } else {
                System.out.println("Maestria no valida!");
            }
        }

        while (true) {

            int probabilidadDaño = rand.nextInt(1, 100);
            int daño = rand.nextInt(1, 7);
            int distanciaAvance = rand.nextInt(3, 5);

            System.out.println("El zombie se encuentra a " + distancia + " metros!");
            System.out.println("");
            System.out.println("El jugador cuenta con " + balas + " balas!");
            System.out.println("");
            System.out.println("El zombie cuenta con " + vidaZombie + " HP");
            System.out.println("");
            System.out.println("");

            switch (maestria) {

                case 1:

                    if (probabilidadDaño >= 1 && probabilidadDaño <= 65) {
                        vidaZombie -= daño;
                        balas--;

                        System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: " + daño);

                    } else {
                        distancia -= distanciaAvance;
                        balas--;

                        System.out.println("Ha fallado! El zombie se encuentra a: " + distancia + " metros");

                    }

                    break;

                case 2:

                    if (probabilidadDaño >= 1 && probabilidadDaño <= 70) {
                        vidaZombie -= daño;
                        balas--;

                        System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: " + daño);

                    } else {
                        distancia -= distanciaAvance;
                        balas--;

                        System.out.println("Ha fallado! El zombie se encuentra a: " + distancia + " metros");

                    }

                    break;

                case 3:

                    if (probabilidadDaño >= 1 && probabilidadDaño <= 85) {
                        vidaZombie -= daño;
                        balas--;

                        System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: " + daño);

                    } else {
                        distancia -= distanciaAvance;
                        balas--;

                        System.out.println("Ha fallado! El zombie se encuentra a: " + distancia + " metros");

                    }

                    break;

            }

            System.out.println("Desea continuar para la siguiente ronda? S/N");
            continuar = leer.next().charAt(0);
            continuarInt = continuar;

            if (balas <= 0) {
                if (vidaZombie <= 0) {
                    System.out.println("YOU WIN! Has logrado vencer al zombie");
                    break;
                } else {
                    System.out.println("YOU LOSE! Te has quedado sin balas");
                    break;
                }
            }

            if (vidaZombie <= 0) {
                System.out.println("YOU WIN! Has logrado vencer al zombie");
                break;
            }

            if (distancia <= 0) {
                System.out.println("YOU LOSE! El zombie ha llegado hacia ti");
                break;
            }

            if (continuarInt == 110 || continuarInt == 78) {
                break;
            }

        }

    }

    public static void triFuerza() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un tamaño par y mayor a 20, cuya division entre 2 es impar");

        int t;

        while (true) {

            t = sc.nextInt();
            int chequeo = t / 2;

            if (t % 2 == 0 && chequeo % 2 != 0) {
                break;
            } else {
                System.out.println("Numero Invalido!");
            }
        }
        
        System.out.println("");
        
        System.out.println("        *        ");
        System.out.println("       ***       ");
        System.out.println("      *****      ");
        System.out.println("     *******     ");
        System.out.println("    *       *    ");
        System.out.println("   ***     ***   ");
        System.out.println("  *****   *****  ");
        System.out.println(" ******* ******* ");
        
        System.out.println("");
        System.out.println("No pude hacerlo :(");
        

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Ingresa una opcion (1 y 2, 3 cierra el programa)");
            int opcion = sc.nextInt();

            switch (opcion) {

                case 1: {
                    FightorFlight();
                    break;
                }

                case 2: {
                    triFuerza();
                    break;
                }

                case 3: {
                    System.out.println("Fin del programa");
                    break;
                }
            }

            if (opcion == 3) {
                break;
            }

        }

    }

}
