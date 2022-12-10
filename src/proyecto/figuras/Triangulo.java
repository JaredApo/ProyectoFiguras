/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.figuras;

/**
 *
 * @author alex-
 */
public class Triangulo implements Figura {

    private int index;
    private double lado;

    public Triangulo() {
    }

    public Triangulo(int index, double lado) {
        this.index = index;
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return (lado * lado) * ((Math.sqrt(3)) / 4);
    }

    @Override
    public String getNombre() {
        return "Triangulo";
    }

    @Override
    public String getComponentesFigura() {
        return "Lado";
    }

    @Override
    public String getMedidas() {
        return String.valueOf(lado);
    }

    @Override
    public int getIndex() {
        return index;
    }

}
