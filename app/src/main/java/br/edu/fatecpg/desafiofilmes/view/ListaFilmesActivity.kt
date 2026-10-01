package br.edu.fatecpg.desafiofilmes.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.desafiofilmes.R
import br.edu.fatecpg.desafiofilmes.adapter.FilmesAdapter
import br.edu.fatecpg.desafiofilmes.dao.DaoFilmes

class ListaFilmesActivity : AppCompatActivity(R.layout.activity_lista_filmes) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val rvFilmes = findViewById<RecyclerView>(R.id.rv_filmes)

        rvFilmes.adapter = FilmesAdapter(DaoFilmes.buscar())
        rvFilmes.layoutManager = LinearLayoutManager(this)
    }
}