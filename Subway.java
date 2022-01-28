import javax.swing.JOptionPane;
/** 
 * @author (Alex e Lorena)
 */
public class Subway extends Carrinho
{
    double sand_frango = 15, sand_carne = 20, refri = 5, cookie = 3, doritos = 7;
    int csub;
    public void CardapioSub(){
     csub = Integer.parseInt(JOptionPane.showInputDialog(null, "\t Cardápio \n" + "Escolha o que você deseja comer: \n" + 
        "1 - Sanduíche de Frango -------- R$15,00 \n" + "2 - Sanduíche de Carne -------- R$20,00 \n" +
        "3 - Refrigerante -------- R$5,00 \n" + "4 - Cookie ------ R$3,00 \n" + "5 - Doritos ------- R$7,00"));
    }
    
    public double getSand_frango(){
    return this.sand_frango + getCarrinho();
    }
    
    public double getSand_carne(){
    return this.sand_carne + getCarrinho();
    }
    
    public double getRefri(){
    return this.refri + getCarrinho();
    }
    
    public double getCookie(){
    return this.cookie + getCarrinho();
    }
    
    public double getDoritos(){
    return this.doritos + getCarrinho();
    }
}
