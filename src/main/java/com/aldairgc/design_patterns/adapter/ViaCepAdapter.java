package com.aldairgc.design_patterns.adapter;

import com.aldairgc.design_patterns.model.Address;
import com.aldairgc.design_patterns.model.ViaCepResponse;

public class ViaCepAdapter {
    public static Address adapt(ViaCepResponse viaCepResponse) {
        Address address = new Address();
        address.setCep(viaCepResponse.getCep());
        address.setName(viaCepResponse.getLogradouro());
        address.setComplement(viaCepResponse.getComplemento());
        address.setNeighbourhood(viaCepResponse.getBairro());
        address.setState(viaCepResponse.getEstado());
        address.setDdd(viaCepResponse.getDdd());
        return address;
    }
}
