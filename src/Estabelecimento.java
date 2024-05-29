import Atendente.Atendente;

public class Estabelecimento {
    public static void main(String[] args) throws Exception {
        System.out.println("Estabelecimento INVISIVEL");
        Atendente atendente1 = new Atendente();
        atendente1.nome="Guilberte";
        atendente1.atender(); 
        // A visibilidade private dentro da mesma classe 
        // default dentro do mesmo pacote 
        // private pode ser usado em operaçoes que não é necessario ser vista na classe principal
        
    
    
    }
}
