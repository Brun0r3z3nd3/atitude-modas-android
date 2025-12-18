package com.atitudemodas.app.data.repository

import com.atitudemodas.app.data.entity.Produto
import com.atitudemodas.app.data.entity.Venda

class LojaRepository {

    private val produtos = mutableListOf<Produto>()
    private val vendas = mutableListOf<Venda>()

    fun adicionarProduto(produto: Produto) {
        produtos.add(produto)
    }

    fun registrarVenda(venda: Venda) {
        vendas.add(venda)
    }

    fun listarProdutos(): List<Produto> = produtos
    fun listarVendas(): List<Venda> = vendas
}
