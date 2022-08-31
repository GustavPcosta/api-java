package projeto.com.springboot.projeto2.services;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class projetoService {
    
    ParkingProjetoCliente  clienteRepository;

    public void ParkingProjetoCliente(ParkingProjetoCliente clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    @Trasactional
    public ParkingProjetoCliente save(Client sportModel){
        return (ParkingProjetoCliente) clienteRepository.save(sportModel);
        
    }
    public boolean existsByEmail(String Email){
       
        return clienteRepository.existsByEmail(Email);
    }
    public List<ParkingProjetoCliente>findAll(){
        return clienteRepository.findAll();
    }
    public Optional<ParkingProjetoCliente> findById(UUID id){
        return clienteRepository.findById(id);
    }
    @Trasactional
    public Object delete(ParkingProjetoClient clienteModel){
        return clienteRepository.delete(clienteModel);
    }
}
