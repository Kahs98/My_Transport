package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IVehiculoDao;
import pe.edu.upc.entity.Vehiculo;
import pe.edu.upc.service.IVehiculoService;

@Named
@RequestScoped
public class VehiculoServiceImpl implements IVehiculoService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IVehiculoDao mD;

	@Override
	public void insertar(Vehiculo vehiculo) {
		mD.insertar(vehiculo);		
	}

	@Override
	public List<Vehiculo> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idVehiculo) {
		mD.eliminar(idVehiculo);		
	}
	

}
