/*
Buffet / Alimentación
Hotel el Descanzo Puntareanas
 */
package proyecto.programacion;

import javax.swing.JOptionPane;
public class Buffet 
{
 public void Abierto_Cerrado_D() 
 {
  JOptionPane.showMessageDialog(null,"Bienvenidos al buffet los sueños ");
  int op;  
    int hora=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la hora de entrada a desayunar: "));
   if ( hora >= 8 && hora <= 11) 
   {
     JOptionPane.showMessageDialog(null,"Abierto");
     Desayuno();
   } else  {
        JOptionPane.showMessageDialog(null,"Cerrado");
     Almuerzo();  
   }   
 }
   public void Desayuno () {
 
 JOptionPane.showMessageDialog(null,"Menú\n"+
          "Desayuno 1: Pinto, huevos y de bebida café\n"+
          "Desayuno 2: Pan, tocineta o natilla y de bebida juego de naranaja\n"+
          "Desayuno 3: Cereal y frutas, si gusta agua\n"+
          "Desayuno 4: Panqueques con miel y de bebida agua dulce");
 
  
  int op;
  op=Integer.parseInt(JOptionPane.showInputDialog(null,"Selecione cuál de los 4 desayunos anteriores desea pedir"));
   switch(op) 
   {
       case 1:
           if(op==1 )  
           {
            JOptionPane.showMessageDialog(null,"Su desayuno es: Pinto, huevos y de bebida café");
            break;
            
           }
       case 2:
           if (op==2) 
           {
           JOptionPane.showMessageDialog(null," Su desayuno es: Pan, tocineta o natilla y de bebida juego de naranaja");
           break;
           }
       case 3:
           if (op==3) 
           {
             JOptionPane.showMessageDialog(null,"Su desayuno es: Cereal y frutas, si gusta agua ");
             break;
           }
       case 4:
           if (op==4) 
           {
            JOptionPane.showMessageDialog(null,"Su desayuno es: Panqueques con miel y de bebida agua dulce ");
            break;
           }
           default:
          JOptionPane.showMessageDialog(null,"El número que inserto no concuerda con ninguno de nuestros menús, por favor, intentelo denuevo");
          Desayuno();
   }
   } 
 
    public void Abierto_Cerrado_A()    
    {
    
     int hora=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la hora de entrada almorzar: "));
   if ( hora == 12 || hora == 1 || hora == 2 || hora ==3) 
   {
     JOptionPane.showMessageDialog(null,"Abierto");
     Almuerzo();
   } else  {
        JOptionPane.showMessageDialog(null,"Cerrado"); 
       Cena();
   }   
    }
  public void Almuerzo () {
      
      JOptionPane.showMessageDialog(null,"Menú\n"+
          "Almuerzo 1:Hambuerguesa con papas fritas y bebida gaseosa\n"+
          "Almuerzo 2: Carne con arroz y frijoles de bebida fresco natural y agua\n"+
          "Almuerzo 3: Mariscos con ensalada de vegetales y bebida coctel con o sin licor ,agua\n"+
          "Almuerzo 4: Pizza y bebida gaseosas");
     int op;
     op=Integer.parseInt(JOptionPane.showInputDialog(null,"Selecione cuál de los 4 almuerzos anteriores desea pedir: "));
   switch(op) 
   {
       case 1:
           if (op==1) 
           {
              JOptionPane.showMessageDialog(null,"Su almuerzo es: Hambuerguesa con papas fritas y bebida gaseosa");
              break;
           }
       case 2:
           if (op==2) 
           {
              JOptionPane.showMessageDialog(null,"Su almuerzo es: Carne con arroz y frijoles de bebida fresco natural y agua");
              break;
           }
       case 3:
             if (op==3) 
           {
              JOptionPane.showMessageDialog(null,"Su almuerzo es: Mariscos con ensalada de vegetales y bebida coctel con o sin licor ,agua");
              break;
           }
       case 4:
           if (op==4) 
           {
              JOptionPane.showMessageDialog(null,"Su almuerzo es: Pizza y bebida gaseosas");
              break;
           }
       default:
       JOptionPane.showMessageDialog(null,"El número que inserto no concuerda con ninguno de nuestros menús ");
       Almuerzo();
   } 
    }    
   
 
    public void Abierto_Cerrado_C () 
    {
     int op;
     int hora=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la hora de entrada a la cena: "));
   if ( hora >= 7 && hora <= 9) 
   {
     JOptionPane.showMessageDialog(null,"Abierto");
     Cena();
   } else  {
        JOptionPane.showMessageDialog(null,"Cerrado vuelva el siguiente día");
        String[] args={};
 ProyectoProgramacion .main(args); 
   }   
    }
   public void Cena() 
   {
    JOptionPane.showMessageDialog(null,"Menú\n"+
          "Cena 1:Pastas acompañado de un vino de la casa se añade una taza de agua\n"+
          "Cena 2: Sopa azteca,fideos o de mariscos y una bebida agua\n"+
          "Cena 3:Chuleton o lomo de res con salsa blanca y acompañado de una champagne\n"+
          "Cena 4:Pescado entero y ensalada con yuca frita y cerveza para degustar");
     
    int op;
   op=Integer.parseInt(JOptionPane.showInputDialog(null,"Selecione cuál de las 4 cenas anteriores desea pedir: "));
   switch(op)  
   {
       case 1:
       if (op==1) 
           {
              JOptionPane.showMessageDialog(null,"Su cena es: Pastas acompañado de un vino de la casa se añade una taza de agua");
              break;
           }
       case 2:
        if (op==2) 
           {
              JOptionPane.showMessageDialog(null,"Su cena es: Sopa azteca,fideos o de mariscos y una bebida agua");
              break;
           }
       case 3:
         if (op==3) 
           {
              JOptionPane.showMessageDialog(null,"Su cena es: Chuleton o lomo de res con salsa blanca y acompañado de una champagne");
              break;
           }  
       case 4:
        if (op==4) 
           {
              JOptionPane.showMessageDialog(null,"Su cena es: Pescado entero y ensalada con yuca frita y cerveza para degustar");
              break;
           }     
       default:
            JOptionPane.showMessageDialog(null,"El número que inserto no concuerda con ninguno de nuestros menús ");
            Cena();
   }  
      String[] args={};
 ProyectoProgramacion .main(args);  
    }
    
}
