/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author turupawn
 */
public class Ejercicios {
    static void guardar(String nombre_archivo, ArrayList<Producto> productos)
    {
           try
        {
            PrintWriter PRO1 = new PrintWriter(nombre_archivo);

            for(Producto PROC : productos)
            {
                PRO1.println(PROC.nombre + " " + PROC.categoria+" "+ PROC.existencias + " " + PROC.precio);
            }

            PRO1.close();
        }catch (Exception e)
        {
            System.out.println(" Error al guardar el archivo. ");
}
    }
    
    static ArrayList<Producto> abrir(String nombre_archivo)
    {
      ArrayList<Producto> Producto2= new ArrayList<>(); 
        try
        {
            Scanner scanner = new Scanner(new File(nombre_archivo));
            while(scanner.hasNext())
            {
                String nombre = scanner.next();
                String categoria = scanner.next();
                int existencias = scanner.nextInt();
                double precio=scanner.nextDouble();
                Producto2.add (new Producto(nombre, categoria, existencias,precio) );
            }
            scanner.close();
        }catch(Exception e)
        {
            System.out.print("Error al leer el archivo");
        }
        return Producto2;
    }
}

