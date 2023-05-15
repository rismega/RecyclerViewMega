package com.example.megaamanda

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.megaamanda.adaptor.AdaptorTeamBola
import com.example.megaamanda.databinding.ActivityMainBinding
import com.example.megaamanda.model.Pemain

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listPemain = ArrayList<Pemain>()
        listPemain.add(Pemain("Courtois",R.drawable.courtois,"penjaga gawang","1.89","Depok","11 mei 1999"))
        listPemain.add(Pemain("Benzema",R.drawable.download,"Penyerang","1.86","Bandung","12 Mei 1999"))
        listPemain.add(Pemain("Marcelo",R.drawable.marcelo,"Gelandang","1.79","Papua","13 April 1990"))
        listPemain.add(Pemain("Grealish",R.drawable.grealish,"Geladang","1.80","Bogor","12 September 1990"))
        listPemain.add(Pemain("Erling",R.drawable.halland,"Penyerang","1.90","Bekasi","12 Desember 1990"))
        listPemain.add(Pemain("Courtois",R.drawable.courtois,"penjaga gawang","1.89","Depok","11 mei 1999"))
        listPemain.add(Pemain("Benzema",R.drawable.download,"Penyerang","1.86","Bandung","12 Mei 1999"))
        listPemain.add(Pemain("Marcelo",R.drawable.marcelo,"Gelandang","1.79","Papua","13 April 1990"))
        listPemain.add(Pemain("Grealish",R.drawable.grealish,"Geladang","1.80","Bogor","12 September 1990"))
        listPemain.add(Pemain("Erling",R.drawable.halland,"Penyerang","1.90","Bekasi","12 Desember 1990"))
        listPemain.add(Pemain("Courtois",R.drawable.courtois,"penjaga gawang","1.89","Depok","11 mei 1999"))
        listPemain.add(Pemain("Benzema",R.drawable.download,"Penyerang","1.86","Bandung","12 Mei 1999"))
        listPemain.add(Pemain("Marcelo",R.drawable.marcelo,"Gelandang","1.79","Papua","13 April 1990"))
        listPemain.add(Pemain("Grealish",R.drawable.grealish,"Geladang","1.80","Bogor","12 September 1990"))
        listPemain.add(Pemain("Erling",R.drawable.halland,"Penyerang","1.90","Bekasi","12 Desember 1990"))
        listPemain.add(Pemain("Courtois",R.drawable.courtois,"penjaga gawang","1.89","Depok","11 mei 1999"))
        listPemain.add(Pemain("Benzema",R.drawable.download,"Penyerang","1.86","Bandung","12 Mei 1999"))
        listPemain.add(Pemain("Marcelo",R.drawable.marcelo,"Gelandang","1.79","Papua","13 April 1990"))
        listPemain.add(Pemain("Grealish",R.drawable.grealish,"Geladang","1.80","Bogor","12 September 1990"))

        binding.list.adapter = AdaptorTeamBola(this,listPemain,object  : AdaptorTeamBola.OnClickListener {
            override fun detailData(item: Pemain?) {
                Dialog(this@MainActivity).apply {
                    requestWindowFeature(Window.FEATURE_NO_TITLE)
                    setCancelable(true)
                    setContentView(R.layout.detail_data_pemain)

                    val image  = this.findViewById<ImageView>(R.id.image_pemain)
                    val nama    = this.findViewById<TextView>(R.id.txtNamaPemain)
                    val posisi    = this.findViewById<TextView>(R.id.txtPosisi)
                    val tinggi    = this.findViewById<TextView>(R.id.txtTinggi)
                    val tempatlahir    = this.findViewById<TextView>(R.id.txtTempatLahir)
                    val tgllahir    = this.findViewById<TextView>(R.id.txtTanggalLahir)
                    val btn      = this.findViewById<Button>(R.id.btnClose)

                    image.setImageResource(item?.foto ?:0)
                    nama.text = "${item?.nama}"
                    posisi.text = "${item?.posisi}"
                    tinggi.text = "${item?.tinggi}"
                    tempatlahir.text = "${item?.tempatlahir}"
                    tgllahir.text = "${item?.tgllahir}"

                    btn.setOnClickListener {
                        this.dismiss()
                    }



                }.show()

            }

        })



    }
}