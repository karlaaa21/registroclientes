package registroclientes.service;

import registroclientes.model.Cliente;
import registroclientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    public List <Cliente> getClientes(){
        return clienteRepository.obtenerClientes();
    }

    public Cliente saveCliente(Cliente cliente){
        return clienteRepository.registrar(cliente );
    }

    public String deleteCliente(String correo){
        clienteRepository.eliminar(correo);
            return "cliente eliminado";
    }
}