import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    	Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Aprenda Java do básico ao avançado.");
        cursoJava.setCargaHoraria(14);

        Curso cursoSql = new Curso();
        cursoSql.setTitulo("Introdução a banco de dados relacionais");
        cursoSql.setDescricao("Curso de introdução a bancos de dados relacionais e linguagem SQL.");
        cursoSql.setCargaHoraria(10);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda Java e trabalhe conosco!!");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoSql);

        Scanner ler = new Scanner(System.in);
        
        Dev devUsuario = new Dev();
        
        System.out.print("Digite o seu nome: ");
        devUsuario.setNome(ler.nextLine());
        
        ler.close();

    }

}
