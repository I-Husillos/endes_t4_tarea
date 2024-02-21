package org;

/**
 * Clase Main </br>
 * Clase donde se definen los objetos auto1 y auto2 referenciando a automóviles y se procede a gregar su marca y modelo
 * @author Iván Husillos / Tunivers Formación
 * @version 1.0 20/02/2024
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Instanciación del objeto auto1 con los valores marca y modelo
         */
        Auto auto1 = new Auto("Peugeot", "308");
        /**
         * Instanciación del objeto auto2 con los datos marca y modelo
         */
        Auto auto2 = new Auto("Seat", "Leon");

        /**
         * Llamada al contructor de la clase Concesionario
         */
        Concesionario concesionario1 = new Concesionario();

        /**
         * Método agregarAuto </br>
         * Método para agregar el objeto auto1 a la lista autos de la clase Concesionario
         */
        concesionario1.agregarAuto(auto1);
        /**
         * Método agregarAuto </br>
         * Método para agregar el objeto auto2 a la lista autos de la clase Concesionario
         */
        concesionario1.agregarAuto(auto2);

        /**
         * Método imprimirAutos </br>
         * Método para mostrar los automóviles almacenados en el Concesionario mostrando su marca y modelo
         */
        concesionario1.imprimirAutos();
    }
}