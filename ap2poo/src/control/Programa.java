package control;

import model.*;

import java.util.Arrays;

public class Programa {
    public static void main(String[] args) {

        Sala sala101 = new Sala(40, "Sala101", "Predio A", "101", true);
        Auditorio auditorio1 = new Auditorio(200, "Auditorio Central", "Predio B", true, true);
        Laboratorio labInformatica = new Laboratorio(30, "Lab Info", "Bloco C", 10, "Informática");

        // Instrutores
        Instrutor instrutor1 = new Instrutor("Lucas Lima", "lucas@ufrj.br", "Mestre em Computação", "IA");
        Instrutor instrutor2 = new Instrutor("Fernanda Souza", "fernanda@ufrj.br", "Doutora em Sistemas", "Banco de Dados");

        // Organizadores
        Organizador org1 = new Organizador("Joana Rocha", "joana@ufrj.br", "Coordenadora Geral");

        // Participantes
        Participante p1 = new Participante("Carlos Silva", "111.111.111-11", "carlos@aluno.com", "Engenharia");
        Participante p2 = new Participante("Marina Reis", "222.222.222-22", "marina@aluno.com", "Computação");
        Participante p3 = new Participante("Eduardo Lima", "333.333.333-33", "eduardo@aluno.com", "Física");

        Palestrante renato = new Palestrante("renatoi@ibmec-rio.br", "Ibmec-Rio", "Renato");

        // Eventos
        Palestra palestra = new Palestra("10/07/2025",4 , 1000.0, "Automação industrial", renato,
                auditorio1);

        Minicurso minicurso = new Minicurso()

        Seminario seminario = new Seminario("Robótica em Educação", "15/07/2025", 3, 800.0, labInformatica,
                "Aplicações práticas", Arrays.asList(p1, p2), "Prof. Dr. Alberto Souza");

    }
}
