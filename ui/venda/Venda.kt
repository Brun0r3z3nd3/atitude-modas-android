package com.atitudemodas.app.ui.venda

import androidx.lifecycle.ViewModel
import com.atitudemodas.app.data.entity.Venda
import com.atitudemodas.app.data.repository.LojaRepository

class VendaViewModel : ViewModel() {

    private val repository = LojaRepository()

    fun registrarVenda(valor: Double) {
        val venda = Venda(
            data = "01/01/2026",
            valorTotal = valor
        )
        repository.registrarVenda(venda)
    }
}
