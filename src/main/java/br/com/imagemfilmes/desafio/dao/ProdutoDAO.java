package br.com.imagemfilmes.desafio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import br.com.imagemfilmes.desafio.entity.Produto;

public class ProdutoDAO extends DAO {

	public ProdutoDAO(final Connection connection) {
		super(connection);
	}
	
	  public List<Produto> findAll() throws SQLException {
	        try (PreparedStatement psmt = getConnection().prepareStatement("SELECT * FROM produto")) {
	            try (ResultSet rs = psmt.executeQuery()) {
	                final List<Produto> produtos = new ArrayList<>();
	                while (rs.next()) {
	                    final Produto produto = new Produto()
	                            .setRegistro(rs.getInt("id"))
	                            .setDescricao(rs.getString("descricao"))
	                            .setValorUnitario(rs.getBigDecimal("valor_unitario"));
	                    produtos.add(produto);
	                }
	                return produtos;
	            }
	        }
	    }
	  public List<Produto> findAllOrderByPreco() throws SQLException {
	        try (PreparedStatement psmt = getConnection().prepareStatement("SELECT * FROM produto ORDER BY valor_unitario")) {
	            try (ResultSet rs = psmt.executeQuery()) {
	                final List<Produto> produtos = new ArrayList<>();
	                while (rs.next()) {
	                    final Produto produto = new Produto()
	                            .setRegistro(rs.getInt("id"))
	                            .setDescricao(rs.getString("descricao"))
	                            .setValorUnitario(rs.getBigDecimal("valor_unitario"));
	                    produtos.add(produto);
	                }
	                return produtos;
	            }
	        }
	  }
	
	

}
