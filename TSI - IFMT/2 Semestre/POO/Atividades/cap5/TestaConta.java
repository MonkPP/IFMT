public class TestaConta {
    public static void main (String[] args) {
    
/*exercicio 1: para	garantirmos	que os atributos da classe Conta não sejam acessados de forma direta em outra classe a qual não seja a própria classe Conta devemos usar o controlador de acesso private */ 
     
/*exercicio 2: Ao deixar os atributos em modo privado na Classe Conta, a classe TestaConta não consegue acessar ou atribuir valores a eles, dando erro na hora de rodar o codigo
  
        o codigo a seguir não roda porque o atributo titular é privado:

        Conta c1 = new Conta();
        c1.titular = "monik";
        System.out.println(c1.titular);*/

        Conta c2 = new Conta();
        c2.setTitular("Monyk");
        System.out.println(c2.getTitular());




    }    
}