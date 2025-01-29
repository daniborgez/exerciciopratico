
package expraticopoo;

public class ExPraticoPOO {

    public static void main(String[] args) {
        Pessoa daniel = new Pessoa("Daniel", 23, "M");
        Livro l1 = new Livro("CARTAS PARA JULIETA","SEI LA",80,22,daniel);
        System.out.println(l1.detalhes());
        l1.abrir();
        l1.folhear();
        System.out.println(l1.detalhes());
        System.out.println("--------------");
        l1.fechar();
        l1.voltarPag();
        System.out.println(l1.detalhes());
    }
    
}
