package com.example.dummyecommerceapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.dummyecommerceapplication.R
import com.example.dummyecommerceapplication.databinding.RawBinding
import com.example.dummyecommerceapplication.web_service.module.Product
import com.example.dummyecommerceapplication.web_service.module.ProductItem
import java.util.zip.Inflater

class CustomAdaptor(private val list:ArrayList<ProductItem>) : RecyclerView.Adapter<CustomAdaptor.MyHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.raw,parent,false)
        return  MyHolder(RawBinding.bind(view))
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        with(holder){

        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
    class MyHolder(binding: RawBinding): RecyclerView.ViewHolder(binding.root) {
        init {

        }

    }
}