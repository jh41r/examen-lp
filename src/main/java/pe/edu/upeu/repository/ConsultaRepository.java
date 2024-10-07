package pe.edu.upeu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.entity.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long>{

}
