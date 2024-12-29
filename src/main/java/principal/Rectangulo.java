package principal;

public class Rectangulo {
    
    double base;
    double altura;

    Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return base * altura;
    }

    double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
    
    public static String limpiar_parametros(){
        return "";
    }    
}

