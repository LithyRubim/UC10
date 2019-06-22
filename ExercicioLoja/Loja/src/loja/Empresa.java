
package loja;


public abstract class Empresa implements Vendedor {
    protected String produto;
    protected float valor;
    protected int estoque;
    
    public Empresa(){
        super();
    }
}
