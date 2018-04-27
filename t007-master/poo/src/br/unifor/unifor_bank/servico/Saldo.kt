package br.unifor.unifor_bank.servico

import br.unifor.unifor_bank.entidades.Conta
import br.unifor.unifor_bank.entidades.ContaCorrente

class Saldo(val conta: Conta):Servico {

    override fun executar() {

        when(conta){

            is ContaCorrente -> println("Saldo: ${conta.saldo + conta.limite}")

        }

    }

}