
package loja;


public class Eletronicos extends Empresa {
    private String voltagem;
    
    public Eletronicos(){
        super();
    }

    public Eletronicos(String produto,float valor,String voltagem, int estoque) {
        super.produto = produto;
        super.valor = valor;
        this.voltagem = voltagem;
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

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }
    
    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public void comprar() {
    }

    @Override
    public void trocar() {
    }

    @Override
    public void provar() {
    }

    @Override
    public void status() {
    }
    
}
