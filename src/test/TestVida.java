
package test;

import dominio.*;
import java.util.Scanner;

public class TestVida {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese si quiere tratar con plantas o animales");
        System.out.println("<<planta>> o <<animal>>");
        String opcion = entrada.nextLine();
        if (opcion.equalsIgnoreCase("planta")) {
            System.out.println("Ingrese el nombre de una planta");
            String plant = entrada.nextLine();
            Planta planta = new Planta(plant);
            System.out.println("Planta: " + planta.getNombre());
            planta.alimentarse();
        } else if (opcion.equalsIgnoreCase("animal")) {
            System.out.println("Ingrese si es <<carnivoro>> o <<herbivoro>>");
            String opcion1 = entrada.nextLine();
            if (opcion1.equalsIgnoreCase("carnivoro")) {
                System.out.println("Ingrese el nombre de una animal Carnivoro");
                String ancar = entrada.nextLine();
                AnimalCarnivoro aniCar = new AnimalCarnivoro(ancar);
                System.out.println("Animal: " + aniCar.getNombre());
                aniCar.alimentarse();
            } else if (opcion1.equalsIgnoreCase("herbivoro")) {
                System.out.println("Ingrese el nombre de una animal Herbivoro");
                String anher = entrada.nextLine();
                AnimalHerbivoro aniHer = new AnimalHerbivoro(anher);
                System.out.println("Animal: " + aniHer.getNombre());
                aniHer.alimentarse();
            }
        }
    }
}
