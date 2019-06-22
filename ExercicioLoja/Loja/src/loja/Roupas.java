
package loja;

import java.text.DecimalFormat;


public class Roupas extends Empresa {
    private String genero;
    private String tamanho;
    
    public Roupas(){
        super();
    }

    public Roupas(String produto,float valor,String genero, String tamanho, int estoque) {
        super.produto = produto;
        super.valor = valor;
        this.genero = genero;
        this.tamanho = tamanho;
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
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
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
          System.out.println("Não é possível comprar.Produto fora de estoque.");
          System.out.println("##################");
          System.out.println("");
      }else{
          this.setEstoque(this.getEstoque()-1);
          DecimalFormat df = new DecimalFormat("#,##.00");
          System.out.println("Você comprou o produto "+ this.getProduto() + " " + this.getGenero() + " por R$ "+df.format(this.getValor()));
          System.out.println("Obrigado pela compra!");
          System.out.println("Restam "+ this.getEstoque()+ " unidades no estoque.");
          System.out.println("##################");
      }
    }

    @Override
    public void trocar() {
        System.out.println("TROCAR");
      if(this.getEstoque()== 0){
          System.out.println("Não é possível trocar a mercadoria.Ela está fora de estoque!");
          System.out.println("##################");
          System.out.println("");
      }else{
          this.setEstoque(this.getEstoque()-1);
          DecimalFormat df = new DecimalFormat("#,##.00");
          System.out.println("Você deseja trocar o produto "+this.getProduto()+ " "+this.getGenero()+" de R$: "+ df.format(this.getValor()));
          System.out.println("Troca realizada com sucesso.");
          System.out.println("Restam "+ this.getEstoque()+ " unidades no estoque");
          System.out.println("##################");
          System.out.println("");
      }
    }

    @Override
    public void provar() {
        System.out.println("PROVAR");
      if(this.getEstoque()== 0){
          System.out.println("Não é possível provar. Peça fora de estoque.");
          System.out.println("##################");
          System.out.println("");
      }else{
          System.out.println("Possuímos no momento "+ this.getEstoque()+ " unidades tamanho "+this.getTamanho()+ " no nosso estoque.");
          System.out.println("Fique à vontade para experimentar a peça no nosso provador!");
          System.out.println("##################");
          System.out.println("");
      }
    }

    @Override
    public void status() {
        System.out.println("####################");
        System.out.println("Produto: " + this.getProduto());
        System.out.println("Gênero: "+ this.getGenero());
        System.out.println("Tamanho: "+ this.getTamanho());
        DecimalFormat df = new DecimalFormat();
        System.out.println("Valor: R$ "+ df.format(this.getValor()));
        System.out.println("Quantidade no estoque: "+ this.getEstoque()+ " unidades.");
        System.out.println("#####################");
        System.out.println("");
    }
    
}
