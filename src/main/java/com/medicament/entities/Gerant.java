package com.medicament.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Gerant implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	int idGerant;
	String NomGerant;


	String EmailGerant;
	String PasswordGerant;
	
	public Gerant() {}
	public Gerant(int idGerant,String NomGerant,String EmailGerant,String PasswordGerant)
	{
		this.idGerant=idGerant;
		this.NomGerant=NomGerant;
		this.EmailGerant=EmailGerant;
		this.PasswordGerant=PasswordGerant;
	}
	public int getIdGerant() {
		return idGerant;
	}
	public void setIdGerant(int idGerant) {
		this.idGerant = idGerant;
	}
	public String getNomGerant() {
		return NomGerant;
	}
	public void setNomGerant(String nomGerant) {
		NomGerant = nomGerant;
	}
	public String getEmailGerant() {
		return EmailGerant;
	}
	public void setEmailGerant(String emailGerant) {
		EmailGerant = emailGerant;
	}
	public String getPasswordGerant() {
		return PasswordGerant;
	}
	public void setPasswordGerant(String passwordGerant) {
		PasswordGerant = passwordGerant;
	}
	
}
