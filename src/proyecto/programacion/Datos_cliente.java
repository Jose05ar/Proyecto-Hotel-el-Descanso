/*
 Datos Cliente 
Hotel el Descanzo Puntarenas 
 */
package proyecto.programacion;

import javax.swing.JOptionPane;
public class  Datos_cliente 
{
    
  public String nombre;
  public String apellidos;
  
  public String correo;
  
  public int cedula;
  public int telefono;
  
 
 public Datos_cliente(String nombre,String apellidos,String correo,int cedula, int telefono)
 {
 this.apellidos=apellidos;
 this.nombre=nombre;
 this.correo=correo;
 this.cedula=cedula;
 this.telefono=telefono;
     
 }

 

    Datos_cliente() 
    {
       
    }
public void corridodatos()
{
  Datos_cliente ProyectoProgramacion[]=new Datos_cliente[1];
for(int x=0;x<ProyectoProgramacion.length;x++)//se llena los datos 
{
 JOptionPane.showMessageDialog(null,"Acontinuacion se le va pedir la informacion del huesped");
 String nombre= JOptionPane.showInputDialog("Digite su nombre");
 String apellidos= JOptionPane.showInputDialog("Digite sus apellidos");
 int cedula=Integer.parseInt(JOptionPane.showInputDialog("Digite su cedula"));
 String correo=JOptionPane.showInputDialog("Digite su correo");
 int telefono=Integer.parseInt(JOptionPane.showInputDialog("digite su telefono"));
 
 ProyectoProgramacion[x]=new Datos_cliente(nombre,apellidos,correo,cedula,telefono);
}
for(int x=0;x<ProyectoProgramacion.length;x++)// se lee los datos que se resgistraron en el for anterior 
{
 JOptionPane.showMessageDialog(null, ProyectoProgramacion[x].nombre+"\n"+ ProyectoProgramacion[x].apellidos+"\n"
 + ProyectoProgramacion[x].cedula+"\n"+ ProyectoProgramacion[x].correo+"\n"+ ProyectoProgramacion[x].telefono);
 
 
}
}
public void volver()// se vuelve a repetir los datos del menu 
{
  String[] args={};
 ProyectoProgramacion .main(args);   
}
}




