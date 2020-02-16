package Clases;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;


public class Principal extends JApplet{

 PanelDibujo pd;
 JPanel pdatos;
 Cola cola;
 JTextField textField;

 public void init(){
  
  cola=new Cola();
  pd=new PanelDibujo(cola);
  pdatos=new JPanel();
  
  textField=new JTextField(10);
  JButton boton=new JButton("Nuevo Cliente");
  boton.addActionListener(new ActionListener(){


   @Override
   public void actionPerformed(ActionEvent e) {
    try{
     if(cola.getNodos().size()<20){

        cola.insertar(Integer.parseInt(textField.getText()));
        pd.repaint();
        repaint();
     }else{
      JOptionPane.showMessageDialog(null, "Maximo se mostraran 20 elementos.");
     }
    }catch(NumberFormatException nfe){
     JOptionPane.showMessageDialog(null, "Error digite un Valor Valido");
    }
   }
   
  });
  
  JButton borrar=new JButton("Atender");
  borrar.addActionListener((ActionEvent e) -> {
      if(cola.maxRecibos()){
          cola.insertar(cola.getNodos().get(1).getNombre(),cola.getNodos().get(1).getRecibos()-3);
      }
      if(cola.getNodos().size()>1){
          cola.eliminar();
          pd.repaint();
          repaint();
      }
  });
  
  pdatos.add(new JLabel("Numero de recibos: "));
  pdatos.add(textField);
  pdatos.add(boton);
  pdatos.add(borrar);
  
  add(pd);
  add(pdatos,BorderLayout.SOUTH);
 }
}

