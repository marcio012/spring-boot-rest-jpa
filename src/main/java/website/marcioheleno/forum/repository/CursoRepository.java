package website.marcioheleno.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import website.marcioheleno.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    Curso findByNome(String nomeCurso);

}
