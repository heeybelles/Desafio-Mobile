package br.edu.fatecpg.desafiofilmes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.desafiofilmes.R
import br.edu.fatecpg.desafiofilmes.model.Filme
import coil3.load


class FilmesAdapter(private val filmes:MutableList<Filme>):
    RecyclerView.Adapter<FilmesAdapter.ViewHolder>(){
    class ViewHolder(itemView: View):
        RecyclerView.ViewHolder(itemView){
        val txvNomeFilme = itemView.findViewById<TextView>(R.id.txv_filme)
        val txvGeneroFilme = itemView.findViewById<TextView>(R.id.txv_genero)
        val imgUrl = itemView.findViewById<ImageView>(R.id.imv_filme)
        val btnExcluir = itemView.findViewById<Button>(R.id.btnExcluir)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_item_filme,parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return filmes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txvNomeFilme.text = filmes[position].nome
        holder.txvGeneroFilme.text = filmes[position].genero
        holder.imgUrl.load(filmes[position].url)
        holder.btnExcluir.setOnClickListener{
            val posicaoAtual = holder.adapterPosition
            if(posicaoAtual!= RecyclerView.NO_POSITION){
                filmes.removeAt(posicaoAtual)
                notifyItemRemoved(posicaoAtual)
                notifyItemRangeChanged(posicaoAtual, filmes.size)
            }


        }
    }
}