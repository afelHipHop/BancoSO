package Clases;

import java.awt.*;
import javax.swing.JPanel;


public class PanelDibujo extends JPanel {

 public int x=20;
 public int y=100;
 public Cola cola;
 public boolean swborrar=false;

 public PanelDibujo(Cola c){
    cola=c;
 }

 public void paintComponent(Graphics g){
    super.paintComponents(g);
    Graphics2D g2d=(Graphics2D)g;
    g2d.setColor(Color.WHITE);
    g2d.fillRect(5,10,800,200);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(2));
    for(int i=0;i<cola.getNodos().size();i++){
        if(i!=0){
            g2d.drawLine(2*x*(i+2)-10, y+15, 2*x*(i+2), y+15);
        }
        g2d.drawRoundRect(2*x*(i+2), y, 30, 30, 10, 10);
        g2d.drawString(cola.getNodos().get(i).getNombre()+" "+cola.getNodos().get(i).getRecibos(), 2*x*(i+2)+12, y+20);
    }
 }
}
