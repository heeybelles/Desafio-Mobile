package br.edu.fatecpg.desafiofilmes.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.desafiofilmes.R
import br.edu.fatecpg.desafiofilmes.dao.DaoFilmes
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val edtLogin = findViewById<EditText>(R.id.edtUsuario)
        val edtSenha = findViewById<EditText>(R.id.edtSenha)
        val txvMsg = findViewById<TextView>(R.id.txvMsg)
        val btnSalvar = findViewById<Button>(R.id.btnEntrar)
        val senha = "123"
        val usuario = "ale"
        btnSalvar.setOnClickListener{
            val loginDigitado = edtLogin.text.toString()
            val senhaDigitado = edtSenha.text.toString()
            if(loginDigitado == usuario && senhaDigitado == senha){
                val intent = Intent(this,CadastroFilmesActivity::class.java)
                startActivity(intent)
            }
            else{
                txvMsg.setText("Credenciais Incorretas! Tente Novamente")
            }
        }

    }
}