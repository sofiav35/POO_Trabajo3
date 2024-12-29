package Punto7;

public class Comparar {
    
    double a;
    double b;

    public Comparar(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public String compararValores(){
    
        if(a>b){
            return "A es mayor que B";
        }
        
        else if(a<b){
            return "A es menor que B";
        }
    
        else{ 
            return "A es igual que B";
        } 
   }
    
    public static String limpiar_parametros(){
        return "";
    }
    
    
}
