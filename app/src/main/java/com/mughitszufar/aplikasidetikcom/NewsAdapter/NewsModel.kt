package com.mughitszufar.aplikasidetikcom.NewsAdapter

import com.mughitszufar.aplikasidetikcom.R
import kotlinx.android.synthetic.main.activity_main.view.*

data class news(var title: String, var desc: String, var photo: Int)

object NewsModel {
    val newlist = listOf<news>(
        news("Pasar ramai dikunjungi warga meskipun wabah covid 19 belum dinyatakan usai" ,
            "detikcom | 1 jam yang lalu",
            R.drawable.img_news1),

        news("Kapal nelayan menyalurkan bansos masyarakat sulawesi",
            "detikcom | 1 jam yang lalu",
            R.drawable.img_news2),

        news("Macet mulai terjadi di wilayah jalur pemudik semarang",
            "detikcom | 2 jam yang lalu",
            R.drawable.img_news3),

        news("Jelang new normal jakarta macet lagi",
            "detikcom | 3 jam yang lalu",
            R.drawable.img_news4),

        news("Dukung indonesia perangi covid - 19, sampoerna donasi ventilator dan APD fullset ",
            "detikcom | 4 jam yang lalu",
            R.drawable.img_news5),

        news("Saat risma menjelaskan oal penanganan corana pada kepala BNbP dan Menkes",
            "detikcom| 5 jam yang lalu",
            R.drawable.img_news6),

        news("Banjir keritik trump yang kerahkan militer usai demo George Floyid",
            "detikcom | 6 jam yang lalu",
            R.drawable.img_news7),

        news("Mengapa aksi demo damaikasuk george floyid bisa berubah jadi kerusuhan",
            "detikcom | 7 jam yang lalu",
            R.drawable.img_news8),

        news("2 opsi bagi calon jamaah haji yang tidak berangkat tahun ini",
            "deticom | 8 jam yang lalu",
           R.drawable.img_news9)




    )

}

