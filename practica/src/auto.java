/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UTBIS
 */
public class auto {
    private int puertas;
    private int llantas;
    private boolean prender;
    
    public auto(int puertas, int llantas, boolean prender){
        this.puertas=puertas;
        this.llantas=llantas;
        this.prender=prender;
     }// cierre constructor
    
    public void encendido(boolean a){
        this.prender=a;
    }// cierre de encendido
    public boolean getprender(){
        System.out.println("El coche esta: " +prender);
        return prender;
    }// cierre de getprender
    public void puertas(int b){
        this.puertas=b;
    }// cierre de puertas
    public int getpuertas(){
        System.out.println("El coche tiene: " +puertas +" puertas");
        return puertas;
    }// cierre de getpuertas
     public void llantas(int c){
        this.llantas=c;
    }// cierre de llantas
    public int getllantas(){
        System.out.println("El coche tiene: " +llantas+ " llantas");
        return llantas;
    }// cierre de getprender
    @Override
    public String toString(){
    String aux="";
    aux="El auto tiene:\n" +llantas+ "llantas\n" +puertas+"puertas\n esta";
    if(prender){
        aux=aux+"encendido";
    }else{
        aux=aux+"apagado";
    }//cierra if-else
    return aux;
    }//cierra toString
    
}// cierre de clase
