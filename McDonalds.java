import javax.swing.JOptionPane;
/**
 * @author (Alex e Lorena)
 */
public class McDonalds extends Carrinho
{
    double hamb_cheddar = 20, hamb_frango = 18, milk = 10, batata = 6, refri = 5;
    
    int cmcd;
    
    public void setHamb_cheddar(double soma){
    this.hamb_cheddar = 20 + soma;
    }
    
    public double getHamb_cheddar(){
    return this.hamb_cheddar + getCarrinho();
    } 
    
    public double getHamb_frango(){
    return this.hamb_frango + getCarrinho();
    }
    
    public void setHamb_frango(double soma){
    this.hamb_frango = this.hamb_frango + soma;
    }
    
    public double getMilk(){
    return this.milk + getCarrinho();
    } 
    
    public double getRefri(){
    return this.refri + getCarrinho();
    }
    public double getBatata(){
    return this.batata + getCarrinho();
    } 
    
    public void CardapioMc(String op, double alt){
        if (op == "hamburguer cheddar"){
        setHamb_cheddar(alt);
        }
        cmcd = Integer.parseInt(JOptionPane.showInputDialog(null, "\t Cardápio \n" + "Escolha o que você deseja comer: \n" + 
        "1 - Hambúrguer de carne bovina c/ cheddar-------- "+ getHamb_cheddar() + "\n"
        + "2 - Hambúrguer de frango c/ batata frita --------" + getHamb_frango() + "\n" +
        "3 - Milk Shake(Chocolate) --------" + getMilk() + "\n" +
        "4 - Refrigerante --------" + getRefri() + "\n" + 
        "5 - Batata frita --------" + getBatata()));  
      
    }
    
}
