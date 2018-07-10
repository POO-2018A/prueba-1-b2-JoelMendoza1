/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendafrutas;

import java.util.ArrayList;

/**
 *
 * @author ESFOT
 */
public class Clientes {
    String nombre;
    String cedula;
    public ArrayList<Frutas> frutas;

    public Clientes(String nombre, String cedula, ArrayList<Frutas> frutas) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.frutas = frutas;
    }
  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Frutas> getFrutas() {
        return frutas;
    }

    public void setFrutas(ArrayList<Frutas> frutas) {
        this.frutas = frutas;
    }

    
    
}
