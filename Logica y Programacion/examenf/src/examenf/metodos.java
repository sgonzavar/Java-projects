
package examenf;
import javax.swing.JOptionPane;
public class metodos 
{
    
    public void crear()
    {
    String[] v1 = new String[3];
    String[] v2 = new String[3];
    String[] v3 = new String[3];
    String[] v4 = new String[3];
   
    
    for(int i=0;i<3;i++)
       {
           v1[i]=JOptionPane.showInputDialog("ingrese los nombres de los tres profesores porfavor");
       } 
    for(int i=0;i<3;i++)
         {int s=Integer.parseInt(JOptionPane.showInputDialog("ingrese la nota del profesor "+v1[i]+" para la claridad en sus respuestas"));
          if (s<65)
          {v2[i]="mal";}else 
           if(s>=65&&s<75)
           {v2[i]="regular";}else
           if(s>=75&&s<85)
           {v2[i]="bien";}else
           if(s>=85&&s<95)
           {v2[i]="muy bien";}else
           if(s>=95&&s<=100)
           {v2[i]="excelente";}else
           {JOptionPane.showMessageDialog(null,"tienes un serio problema amigo ;D");}
          
          
         }
    
    for(int i=0;i<3;i++)
         {int s=Integer.parseInt(JOptionPane.showInputDialog("ingrese la nota del profesor "+v1[i]+" para la metodologia de su enseñansa"));
          if (s<65)
          {v3[i]="mal";}else 
           if(s>=65&&s<75)
           {v3[i]="regular";}else
           if(s>=75&&s<85)
           {v3[i]="bien";}else
           if(s>=85&&s<95)
           {v3[i]="muy bien";}else
           if(s>=95&&s<=100)
           {v3[i]="excelente";}else
           {JOptionPane.showMessageDialog(null,"tienes un serio problema amigo ;D");}
       
    
    }
    
    for(int i=0;i<3;i++)
         {int s=Integer.parseInt(JOptionPane.showInputDialog("ingrese la nota del profesor "+v1[i]+" para el trato que da a sus estudiantes"));
          if (s<65)
          {v4[i]="mal";}else 
           if(s>=65&&s<75)
           {v4[i]="regular";}else
           if(s>=75&&s<85)
           {v4[i]="bien";}else
           if(s>=85&&s<95)
           {v4[i]="muy bien";}else
           if(s>=95&&s<=100)
           {v4[i]="excelente";}else
           {JOptionPane.showMessageDialog(null,"tienes un serio problema amigo ;D");}
       
    
           }
           for(int i=0;i<3;i++)
           {JOptionPane.showMessageDialog(null,"estos son los respectivos datos del profesor "+v1[i]+"\n y sus respectivas notas en orden\n"+"claridad en sus respuestas "+v2[i]+"\nmetodologia de su enseñansa "+v3[i]+"\ntrato que da a sus estudiantes "+v4[i]);
           }
 }   
}
