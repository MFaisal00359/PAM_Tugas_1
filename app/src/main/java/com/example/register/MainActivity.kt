package com.example.register

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.register.ui.theme.registerTheme
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSubmit: Button = findViewById(R.id.buttonSubmit)
        val editTextName: EditText = findViewById(R.id.editTextName)
        val checkBoxMale: CheckBox = findViewById(R.id.checkBoxMale)
        val spinnerProdi: Spinner = findViewById(R.id.spinnerProdi)

        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            val gender = if (checkBoxMale.isChecked) "Laki-laki" else "Perempuan"
            val prodi = spinnerProdi.selectedItem.toString()

            val intent = Intent(this@MainActivity, DisplayActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("GENDER", gender)
            intent.putExtra("PRODI", prodi)
            startActivity(intent)
        }
    }
}

