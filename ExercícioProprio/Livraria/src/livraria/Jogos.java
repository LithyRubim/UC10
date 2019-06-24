
package livraria;


public class Jogos extends Livro {
    private String plataforma;
    private String genero;

    public Jogos() {
        super();
    }

    public Jogos(String titulo,String genero,String plataforma,float valor,int estoque) {
        super.titulo = titulo;
        this.genero = genero;
        this.plataforma = plataforma;
        super.valor = valor;
        super.estoque = estoque;        
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
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
