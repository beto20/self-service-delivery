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

        var dto3 = new RepositoryResponse("Grafana", "https://github.com/grafana" , "grafana");
        var dto4 = new RepositoryResponse("K8s", "https://github.com/kubernetes/kubernetes" , "gubernetes");

        return List.of(dto1, dto2, dto3, dto4);
    }
}
