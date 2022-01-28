
/**
 * @author (Alex e Lorena)
 */
public class G_McDonalds extends McDonalds implements Gerente 
{
    private int senha;
    private String nome, login;
    private double salario;
    private boolean ativo;
    
    public int getSenha(){
    return senha;
    }
    
    public void setSenha(int s){
    this.senha = s;
    }
    
    public String getNome(){
    return nome;
    }
    
    public void setNome(String n){
    this.nome = n;
    }
    
    public String getLogin(){
    return login;
    }
    
    public void setLogin(String l){
    this.login = l;
    }
    
    public double getSalario(){
    return salario;
    }
    
    public void setSalario(double sal){
    this.salario = sal;
    }
    
    public boolean getAtivo(){
    return ativo;
    }
    
    public void setAtivo(boolean at){
    this.ativo = at;
    }
    
    public void status(){
    if (this.ativo = true){
    System.out.println("O gerente " + this.nome + " está ativo na empresa Mc Donalds");
    } else {
    System.out.println("O gerente " + this.nome + " não trabalha mais na empresa Mc Donalds");
    }
    }
    
    public void dados(){
    System.out.println("Nome: " + this.nome);
    System.out.println("Salário: " + this.salario);
    System.out.println("Login: " + this.login);
    if (this.ativo = true){
        System.out.println("Situação: ativo");
    } else {
        System.out.println("Situação: desativo");
    }
    }
    
    public boolean autentica (int senha){
    if (this.senha == senha){
    System.out.println("Acesso permitido!");
    return true;
    } else {
    System.out.println("Acesso negado!");
    return false;
    }
    }
    
    public void muda_valor(String op, double alt){
    if (op ==  "hamburguer cheddar"){
     setHamb_cheddar(alt);
     CardapioMc(op, alt);
    } else if (op  == "hamburguer frango") {
    setHamb_frango(getHamb_cheddar() + alt);
    }
    }
}
