package com.example.myapplication

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.RoundedCornerShape

@Composable
fun ValidatedTextField(label: String) {
    var value by remember { mutableStateOf("") }
    var isError by remember { mutableStateOf(false) }

    TextField(
        value = value,
        onValueChange = {
            value = it
            isError = it.isBlank()
        },
        label = { Text(label) },
        isError = isError,
        supportingText = { if (isError) Text("Este campo no puede estar vacío") }
    )
}