package com.aldairgc.design_patterns.service;

import com.aldairgc.design_patterns.model.ViaCepResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    @GetMapping("/{cep}/json/")
    ViaCepResponse searchCep(@PathVariable("cep") String cep);
}
