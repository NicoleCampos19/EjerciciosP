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

class activity_ejerciciodos2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejerciciodos2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val txtBase = findViewById<EditText>(R.id.txtBase)
        val txtAltura = findViewById<EditText>(R.id.txtAltura)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val lblResultado = findViewById<TextView>(R.id.lblResultado)

        val objCal = CalcularE2()

        btnCalcular.setOnClickListener {
            val resul = objCal.calcular(txtBase.text.toString().toDouble(), txtAltura.text.toString().toDouble())
            lblResultado.text = "El área del triángulo es: $resul"
        }

        val btnContinuar = findViewById<ImageButton>(R.id.btnAdelante2)
        btnContinuar.setOnClickListener {
            val pantalla3 = Intent(this, activity_prueba::class.java)
            startActivity(pantalla3)
        }
        val btnRegresar = findViewById<ImageButton>(R.id.btnAtras)
        btnRegresar.setOnClickListener {
            val pantalla1 = Intent(this, activity_ejerciciouno::class.java)
            startActivity(pantalla1)
        }
    }
}