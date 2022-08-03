package com.example.dialogfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dialogfragment.databinding.Fragment1Binding

class Fragment1 : Fragment() {
    lateinit var myAdapterChats: AdapterChats
    lateinit var binding: Fragment1Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment1Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val listItemChats = arrayListOf<DataChats>(
            DataChats(
                "Jafar",
                "سلام جعفر خوبی چه خبر یادی از م نمیکنی جوون دل ",
                "23:45",
                "https://arga-mag.com/file/img/2021/02/Profile-photo-for-Instagram-4.jpg"
            ),
            DataChats("mmdJavar","ممدو باوا بزپن که تموم بو","23:17","https://arga-mag.com/file/img/2021/02/Profile-photo-for-Instagram-26.jpg"),
            DataChats("abolBahadory","حاجی بیا یه دور کالاف بزنیم گور بابای دنیا","22:01","https://arga-mag.com/file/img/2021/02/Profile-photo-for-Instagram-15.jpg"),
            DataChats("خاله 2","از کی حالا ما نمیدونیم","22:10","https://www.toptoop.ir/files/images/01-khordad/siyah-(22).jpg"),
            DataChats("فرهاد سرباز ","دارم نگهبای میدم دزدی گوشیو برداشتم","21:37","https://www.toptoop.ir/files/images/01-khordad/siyah-(20).jpg"),
            DataChats("Jaber","سرت تلی  ماستم نهیی","22/10/7","https://arga-mag.com/file/img/2021/02/Profile-photo-for-Instagram-24.jpg"),
            DataChats("شاهرخ","بیامpesشکستت  بدم ","19/20/7","https://arga-mag.com/file/img/2021/02/Profile-photo-for-Instagram-17.jpg"),
            DataChats("کیهان مرده","بیا برا من چیت فری فایر بزن","19/10/7","https://arga-mag.com/file/img/2021/02/Profile-photo-for-Instagram-26.jpg"),
            DataChats("mmdSalah","چاکرتیم برا بیا کهنوج میگم به رگبارت ببندند","18/10/7","https://www.toptoop.ir/files/images/01-khordad/siyah-(9).jpg"),
            DataChats("خالو گپ ","فکرکنم پول های منو کامل ندادی","7/10/7","https://arga-mag.com/file/img/2021/02/Profile-photo-for-Instagram-3.jpg"),
            DataChats("amir","تلا چی","2/10/7","https://www.toptoop.ir/files/images/01-khordad/siyah-(13).jpg"),
            DataChats("معاونت اموزش","چقدر نمره کمکت کنم درسا رو نیفتی ","1/10/7","https://www.toptoop.ir/files/images/01-khordad/siyah-(25).jpg"),
            DataChats("مادر","صبحانه خوردی یا نه ):","1/10/7","https://www.toptoop.ir/files/images/01-khordad/siyah-(6).jpg"),





        )
        // var myAdapterChats= AdapterChats(arrayListOf<DataChats>()) به جای این از لیتینیت ور  استفاد کردیم
        myAdapterChats = AdapterChats(listItemChats)
        binding.resyclerMain.adapter = myAdapterChats
        binding.resyclerMain.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)


    }


}