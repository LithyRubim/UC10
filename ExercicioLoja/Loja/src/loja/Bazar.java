
package loja;

import java.text.DecimalFormat;


public class Bazar extends Empresa {
    private boolean garantia;
    
    public Bazar(){
        super();
    }

    public Bazar(String produto,float valor,boolean garantia, int estoque) {
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

    @Override
    public void comprar() {
        System.out.println("COMPRAR");
      if(this.getEstoque()== 0){
          System.out.println("Não é possível comprar. Mercadoria fora de estoque.");
          System.out.println("###################");
          System.out.println("");
      }else{
          this.setEstoque(this.getEstoque()-1);
          DecimalFormat df = new DecimalFormat("#,##.00"); 
          System.out.println("Você comprou "+this.getProduto()+" por R$ "+ df.format(this.getValor()));
          System.out.println("Obrigado pela compra!");
          System.out.println("Restam "+this.getEstoque()+" unidades no estoque.");
          System.out.println("###################");
          System.out.println("");
      }
    }

    @Override
    public void trocar() {
        System.out.println("TROCAR");
      if(this.getEstoque()== 0){
        System.out.println("Não é possível trocar. Produto fora de estoque.");
        System.out.println("######################");
        System.out.println("");
    }else{
        this.setEstoque(this.getEstoque()-1);
        DecimalFormat df = new DecimalFormat("#,##.00");
        System.out.println("Você deseja trocar "+ this.getProduto()+" de R$ "+ df.format(this.getValor()));
        System.out.println("Troca realizada com sucesso.");
        System.out.println("Restam "+ this.getEstoque()+ " unidades no estoque.");
      }
    }
        

    @Override
    public void provar() {
        System.out.println("PROVAR");
        System.out.println("Não é possivel provar artigos de bazar!");
    }

    @Override
    public void status() {
        System.out.println("###########################");
        System.out.println("Produto: "+ this.getProduto());
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("Valor: R$ "+ df.format(this.getValor()));
      if(this.isGarantia()== false){
          System.out.println("O produto não possui garantia.");
      }else{
          System.out.println("O produto possui garantia de fábrica.");
      }
        System.out.println("Quantidade no estoque: "+this.getEstoque()+ " unidades.");
        System.out.println("############################");
        System.out.println("");
    }
    
}
