/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.figuras;

import java.io.IOException;
import java.util.List;

/**
 * APLICACION QUE CALCULA EL ÁREA DE CUADRADOS, RECTANGULOS, CIRCULOS Y
 * TRIANGULOS EQUILATEROS
 *
 * @author alex-
 */
public class ReporteFiguras {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Especifice el archivo de datos tal y como se especifica en la documentación");

        } else {
            System.out.println("------ EVALUACIÓN TÉCNICA EJERCICIO #1 ------\n");
            System.out.println("Resultados después de leer el archivo:\n");
            procesaArchivo(args[0]);
            System.out.println("\n------------- FIN DE LA EJECUCIÓN -------------");
        }

    }

    static void procesaArchivo(String archivo) {
        CargadorFiguras cargador = new CargadorFiguras(archivo);
        try {
            List<Figura> listaFiguras = cargador.getAll();
            for (Figura figura : listaFiguras) {
                System.out.println(figura.getNombre() + " [" + figura.getIndex() + " - " + figura.getComponentesFigura() + ": " + figura.getMedidas() + "] = " + figura.getArea());
            }
        } catch (final IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }

    }

}
