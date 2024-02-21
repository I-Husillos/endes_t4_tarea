package org;

import java.util.ArrayList;

/**
 * Clase Concesionario </br>
 * Clase que define la lista que almacenará al objeto que representan a un automóvil
 * @author Iván Husillos / Tunivers Formación
 * @version 1.0 20/02/2024
 */
public class Concesionario {

    /**
     * Objeto autos de tipo ArrayList </br>
     * Representa la lista donde se almacenara los objetos de la clase Auto
     */
    private ArrayList<Auto> autos;

    /**
     * Constructor de la clase Concesionario </br>
     * Constructor que inicializa el objeto autos
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }

    /**
     * Método agregarAuto </br>
     * Método para agregar los objetos de tipo Auto a la lista autos
     * @param auto Nuevos datos a introducir en autos
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * Método listarAutos </br>
     * Método para retornar la lista autos
     * @return Retornar la lista autos
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }


    /**
     * Método imprimirAutos </br>
     * Método para mostrar el contenido de autos
     * Se utiliza el bucle for each para recorrer los objetos de tipo Auto en la lista autos en cada iteracion e imprime la información de la forma en que se especifica en el toString de la clase Auto
     */
    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}
