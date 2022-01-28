import java.util.Scanner;
/**
 * @author (Alex e Lorena) 
 */
public class IFome
{
    public static void main (String[] args){
    Mensagem msg = new Mensagem();
    MenuComida menu = new MenuComida();
    msg.MensagemInicio();
    menu.MenuTipo();
    
    //Mostrando gerente
    G_McDonalds gmc = new G_McDonalds();
    gmc.setSalario(5000);
    gmc.setNome("Junior");
    gmc.setLogin("Junior123");
    gmc.setAtivo(true);
    gmc.dados();
    gmc.muda_valor("hamburguer cheddar", 2.0);
   
    // Chamando o restaurantes com as alteraçoes
    McDonalds mc = new McDonalds();
    //mc.CardapioMc("hamburguer cheddar", 2.0);
    }
}
