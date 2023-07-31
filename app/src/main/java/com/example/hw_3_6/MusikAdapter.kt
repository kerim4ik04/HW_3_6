package com.example.hw_3_6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.hw_3_6.databinding.ItemMusikBinding

class MusikAdapter(
    val musikList: ArrayList<Musik>,val onClick:(position:Int)->Unit
): Adapter<MusikAdapter.ViewHolder>() {

    inner class ViewHolder (private  val binding: ItemMusikBinding): RecyclerView.ViewHolder(binding.root){
        fun bind() {
            val musikModel = musikList[adapterPosition]
            binding.tvName.text = musikModel.name
            binding.tvAuthor.text = musikModel.author
            binding.tvNum.text = musikModel.number.toString()
            binding.tvTime.text = musikModel.time.toString()

            itemView.setOnClickListener{
                onClick(adapterPosition)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    return ViewHolder(ItemMusikBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return musikList.size
    }

}



//1:11:21