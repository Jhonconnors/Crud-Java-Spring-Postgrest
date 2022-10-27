package youtube.princejrdeveloper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import youtube.princejrdeveloper.entity.Empleado;
import youtube.princejrdeveloper.service.EmpleadoService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping
	public List<Empleado> listar(){
		return empleadoService.listar();
	}
	
	@PostMapping
	public Empleado insertar(@RequestBody Empleado emp) {
		return empleadoService.insertar(emp);
	}
	
	@PutMapping
	public Empleado actualizar(@RequestBody Empleado emp) {
		return empleadoService.actualizar(emp);
	}
	
	@DeleteMapping
	public void eliminar(@RequestBody Empleado emp) {
		empleadoService.eliminar(emp);
	}
	
}