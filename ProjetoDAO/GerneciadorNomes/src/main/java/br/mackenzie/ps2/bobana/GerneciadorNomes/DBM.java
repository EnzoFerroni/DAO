//Enzo Ferroni – RA: 10417100
//Leonardo Rodrigues – RA: 10418105
//Rafael Neves de Oliveira – RA: 10418316

package br.mackenzie.ps2.bobana.GerneciadorNomes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBM {

	
	public static Connection getConnection() throws SQLException{
			String createTable = "CREATE TABLE IF NOT EXISTS filmes(id INT, filme VARCHAR(256), duracao INT, faixa INT, PRIMARY KEY (id));";
		    String databaseURL = "mem:databd;";
		     Connection conn = DriverManager
					.getConnection(
							"jdbc:h2:" + databaseURL + "INIT=" + createTable,
							"admin", "admin");
		     System.out.println("DB Criado com Sucesso");
			return conn;
	}
	
	public static void closeConnection(Connection conn) throws SQLException{
		conn.close();
	}
	
	
}
