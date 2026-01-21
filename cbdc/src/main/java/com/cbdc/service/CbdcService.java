package com.cbdc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cbdc.dao.CbdcDAOInterface;
import com.cbdc.entity.Token;

@Service
@Transactional
public class CbdcService implements CbdcServiceInterface {
	
	@Autowired
	private CbdcDAOInterface cDao;

	@Override
	public Token createTokenService(Token tk) {
		cDao.save(tk);
		return tk;
	}
	public Token getTokenService(long id) {
		Optional<Token> tk=cDao.findById(id);
		return tk.get();
	}
	public Token updateTokenService(long id,Token tk) {
		cDao.saveAndFlush(tk);
		return tk;
	}
	public String deleteTokenService(long id) {
		cDao.deleteById(id);
		return "Ok";
	}
	public List<Token> getAllTokenService(){
		return cDao.findAll();
	}
	
	

}
