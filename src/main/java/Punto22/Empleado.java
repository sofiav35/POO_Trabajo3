package Punto22;
/*Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el
número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor
de $450.000, de lo contrario escriba sólo el nombre.*/
public class Empleado {
    String nombre;
    double salario;
    double horas;
    double pago;

    public Empleado(String nombre, double salario, double horas) {
        this.nombre = nombre;
        this.salario = salario;
        this.horas = horas;
    }
    
   /*Métodos*/
    
    public double pago(){
        pago= salario*horas;
        return pago;
    }
    
    public static String limpiar(){
        return "";
    }
}
