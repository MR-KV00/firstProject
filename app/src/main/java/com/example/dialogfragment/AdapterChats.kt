package com.example.dialogfragment


import android.view.LayoutInflater
import android.view.RoundedCorner
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.dialogfragment.databinding.Modal2Binding

import com.example.dialogfragment.databinding.ModalBinding
import jp.wasabeef.glide.transformations.RoundedCornersTransformation


class AdapterChats(val dataChats:ArrayList<DataChats>) : RecyclerView.Adapter<AdapterChats.ViewHolder>() {

    inner class ViewHolder(private val binding: ModalBinding) :
      RecyclerView.ViewHolder(binding.root) {

        fun findData(position: Int) {

            binding.txtNameModal.text=dataChats[adapterPosition].name
            binding.txtDataModal.text=dataChats[adapterPosition].date
            binding.txtTextModal.text=dataChats[adapterPosition].text


            Glide.with(binding.root.context)
               .load(dataChats[adapterPosition].img)
                .transform(RoundedCornersTransformation(200,4))
               .into(binding.imgMainModal)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ModalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.findData(position)
    }

    override fun getItemCount(): Int {
        return dataChats.size
    }

}

class AdapterMeStatus(val dataMeStatus:ArrayList<Status>) : RecyclerView.Adapter<AdapterMeStatus.ViewHolder>() {

    inner class ViewHolder(private val binding: Modal2Binding) :
        RecyclerView.ViewHolder(binding.root) {

        fun findData(position: Int) {

            binding.txtNameModal.text=dataMeStatus[adapterPosition].name
            binding.txtTextModal.text=dataMeStatus[adapterPosition].text

             Glide.with(binding.root.context)
                 .load(dataMeStatus[adapterPosition].img2)
                 .into(binding.imgMorHori)
            Glide.with(binding.root.context)
                .load(dataMeStatus[adapterPosition].img)
                .transform(RoundedCornersTransformation(200,4))
                .into(binding.imgMainModal)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = Modal2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.findData(position)
    }

    override fun getItemCount(): Int {
        return dataMeStatus.size
    }

}

class Adpterqthr(val dataQther:ArrayList<StatusQther>):RecyclerView.Adapter<Adpterqthr.ViewHolder>() {

    inner class ViewHolder(private val binding: Modal2Binding) :
        RecyclerView.ViewHolder(binding.root) {

        fun findData(position: Int) {

            binding.txtNameModal.text=dataQther[adapterPosition].name
            binding.txtTextModal.text=dataQther[adapterPosition].text


            Glide.with(binding.root.context)
                .load(dataQther[adapterPosition].img)
                .transform(RoundedCornersTransformation(200,4))
                .into(binding.imgMainModal)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = Modal2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.findData(position)
    }

    override fun getItemCount(): Int {
        return dataQther.size
    }

}