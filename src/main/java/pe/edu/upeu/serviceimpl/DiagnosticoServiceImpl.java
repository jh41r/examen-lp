package pe.edu.upeu.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.dao.DiagnosticoDao;
import pe.edu.upeu.entity.Diagnostico;
import pe.edu.upeu.service.DiagnosticoService;
@Service
public class DiagnosticoServiceImpl implements DiagnosticoService{

	@Autowired
	private DiagnosticoDao diagnosticoDao;
	@Override
	public Diagnostico create(Diagnostico d) {
		// TODO Auto-generated method stub
		return diagnosticoDao.create(d);
	}

	@Override
	public Diagnostico update(Diagnostico d) {
		// TODO Auto-generated method stub
		return diagnosticoDao.update(d);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		diagnosticoDao.delete(id);
	}

	@Override
	public Optional<Diagnostico> read(Long id) {
		// TODO Auto-generated method stub
		return diagnosticoDao.read(id);
	}

	@Override
	public List<Diagnostico> realAll() {
		// TODO Auto-generated method stub
		return diagnosticoDao.realAll();
	}

}
