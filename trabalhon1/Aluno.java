/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhon1;

/**
 *
 * @author Alunos
 */
public class Aluno {
    
    private String nome;
    private int matricula;
    private String curso;
    private int cargaHorariaTotal;
    private int quantidadeAtividades;

    public Aluno(String nome, int matricula, String curso, int cargaHorariaTotal,
            int quantidadeAtividades) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.cargaHorariaTotal = cargaHorariaTotal;
        this.quantidadeAtividades = quantidadeAtividades;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public int getCargaHorariaTotal() {
        return cargaHorariaTotal;
    }

    public int getQuantidadeAtividades() {
        return quantidadeAtividades;
    }
    
    
    
}
