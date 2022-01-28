import javax.swing.JOptionPane;
/**
 * @author (Alex e Lorena)
 */
public class VidaSemCarne extends Carrinho
{
    double torta_gbico = 20, esfirra_espi = 8, lasanha = 10, bolo_vegano = 5, suco = 5;
    int cvsc;
    public void CardapioVsc(){
    cvsc = Integer.parseInt(JOptionPane.showInputDialog(null, "\t Cardápio \n" + "Escolha o que você deseja comer: \n" + 
        "1 - Torta de grão bico -------- R$20,00 \n" + "2 - Esfirra de esfinafre -------- R$8,00 \n" +
        "3 - Lasanha de berinjela -------- R$10,00 \n" + "4 - Bolo vegano ------ R$5,00 \n" + "5 - Suco ------- R$5,00"));
    }
    
    public double getTorta_gbico(){
    return this.torta_gbico + getCarrinho();
    }
    
    public double getEsfirra_espi(){
    return this.esfirra_espi + getCarrinho();
    }
    
    public double getLasanha(){
    return this.lasanha + getCarrinho();
    }
    
    public double getBolo_vegano(){
    return this.bolo_vegano + getCarrinho();
    }
    
    public double getSuco(){
    return this.suco + getCarrinho();
    }
}
