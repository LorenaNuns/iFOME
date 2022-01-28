  import javax.swing.JOptionPane;
  import java.util.Random;
  /**
  * @author (Alex e Lorena)
  */
   public class Pagamento extends Carrinho
  {
                    
                public void Pagamento(double conta, int c1, int c2){
                MenuComida mc = new MenuComida();
                Restaurantes rest = new Restaurantes();
                   
                //GERAR SENHA
                Random random = new Random();
                int senha = random.nextInt(100);
                   
                double pag;
                mc.n1 = c1;
                   
                   if (mc.n1 == 1){
                       rest.fastf = c2;
                   } else if (mc.n1 == 2){
                       rest.cs = c2;
                   } else if (mc.n1 == 3){
                       rest.cv = c2;
                   }
                   
                //VALOR DE UMA VARIAVEL EM RESTAURANTE DEVE ACUMULAR O PREÇO DO PEDIDO E AI AQUI PASSAR ELA PELO SET
                setCarrinho(conta);
                   
                JOptionPane.showMessageDialog(null, "PAGAMENTO \n " + "Valor: " + getCarrinho());
                   
                pag = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor do pedido: "));
                    
                    if (pag == getCarrinho()){
                        JOptionPane.showMessageDialog(null, "Pagamento efetuado com sucesso! \n ");
                    
                        JOptionPane.showMessageDialog(null, "Emitindo nota fiscal");
                    
                        if (mc.n1 == 1 && rest.fastf == 1){
                            JOptionPane.showMessageDialog(null, "Restaurante: Mc Donalds \n" + "Valor: " + getCarrinho() + "\n" + "Senha do pedido: " + senha);
                        }else if (mc.n1 == 1 && rest.fastf == 2){
                            JOptionPane.showMessageDialog(null, "Restaurante: Subway \n" + "Valor: " + getCarrinho() + 
                            "\n" + "Senha do pedido: " + senha);
                        } else if (mc.n1 == 2 && rest.cs == 1){
                            JOptionPane.showMessageDialog(null, "Restaurante: Vida Saúdavel \n" + "Valor: " + getCarrinho() + 
                            "\n" + " Senha do pedido: " + senha);
                        } else if (mc.n1 == 2 && rest.cs == 2){
                            JOptionPane.showMessageDialog(null, "Restaurante: Salada Food \n" + "Valor: " + getCarrinho() + "\n" 
                            + "Senha do pedido: " + senha);
                        } else if (mc.n1 == 3 && rest.cv == 1){
                            JOptionPane.showMessageDialog(null, "Restaurante: Vida sem Carne \n" + "Valor: " + getCarrinho() + "\n" 
                            + "Senha do pedido: " + senha);
                        } else if (mc.n1 == 3 && rest.cv == 2){
                            JOptionPane.showMessageDialog(null, "Restaurante: Hamburgueria Vegana \n" + "Valor: " + getCarrinho() + "\n"
                            + "Senha do pedido: " + senha);
                        }
                
                    // IF SE O PAGAMENTO FOR MENOR Q O VALOR DO PEDIDO
                } else if (pag < getCarrinho()){
                    JOptionPane.showMessageDialog(null, "Por favor, insira o valor correto do pedido! \n ");
                        if (mc.n1 == 1){
                            Pagamento(0, mc.n1, rest.fastf);
                        } else if (mc.n1 == 2){
                            Pagamento(0, mc.n1, rest.cs);
                        } else if (mc.n1 == 3){
                            Pagamento(0, mc.n1, rest.cv);
                        }   
                    }
        
        
            }   
   }
    
