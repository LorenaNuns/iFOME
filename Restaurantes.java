import javax.swing.JOptionPane;
/** 
 * @author (Alex e Lorena)
 */
public class Restaurantes extends Carrinho
{
    protected int escolha = 1;
    protected int pedido;
    protected int fastf;
    protected int cs;
    protected int cv;
    Pagamento pgmnt = new Pagamento();
    
    public void FastFood(int n1){
        //MENU PARA ESCOLHER O RESTAURANTE DO FAST FOOD
        McDonalds mcd = new McDonalds();
        Subway sub = new Subway();
        
        
        fastf = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha em qual restaurante deseja pedir: \n" + 
        "1 - Mc Donalds \n" + "2 - Subway"));
        
        while(this.escolha == 1){
            if (fastf == 1){
                mcd.CardapioMc("",0);
                // Variável que aponta para a opção cardápio
                pedido = mcd.cmcd;
                if (this.pedido == 1) {
                setCarrinho(mcd.getHamb_cheddar());
                //conta = getCarrinho() + conta;
                } else if (this.pedido == 2){
                setCarrinho(mcd.getHamb_frango());
                } else if (this.pedido == 3){
                setCarrinho(mcd.getMilk());
                } else if (this.pedido == 4){
                setCarrinho(mcd.getRefri());
                } else if (this.pedido == 5){
                setCarrinho(mcd.getBatata());
                } else {
                JOptionPane.showMessageDialog(null, "Essa opção não existe!");
                }
                // AQUI ONDE MOSTRA O VALOR DE CADA COMPRA
                JOptionPane.showMessageDialog(null, "Valor da compra: " + getCarrinho());
                
            }else if (fastf == 2){
                sub.CardapioSub();
                pedido = sub.csub;
                if (this.pedido == 1) {
                setCarrinho(sub.getSand_frango());
                } else if (this.pedido == 2){
                setCarrinho(sub.getSand_carne());
                } else if (this.pedido == 3){
                setCarrinho(sub.getRefri());
                } else if (this.pedido == 4){
                setCarrinho(sub.getCookie());
                } else if (this.pedido == 5){
                setCarrinho(sub.getDoritos());
                } else {
                JOptionPane.showMessageDialog(null, "Essa opção não existe!");
                }
                // AQUI ONDE MOSTRA O VALOR DE CADA COMPRA
                JOptionPane.showMessageDialog(null, "Valor da compra: " + getCarrinho()); 
            }else{
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            } 
            
            //CLIENTE ESCOLHE SE FINALIZA A COMPRA OU CONTINUA
            escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Você deseja adicionar algo a mais na sua compra? \n" + "Digite 1 para Sim e 2 para Não;"));
            //CLIENTE ESCOLHE SE FINALIZA A COMPRA OU CONTINUA.
            
        }
        // AQUI ONDE MOSTRA O VALOR DE CADA COMPRA
        JOptionPane.showMessageDialog(null, "Valor da compra: " + getCarrinho());  
        pgmnt.Pagamento(getCarrinho(), n1, fastf);
    }
    
    public void CS(int n1){
        //MENU PARA ESCOLHER O RESTAURANTE DO COMIDA SAUDÁVEL
        
        VidaSaudavel vs = new VidaSaudavel();
        SaladaFood sf = new SaladaFood();
         cs = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha em qual restaurante deseja pedir: \n" + 
        "1 - Vida Saudável \n" + "2 - Salada Food"));
        
        while(escolha == 1){
            if (cs == 1){
            vs.CardapioVs();
            // Variável que aponta para a opção cardápio
            pedido = vs.cvs;
            if (this.pedido == 1) {
                setCarrinho(vs.getFrango_chapa());
                } else if (this.pedido == 2){
                setCarrinho(vs.getSalad_frango());
                } else if (this.pedido == 3){
                setCarrinho(vs.getCamarao_bafo());
                } else if (this.pedido == 4){
                setCarrinho(vs.getAcai());
                } else if (this.pedido == 5){
                setCarrinho(vs.getSuco());
                } else {
                JOptionPane.showMessageDialog(null, "Essa opção não existe!");
            }
            // AQUI ONDE MOSTRA O VALOR DE CADA COMPRA
            JOptionPane.showMessageDialog(null, "Valor da compra: " + getCarrinho()); 
            } else if (cs == 2){
            sf.CardapioSf();
            pedido = sf.csf;
            if (this.pedido == 1) {
                setCarrinho(sf.getSalad_frango());
                } else if (this.pedido == 2){
                setCarrinho(sf.getSalad_camarao());
                } else if (this.pedido == 3){
                setCarrinho(sf.getRisoto());
                } else if (this.pedido == 4){
                setCarrinho(sf.getBolo_cenou());
                } else if (this.pedido == 5){
                setCarrinho(sf.getSuco());
                } else {
                JOptionPane.showMessageDialog(null, "Essa opção não existe!");
            }
            // AQUI ONDE MOSTRA O VALOR DE CADA COMPRA
            JOptionPane.showMessageDialog(null, "Valor da compra: " + getCarrinho()); 
            } else {
            JOptionPane.showMessageDialog(null,"Opção inválida!" );
            }
            //CLIENTE ESCOLHE SE FINALIZA A COMPRA OU CONTINUA
            escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Você deseja adicionar algo a mais na sua compra? \n" + "Digite 1 para Sim e 2 para Não;"));
            //CLIENTE ESCOLHE SE FINALIZA A COMPRA OU CONTINUA.
       }
       // AQUI ONDE MOSTRA O VALOR DE CADA COMPRA
       JOptionPane.showMessageDialog(null, "Valor da compra: " + getCarrinho());
       pgmnt.Pagamento(getCarrinho(), n1, cs);
    }
    
    public void CV(int n1){
        // //MENU PARA ESCOLHER O RESTAURANTE DO COMIDA VEGANA
        VidaSemCarne vsc = new VidaSemCarne();
        HamburgueriaVegana hv = new HamburgueriaVegana();
        
        cv = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha em qual restaurante deseja pedir: \n" + 
        "1 - Vida sem Carne \n" + "2 - Hamburgueria Vegana"));
        
        while(escolha == 1){
            if (cv == 1){
            vsc.CardapioVsc();
            pedido = vsc.cvsc;
            if (this.pedido == 1) {
                setCarrinho(vsc.getTorta_gbico());
                } else if (this.pedido == 2){
                setCarrinho(vsc.getEsfirra_espi());
                } else if (this.pedido == 3){
                setCarrinho(vsc.getLasanha());
                } else if (this.pedido == 4){
                setCarrinho(vsc.getBolo_vegano());
                } else if (this.pedido == 5){
                setCarrinho(vsc.getSuco());
                } else {
                JOptionPane.showMessageDialog(null, "Essa opção não existe!");
            }
            // AQUI ONDE MOSTRA O VALOR DE CADA COMPRA
            JOptionPane.showMessageDialog(null, "Valor da compra: " + getCarrinho()); 
            } else if (cv == 2){
            hv.CardapioHv();
            pedido = hv.chv;
            if (this.pedido == 1) {
                setCarrinho(hv.getHamb_soja());
                } else if (this.pedido == 2){
                setCarrinho(hv.getHamb_bdoce());
                } else if (this.pedido == 3){
                setCarrinho(hv.getHamb_ccaju());
                } else if (this.pedido == 4){
                setCarrinho(hv.getPave_vegano());
                } else if (this.pedido == 5){
                setCarrinho(hv.getSuco());
                } else {
                JOptionPane.showMessageDialog(null, "Essa opção não existe!");
            }
            // AQUI ONDE MOSTRA O VALOR DE CADA COMPRA
            JOptionPane.showMessageDialog(null, "Valor da compra: " + getCarrinho()); 
            } else {
            JOptionPane.showMessageDialog(null,"Opção inválida!" );
            }
            //CLIENTE ESCOLHE SE FINALIZA A COMPRA OU CONTINUA
            escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Você deseja adicionar algo a mais na sua compra? \n" + "Digite 1 para Sim e 2 para Não;"));
            //CLIENTE ESCOLHE SE FINALIZA A COMPRA OU CONTINUA.
        }
        
        // AQUI ONDE MOSTRA O VALOR DE CADA COMPRA
        JOptionPane.showMessageDialog(null, "Valor da compra: " + getCarrinho()); 
        pgmnt.Pagamento(getCarrinho(), n1, cv);
    }
}
