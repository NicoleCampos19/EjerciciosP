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

class activity_ejerciciouno : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejerciciouno)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val txtEdad = findViewById<EditText>(R.id.txtEdad)
        val btnCalcularEdad = findViewById<Button>(R.id.btnCalcularEdad)
        val lblResultadoEdad = findViewById<TextView>(R.id.lblResultadoEdad)

        val objCal = CalcularE1()

        btnCalcularEdad.setOnClickListener {
            val resul = objCal.calcular(txtEdad.text.toString().toInt())
            lblResultadoEdad.text = "Su edad es:  $resul"
        }
        val btnContinuar = findViewById<ImageButton>(R.id.btnAdelante)
        btnContinuar.setOnClickListener {
            val pantalla2 = Intent(this, activity_ejerciciodos2::class.java)
            startActivity(pantalla2)
        }
    }
}