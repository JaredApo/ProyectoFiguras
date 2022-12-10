/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.figuras;

/**
 *
 * @author alex-
 */
public class Circulo implements Figura {

    private int index;
    private double radio;

    public Circulo() {
    }

    public Circulo(int index, double radio) {
        this.index = index;
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return (radio * radio) * Math.PI;
    }

    @Override
    public String getNombre() {
        return "Circulo";
    }

    @Override
    public String getComponentesFigura() {
        return "Radio";
    }

    @Override
    public String getMedidas() {
        return String.valueOf(radio);
    }

    @Override
    public int getIndex() {
        return index;
    }

}
