import java.util.ArrayList;
import java.util.Objects;

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

    public void imprimirProdutos(ArrayList<Produto> produtos) {
        for(Produto produto : produtos) {
            if(produto instanceof Livro) {
                Livro livro = (Livro) produto;
                System.out.println("Livro: " + livro.getNome() + "\nAutor: " + livro.getAutor() + "\nNº de páginas: " + livro.getPaginas() + "\nPreço: " + livro.getPreco());
            } else if(produto instanceof Eletronico) {
                Eletronico eletronico = (Eletronico) produto;
                System.out.println("Nome: " + eletronico.getNome() + "\nFábrica: " + eletronico.getFabrica() + "\nCategoria: " + eletronico.getCategoria() + "\nPreço: " + eletronico.getPreco());
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        var produtos = new ArrayList<Produto>();


    }
}

