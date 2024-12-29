package Punto18;
public class Empleado {
    /*Atributos*/
    double horas;
    double salario;
    double retención;

    /*Constructor*/
    Empleado(double horas, double salario, double retención ){
        
        this.horas= horas;
        this.salario=salario;
        this.retención=retención;
        
    }
    /*Métodos para calcular salarios*/
    public double calcularSalarioBruto(){
        return salario*horas;
    }
    
    public double calcularSalarioNeto(){
        return ((salario*horas)-(salario*horas*(retención/100)));
    }
    
}
