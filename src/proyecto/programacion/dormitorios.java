/*
Habitaciones
Hotel el Descanzo Puntarenas
 */
package proyecto.programacion;

import javax.swing.JOptionPane;
public class dormitorios 
{
 
 
 public void Cuartos()
 {
    int opcion,telefono_1,telefono_2,telefono_3,cedula_1,cedula_2,cedula_3;
   String nombre1,nombre2,nombre3,apellido_1,apellido_2,apellido_3,apellido_4,apellido_5,apellido_6;
   JOptionPane.showMessageDialog(null,"Acontinuacion se les estara dando los diferentes tipos de dormitorios y sus caracteristicas");
   JOptionPane.showMessageDialog(null,"Dormitorio regular: dos camas individuales, tiene un baño, television, wfi de un 1MB,\n "
          + "no cuenta con aire acondicionado,\n "
          + "cuenta con servicio habitacion(toallas e inprevistos),\n"
          + " sin mini bar,\n"
          + "vista al parque y sin balcon\n"
          + "para un total de $150");
   JOptionPane.showMessageDialog(null,"Dormitorio V.I.P: 1 cama matrimonial, una cama individual, un baño, television,\n"
          + "wifi de 30MB, con aire acondicionado, servicio habitacion, sin mini bar, vista a la picina y con balcon.\n"
          + "para un total de $300");
  JOptionPane.showMessageDialog(null,"Dormitorio Diamond: 2 camas matrimoniales, dos baños, dos televisiones,\n"
          + "wifi de 50MB, con aire acondicionado, servicio habitacion completa, contiene mini bar, vista al mar y\n"
          + " vista a las picinas y tambien contiene balcon.\n"
          + "para un total de $450");
  
 opcion=Integer.parseInt(JOptionPane.showInputDialog(null," digite del 1 al 3 el dormitorio que desea usar"));
  
  
  
  
  
   switch(opcion)
  {
      case 1:
       JOptionPane.showMessageDialog(null,"ingrese los datos de tus acompañantes");
      if(opcion==1)
      {
           for(int i =1;i<=2;i++)
      {
       nombre1=JOptionPane.showInputDialog(null,"ingrese su nombre: ");
       apellido_1=JOptionPane.showInputDialog(null,"Ingrese su primer apellido: ");
       apellido_2=JOptionPane.showInputDialog(null,"Ingrese su segundo apellido: ");
       
       telefono_1=Integer.parseInt(JOptionPane.showInputDialog(null," digite su numero telefonico"));
       cedula_1=Integer.parseInt(JOptionPane.showInputDialog(null," digite de su cedula"));
      }    
      }
    
      break;
      case 2:
      JOptionPane.showMessageDialog(null,"ingrese los datos de tus acompañantes");
      if(opcion==2){
            for(int i=1;i<=3;i++)
      {
       nombre2=JOptionPane.showInputDialog(null,"ingrese su nombre: ");
       apellido_3=JOptionPane.showInputDialog(null,"Ingrese su primer apellido: ");
       apellido_4=JOptionPane.showInputDialog(null,"Ingrese su segundo apellido: ");
       
       telefono_2=Integer.parseInt(JOptionPane.showInputDialog(null," digite su numero telefonico"));
       cedula_2=Integer.parseInt(JOptionPane.showInputDialog(null," digite de su cedula"));
      }   
      }
    
      break;
      case 3:
      JOptionPane.showMessageDialog(null,"ingrese los datos de tus acompañantes");
      if(opcion==3)
      {
         for(int i=1;i<=4;i++)
      {
       nombre3=JOptionPane.showInputDialog(null,"ingrese su nombre: ");   
       apellido_5=JOptionPane.showInputDialog(null,"Ingrese su primer apellido: ");
       apellido_6=JOptionPane.showInputDialog(null,"Ingrese su segundo apellido: ");
       
       telefono_3=Integer.parseInt(JOptionPane.showInputDialog(null," digite su numero telefonico"));
       cedula_3=Integer.parseInt(JOptionPane.showInputDialog(null," digite de su cedula"));
       
      }   
          
      }
     
      break;
  }
  
 
 }
 
 
 
}


