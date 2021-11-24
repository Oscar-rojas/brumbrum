/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo1;

import java.util.ArrayList;

/**
 *
 * @author aguil
 */
public abstract class Vehiculo {
        private ArrayList<String> marca = new ArrayList<String>();
	private ArrayList<Integer> precio = new ArrayList<Integer>();
	private ArrayList<String>  modelo= new ArrayList<String>();

    
    public ArrayList<String> getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca.add(marca);
    }

    public ArrayList<Integer> getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio.add(precio);
    }

    public ArrayList<String> getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo.add(modelo);
    }   
    
    public void escribir(){
        
       } 
    
}
