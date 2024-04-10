//Enzo Ferroni – RA: 10417100
//Leonardo Rodrigues – RA: 10418105
//Rafael Neves de Oliveira – RA: 10418316

package br.mackenzie.ps2.bobana.GerneciadorNomes;

import java.util.ArrayList;
import java.sql.SQLException;



public interface DAO<O> {
	O get(int id) throws SQLException;
	
	ArrayList<O> getAll() throws SQLException;
	
	int insert(O o) throws SQLException;
	
	int update(O o) throws SQLException;
	
	int delete(O o) throws SQLException;
	
	
	
}
