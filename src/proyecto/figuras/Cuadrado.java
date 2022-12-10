/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.figuras;

/**
 *
 * @author alex-
 */
public class Cuadrado implements Figura {

    private int index;
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(int index, double lado) {
        this.index = index;
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public String getNombre() {
        return "Cuadrado";
    }

    @Override
    public String getComponentesFigura() {
        return "Lados";
    }

    @Override
    public String getMedidas() {
        return lado + " x " + lado;
    }

    @Override
    public int getIndex() {
        return index;
    }

}
