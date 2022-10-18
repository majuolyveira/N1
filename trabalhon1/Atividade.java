/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhon1;

/**
 *
 * @author Alunos
 */
public class Atividade {
    
    private String nome_aluno;
    private int matricula;
    private int numeroRegistro;
    private int grupoAtividade;
    private String descricaoAtividade;
    private boolean statusAproveitamento;
    private int cargaHorariaConsiderada;

    public Atividade(String nome_aluno, int matricula, int numeroRegistro, int grupoAtividade,
            String descricaoAtividade, boolean statusAproveitamento, int cargaHorariaConsiderada) {
        this.nome_aluno = nome_aluno;
        this.matricula = matricula;
        this.numeroRegistro = numeroRegistro;
        this.grupoAtividade = grupoAtividade;
        this.descricaoAtividade = descricaoAtividade;
        this.statusAproveitamento = statusAproveitamento;
        this.cargaHorariaConsiderada = cargaHorariaConsiderada;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public int getGrupoAtividade() {
        return grupoAtividade;
    }

    public String getDescricaoAtividade() {
        return descricaoAtividade;
    }

    public Boolean getStatusAproveitamento() {
        return statusAproveitamento;
    }

    public int getCargaHorariaConsiderada() {
        return cargaHorariaConsiderada;
    }
    
    
}
