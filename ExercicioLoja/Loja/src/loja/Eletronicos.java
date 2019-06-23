
package loja;

import java.text.DecimalFormat;


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
        System.out.println("COMPRAR");
       if(this.getEstoque()== 0){
           System.out.println("Não é possível comprar. Este produto está fora de estoque.");
       }else{
           this.setEstoque(this.getEstoque()-1);
           DecimalFormat df = new DecimalFormat("#,##0.00");
           System.out.println("Você comprou "+this.getProduto() +" de  "+this.getVoltagem()+" por R$ "+ df.format(this.getValor()));
           System.out.println("Obrigado pela compra!");
           System.out.println("Restam " +this.getEstoque()+ " unidades no estoque.");
           System.out.println("###########################");
           System.out.println("");
       }
    }

    @Override
    public void trocar() {
        System.out.println("TROCAR");
       if(this.getEstoque()== 0){
           System.out.println("Não é possível trocar a mercadoria. Produto fora de estoque.");
       }else{
           DecimalFormat df = new DecimalFormat("#,###.00");
           this.setEstoque(this.getEstoque()-1);
           System.out.println("Você deseja trocar "+this.getProduto()+""+this.getVoltagem()+" de R$ "+df.format(this.getValor()));
           System.out.println("Troca realizada com sucesso.");
           System.out.println("Restam "+this.getEstoque()+" unidades no estoque.");
       }        
    }

    @Override
    public void provar() {
        System.out.println("PROVAR");
        System.out.println("Não é possível experimentar Eletrônicos.");
    }

    @Override
    public void status() {
        System.out.println("##########################");
        System.out.println("Produto: "+ this.getProduto());
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("Valor:R$ "+ df.format(this.getValor()));
        System.out.println("Voltagem: "+this.getVoltagem());
        System.out.println("Quantidade em estoque: "+this.getEstoque()+ " unidades.");
        System.out.println("###########################");
        System.out.println("");
    }
    
}
