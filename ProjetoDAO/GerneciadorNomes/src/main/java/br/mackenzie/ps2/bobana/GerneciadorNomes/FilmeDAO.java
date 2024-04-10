//Enzo Ferroni – RA: 10417100
//Leonardo Rodrigues – RA: 10418105
//Rafael Neves de Oliveira – RA: 10418316

package br.mackenzie.ps2.bobana.GerneciadorNomes;

import java.sql.*;
import java.util.ArrayList;

public class FilmeDAO implements DAO<Filme>{

	@Override
	public Filme get(int id) throws SQLException {
		Connection conn = DBM.getConnection();
		String sql = "SELECT id, filme, duracao, faixa FROM filmes where id=?";
		PreparedStatement ppst = conn.prepareStatement(sql);
		ppst.setInt(1, id);
		ResultSet rs = ppst.executeQuery();
		int ID = rs.getInt("id");
		String NOME = rs.getString("filme");
		int DUR = rs.getInt("duracao");
		int FAIXA = rs.getInt("faixa");
		Filme filme = new Filme(ID, NOME, DUR, FAIXA);
		DBM.closeConnection(conn);
		return filme;
	}

	@Override
	public ArrayList<Filme> getAll() throws SQLException {
		ArrayList<Filme> list_filme = new ArrayList<Filme>();
		Connection conn = DBM.getConnection();
		String sql = "SELECT * FROM filmes";
		PreparedStatement ppst = conn.prepareStatement(sql);
		ResultSet rs = ppst.executeQuery();
		while(rs.next()) {
			int ID = rs.getInt("id");
			String NOME = rs.getString("filme");
			int DUR = rs.getInt("duracao");
			int FAIXA = rs.getInt("faixa");
			Filme filme = new Filme(ID, NOME, DUR, FAIXA);
			list_filme.add(filme);
		}
		DBM.closeConnection(conn);
		return list_filme;
	}

	@Override
	public int insert(Filme o) throws SQLException {
		Connection conn = DBM.getConnection();
		String sql = "INSERT INTO filmes VALUES (?, ?, ?, ?)";
		PreparedStatement ppst = conn.prepareStatement(sql);
		ppst.setInt(1, o.getId());
		ppst.setString(2, o.getNome());
		ppst.setInt(3, o.getDuracao());
		ppst.setInt(4, o.getFaixa());
		int rs = ppst.executeUpdate();
		DBM.closeConnection(conn);
		return 0;
	}

	@Override
	public int update(Filme o) throws SQLException {
		Connection conn = DBM.getConnection();
		String sql = "UPDATE filmes SET filme=?, duracao=?, faixa=? WHERE id=?";
		PreparedStatement ppst = conn.prepareStatement(sql);
		ppst.setInt(4, o.getId());
		ppst.setString(1, o.getNome());
		ppst.setInt(2, o.getDuracao());
		ppst.setInt(3, o.getFaixa());
		int rs = ppst.executeUpdate();
		DBM.closeConnection(conn);
		return 0;
	}

	@Override
	public int delete(Filme o) throws SQLException {
		Connection conn = DBM.getConnection();
		String sql = "DELETE FROM filmes WHERE id=?";
		PreparedStatement ppst = conn.prepareStatement(sql);
		ppst.setInt(1, o.getId());
		int rs = ppst.executeUpdate();
		DBM.closeConnection(conn);
		return 0;
	}

}
