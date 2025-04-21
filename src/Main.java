abstract class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

class Livro extends Produto {
    private String autor;
    private String paginas;

    public Livro(String nome, String autor, String paginas, double preco) {
        super(nome, preco);
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getAutor()  {
        return autor;
    }

    public String getPaginas() {
        return paginas;
    }
}

class Eletronico extends Produto {
    private String fabrica;
    private String categoria;

    public Eletronico(String nome, String fabrica, String categoria, double preco) {
        super(nome, preco);
        this.fabrica = fabrica;
        this.categoria = categoria;
    }

    public String getFabrica() {
        return fabrica;
    }

    public String getCategoria() {
        return categoria;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

