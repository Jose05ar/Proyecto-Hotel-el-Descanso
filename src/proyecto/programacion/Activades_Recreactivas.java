/*Actividades recreativas para los huespedes del hotel
Universidad Fidelitas 
grupo 1 
Hotel el descanzo 
 */
package proyecto.programacion;

import javax.swing.JOptionPane;

public class Activades_Recreactivas 
{
    public void dia()
    {
        /*
        esta clase el usuario selecciona la las actividades recreativas que desee el usuario 
        */
    
        int op;
    JOptionPane.showMessageDialog(null,"En este apartado podrá elegir las actividades recreativas que ofrece el hotel");
    JOptionPane.showMessageDialog(null,"Contamos con actividades para hacer durante el día o la noche, algunas de ellas son: ");
    JOptionPane.showMessageDialog(null,"Actividades Diurnas\n"+
                                       "Actividad 1: Buceo\n"+
                                       "Actividad 2: Surf\n"+
                                       "Actividad 3: Kayak\n"+
                                       "Actividad 4: Paseo en lancha\n"+
                                       "Actividad 5: Motos acuáticas\n"+
                                       "Actividad 6: Parasailing\n");
    op =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la actividad diurna que desea realizar: "));
    while (op < 1 || op > 6)//funciona como filtro para evitar errores de opcion
    {
        JOptionPane.showMessageDialog(null,"El numero seleccionado no corresponde a ninguna de nuestras actividades, por favor intentarlo de nuevo"); 
         op =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la actividad diurna que desea realizar: "));
    }
    switch(op) 
   {
       case 1:
           if(op==1 )  
           {
            JOptionPane.showMessageDialog(null,"La actividad seleccionada es: Buceo\n"+
                                               "Recordar a nuestros huéspedes que las actividades diurnas se realizan en un horario\n"+
                                               "de entre 8 a.m a 4 p.m ");
            break;
            
           }
       case 2:
           if (op==2) 
           {
           JOptionPane.showMessageDialog(null,"La actividad seleccionada es: Surf\n"+
                                               "Recordar a nuestros huéspedes que las actividades diurnas se realizan en un horario\n"+
                                               "de entre 8 a.m a 4 p.m ");
           break;
           }
       case 3:
           if (op==3) 
           {
             JOptionPane.showMessageDialog(null,"La actividad seleccionada es: Kayak\n"+
                                               "Recordar a nuestros huéspedes que las actividades diurnas se realizan en un horario\n"+
                                               "de entre 8 a.m a 4 p.m ");
             break;
           }
       case 4:
           if (op==4) 
           {
            JOptionPane.showMessageDialog(null,"La actividad seleccionada es: Paseo en lancha\n"+
                                               "Recordar a nuestros huéspedes que las actividades diurnas se realizan en un horario\n"+
                                               "de entre 8 a.m a 4 p.m ");
            break;
           }
           
        case 5:
           if (op==5) 
           {
            JOptionPane.showMessageDialog(null,"La actividad seleccionada es: Motos Acuáticas\n"+
                                               "Recordar a nuestros huéspedes que las actividades diurnas se realizan en un horario\n"+
                                               "de entre 8 a.m a 4 p.m ");
            break;
           }
        case 6:
           if (op==6) 
           {
            JOptionPane.showMessageDialog(null,"La actividad seleccionada es: Parasailing\n"+
                                               "Recordar a nuestros huéspedes que las actividades diurnas se realizan en un horario\n"+
                                               "de entre 8 a.m a 4 p.m ");
            break;
           }
              
   }
   } 
    
    ///////////////////////////////cambio de actividades diurnas a nocturnas////////////////////////////////////////////////////
    public void noche()
    {
        int op;
        JOptionPane.showMessageDialog(null,"Actividades Nocturnas\n"+
                                       "Actividad 1: Discoteca\n"+
                                       "Actividad 2: Cine y teatro\n"+
                                       "Actividad 3: Fogata con malvavisco\n"+
                                       "Actividad 4: Juego de polvora\n");
         
    op =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la actividad nocturna que desea realizar: "));
    while (op < 1 || op > 4)
    {
        JOptionPane.showMessageDialog(null,"El numero seleccionado no corresponde a ninguna de nuestras actividades, por favor intentarlo de nuevo"); 
         op =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la actividad diurna que desea realizar: "));
    }
    switch(op) 
   {
       case 1:
           if(op==1)  
           {
            JOptionPane.showMessageDialog(null,"La actividad seleccionada es: Discoteca\n"+
                                               "Recordar a nuestros huéspedes que las actividades nocturnas se realizan en un horario\n"+
                                               "de entre 7 p.m a 2 a.m ");
            break;
            
           }
       case 2:
           if (op==2) 
           {
           JOptionPane.showMessageDialog(null,"La actividad seleccionada es: Cine y teatro\n"+
                                               "Recordar a nuestros huéspedes que las actividades nocturnas se realizan en un horario\n"+
                                               "de entre 7 p.m a 2 a.m ");
           break;
           }
       case 3:
           if (op==3) 
           {
             JOptionPane.showMessageDialog(null,"La actividad seleccionada es: Fogata con malvavisco\n"+
                                               "Recordar a nuestros huéspedes que las actividades nocturnas se realizan en un horario\n"+
                                               "de entre 7 p.m a 2 a.m ");
             break;
           }
       case 4:
           if (op==4) 
           {
            JOptionPane.showMessageDialog(null,"La actividad seleccionada es: Juego de polvora\n"+
                                               "Recordar a nuestros huéspedes que las actividades nocturnas se realizan en un horario\n"+
                                               "de entre 7 p.m a 2 a.m ");
            break;
           }
         
    }
    JOptionPane.showMessageDialog(null,"Sus actividades quedaron registradas, esperamos que las disfruten y que tengan una excelente estadía  :) ");
     String[] args={};
 ProyectoProgramacion .main(args);
    }
}

