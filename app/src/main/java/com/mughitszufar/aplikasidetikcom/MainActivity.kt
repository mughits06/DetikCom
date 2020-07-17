package com.mughitszufar.aplikasidetikcom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mughitszufar.aplikasidetikcom.NewsAdapter.NewsAdapter
import com.mughitszufar.aplikasidetikcom.NewsAdapter.NewsModel
import com.mughitszufar.aplikasidetikcom.NewsAdapter.news
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.lay_berita.*

class MainActivity : AppCompatActivity() {

    private lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //region headline

        var headlinenews: news?
        if (NewsModel.newlist.size>0){
            headlinenews = NewsModel.newlist[NewsModel.newlist.size-1]
            tvw_TitleHeadLine.setText(headlinenews.title)
            tvw_DescHeadline.setText(headlinenews.desc)
            img_news0.setImageResource(headlinenews.photo)

            cdv_newsheadline.setOnClickListener {
                val intent_Detail = Intent (this, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, headlinenews.title)
                        putExtra(DetailActivity.cont_PhotoNews, headlinenews.photo.toString())
                    }

                startActivity(intent_Detail)
                finish()


            }
        }

        //endrogion



        //region daftar berita
        val layManager = LinearLayoutManager(this)
        layManager.orientation = LinearLayoutManager.VERTICAL
        rcv_daftarberita.layoutManager = layManager

        newsAdapter = NewsAdapter(this, NewsModel.newlist)
        rcv_daftarberita.adapter = newsAdapter

        newsAdapter.setOnClickCallBack(object : NewsAdapter.OnItemClickCallBack{
            override fun onItemClick(data: news) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, data.title.toString())
                        putExtra(DetailActivity.cont_PhotoNews, data.photo.toString())
                    }

                startActivity(intent)
                finish()
            }
        })



        //endregion
    }
}
