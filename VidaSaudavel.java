import javax.swing.JOptionPane;
/**
 * @author (Alex e Lorena)
 */
public class VidaSaudavel extends Carrinho
{
    double frango_chapa = 35, carne_chapa = 40, camarao_bafo = 45, acai = 7, suco = 5;
    int cvs;
    public void CardapioVs(){
        cvs = Integer.parseInt(JOptionPane.showInputDialog(null, "\t Cardápio \n" + "Escolha o que você deseja comer: \n" + 
        "1 - Frango na chapa -------- R$35,00 \n" + "2 - Carne na chapa -------- R$40,00 \n" +
        "3 - Camarão no bafo -------- R$45,00 \n" + "4 - Açaí 500ml ------ R$7,00 \n" + "5 - Suco ------- R$5,00"));
    
    }
    
    public double getFrango_chapa(){
    return this.frango_chapa + getCarrinho();
    }
    
    public double getSalad_frango(){
    return this.carne_chapa + getCarrinho();
    }
    
    public double getCamarao_bafo(){
    return this.camarao_bafo + getCarrinho();
    }
    
    public double getAcai(){
    return this.acai + getCarrinho();
    }
    
    public double getSuco(){
    return this.suco + getCarrinho();
    }
}
