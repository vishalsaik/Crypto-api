package com.cbdc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbdc.entity.Token;
import com.cbdc.service.CbdcServiceInterface;

@RestController
@RequestMapping("api/v1/cbdc")
public class CbdcController {
	
	@Autowired
	private CbdcServiceInterface cService;
	
	@PostMapping
	public Token createToken(@RequestBody Token tk) {
		return cService.createTokenService(tk);
	}
	@GetMapping("/{i}")
	public Token getToken(@PathVariable("i") long id) {
		return cService.getTokenService(id);
	}
	@PutMapping("/{i}")
	public Token updateToken(@PathVariable("i") long id,@RequestBody Token tk) {
		return cService.updateTokenService(id,tk);
	}
	@DeleteMapping("/{i}")
	public String deleteToken(@PathVariable("i") long id) {
		return cService.deleteTokenService(id);
	}
	@GetMapping
	public List<Token> getAllToken() {
		return cService.getAllTokenService();
	}
	
	

}
