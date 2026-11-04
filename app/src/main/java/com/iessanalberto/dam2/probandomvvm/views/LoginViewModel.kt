package com.iessanalberto.dam2.probandomvvm.views

import androidx.lifecycle.ViewModel
import com.iessanalberto.dam2.probandomvvm.states.LoginState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

/**
 * Extiende la clase ViewModel, se le agrega el _State (guión bajo) porque
 * solo se modifica en el viewModel, el State (sin guión) se expone a la vista.
 */

class LoginViewModel: ViewModel() {
    private val _loginState = MutableStateFlow(LoginState())
    val loginState: StateFlow<LoginState> = _loginState.asStateFlow() // Este es el vamos a exponer

    fun onTextChanged (texto: String) {
        _loginState.update { currentState ->
            currentState.copy(texto = texto, contador = texto.length)
        }
    }
}
