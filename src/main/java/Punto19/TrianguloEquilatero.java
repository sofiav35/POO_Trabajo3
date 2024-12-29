package Punto19;

public class TrianguloEquilatero {
    
    double lado;

    TrianguloEquilatero(double lado) {
        this.lado = lado;
    }
    
    public double calcularPerimetro(){
        return (3*lado);
    }

    public double calcularArea(){
        return((Math.sqrt(3)/4)*Math.pow(lado, 2));
    }
    
    public double calcularAltura(){
        return ((Math.sqrt(3)/2)*lado);
    }
}
