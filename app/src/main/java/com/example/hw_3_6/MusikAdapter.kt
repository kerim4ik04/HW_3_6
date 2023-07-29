package com.example.hw_3_6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.hw_3_6.databinding.ItemMusikBinding

class MusikAdapter (
    val musikList: ArrayList<Musik>):
    Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemMusikBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(musikList[position])
    }

    override fun getItemCount(): Int = musikList.size

}

class ViewHolder (private  val binding: ItemMusikBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(musik: Musik){
        binding.tvName.text = musik.name
        binding.tvAuthor.text = musik.author
        binding.tvNum.text = musik.number.toString()
        binding.tvTime.text = musik.time.toString()
    }
}