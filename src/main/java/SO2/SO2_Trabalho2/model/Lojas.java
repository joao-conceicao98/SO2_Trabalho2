package SO2.SO2_Trabalho2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Lojas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String local;
    private int tamanho;
    private int dono;

    protected Lojas() {
    }

    public Lojas(String nome, String local, int tamanho, int dono) {
        super();
        this.nome = nome;
        this.local = local;
        this.tamanho = tamanho;
        this.dono = dono;
    }

    @Override
    public String toString() {
        return String.format("Loja[id=%d, nome='%s', local='%s', tamanho=%d, dono='%d']", id, nome, local, tamanho,
                dono);
    }

    public long getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public String getLocal() {
        return this.local;
    }

    public int getDono() {
        return this.dono;
    }

    public void setId(int set) {
        this.id = set;
    }

    public void setNome(String set) {
        this.nome = set;
    }

    public void setTamanho(int set) {
        this.tamanho = set;
    }

    public void setLocal(String set) {
        this.local = set;
    }

    public void setDono(int dono) {
        this.dono = dono;
    }

}