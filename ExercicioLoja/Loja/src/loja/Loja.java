package loja;


public class Loja {
    public static void main(String[] args) {
        Roupas camiseta = new Roupas("camiseta",29.9f,"feminino","GG",2);
        //camiseta.status();
        
        Roupas calça = new Roupas("calça jeans",35.99f,"masculino","40",0);
        calça.status();
        calça.trocar();
        
    }
}
