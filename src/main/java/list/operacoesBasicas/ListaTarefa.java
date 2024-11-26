package main.java.list.operacoesBasicas;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if(t.getDescricao().equals(descricao)) {
                tarefasParaRemover.add(t);
            }

        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTarefas() {
        return tarefaList.size();
    }

    public void imprimirTarefa() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println(listaTarefa.obterNumeroTarefas());

       listaTarefa.adicionarTarefa("adcionando uma tarefa");
        listaTarefa.adicionarTarefa("adcionando uma tarefa2");
        System.out.println(listaTarefa.obterNumeroTarefas());

        listaTarefa.removerTarefa("adcionando uma tarefa2");
        System.out.println(listaTarefa.obterNumeroTarefas());

        listaTarefa.imprimirTarefa();
    }
}
