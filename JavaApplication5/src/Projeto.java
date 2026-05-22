public class Projeto {
    
    private String nome;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private String status;
    
    private Usuario gerente; 

    public Projeto(String nome, String descricao, String dataInicio, String dataTermino, String status, Usuario gerente) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.status = status;
        this.gerente = gerente;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getDataInicio() { return dataInicio; }
    public void setDataInicio(String dataInicio) { this.dataInicio = dataInicio; }

    public String getDataTermino() { return dataTermino; }
    public void setDataTermino(String dataTermino) { this.dataTermino = dataTermino; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Usuario getGerente() { return gerente; }
    public void setGerente(Usuario gerente) { this.gerente = gerente; }
}
