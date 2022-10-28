package controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.conexion.conexionPostgresql;
import util.variablesConexionPostgreSQL;


public class controladorPostgreSQL {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		//CONSTANTES
		final String HOST = variablesConexionPostgreSQL.getHost();
		final String PORT = variablesConexionPostgreSQL.getPort();
		final String DB = variablesConexionPostgreSQL.getDb();
		final String USER = variablesConexionPostgreSQL.getUser();
		final String PASS = variablesConexionPostgreSQL.getPass();
		

		
		/*Se crea una instancia de la clase en la que estamos para poder generar la conexión a PostgreSQL
		*utilizando el método generaConexion
		*/
		System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Lamada generaConexion");
		conexionPostgresql conexionPostgresql = new conexionPostgresql();
		Connection conexionGenerada = conexionPostgresql.generaConexion(HOST,PORT,DB,USER,PASS);

	
	}

}
