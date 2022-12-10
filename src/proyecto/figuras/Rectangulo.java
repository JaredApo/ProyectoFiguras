/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.figuras;

/**
 *
 * @author alex-
 */
public class Rectangulo implements Figura {

    private int index;
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(int index, double base, double altura) {
        this.index = index;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public String getNombre() {
        return "Rectangulo";
    }

    @Override
    public String getComponentesFigura() {
        return "Lados";
    }

    @Override
    public String getMedidas() {
        return base + " x " + altura;
    }

    @Override
    public int getIndex() {
        return index;
    }

}
