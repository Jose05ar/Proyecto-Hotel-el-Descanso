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
  
  private int cedula=Integer.parseInt(JOptionPane.showInputDialog(null,"inserte su cedula"));
  private int telefono=Integer.parseInt(JOptionPane.showInputDialog(null,"inserte su numero telefonico"));
  
}




