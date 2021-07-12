/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import classes.Aluno;
import classes.Livros;
import classes.Movimento;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class LivrariaIF {

    //Metodo para Criar aluno
    public static Aluno criarAluno() {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite seu nome para cadastrar:");
        String nome = Ler.next();

        System.out.println("Informe seu CPF: ");
        String cpf = Ler.next();

        System.out.println("Informe seu Telefone: ");
        String fone = Ler.next();

        return new Aluno(nome, cpf, fone);
    }

    //Metodo para Criar livros
    public static Livros criarLivro() {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite a descrição para o Livro:");
        String Descricao = Ler.next();

        System.out.println("Informe o tipo do livro: ");
        String Tipo = Ler.next();

        return new Livros(Descricao, Tipo);
    }

    //Metodo para Criar movimento(Aluguel livro)
    public static Movimento criarMovimento() {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite ID Aluno:");
        int id_aluno = Ler.nextInt();

        System.out.println("Digite ID Livro:");
        int id_livro = Ler.nextInt();

        System.out.println("Informe data retirada do livro: ");
        String DataRetirada = Ler.next();

        System.out.println("Informe data entrega do livro: ");
        String DataEntrega = Ler.next();

        return new Movimento(id_aluno, id_livro, DataRetirada, DataEntrega);
    }

    //Metodo para Listar alunos cadastrados
    public static void listagemAlunos(ArrayList lista) {
        if (!lista.isEmpty()) {
            String mensagem = "";

            for (Iterator it = lista.iterator(); it.hasNext();) {
                Aluno p = (Aluno) it.next();
                mensagem += "ID: " + p.getID() + " - Nome: " + p.getNome() + " - Fone: " + p.getFone() + " - CPF: " + p.getCPF() + "\n";
            }
            System.out.println(mensagem);
        }
    }

    //Metodo para Listar livros
    public static void listagemLivros(ArrayList lista) {
        if (!lista.isEmpty()) {
            String mensagem = "";

            for (Iterator it = lista.iterator(); it.hasNext();) {
                Livros l = (Livros) it.next();
                mensagem += "ID: " + l.getID() + " - Descrição: " + l.getDescricao() + " - Tipo Livro: " + l.getTipo() + "\n";
            }
            System.out.println(mensagem);
        }
    }

    //Metodo para Listar movimentos(alugueis de livros)
    public static void listagemMovimentos(ArrayList lista) {
        if (!lista.isEmpty()) {
            String mensagem = "";

            for (Iterator it = lista.iterator(); it.hasNext();) {
                Movimento m = (Movimento) it.next();
                mensagem += "ID: " + m.getID() + " - ID Aluno: " + m.getID_Aluno() + " - ID Livro: " + m.getID_Livro()
                        + " - Data Retirada: " + m.getDataRetirada() + " - Data para devolução: " + m.getDataDevolver() + "\n";
            }
            System.out.println(mensagem);
        }
    }

    //Metodo para Carregar Aluno cadastrados pelo CPF
    public static Aluno carregaDadosAluno(String cpf, ArrayList lista) {
        if (!lista.isEmpty()) {
            String mensagem = "";

            for (Iterator it = lista.iterator(); it.hasNext();) {
                Aluno a = (Aluno) it.next();
                if (a.getCPF().equals(cpf)) {
                    return a;
                }
            }
            System.out.println(mensagem);
        }
        return null;
    }

    //Metodo para Carregar Livro cadastrado pela descrição
    public static Livros carregaDadosLivro(String Descricao, ArrayList lista) {
        if (!lista.isEmpty()) {
            String mensagem = "";

            for (Iterator it = lista.iterator(); it.hasNext();) {
                Livros l = (Livros) it.next();
                if (l.getDescricao().equals(Descricao)) {
                    return l;
                }
            }
            System.out.println(mensagem);
        }
        return null;
    }

    //Metodo para Carregar Movimentos cadastrado pela descrição
    public static Movimento carregaDadosMovimento(int ID, ArrayList lista) {
        if (!lista.isEmpty()) {
            String mensagem = "";

            for (Iterator it = lista.iterator(); it.hasNext();) {
                Movimento m = (Movimento) it.next();
                if (m.getID() == (ID)) {
                    return m;
                }
            }
            System.out.println(mensagem);
        }
        return null;
    }

//Metodo para Buscar e printar Aluno cadastrado pelo CPF
    public static void buscaEPrintaAlunoPeloCPF(String CPF, ArrayList lista) {
        Aluno a = carregaDadosAluno(CPF, lista);
        if (a != null) {
            System.out.println("ID:" + a.getID() + " - Nome:" + a.getNome() + " - CPF:" + a.getCPF() + " - Tel:" + a.getFone());
        }
    }

//Metodo para Buscar e printar Livro cadastrado pela descrição
    public static void buscaEPrintaLivroPelaDescricao(String Descricao, ArrayList lista) {
        Livros lv = carregaDadosLivro(Descricao, lista);
        if (lv != null) {
            System.out.println("ID:" + lv.getID() + " - Descrição:" + lv.getDescricao() + " - Tipo:" + lv.getTipo());
        }
    }

    // Alterar aluno
    public static void alterarAluno(int ID, String novoNome, String novoCPF, String novoFone, ArrayList lista) {
        if (!lista.isEmpty()) {
            String mensagem = "";

            for (Iterator it = lista.iterator(); it.hasNext();) {
                Aluno a = (Aluno) it.next();
                if (a.getID() == ID) {
                    mensagem = "Registro alterado";

                    a.setCPF(novoCPF);
                    a.setFone(novoFone);
                    a.setNome(novoNome);
                }
            }
            System.out.println(mensagem);
        }
    }

    // Alterar Livro
    public static void alterarLivro(int ID, String novoDescricao, String novoTipo, ArrayList lista) {
        if (!lista.isEmpty()) {
            String mensagem = "";

            for (Iterator it = lista.iterator(); it.hasNext();) {
                Livros l = (Livros) it.next();
                if (l.getID() == ID) {
                    mensagem = "Registro alterado";

                    l.setDescricao(novoDescricao);
                    l.setTipo(novoTipo);
                }
            }
            System.out.println(mensagem);
        }
    }

    // Alterar Movimento
    public static void alterarMovimento(int ID, int novoIdAluno, int novoIdLivro, String novaDataRetirada, String novaDataDevolver, ArrayList lista) {
        if (!lista.isEmpty()) {
            String mensagem = "";

            for (Iterator it = lista.iterator(); it.hasNext();) {
                Movimento m = (Movimento) it.next();
                if (m.getID() == ID) {
                    mensagem = "Registro alterado";
                    m.setID_Aluno(novoIdAluno);
                    m.setID_Livro(novoIdLivro);
                    m.setDataRetirada(novaDataRetirada);
                    m.setDataDevolver(novaDataDevolver);
                }
            }
            System.out.println(mensagem);
        }
    }

//Metodo para Remover Aluno pelo cpf
    public static void removerAluno(String cpf, ArrayList lista) {
        try {
            Aluno a = carregaDadosAluno(cpf, lista);
            if (a != null) {
                lista.remove(a);
            }
        } catch (IndexOutOfBoundsException e) {

            System.out.printf("\nErro: CPF inválido (%s).",
                    e.getMessage());
        }
    }

    //Metodo para Remover Livro pela Descrição
    public static void removerLivro(String Descricao, ArrayList lista) {
        try {
            Livros l = carregaDadosLivro(Descricao, lista);
            if (l != null) {
                lista.remove(l);
            }
        } catch (IndexOutOfBoundsException e) {

            System.out.printf("\nErro: Descrição do Livro inválida (%s).",
                    e.getMessage());
        }
    }

//Metodo para Remover Movimento pelo ID
    public static void removerMovimento(int idMovimento, ArrayList lista) {

        try {
            Movimento m = carregaDadosMovimento(idMovimento, lista);
            if (m != null) {
                lista.remove(m);
            }
        } catch (IndexOutOfBoundsException e) {

            System.out.printf("\nErro: ID inválido (%s).",
                    e.getMessage());
        }
    }

    // Metodo para validar se a string é um inteiro.
    public static boolean isInteger(String s) {
        try {

            Integer.parseInt(s);
            return true;

        } catch (NumberFormatException ex) {
            return false;

        }
    }

    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        ArrayList<Aluno> Aluno = new ArrayList<>();
        ArrayList<Livros> Livros = new ArrayList<>();
        ArrayList<Movimento> Movimento = new ArrayList<>();
        int menu = 0;

        do {
            String texto
                    = "---------------------------------------" + "\n"
                    + "Escolha a opção para seguir o sistema: " + "\n"
                    + "---------------------------------------" + "\n"
                    + "Cadastros" + "\n"
                    + "---------------------------------------" + "\n"
                    + " 1-Criar Aluno" + "\n"
                    + " 2-Criar Livro" + "\n"
                    + " 3-Criar Movimento(Emprestimo Livro)" + "\n"
                    + "---------------------------------------" + "\n"
                    + "Consultas" + "\n"
                    + "---------------------------------------" + "\n"
                    + " 4-Listar Alunos" + "\n"
                    + " 5-Listar Livros" + "\n"
                    + " 6-Listar Movimentos" + "\n"
                    + " 7-Buscar Aluno" + "\n"
                    + " 8-Buscar Livro" + "\n"
                    + "---------------------------------------" + "\n"
                    + "Exclusões" + "\n"
                    + "---------------------------------------" + "\n"
                    + " 9-Excluir Aluno" + "\n"
                    + "10-Excluir Livro" + "\n"
                    + "11-Excluir Movimento(Devolver Livro)" + "\n"
                    + "---------------------------------------" + "\n"
                    + "Alterações" + "\n"
                    + "---------------------------------------" + "\n"
                    + "12-Alterar Aluno" + "\n"
                    + "13-Alterar Livro" + "\n"
                    + "14-Alterar Movimento" + "\n"
                    + "---------------------------------------" + "\n"
                    + "15-Sair" + "\n";

            System.out.println(texto);
            menu = Ler.nextInt();

            switch (menu) {
                case 1:
                    Aluno p = criarAluno();
                    Aluno.add(p);
                    break;
                case 2:
                    Livros l = criarLivro();
                    Livros.add(l);
                    break;
                case 3:
                    Movimento m = criarMovimento();
                    Movimento.add(m);
                    break;
                case 4:
                    listagemAlunos(Aluno);
                    break;
                case 5:
                    listagemLivros(Livros);
                    break;
                case 6:
                    listagemMovimentos(Movimento);
                    break;
                case 7:
                    System.out.println("Digite o CPF do Aluno para buscar.");
                    String lCPF = Ler.next();
                    buscaEPrintaAlunoPeloCPF(lCPF, Aluno);
                    break;
                case 8:
                    System.out.println("Digite a descrição do livro para buscar.");
                    String lDescricao = Ler.next();
                    buscaEPrintaLivroPelaDescricao(lDescricao, Livros);
                    break;
                case 9:
                    System.out.println("Digite o CPF do Aluno para remover do cadastro.");
                    String CPF = Ler.next();
                    removerAluno(CPF, Aluno);
                    break;
                case 10:
                    System.out.println("Digite a descrição do livro para remover do cadastro.");
                    String Descricao = Ler.next();
                    removerLivro(Descricao, Livros);
                    break;
                case 11:
                    System.out.println("Digite o ID do Movimento para fazer a entregar o Livro.");
                    String ID = Ler.next();

                    // verifico se o id digitado é inteiro
                    if (isInteger(ID)) {
                        int idMovimento = Integer.parseInt(ID);
                        removerMovimento(idMovimento, Movimento);
                    }
                    System.out.println("Valor digitado não é um ID válido.");
                    break;

                case 12:
                    System.out.println("Informe o id do aluno para alterar:");
                    int idAluno = Ler.nextInt();
                    System.out.println("Informe novo nome para alterar:");
                    String novoNome = Ler.next();

                    System.out.println("Informe novo CPF para alterar: ");
                    String novoCpf = Ler.next();

                    System.out.println("Informe novo Telefone para alterar: ");
                    String novoFone = Ler.next();

                    alterarAluno(idAluno, novoNome, novoCpf, novoFone, Aluno);
                    break;

                case 13:
                    System.out.println("Informe o id do livro para alterar:");
                    int idLivro = Ler.nextInt();

                    System.out.println("Informe nova descrição para alterar:");
                    String novaDesc = Ler.next();

                    System.out.println("Informe o novo tipo para alterar: ");
                    String novoTipo = Ler.next();

                    alterarLivro(idLivro, novaDesc, novoTipo, Livros);
                    break;

                case 14:
                    System.out.println("Informe o id do Movimento para alterar:");
                    int idMovi = Ler.nextInt();

                    System.out.println("Informe novo id aluno para alterar:");
                    int novoIdAluno = Ler.nextInt();

                    System.out.println("Informe novo id livro para alterar: ");
                    int novoIdLivro = Ler.nextInt();

                    System.out.println("Informe nova Data de Retirada para alterar: ");
                    String novaDataRetirada = Ler.next();

                    System.out.println("Informe nova Data de entrega para alterar: ");
                    String novaDataDevolver = Ler.next();

                    alterarMovimento(idMovi, novoIdAluno, novoIdLivro, novaDataRetirada, novaDataDevolver, Movimento);
                    break;
                default:
                    break;
            }

        } while (menu
                < 15);

    }
}
