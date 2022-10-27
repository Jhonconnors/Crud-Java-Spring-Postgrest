package youtube.princejrdeveloper.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import youtube.princejrdeveloper.entity.Empleado;
import youtube.princejrdeveloper.repository.EmpleadoRepository;

@Service
public class EmpleadoService {

	@Autowired
	private EmpleadoRepository empleadoRepo;
	
	public Empleado insertar(Empleado emp) {
		return empleadoRepo.save(emp);
	}
	
	
	public Empleado actualizar(Empleado emp) {
		return empleadoRepo.save(emp);
	}
	
	public List<Empleado> listar(){
		return empleadoRepo.findAll();	
		
	}
	
	public void eliminar(Empleado emp) {
		empleadoRepo.delete(emp);
	}
	
}
