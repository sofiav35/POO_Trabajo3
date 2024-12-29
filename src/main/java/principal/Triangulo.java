package principal;

public class Triangulo {
    double base; 
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return (base * altura / 2);
    }

    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa()); 
    }

    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }

    String determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
    
        return "Equilatero";
    }
    
    else if ((base != altura) && (base != calcularHipotenusa()) &&
    (altura != calcularHipotenusa())){
        
        return "Escaleno";
    }
    
    else{
    
        return "Isoceles";
    }
    
    }
    
     public static String limpiar_parametros(){
        return "";
    }
}