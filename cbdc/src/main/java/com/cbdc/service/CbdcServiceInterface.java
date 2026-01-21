package com.cbdc.service;

import java.util.List;
import java.util.Optional;

import com.cbdc.entity.Token;

public interface CbdcServiceInterface {

	Token createTokenService(Token tk);

	Token getTokenService(long id);

	Token updateTokenService(long id, Token tk);

	String deleteTokenService(long id);

	List<Token> getAllTokenService();

}
