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
     JOptionPane.showMessageDialog(null, " Hotel el Descanzo Puntarenas");
int op;
JOptionPane.showMessageDialog(null,"Opción 1. Registro del cliente\n"+// se le muestra las opciones para hospedarse
                                   "Opción 2. Seleccion de habitaciones\n"+
                                   "Opción 3. Seleccion del Buffet\n"+
                                   "Opción 4. Seleccion de actividades recreativas\n"+
                                   "Opcion 5. Factura\n"+
                                   "Opcion 6. ¿Quienes somos?\n"+
                                   "Opción 7. Salir ");

op =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la opción deseada: "));
    while (op < 1 || op > 7)// funciona como filtro para evitar errores de opcion
    {
        JOptionPane.showMessageDialog(null,"El numero seleccionado no corresponde a ninguna de las opciones anteriores, por favor intentarlo denuevo"); 
         op =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la opción deseada "));// se selecciona la opcion deseada
    }
switch(op)
{
    case 1:// para los datos del cliente 
    Datos_cliente Fide=new Datos_cliente();
    Fide.corridodatos();
    Fide.volver();
    break;
  
    case 2:// para la seleccion de dormitorios 
       
    dormitorios Fide1=new dormitorios();
    Fide1.Cuartos();
    Fide1.Información_Huspedes();
    break;
  
    case 3:// seleccion de horas para el bufete
       Buffet Fide2=new Buffet ();
       Fide2.Abierto_Cerrado_D();
       Fide2.Abierto_Cerrado_A();
       Fide2.Abierto_Cerrado_C();
       break;
       
    case 4:// seleccion de eventos recreativos 
        Activades_Recreactivas Fide3= new Activades_Recreactivas();
        Fide3.dia();
        Fide3.noche();
        break;
        
    case 5: // se muestra la factura con el check in y check out 
        
        Factura Fide4= new Factura();
        Fide4.facturacion();
        Fide4.Check_in_and_Check_out();
        break;
        
    case 6:// informacion del hotel 
        
        informacion Fide5=new informacion();
        Fide5.quienes_somos();
        break; 
    case 7:// salida del menu
         JOptionPane.showMessageDialog(null,"Muchas gracias por su preferencia  <3 ");
    break;
}

}
    
}
