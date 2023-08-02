package com.pmoc.mirante.services;

import com.pmoc.mirante.models.checklist.TipoEquipamento;
import com.pmoc.mirante.models.checklist.TipoEquipamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional; // Importe a classe Optional

@Service
public class TipoEquipamentoServiceImpl implements TipoEquipamentoService {

    private final TipoEquipamentoRepository tipoEquipamentoRepository;

    @Autowired
    public TipoEquipamentoServiceImpl(TipoEquipamentoRepository tipoEquipamentoRepository) {
        this.tipoEquipamentoRepository = tipoEquipamentoRepository;
    }

    public TipoEquipamento save(TipoEquipamento tipoEquipamento) {
        return tipoEquipamentoRepository.save(tipoEquipamento);
    }

    public List<TipoEquipamento> findAll() {
        return tipoEquipamentoRepository.findAll();
    }

    public Optional<TipoEquipamento> findById(Long id) {
        return tipoEquipamentoRepository.findById(id);
    }

    public void delete(TipoEquipamento tipoEquipamento) {
        tipoEquipamentoRepository.delete(tipoEquipamento);
    }
}