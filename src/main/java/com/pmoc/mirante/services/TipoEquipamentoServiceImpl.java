package com.pmoc.mirante.services;

import com.pmoc.mirante.models.checklist.TipoEquipamento;
import com.pmoc.mirante.models.checklist.TipoEquipamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TipoEquipamentoServiceImpl implements TipoEquipamentoService {

    @Autowired
    private TipoEquipamentoRepository tipoEquipamentoRepository;

    @Override
    public TipoEquipamento findById(Long id) {
        return tipoEquipamentoRepository.findById(id);
    }

    @Override
    public List<TipoEquipamento> findAll() {
        return tipoEquipamentoRepository.findAll();
    }

    @Override
    @Transactional
    public TipoEquipamento save(TipoEquipamento tipoEquipamento) {
        return tipoEquipamentoRepository.save(tipoEquipamento);
    }

    @Override
    @Transactional
    public void delete(TipoEquipamento tipoEquipamento) {
        tipoEquipamentoRepository.delete(tipoEquipamento);
    }
}
