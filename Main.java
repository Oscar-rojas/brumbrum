/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author aguil
 */
public class Main {
    public static void main(String Arg[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Carro carro= new Carro();
        Moto moto= new Moto();
        int opcion=0;
        System.out.println("bienvenido al registro de vehiculos");
        System.out.println("aca podra registrar distintos de vehiculos");
        do{
            System.out.println("inserte 1 para carros y 2 para motos o inserte 9 para terminar el programa y ver lo registrado");
            opcion=Integer.parseInt(in.readLine());
            if (opcion==1){
                 System.out.println("inserte la marca del carro");
                 carro.setMarca(in.readLine());
                 System.out.println("inserte el precio del carro");
                 carro.setPrecio(Integer.parseInt(in.readLine()));
                 System.out.println("inserte el modelo del carro");
                 carro.setModelo(in.readLine());
            }
            if (opcion==2){
                 System.out.println("inserte la marca del moto");
                 moto.setMarca(in.readLine());
                 System.out.println("inserte el precio del moto");
                 moto.setPrecio(Integer.parseInt(in.readLine()));
                 System.out.println("inserte el modelo del moto");
                 moto.setModelo(in.readLine());
            }
        }while(opcion!=9);
        carro.escribir();
        moto.escribir();
    }
}
