import javax.swing.JOptionPane;
/** 
 * @author (Alex e Lorena)
 */
public class HamburgueriaVegana extends Carrinho
{
    double hamb_soja = 16, hamb_bdoce = 10, hamb_ccaju = 15, pave_vegano = 6, suco = 5;
    int chv;
    public void CardapioHv(){
     chv = Integer.parseInt(JOptionPane.showInputDialog(null, "\t Cardápio \n" + "Escolha o que você deseja comer: \n" + 
        "1 - Hambúrguer de soja -------- R$16,00 \n" + "2 - Hambúrguer de batata doce -------- R$10,00 \n"
        + "3 - Hambúrguer de castanha de caju ------ R$15,00 \n" +  "4 - Pavê vegano ------- R$6,00 \n" + 
        "5 - Suco ------- R$5,00" ));
    }
    
    public double getHamb_soja(){
    return this.hamb_soja + getCarrinho();
    }
    
    public double getHamb_bdoce(){
    return this.hamb_bdoce + getCarrinho();
    }
    
    public double getHamb_ccaju(){
    return this.hamb_ccaju + getCarrinho();
    }
    
    public double getPave_vegano(){
    return this.pave_vegano + getCarrinho();
    }
    
    public double getSuco(){
    return this.suco + getCarrinho();
    }
}
