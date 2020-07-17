package com.mughitszufar.aplikasidetikcom.NewsAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mughitszufar.aplikasidetikcom.R
import kotlinx.android.synthetic.main.lay_berita.view.*
import java.security.AccessControlContext

class NewsAdapter (val context: Context, val listnews: List<news>) :
    RecyclerView.Adapter<NewsAdapter.MyViewHolder>(){
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var currentNews: news? = null
        var currentPosition: Int = 0

        fun setData(currNews: news, pos: Int){
            itemView.tvw_title.text = currNews!!.title
            itemView.tvw_Desc.text = currNews!!.title
            itemView.img_news.setImageResource(currNews!!.photo)

            this.currentNews
            this.currentPosition
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.lay_berita, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listnews.size
    }

    override fun onBindViewHolder(holder: NewsAdapter.MyViewHolder, position: Int) {
        var datanews = listnews[position]
        holder.setData(datanews, position)

        holder.itemView.setOnClickListener(){onItemClickCallBack.onItemClick(listnews[position])
        }
    }

    //region 1 . Event Click
    private lateinit var onItemClickCallBack: OnItemClickCallBack

    fun setOnClickCallBack(onItemClickCallBack: OnItemClickCallBack){
        this.onItemClickCallBack = onItemClickCallBack
    }
    interface OnItemClickCallBack{
        fun onItemClick(data: news)


    }



}