package com.cbdcconsumer.dto;


public class Token {
	private String tokenName;
	private long tokenValue;
	public String getTokenName() {
		return tokenName;
	}
	public void setTokenName(String tokenName) {
		this.tokenName = tokenName;
	}
	public long getTokenValue() {
		return tokenValue;
	}
	public void setTokenValue(long tokenValue) {
		this.tokenValue = tokenValue;
	}
	public long getTokenId() {
		return tokenId;
	}
	public void setTokenId(long tokenId) {
		this.tokenId = tokenId;
	}
	public String getTokenissuer() {
		return tokenissuer;
	}
	public void setTokenissuer(String tokenissuer) {
		this.tokenissuer = tokenissuer;
	}
	private long tokenId;
	private String tokenissuer;
}
