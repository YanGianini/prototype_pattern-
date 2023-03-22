import java.util.Date;
import java.util.Objects;

public class Cartao implements Cloneable{
    private Integer numero;
    private Integer CCV;
    private String nome;
    private String validade;

    public Cartao (int numero, int CCV, String nome, String validade){
        this.numero = numero;
        this.CCV = CCV;
        this.nome = nome;
        this.validade = validade;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCCV() {
        return CCV;
    }

    public void setCCV(Integer CCV) {
        this.CCV = CCV;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Cartao{"+ "numero=" + numero + ", CVV=" + CCV + ", nome='" + nome + "', validade='" + validade + "'}";
    }
}
