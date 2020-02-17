package com.gm.business.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Singleton {
	private static Singleton instance = new Singleton();
	 
	public static Singleton getInstance() {
		return instance;
	}
 
	private String url = "jdbc:mysql://localhost:3306/gestion_magasin_tahzima?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
	private String user = "root";
	private String passwd = "";
	private Connection conexion;
	Statement state;
 
	private Singleton() {
		if (conexion == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conexion = DriverManager.getConnection(url, user, passwd);
 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
 
	public Connection getConexion() {
		return conexion;
	}
}
