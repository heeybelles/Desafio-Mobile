package br.edu.fatecpg.desafiofilmes.dao

import br.edu.fatecpg.desafiofilmes.model.Filme

class DaoFilmes{
    companion object{
        private val filmes = mutableListOf<Filme>()

        fun salvar(nome:String, genero: String, url: String):String{
            filmes.add(Filme(nome = nome, genero = genero, url = url))
            return "Filme Salvo!"
        }
        fun buscar():MutableList<Filme>{
            return filmes
        }
    }
}
