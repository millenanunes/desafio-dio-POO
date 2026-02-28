import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
public static void main(String[]  args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java.");
    curso1.setDescricao("Descrição do Curso Java.");
    curso1.setCargahoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso JS");
    curso2.setDescricao("Descrição do curso JS");
    curso2.setCargahoraria(8);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("descricao mentoria java");
    mentoria.setData(LocalDate.now());

    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);
}
}
