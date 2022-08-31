package projeto.com.springboot.projeto2.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.var;
import projeto.com.springboot.projeto2.Dto.ProjetoDto;
import projeto.com.springboot.projeto2.services.ParkingProjetoCliente;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/clientes")
public class ClienteController {
    
    final ParkingProjetoCliente projetoService;
    private Object parkingProjetoService;

    public ClienteController(ParkingProjetoCliente projetoService){
        this.parkingProjetoService = parkingProjetoService;
    }
    @PostMapping
    public ResponseEntity<Object> saveParkingCliente(@RequestBody @Valid ProjetoDto projetoDto){
        if(((Object) parkingProjetoService).existsEmail(projetoDto.getEmail))){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Email já estar em uso");
        }
        var sportModel = new SportModel();
        Object sportDto;
        BeanUtils.copyProperties(sportDto, sportModel);
        ((Object) sportModel).setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));

        return ResponseEntity.status(HttpStatus.CREATED).body(projetoService.save(sportModel));
    }

    @GetMapping
    public ResponseEntity<List<ParkingProjetoCliente>> getAllparkingClientes(){
        return ResponseEntity.status(HttpStatus.OK).body(((ParkingProjetoCliente) parkingProjetoService).findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneCliente(@PathVariable(value = "id")UUID id) {
        Optional<ParkingProjetoCliente> projetoOtOptional = ((ParkingProjetoCliente) parkingProjetoService).findById(id);
        if(!projetoOtOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(((Optional<ProjetoDto>) parkingProjetoService).get());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteCliente(@PathVariable(value = "id")UUID id){
        Optional<ParkingProjetoCliente> projOptional = ((ParkingProjetoCliente) parkingProjetoService).findById(id);
        if(!projOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
        }
        ((ParkingProjetoCliente) parkingProjetoService).delete(projOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Cliente deletado com sucesso");
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateCliente(@PathVariable(value = "id") UUID id,
    Optional<ParkingProjetoCliente> projOptional = ((ParkingProjetoCliente) parkingProjetoService).findById(id);
    if(!projOptional.isPresent()){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
    } 
    var parkingModel = new ParkingModel();
    return ResponseEntity.status(HttpStatus.OK).body(parkingProjetoService.save(ParkingProjetoCliente));
}
