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
int op;
JOptionPane.showMessageDialog(null,"Opción 1. Registro del cliente\n"+
                                   "Opción 2. Seleccion de habitaciones\n"+
                                   "Opción 3. Seleccion del Buffet\n"+
                                   "Opción 4. Seleccion de actividades recreativas");

op =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la opción deseada: "));
    while (op < 1 || op > 4)
    {
        JOptionPane.showMessageDialog(null,"El numero seleccionado no corresponde a ninguna de las opciones anteriores, por favor intentarlo denuevo"); 
         op =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la opción deseada "));
    }
switch(op)
{
    case 1:
    Datos_cliente Fide=new Datos_cliente();
    break;
  
    case 2:
       
    dormitorios Fide1=new dormitorios();
    Fide1.Cuartos();
    Fide1.Información_Huspedes();
    break;
  
    case 3:
        Buffet Fide2=new Buffet ();
       Fide2.Abierto_Cerrado_D();
       Fide2.Abierto_Cerrado_A();
       Fide2.Abierto_Cerrado_C();
       break;
       
    case 4:
        Activades_Recreactivas Fide3= new Activades_Recreactivas();
        Fide3.dia();
        Fide3.noche();
        
}

}
    
}
