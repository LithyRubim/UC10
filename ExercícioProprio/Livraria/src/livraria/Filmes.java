
package livraria;


public class Filmes extends Livro {
    private int ano;

    public Filmes() {
        super();
    }

    public Filmes(String titulo,float valor,int ano,int estoque) {
        super.titulo = titulo;
        super.valor = valor;
        this.ano = ano;
        super.estoque = estoque;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    
    
    
    
    
}
