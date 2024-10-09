package com.aldairgc.design_patterns.service;

import com.aldairgc.design_patterns.model.Address;

public interface AddressService {
    Address getByCep(String cep);
}
