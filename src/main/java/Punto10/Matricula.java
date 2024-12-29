package Punto10;

public class Matricula {
    /*Atributos*/
    String estudiante;
    double numInscripcion;
    double patrimonio;
    double estrato;
    double pagoMatricula=50000;
    
    /*Constructor*/
    public Matricula(String estudiante, double numInscripcion, double patrimonio, double estrato) {
        this.estudiante = estudiante;
        this.numInscripcion = numInscripcion;
        this.patrimonio = patrimonio;
        this.estrato = estrato;
    }
     
    /*Métodos*/
    public double pagoTotal(){
       
       if(patrimonio>2000000 && estrato>3){
           pagoMatricula= pagoMatricula +(patrimonio*(estrato/100));
           return pagoMatricula;
       }
       else{
           return pagoMatricula;
       }
    }
    
    public static String obtenerNombre(String estudiante){
        return estudiante;
    }
    
    public static double obtenerInscripcion(double numInscripcion){
        return numInscripcion;
    }
    
    public static String limpiarParametros(){
        return "";
    }
}
