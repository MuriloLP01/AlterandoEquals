public class Pessoa{
    private String nome;
    private Integer rg;

    public Pessoa(String nome, Integer rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } if ((object == null) || (getClass() != object.getClass())) {
            return false;
        } Pessoa pessoa = (Pessoa) object;
        return pessoa.getRg().equals(this.getRg());
    }
}
