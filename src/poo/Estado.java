package poo;


public class Estado {
 private String texto;
 private int num;
    
  public int numerico(String texto){
      
      if(texto.equals("Pendiente")){
        num=1;
      }
      if(texto.equals("Asignado")){
        num=2;
      }
      if(texto.equals("Trabanjo")){
        num=3;
      }
      if(texto.equals("Terminado")){
        num=4;
      }
    return num;
    }
    
  public String letra(int num){
     if(num==1){
      texto="Pendiente";
     }
     if(num==2){
       texto="Asignado";
     }
     if(num==3){
       texto="Trabanjo";
     }
     if(num==4){
       texto="Terminado";
     }
  return texto;
  }
}
