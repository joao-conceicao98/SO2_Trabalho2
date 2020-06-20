package SO2.SO2_Trabalho2.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SO2.SO2_Trabalho2.repository.UtilizadorRepository;
import SO2.SO2_Trabalho2.exception.ResourceNotFoundException;
import SO2.SO2_Trabalho2.model.Utilizador;

@RestController
@RequestMapping("/utilizador")
public class UtilizadorController {

    @Autowired
    private UtilizadorRepository utilizadorRepository;

    @GetMapping("/utilizadors")
    public List<Utilizador> getAllUtilizadors() {
        return utilizadorRepository.findAll();
    }

    @GetMapping("/utilizadors/{id}")
    public ResponseEntity<Utilizador> getUtilizadorById(@PathVariable(value = "id") Long utilizadorId)
            throws ResourceNotFoundException {
        Utilizador utilizador = utilizadorRepository.findById(utilizadorId).orElseThrow(
                () -> new ResourceNotFoundException("utilizador not found for this id :: " + utilizadorId));
        return ResponseEntity.ok().body(utilizador);
    }

    @PostMapping("/utilizadors")
    public Utilizador createUtilizador(@RequestBody Utilizador utilizador) {
        return utilizadorRepository.save(utilizador);
    }

    @PutMapping("/utilizadors/{id}")
    public ResponseEntity<Utilizador> updateUtilizador(@PathVariable(value = "id") Long utilizadorId,
            @RequestBody Utilizador utilizadorDetails) throws ResourceNotFoundException {
        Utilizador utilizador = utilizadorRepository.findById(utilizadorId).orElseThrow(
                () -> new ResourceNotFoundException("utilizador not found for this id :: " + utilizadorId));

        utilizador.setUtilizador(utilizadorDetails.getUtilizador());
        final Utilizador updatedutilizador = utilizadorRepository.save(utilizador);
        return ResponseEntity.ok(updatedutilizador);
    }

    @DeleteMapping("/utilizadors/{id}")
    public Map<String, Boolean> deleteUtilizador(@PathVariable(value = "id") Long utilizadorId)
            throws ResourceNotFoundException {
        Utilizador utilizador = utilizadorRepository.findById(utilizadorId).orElseThrow(
                () -> new ResourceNotFoundException("utilizador not found for this id :: " + utilizadorId));

        utilizadorRepository.delete(utilizador);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}