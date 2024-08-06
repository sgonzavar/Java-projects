package supermercado;

public class Cliente {
     private int Id;
     private String Nombres;
     
     public Cliente (){  
     }
    
     public Cliente (int Id,String Nombres){
         this.Id = Id;
         this.Nombres = Nombres;
     }
    
     @Override
     public String toString(){
         if (Id == 0){
             return "Sin cliente\n";
         }
        return String.format("%d %s\n", Id, Nombres);
     }
}


