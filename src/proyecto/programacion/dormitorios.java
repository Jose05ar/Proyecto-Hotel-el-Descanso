/*
Habitaciones
Hotel el Descanzo Puntarenas
 */
package proyecto.programacion;

import javax.swing.JOptionPane;
public class dormitorios 
{
 
 
 public void Cuartos()
 { JOptionPane.showMessageDialog(null,"Acontinuacion se les estara dando los diferentes tipos de dormitorios y sus caracteristicas");
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
 }
  
  public void Información_Huspedes () 
   {       
   String [] Información=new String[3];
   int [] Información2=new int [2];
    int opcion=Integer.parseInt(JOptionPane.showInputDialog(null," digite del 1 al 3 el dormitorio que desea usar"));
  switch(opcion)
  {
      //Caso para el dormitorio Regular 
      case 1:
       JOptionPane.showMessageDialog(null,"ingrese los datos de tus acompañantes");
      if(opcion==1)
      {
          for(int i =1;i<=2;i++)
      {
       //Arreglo para los huespedes Regular 
           
          for(int X=0;X<3; X++)
     {
         
     Información[X]=JOptionPane.showInputDialog(null,"Ingrese su Nombre y apellidos");
         
     }
  for(int J=0;J<2; J++) 
  {
  
    Información2[J]=Integer.parseInt(JOptionPane.showInputDialog(null," digite  su cedula y número telefonico"));
    
  }
     for(int X=0;X<1; X++)
     {
   
         JOptionPane.showMessageDialog(null,"Nombre:\n"+Información[0]+"Apellidos:\n"+Información[1]+","+Información[2]);
                 
     }
 for(int J=0;J<1; J++)
 {
    JOptionPane.showMessageDialog(null,"Telefono:\n"+Información2[0]+"Cedula:\n"+Información2[1]);     
 }
   JOptionPane.showMessageDialog(null,"Información guardada en Dormitorio Regular"); 
  
      }    
      }
    
      break;
     // Caso para el dormitorio VIP
      case 2:
      
          JOptionPane.showMessageDialog(null,"ingrese los datos de tus acompañantes");
      if(opcion==2){
            for(int i=1;i<=3;i++)
      {
     // Arreglo para los huespedes VIP
          for(int X=0;X<3; X++)
     {
         
     Información[X]=JOptionPane.showInputDialog(null,"Ingrese su Nombre y apellidos");
         
     }
  for(int J=0;J<2; J++) 
  {
  
    Información2[J]=Integer.parseInt(JOptionPane.showInputDialog(null," digite  su cedula y número telefonico"));
    
  }
for(int X=0;X<1; X++)
     {
   
        JOptionPane.showMessageDialog(null,"Sus datos son:\n"+Información[0]+","+Información[1]+","+Información[2]);  
                  
     }
 for(int J=0;J<1; J++)
 {
    JOptionPane.showMessageDialog(null,Información2[0]+"y\n"+Información2[1]);     
 }
     JOptionPane.showMessageDialog(null,"Información guardada en Dormitorio VIP"); 
      }   
      }
    
      break;
      //Caso para el dormitorio Diamond
      case 3:
      JOptionPane.showMessageDialog(null,"ingrese los datos de tus acompañantes");
      if(opcion==3)
      {
         for(int i=1;i<=4;i++)
      {
       // Arreglo para los huespedes Diamond 
          for(int X=0;X<3; X++)
     {
         
     Información[X]=JOptionPane.showInputDialog(null,"Ingrese su Nombre y apellidos");
         
     }
  for(int J=0;J<2; J++) 
  {
  
    Información2[J]=Integer.parseInt(JOptionPane.showInputDialog(null," digite  su cedula y número telefonico"));
    
  }
   for( int X=0;X<3; X++)
     {
   
         JOptionPane.showMessageDialog(null,"Sus datos son:\n"+Información[0]+","+Información[1]+","+Información[2]);
                  
     }
   
 for(int J=0;J<2; J++)
 {
   JOptionPane.showMessageDialog(null,Información2[0]+"y\n"+Información2[1]);      
 }
    JOptionPane.showMessageDialog(null,"Información guardada en Dormitorio Diamod");    
      }       
      }
     break;
      
      default: 
    JOptionPane.showMessageDialog(null,"El número que ingreso no corresponde intentalo de nuevo");      
  }
  
 
 }
 

}


