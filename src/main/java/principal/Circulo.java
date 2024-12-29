package principal;

public class Circulo {
    double radio; 

    Circulo(double radio) {
    this.radio = radio;
    }

    double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }

    double calcularPerimetro() {
        return 2*Math.PI*radio;
    }
    
    public static String limpiar_parametros(){
        return "";
    }
}
