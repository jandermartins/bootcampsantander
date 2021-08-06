package br.com.dio.controledeponto.service;

import br.com.dio.controledeponto.model.JornadaTrabalho;
import br.com.dio.controledeponto.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JornadaTrabalhoService {

    @Autowired
    private JornadaTrabalhoRepository jornadaTrabalhoRepository;

    public List<JornadaTrabalho> getJornadaTrabalho() {
        return jornadaTrabalhoRepository.findAll();
    }

    public JornadaTrabalho addJornadaTrabalho(JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public JornadaTrabalho getJornadaTrabalhoById(long id) {
        return jornadaTrabalhoRepository.getById(id);
    }
}
