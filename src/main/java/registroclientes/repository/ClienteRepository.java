package registroclientes.repository;
import registroclientes.model.Cliente;
import java.util.List;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ClienteRepository {
    
    private List <Cliente> listaClientes = new ArrayList<>();

    public List <Cliente> obtenerClientes(){
        return listaClientes;
    }

    public Cliente registrar(Cliente cli){
        listaClientes.add(cli);
        return cli;
    }

    public void eliminar(String correo){
        listaClientes.removeIf(cliente ->cliente.getCorreo().equalsIgnoreCase(correo));
    }
}
