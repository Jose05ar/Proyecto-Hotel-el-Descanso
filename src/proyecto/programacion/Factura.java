/*
 Factura del hotel 
Check in y Check out 
Hotel el Descanzo Puntarenas 
 */
package proyecto.programacion;

import javax.swing.JOptionPane;


public class Factura 
        
{
   private int op,opcion_check_in,opcion_check_out;
   private double cal1,cal2,cal3;
   private int noches;
   private int cantidad;
  
  public void facturacion()
  {
      /* en este apartado le pedimos al usuario que vuelva a seleccionar los dormitorios que reservo para el total que
      debe pagar en el hotel 
      */
      
    op=Integer.parseInt(JOptionPane.showInputDialog(null,"por favor vuelva a digitar su cuarto\n"
    +"1.Dormitorio regular\n"
    +"2.Dormitorio V.I.P\n"
    +"3.Dormitorio Diamond"));  
    
    if(op==1)
    {
     noches= Integer.parseInt(JOptionPane.showInputDialog(null,"la cantidad de noches minimas son 5,\n"
  +"por temas de Covid-19 ya que el gobierno nos dice que debemos tener la mitad de publico. "));
     cantidad=50*noches;
      cal1= (150*2)+cantidad;
       JOptionPane.showMessageDialog(null,"su total a pagar es de: "+cal1+"$");
       
    }
    if(op==2)
    {
     noches= Integer.parseInt(JOptionPane.showInputDialog(null,"la cantidad de noches minimas son 5,\n"
  +"por temas de Covid-19 ya que el gobierno nos dice que debemos tener la mitad de publico. "));
     cantidad=50*noches;
      cal2= (300*3)+cantidad;
      JOptionPane.showMessageDialog(null,"su total a pagar es de: "+cal2+"$");    
    }
    if(op==3)
    {
      noches= Integer.parseInt(JOptionPane.showInputDialog(null,"la cantidad de noches minimas son 5,\n"
  +"por temas de Covid-19 ya que el gobierno nos dice que debemos tener la mitad de publico. "));
     cantidad=50*noches;
      cal3= (300*4)+cantidad;
      JOptionPane.showMessageDialog(null,"su total a pagar es de: "+cal3+"$");   
    }
  }
  public void Check_in_and_Check_out()
  {
      /*
      en este campo el usuario escoge las horas de Check-in y Check-out
      */
   opcion_check_in=  Integer.parseInt(JOptionPane.showInputDialog(null,"acontinuacion se le va dar los horarios del check in\n"
           + "1..8:30am\n"
           + "2..9:00am\n"
           + "3..9:30am\n"
           + "4..10:00am\n"));
    
   opcion_check_out=Integer.parseInt(JOptionPane.showInputDialog(null,"acontinuacion los horarios de check out\n"
           + "1..4:00 a 4:30pm\n"
           + "2..4:30 a 5:00\n"
           + "3..5:00pm a 5:30pm\n"
           + "4..6:00pm a 7:00pm\n"));
  if (opcion_check_in==1)
  {
   JOptionPane.showMessageDialog(null," su check in es a las 8:30am");
  }
   if (opcion_check_in==2)
   {
     JOptionPane.showMessageDialog(null," su check in es a las 9:00am");  
   }
    if (opcion_check_in==3)
    {
     JOptionPane.showMessageDialog(null," su check in es a las 9:30am");   
    }
    if (opcion_check_in==4)
     {
      JOptionPane.showMessageDialog(null," su check in es a las 10:00am");   
     }
    if(opcion_check_out==1)
    {
      JOptionPane.showMessageDialog(null," su check in es a las 4:00 a 4:30pm");     
    }
    if(opcion_check_out==2)
    {
      JOptionPane.showMessageDialog(null," su check in es a las 4:30 a 5:00");   
    }
    if(opcion_check_out==3)
     {
      JOptionPane.showMessageDialog(null," su check in es a las 5:00pm a 5:30pm");   
     }
    if(opcion_check_out==4)
    {
       JOptionPane.showMessageDialog(null," su check in es a las 6:00pm a 7:00pm");     
    }
  String[] args={};
 ProyectoProgramacion .main(args);
  }
  
  
  
 
}


   
     
          
 

