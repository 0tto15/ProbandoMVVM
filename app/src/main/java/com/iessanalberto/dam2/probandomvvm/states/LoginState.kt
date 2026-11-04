package com.iessanalberto.dam2.probandomvvm.states

/**
 * Definirlas como val
 */

data class LoginState(
    val usuario: String = "",
    val password: String = "",
    val intentos: Int = 0
)
