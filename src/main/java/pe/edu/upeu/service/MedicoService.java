package pe.edu.upeu.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.entity.Medico;

public interface MedicoService {
	Medico create(Medico m);
	Medico update(Medico m);
	void delete (Long id);
	Optional<Medico> read(Long id);
	List<Medico> readAll();
}
