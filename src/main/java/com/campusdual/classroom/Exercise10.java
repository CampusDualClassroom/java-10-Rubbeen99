package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {


    // Imprimir el color de las pelotas que salgan, hasta que salgan 2 de color azul
    // El mensaje a imprimir es → La bola es de color: COLOR_BOLA
    // COLOR_BOLA puede ser → rojo, azul, verde
    public static void main(String[] args) {
        int contadorBolaazul = 0;

        while (contadorBolaazul < 2) {
            String colorBola = getBall();
            System.out.println("La bola es de color: " + colorBola);
            if (colorBola.equals("azul")) {
                contadorBolaazul++;
            }
        }
    }


    // Un metodo que devuelva una cadena de texto con el color deD una pelota (en minúscula). Dicho color se escogerá de
    // manera aleatoria. Se empleará el metodo randomWithRange(int min, int max) para escoger un numero aleatorio, que
    // lo asociaremos al valor de un color de la siguiente manera:
    // 1 → rojo
    // 2 → azul
    // 3 → verde
    public static String getBall() {
        int numeroAleatorio = randomWithRange(1, 4);

        switch (numeroAleatorio) {
            case 1:
                return "rojo";
            case 2:
                return "azul";
            case 3:
                return "verde";
            default:
                return "rojo";
        }
    }



    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}