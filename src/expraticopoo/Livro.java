
package expraticopoo;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPagina;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; 
    
    //metodo personalizado

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + "\n, totPagina=" + totPagina + ", pagAtual=" + 
        pagAtual + ", aberto=" + aberto + "\n, leitor=" + leitor.getNome()+", idade do leitor=" + leitor.getIdade()+ '}';
    }

    //meotodos especiais
    public Livro(String titulo, String autor,int totPagina ,Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPagina = totPagina;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPagina() {
        return totPagina;
    }

    public void setTotPagina(int totPagina) {
        this.totPagina = totPagina;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    //metodos abstratos
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
      if(p> this.totPagina || aberto == false){
            this.pagAtual = 0;
            System.out.println("Pagina excedida ou livro esta fechado");
      }else{
            this.pagAtual = p;
      }
    }

    @Override
    public void avancarPag() {
        if(aberto == true && pagAtual <= totPagina){
            this.setPagAtual(pagAtual+1);
        }else{
         System.out.println("ERRO! LIVRO FECHADO OU SEM MAIS PAGINAS PARA FOLHEAR (erro avancarpag)");
        }
    }

    @Override
    public void voltarPag() {
        if(aberto == true && pagAtual >0){
            this.setPagAtual(pagAtual-1);
        }else{
              System.out.println("ERRO! LIVRO FECHADO OU SEM MAIS PAGINAS (erro <0)");
        }

    }

    
    
}
    
   
