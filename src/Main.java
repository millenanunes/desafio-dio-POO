import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java.");
        curso1.setDescricao("Descrição do curso Java.");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript.");
        curso2.setDescricao("Descrição do curso JavaScript.");
        curso2.setCargaHoraria(30);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java.");
        mentoria.setDescricao("Descrição da mentoria Java.");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer.");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMillena = new Dev();
        devMillena.setNome("Millena Nunes.");
        devMillena.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Millena:" + devMillena.getConteudosInscritos());
        devMillena.progredir();
        devMillena.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Millena:" + devMillena.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos Millena:" + devMillena.getConteudosConcluidos());
        System.out.println("XP:" + devMillena.calcularTotalXp());

        System.out.println("-------");

        Dev devNicole = new Dev();
        devNicole.setNome("Nicole");
        devNicole.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Nicole:" + devNicole.getConteudosInscritos());
        devNicole.progredir();
        devNicole.progredir();
        devNicole.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Nicole:" + devNicole.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Nicole:" + devNicole.getConteudosConcluidos());
        System.out.println("XP:" + devNicole.calcularTotalXp());
    }
}