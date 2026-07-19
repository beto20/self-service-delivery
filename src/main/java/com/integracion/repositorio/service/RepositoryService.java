package com.integracion.repositorio.service;

import com.integracion.repositorio.model.RepositoryResponse;

import java.util.List;

public interface RepositoryService {

    List<RepositoryResponse> getAll();
}
