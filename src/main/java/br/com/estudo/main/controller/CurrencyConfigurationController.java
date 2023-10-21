package br.com.estudo.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudo.main.CurrencyServiceConfiguration;

@RestController
public class CurrencyConfigurationController {

	@Autowired
	private CurrencyServiceConfiguration configuration;
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration getCurrencyConfiguration(){
		return configuration;
	}
}
