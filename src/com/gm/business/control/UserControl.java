package com.gm.business.control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.gm.business.service.Singleton;

public class UserControl {

	public boolean login(String login, String password ) {
		Connection conexion = Singleton.getInstance().getConexion();
		boolean exist = false;
		try {
			Statement state = conexion != null ? conexion.createStatement() : null ;
			
			ResultSet result = state
					.executeQuery("SELECT * FROM utilisateur where login like '"+login+"'");
			while (result.next()) {
				if(password.equals(result.getString("password"))){
					exist = true;
				}
			}
			state.close();
			result.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return exist;
	}
}
