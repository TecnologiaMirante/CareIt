package com.pmoc.mirante.services;

import com.pmoc.mirante.models.checklist.TipoEquipamento;

import java.util.List;

public interface TipoEquipamentoService {
    TipoEquipamento findById(Long id);

    List<TipoEquipamento> findAll();

    TipoEquipamento save(TipoEquipamento tipoEquipamento);

    void delete(TipoEquipamento tipoEquipamento);
}
