package poo;

public class TipoTarea {
private String tipol;
private int tipon;
     
     public int numerico(String n){ // Funcion que me convertira el tipo problema en entero para guardarlo en la base de datos.
        if(n.equals("Limpieza")){
          tipon=1;
        }
        if(n.equals("Electrico")){
          tipon=2;
        } 
        if(n.equals("Mecanico")){
          tipon=3;
        } 
        if(n.equals("Plomeria")){
          tipon=4;
        } 
        if(n.equals("Refrigeracion")){
          tipon=5;
        }
         if(n.equals("Carpinteria")){
          tipon=6;
        }
        if(n.equals("Area Verde")){
          tipon=7;
        } 
        if(n.equals("Preventivo")){
          tipon=8;
        } 
        if(n.equals("Pintura")){
          tipon=9;
        } 
        if(n.equals("TI")){
          tipon=10;
        }
      return tipon;     
     }
     
     public String letra(int n){ // Esta función trae la llave primaria desde la base de datos y los muestra en letras 
        
        if(n==1){
          tipol="Limpieza";
        }
        if(n==2){
          tipol="Electrico";
        }  
        if(n==3){
          tipol="Mecanico";
        }  
        if(n==4){
          tipol="Plomeria";
        } 
        if(n==5){
          tipol="Refrigeracion";
        } 
        if(n==6){
          tipol="Carpinteria";
        } 
        if(n==7){
          tipol="Area Verde";
        }  
        if(n==8){
          tipol="Preventivo";
        } 
        if(n==9){
          tipol="Pintura";
        } 
        if(n==10){
          tipol="TI";
        }
      return tipol;     
     
     }
     
}