
package expraticopoo;

public class ExPraticoPOO {

    public static void main(String[] args) {
        Pessoa daniel = new Pessoa("Daniel", 23, "M");
        Livro l1 = new Livro("CARTAS PARA JULIETA","PEDRO LUNEAR",80,daniel);
        l1.abrir();
        l1.folhear(81);
        System.out.println(l1.detalhes());
    }
    
}
