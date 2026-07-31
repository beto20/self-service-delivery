package com.integracion.repositorio.service;

import com.integracion.repositorio.model.RepositoryEntity;
import com.integracion.repositorio.model.RepositoryResponse;
import com.integracion.repositorio.repository.SelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RepositoryServiceImpl implements RepositoryService {

    @Autowired
    SelfService selfService;

    @Override
    public List<RepositoryResponse> getAll() {
        var rows = selfService.findAll();

        if (Boolean.FALSE.equals(rows.iterator().hasNext())) {
            var dto1 = new RepositoryEntity("demo", "https://github.com/beto20/kubexplorer.git" , "tider");
            var dto2 = new RepositoryEntity("pruebaRepo", "https://github.com/beto20/kubexplorer-env.git" , "tider");
            var dto3 = new RepositoryEntity("Grafana", "https://github.com/grafana" , "grafana");
            var dto4 = new RepositoryEntity("K8s", "https://github.com/kubernetes/kubernetes" , "gubernetes");

            selfService.save(dto1);
            selfService.save(dto2);
            selfService.save(dto3);
            selfService.save(dto4);
        }

        var response = new ArrayList<RepositoryResponse>();

        rows.iterator().forEachRemaining(x -> {
            var dto = new RepositoryResponse(x.getName(), x.getGitUrl() , x.getOrganization());
            response.add(dto);
        });

        return response;
    }
}
