package com.gm.business.control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.gm.beans.Produits;
import com.gm.business.service.Singleton;

public class ProduitsControl {
	
	Connection conexion;
	Statement state;
	
	public ProduitsControl() {
		conexion = Singleton.getInstance().getConexion();
		try {
			state = conexion != null ? conexion.createStatement() : null ;
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public List<Produits> getAll(){
		return null;
	}
	
	public Produits get(int id){
		return null;
	}
	
	public Produits update(Produits produits){
		return produits;
		
	}
	public int add(Produits produits){
		return 1;
	}
	public boolean delete(int idProduit){
		return false;
	}
}
