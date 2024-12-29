package principal;

public class Trapecio {
    
    double base1;
    double base2;
    double lado;
    double altura;

    Trapecio(double base1, double base2, double lado, double altura) {
        this.base1 = base1;
        this.base2 = base2;
        this.lado = lado;
        this.altura = altura;
    }



    double calcularArea() {
        return ((base1+base2)/2)*altura;
    }

    double calcularPerimetro() {
        return base1+base2+lado+lado;
    }
    
    public static String limpiar_parametros(){
        return "";
    }
}

