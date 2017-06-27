package umg.curso.clase1;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alumno on 26/06/2017.
 */
public class Banco {
    public static void main(String[] args) throws IOException {
        Cliente c = new Cliente();
        c.setNombre("Willmer");
        c.setEdad(29);
        c.setSalario(2500);

        //System.out.println("Estimado Cliente "+ c.getNombre() + ", su salario será de "+ c.getSalario());

        //buffer
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Su Nombre");
        c.setNombre(reader.readLine());
        System.out.println("Su Edad");
        c.setEdad(Integer.parseInt( reader.readLine()));
        System.out.println("Su Salario");
        c.setSalario(Float.parseFloat(reader.readLine()));

        System.out.println("Estimado Cliente "+ c.getNombre() + ", su salario será de "+ c.getSalario());
    }
}

