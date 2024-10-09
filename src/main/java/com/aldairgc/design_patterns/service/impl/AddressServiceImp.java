package com.aldairgc.design_patterns.service.impl;

import com.aldairgc.design_patterns.adapter.ViaCepAdapter;
import com.aldairgc.design_patterns.model.Address;
import com.aldairgc.design_patterns.model.ViaCepResponse;
import com.aldairgc.design_patterns.service.AddressService;
import com.aldairgc.design_patterns.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImp implements AddressService {
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Address getByCep(String cep) {
        ViaCepResponse viaCepResponse = viaCepService.searchCep(cep);
        return ViaCepAdapter.adapt(viaCepResponse);
    }
}
