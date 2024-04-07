package emily.jacobo.ejerciciospractica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_prueba : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_prueba)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val num = findViewById<EditText>(R.id.txtNumero3)
        val comp = findViewById<Button>(R.id.btnCalcular3)
        val result = findViewById<TextView>(R.id.lblResultado3)
        val parImpar = CalcularE3()

        comp.setOnClickListener {
            val inputText = num.text.toString()
            try {
                val numero = inputText.toInt()
                val resultado = parImpar.calcular(numero)
                result.text = resultado
            } catch (e: NumberFormatException) {
                result.text = "Por favor, ingresa un número entero válido."
            }
        }

        val btnRegresar = findViewById<ImageButton>(R.id.btnAtras3)
        btnRegresar.setOnClickListener {
            val pantalla2 = Intent(this, activity_ejerciciodos2::class.java)
            startActivity(pantalla2)
        }
    }
}