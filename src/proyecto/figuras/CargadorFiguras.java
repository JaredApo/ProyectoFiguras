/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.figuras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alex-
 */
class CargadorFiguras {

    private String rutaArchivo;

    public CargadorFiguras() {

    }

    public CargadorFiguras(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    //EXTRAE DATOS DE UN ARCHIVO DE TEXTO, LOS PROCESA Y RELLENA UNA LISTA DE TIPO FIGURA
    public List<Figura> getAll() {
        List<Figura> listaFiguras = new ArrayList<>();
        try {
            String lectorTemp;
            FileReader archivo = new FileReader(rutaArchivo);
            BufferedReader lector = new BufferedReader(archivo);
            while ((lectorTemp = lector.readLine()) != null) {
                String[] textoLeido = lectorTemp.split(":");
                switch (textoLeido[1]) {
                    case "Circle":
                        Circulo cr = new Circulo(Integer.parseInt(textoLeido[0]), Double.parseDouble(textoLeido[2]));
                        listaFiguras.add(cr);
                        break;
                    case "Square":
                        Cuadrado cu = new Cuadrado(Integer.parseInt(textoLeido[0]), Double.parseDouble(textoLeido[2]));
                        listaFiguras.add(cu);
                        break;
                    case "Triangle":
                        Triangulo tr = new Triangulo(Integer.parseInt(textoLeido[0]), Double.parseDouble(textoLeido[2]));
                        listaFiguras.add(tr);
                        break;
                    case "Rectangle":
                        Rectangulo rc = new Rectangulo(Integer.parseInt(textoLeido[0]), Double.parseDouble(textoLeido[2]), Double.parseDouble(textoLeido[3]));
                        listaFiguras.add(rc);
                        break;
                }

            }

        } catch (final IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }

        return listaFiguras;
    }
}
