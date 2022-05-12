public class Teste {
        int	x = 37;
        public static void main(String	[]	args) {
            System.out.println(x);
        }
}
/* DESAFIO 1: o codigo não roda porque um metodo estatico não consegue fazer referencia a um atributo não estatico
isso acontece porque "static" faz do metodo main ser da classe e não do objeto, e sendo um metodo da classe, ele só consegue referenciar atributos que são da classe */ 

/* */