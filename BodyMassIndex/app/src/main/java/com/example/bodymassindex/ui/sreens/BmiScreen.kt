package com.example.bodymassindex.ui.sreens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.bodymassindex.R
import com.example.bodymassindex.viewmodels.BmiViewModel

@Composable
fun BmiScreen(modifier: Modifier, bmiViewModel: BmiViewModel= viewModel()){
    Column (
        modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text= stringResource(R.string.bmi_calculator),
            fontSize = 30.sp,
            fontWeight = Bold,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center,
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        )
        OutlinedTextField(
            value = bmiViewModel.heightInput,
            onValueChange = {bmiViewModel.heightInput = it},
            label = {Text(stringResource(R.string.height))},
            trailingIcon = {
                Text("m", modifier = Modifier.padding(end = 8.dp))
            },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = bmiViewModel.weightInput,
            onValueChange = {bmiViewModel.weightInput = it},
            label = {Text(stringResource(R.string.weight))},
            trailingIcon = {
                Text("kg", modifier = Modifier.padding(end = 8.dp))
            },
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = stringResource(R.string.your_bmi_is, bmiViewModel.bmiResult)
        )
    }
}