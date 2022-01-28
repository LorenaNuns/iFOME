//Classe que escolhe o tipo de comida
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * @author (Alex e Lorena)
 */
public class MenuComida
{
    int n1;
    public void MenuTipo(){
        Restaurantes rest = new Restaurantes();
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("1 - FastFood \n" + "2 - Comida Saudável \n" + "3 - Comida Vegana")); 
        
        switch(n1){
        case 1:
        rest.FastFood(n1);
        break;
        
        case 2:
        rest.CS(n1);
        break;
        
        case 3: 
        rest.CV(n1);
        break;
        
        default:
        JOptionPane.showMessageDialog(null,"Essa opção não existe" );
        System.exit(0);
        break;
        }
    }
}
