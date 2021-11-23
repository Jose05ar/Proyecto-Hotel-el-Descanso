/*
 Datos Cliente 
Hotel el Descanzo Puntarenas 
 */
package proyecto.programacion;

import javax.swing.JOptionPane;
public class  Datos_cliente 
{
    
  private String nombre=JOptionPane.showInputDialog(null,"Digite su nombre");
  private String apellido1=JOptionPane.showInputDialog(null,"Digite su primer apellido");
  private String apellido2=JOptionPane.showInputDialog(null,"Digite su segundo apellido");
  private String correo=JOptionPane.showInputDialog(null,"Digite su correo");
  
  private int cedula=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte su cedula"));
  private int telefono=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte su numero telefonico"));
  private int noches= Integer.parseInt(JOptionPane.showInputDialog(null,"la cantidad de noches minimas son 5,\n"
  +"por temas de Covid-19 ya que el gobierno nos dice que debemos tener la mitad de publico. "));
  
}




