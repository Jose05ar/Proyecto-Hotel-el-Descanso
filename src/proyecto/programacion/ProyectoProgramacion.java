/*
proyecto programacion 
Universidad Fidelitas 
grupo 1 
Hotel el descanzo 
 */
package proyecto.programacion;

import javax.swing.JOptionPane;
import static proyecto.programacion.dormitorios.mensage;
public class ProyectoProgramacion 
{

   
    public static void main(String[] args) 
    {
     JOptionPane.showMessageDialog(null, "Bienvenido a Hotel el Descanzo Puntarenas prueba con Josue");
int opcion;
JOptionPane.showMessageDialog(null,"Opción 1. registro del cliente ejemplo Jose prueba");
JOptionPane.showMessageDialog(null,"Opción 2. Seleccion de habitaciones");
JOptionPane.showMessageDialog(null,"Opción 3. Seleccion de tiempos de comida");
JOptionPane.showMessageDialog(null,"Opción 4. Seleccion de actividades recreativas");
opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción deseada: "));
switch(opcion)
{
    case 1:
    Datos_cliente Fide=new Datos_cliente();
    break;
        
   
        
        
    case 2:
       
    mensage();
    break;
  
}

}
    
}
