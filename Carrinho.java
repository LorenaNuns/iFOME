import javax.swing.JOptionPane;
/**
 * @author (Alex e Lorena)
 */
public class Carrinho
{
    private double carrinho;
    private double aux;
    
    public void setCarrinho(double car){
    this.carrinho = car;
    this.aux = this.carrinho + this.aux;
    
    }
    
    public double getCarrinho(){
        return this.aux;
    }
}
