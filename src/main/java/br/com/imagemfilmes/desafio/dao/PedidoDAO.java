package br.com.imagemfilmes.desafio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.imagemfilmes.desafio.entity.Pedido;
import br.com.imagemfilmes.desafio.service.PessoaService;


public class PedidoDAO extends DAO{

	public PedidoDAO(final Connection connection) {
		super(connection);
	}
	
    @Autowired
	PessoaService pessoaService;
	
	public List<Pedido> findAll() throws SQLException, Exception {
        try (PreparedStatement psmt = getConnection().prepareStatement("SELECT * FROM pedido")) {
            try (ResultSet rs = psmt.executeQuery()) {
                final List<Pedido> pedidos = new ArrayList<>();
                while (rs.next()) {
                    final Pedido pedido = new Pedido()
                            .setId(rs.getLong("id"))
                            .setPessoa(this.pessoaService.getPessoaById(rs.getInt("id")));
                    pedidos.add(pedido);
                }
                return pedidos;
            }
        }
    }
	

	
}
