/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author gustavohg
 */
public class DrawPanel extends JPanel{
    
    public DrawPanel() {
        this.setSize(300, 400); //se selecciona el tamaño del panel
    }
 
//Se crea un método cuyo parámetro debe ser un objeto Graphics
 
    @Override
    public void paint(Graphics grafico) {
        Dimension height = getSize();
 
//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
 
        ImageIcon Img = new ImageIcon(getClass().getResource("/Images/Bola.jpg")); 
 
//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
 
        grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
 
        setOpaque(false);
        super.paintComponent(grafico);
    }
}