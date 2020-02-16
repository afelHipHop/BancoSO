/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author afelr
 */
public class main {
    public static void main(String args[]){
        JFrame frame = new JFrame("BANCO");
        Principal p = new Principal();
        p.init();
        frame.getContentPane().add(p);
        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
