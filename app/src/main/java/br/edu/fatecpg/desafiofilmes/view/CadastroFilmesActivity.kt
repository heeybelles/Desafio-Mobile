package br.edu.fatecpg.desafiofilmes.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.desafiofilmes.R
import br.edu.fatecpg.desafiofilmes.dao.DaoFilmes

class CadastroFilmesActivity : AppCompatActivity(R.layout.activity_cadastro_filmes) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val edtNomeFilme = findViewById<EditText>(R.id.edtTitulo)
        val edtGeneroFilme = findViewById<EditText>(R.id.edtGenero)
        val edtURL = findViewById<EditText>(R.id.edtUrlPoster)
        val btnSalvar = findViewById<Button>(R.id.btnSalvar)
        val fabAvanca = findViewById<Button>(R.id.btnLista)
        btnSalvar.setOnClickListener {
            val nomeFilme = edtNomeFilme.text.toString()
            val GeneroFilme = edtGeneroFilme.text.toString()
            val URL = edtURL.text.toString()

            val retorno = DaoFilmes.salvar(nomeFilme, GeneroFilme, URL)


            Toast.makeText(this,retorno,Toast.LENGTH_SHORT).show()
            edtNomeFilme.text.clear()
            edtGeneroFilme.text.clear()
            edtURL.text.clear()
        }
        fabAvanca.setOnClickListener {
            val intent = Intent(this, ListaFilmesActivity::class.java)
            startActivity(intent)
        }
    }

}