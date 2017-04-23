package poo;


public class Prioridad {
   private String texto;
   private int num;
   
   public int numerico(String texto){

     if(texto.equals("Normal")){
        num= 1;
     }
     if(texto.equals("Importante")){
       num= 2;
     }
     if(texto.equals("Urgente")){
       num=3;
     }
   return num;
   }
   
   public String letra(int num){
     
       if(num==1){
        texto="Normal";
       }
       if(num==2){
        texto="Importante";
       }
       if(num==3){
        texto="Critico";
       } 
   return texto;
   }
}
