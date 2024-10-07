package pe.edu.upeu.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.entity.Consulta;

public interface ConsultaService {
	Consulta create(Consulta c);
	Consulta update(Consulta c);
	void delete(Long id);
	Optional<Consulta> read(Long id);
	List<Consulta> readAll();
}
