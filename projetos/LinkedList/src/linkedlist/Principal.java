package linkedlist;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Materia2 a = new Materia2();

        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantas materias deseja adicionar?"));

        for (int i = 0; i < qtd; i++) {
            String nome_mat = JOptionPane.showInputDialog("Qual é a " + (i + 1) + " matéria que você quer adicionar?");
            a.addMateria2(nome_mat);

        }

        a.listaMaterias();

        String busca = JOptionPane.showInputDialog("Qual matera você procura?");
        a.buscaMateria(busca);

        String deleta = JOptionPane.showInputDialog("Qual materia você deseja excluir?");
        a.delMateria(deleta);

        a.listaMaterias();
    }

}
