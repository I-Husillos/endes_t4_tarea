package org;

/**
 * Clase Auto </br>
 * Clase que define un objeto que representa un automóvil, en en donde se definira su marca y modelo
 * @author Iván Husillos / Tunivers Formación
 * @version 1.0 20/02/2024
 */
public class Auto {

    /**
     * Objeto marca de tipo String </br>
     * Representa la marca del automóvil
     */
    private String marca;

    /**
     * Objeto modelo de tipo String </br>
     * Representa el modelo del automóvil
     */
    private String modelo;


    /**
     * Constructor de la clase Auto </br>
     * Constructor para definir los valores de marca y modelo
     * @param marca Variable que representa la marca del automóvil
     * @param modelo Variable que representa el modelo del automóvil
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Método getMarca </br>
     * Método para devolver la marca
     * @return Para retornar la marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método setMarca </br>
     * Método que establece la marca
     * @param marca Parametro que representa al valor marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método getModelo </br>
     * Método para devolver el modelo
     * @return Para retornar el modelo
     */
    public String getModelo() {
        return modelo;
    }


    /**
     * Método setModelo </br>
     * Método que establece el modelo
     * @param modelo Parametro que representa al valor modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    /**
     * Método toString </br>
     * Método para imprimir una cadena con los datos marca y modelo del automóvil
     * @return para retornar la cadena con los datos de marca y modelo
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}