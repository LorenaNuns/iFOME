import javax.swing.JOptionPane;
/**
 * @author (Alex e Lorena)
 */
public class SaladaFood extends Carrinho
{
    double salad_frango = 15, salad_camarao = 20, risoto = 17, bolo_cenou = 5, suco = 5;
    int csf;
    public void CardapioSf(){
     csf = Integer.parseInt(JOptionPane.showInputDialog(null, "\t Cardápio \n" + "Escolha o que você deseja comer: \n" + 
     "1 - Salada de frango -------- R$15,00 \n" + "2 - Salada de camarão -------- R$20,00 \n" +
        "3 - Risoto -------- R$17,00 \n" + "4 - Bolo de cenoura ------ R$5,00 \n" + "5 - Suco ------- R$5,00"));
    }
    
    public double getSalad_frango(){
    return this.salad_frango + getCarrinho();
    }
    
    public double getSalad_camarao(){
    return this.salad_camarao + getCarrinho();
    }
    
    public double getRisoto(){
    return this.risoto + getCarrinho();
    }
    
    public double getBolo_cenou(){
    return this.bolo_cenou + getCarrinho();
    }
    
    public double getSuco(){
    return this.suco + getCarrinho();
    }
}
