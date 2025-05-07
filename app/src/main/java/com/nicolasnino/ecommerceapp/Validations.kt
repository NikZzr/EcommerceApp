package com.nicolasnino.ecommerceapp

import android.util.Patterns




fun validateEmail (email:String): Pair<Boolean,String>{
    return  when{
        email.isEmpty()-> Pair(false, "Correo es obligatorio")
        !Patterns.EMAIL_ADDRESS.matcher(email).matches()-> Pair(false, "El correo es invalido")
        !email.endsWith("@unab.edu.co") -> Pair(false, "El Correo No Pertenece al Dominio de la Unab")

        else -> Pair(true, "")
    }
}
fun validatePassword (password:String): Pair<Boolean,String>{
    return  when{
        password.isEmpty()-> Pair(false, "La contraseña es obligatorio")
        password.length< 8 -> Pair(false, "La contraseña debe tener al menos 6 caracteres")
        !password.any{ it.isDigit() } -> Pair(false, "La contraseña debe tener al menos un numero ")

        else -> Pair(true, "")
    }
}
fun validateName (name:String): Pair<Boolean,String>{
    return  when{
        name.isEmpty() -> Pair(false, "EL nombre es requerido")
        name.length < 3 -> Pair(false, "El nombre debe tener al menos 3 caracteres")

        else -> Pair(true, "")
    }
}

fun validateConfirmPassword (password: String, confirmPassword: String): Pair <Boolean, String>{
    return when {
        confirmPassword.isEmpty() -> Pair(false, "La contraseña es requerida")
        confirmPassword != password -> Pair(false, "Las contraseñas no coinciden")
        else -> Pair(true, "")
    }
}

