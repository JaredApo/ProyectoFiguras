/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyecto.figuras;

import java.io.IOException;

/**
 *
 * @author alex-
 */
public interface Figura {

    public double getArea() throws IOException;

    public String getNombre() throws IOException;

    public String getComponentesFigura() throws IOException;
    
    public String getMedidas()throws IOException;
    
    public int getIndex() throws IOException;
    
}
