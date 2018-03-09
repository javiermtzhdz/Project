/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UTBIS
 */
public class principal {
    public static void main(String[] args) {
        auto Auto=new auto(5,4,false);
        int aux=5;
        boolean var1=Auto.getprender();
        System.out.println("Value: "+var1);
        Auto.encendido(true);
        Auto.getprender();
        
        auto Puertas=new auto(5,4,false);
        int aux1=5;
        int var2=Puertas.getpuertas();
        System.out.println("Value: "+var2);
        Puertas.puertas(5);
        Puertas.getpuertas();

        auto Llantas=new auto(5,4,false);
        int aux2=5;
        int var3=Llantas.getllantas();
        System.out.println("Value: "+var3);
        Llantas.llantas(4);
        Llantas.getllantas(); 
        System.out.println(2+4*9-3);
        System.out.println((2+4)*9-3);
        System.out.println(2+(4*9)-3);
        System.out.println(2+4*(9-3));
        System.out.println((2+4*9)-3);
    }// cierre de main
 
    
 
}// cierre de clase
