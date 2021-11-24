/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo1;

/**
 *
 * @author aguil
 */
public class Moto extends Vehiculo{
     public void escribir(){
        System.out.println("motos: "+ super.getMarca().size());
       for (int i=0; i<super.getMarca().size(); i++){
           System.out.print(super.getMarca().get(i)+" ");
           System.out.print(super.getPrecio().get(i)+" ");
           System.out.println(super.getModelo().get(i));
           System.out.println("");
    }}
}
