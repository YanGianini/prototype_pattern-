public class Compra implements Cloneable{
    private String item;
    private String endereco;
    private Integer valor;
    private Cartao cartao;

    public Compra(String item, String endereco, Integer valor, Cartao cartao) {
        this.item = item;
        this.endereco = endereco;
        this.valor = valor;
        this.cartao = cartao;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    @Override
    public Compra clone() throws CloneNotSupportedException {
        Compra compraClone = (Compra) super.clone();
        compraClone.cartao = (Cartao) compraClone.cartao.clone();
        return compraClone;
    }

    @Override
    public String toString() {
        return "Compra{" + "item='" + item + "', endereco='"+ endereco + "', valor=" + valor + ", cartao=" + cartao + "}";
    }
}
