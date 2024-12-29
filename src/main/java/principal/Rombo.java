package principal;

public class Rombo {
    
    double d1;
    double d2;
    double lado;

    Rombo(double d1, double d2, double lado) {
        this.d1 = d1;
        this.d2 = d2;
        this.lado = lado;
    }

    double calcularArea() {
        return (d1*d2)/2 ;
    }

    double calcularPerimetro() {
        return 4*lado;
    }
    
    public static String limpiar_parametros(){
        return "";
    }  
}
