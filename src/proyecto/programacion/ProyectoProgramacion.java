/*
proyecto programacion 
Universidad Fidelitas 
grupo 1 
Hotel el descanzo 
 */
package proyecto.programacion;

import javax.swing.JOptionPane;

public class ProyectoProgramacion 
{

   
    public static void main(String[] args) 
    {
     JOptionPane.showMessageDialog(null, "Bienvenido a Hotel el Descanzo Puntarenas");
int opcion;
JOptionPane.showMessageDialog(null,"Opción 1. registro del cliente");
JOptionPane.showMessageDialog(null,"Opción 2. Seleccion de habitaciones");
JOptionPane.showMessageDialog(null,"Opción 3. Seleccion del Buffet ");
JOptionPane.showMessageDialog(null,"Opción 4. Seleccion de actividades recreativas");
opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción deseada: "));
switch(opcion)
{
    case 1:
    Datos_cliente Fide=new Datos_cliente();
    break;
        
   
        
        
    case 2:
       
    dormitorios Fide1=new dormitorios();
    Fide1.Cuartos();
    break;
  
    case 3:
        Buffet Fide2=new Buffet ();
       Fide2.Abierto_Cerrado_D();
       Fide2.Abierto_Cerrado_A();
       Fide2.Abierto_Cerrado_C();
       break;
}

}
    
}
