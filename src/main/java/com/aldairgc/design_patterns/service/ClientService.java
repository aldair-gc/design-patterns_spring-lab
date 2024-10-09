package com.aldairgc.design_patterns.service;

import com.aldairgc.design_patterns.model.Client;

public interface ClientService {
    Iterable<Client> getAll();

    Client getById(Long id);

    void save(Client client);

    void update(Long id, Client client);

    void delete(Long id);
}
