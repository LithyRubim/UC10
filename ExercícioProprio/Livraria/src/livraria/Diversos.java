
package livraria;


public class Diversos extends Livro {
    private boolean garantia;

    public Diversos() {
        super();
    }

    public Diversos(String produto,float valor,boolean garantia,int estoque) {
        super.produto = produto;
        super.valor = valor;
        this.garantia = garantia;
        super.estoque = estoque;
    }
    
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
     public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    
    
    
    
}
