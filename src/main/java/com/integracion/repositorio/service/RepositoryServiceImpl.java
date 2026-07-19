package com.integracion.repositorio.service;

import com.integracion.repositorio.model.RepositoryResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepositoryServiceImpl implements RepositoryService {
    @Override
    public List<RepositoryResponse> getAll() {
        var dto1 = new RepositoryResponse("demo", "https://github.com/beto20/kubexplorer.git" , "tider");
        var dto2 = new RepositoryResponse("pruebaRepo", "https://github.com/beto20/kubexplorer-env.git" , "tider");

        return List.of(dto1, dto2);
    }
}
