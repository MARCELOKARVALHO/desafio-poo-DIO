import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

           Curso curso1 = new Curso();
           curso1.setTitulo("Curso Java");
           curso1.setDescricao("Descrição Curso Java");
           curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição Curso Js");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

      /*     System.out.println(curso1);
           System.out.println(curso2);
           System.out.println(mentoria);
      */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo");
        devMarcelo.inscreverBootcamp(bootcamp);
          System.out.println("Conteudos Inscritos Marcelo" + devMarcelo.getConteudosInscritos());

          devMarcelo.progredir();
          devMarcelo.progredir();

        System.out.println(".");
          System.out.println("Conteudos Inscritos Marcelo" + devMarcelo.getConteudosInscritos());
          System.out.println("Conteudos Concluidos Marcelo" + devMarcelo.getConteudosConcluidos());
          System.out.println("Xp: " + devMarcelo.calcularTotalXp());

          System.out.println("........");

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
          System.out.println("Conteudos Inscritos Luiz" + devLuiz.getConteudosInscritos());

          devLuiz.progredir();
          devLuiz.progredir();
          devLuiz.progredir();



        System.out.println(".");
          System.out.println("Conteudos Inscritos Luiz" + devLuiz.getConteudosInscritos());
          System.out.println("Conteudos Concluidos Luiz" + devLuiz.getConteudosConcluidos());
          System.out.println("Xp: " + devLuiz.calcularTotalXp());


    }
}