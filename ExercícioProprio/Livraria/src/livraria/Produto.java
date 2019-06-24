package livraria;

public class Produto {
    
    public Produto(){
        super();
    }
    
    String titulo;
    float valor;
    int estoque;
    private String plataforma;
    private String autor;
    private String genero;
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
}
