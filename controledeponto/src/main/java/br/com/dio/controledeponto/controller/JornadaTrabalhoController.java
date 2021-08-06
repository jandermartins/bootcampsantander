package br.com.dio.controledeponto.controller;

import br.com.dio.controledeponto.model.JornadaTrabalho;
import br.com.dio.controledeponto.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/jornada")
@CrossOrigin
public class JornadaTrabalhoController {

    @Autowired
    private JornadaTrabalhoService jornadaTrabalhoService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JornadaTrabalho>> getJornadaTrabalho() {
        return new ResponseEntity<List<JornadaTrabalho>>((List<JornadaTrabalho>) jornadaTrabalhoService.
                getJornadaTrabalho(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public JornadaTrabalho addJornadaTrabalho(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.addJornadaTrabalho(jornadaTrabalho);
    }

    @GetMapping("/{id}")
    public JornadaTrabalho getJornadaTrabalhoById(@PathVariable("id") long id){
        return jornadaTrabalhoService.getJornadaTrabalhoById(id);
    }
}
