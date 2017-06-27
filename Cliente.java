package umg.curso.clase1;

import java.security.PublicKey;

/**
 * Created by alumno on 26/06/2017.
 */
public class Cliente {
    public Cliente(String nombre) {
        Nombre = nombre;
    }

    private String Nombre;

    public Cliente() {
    }

    private Integer Edad;

    public Cliente(float salario) {
        Salario = salario;
    }

    private float Salario;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        Salario = salario;
    }
}
