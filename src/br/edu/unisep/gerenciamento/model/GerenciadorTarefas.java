package br.edu.unisep.gerenciamento.model;

import java.util.ArrayList;

public class GerenciadorTarefas {
    private ArrayList<Tarefa> tarefas;

    public GerenciadorTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void marcarTarefaComoConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).marcarComoConcluida();
        }
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
        }
    }

    public String listarTarefas() {
        StringBuilder lista = new StringBuilder();
        for (int i = 0; i < tarefas.size(); i++) {
            lista.append(i + 1).append(". ").append(tarefas.get(i)).append("\n");
        }
        return lista.toString();
    }

    public int getQuantidadeTarefas() {
        return tarefas.size();
    }
}