package com.example.dialogfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.dialogfragment.databinding.Fragment1Binding
import com.example.dialogfragment.databinding.Fragment2Binding
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class Fragment2:Fragment() {
lateinit var myAdapterMeStatus: AdapterMeStatus
lateinit var myAdpterQthr: Adpterqthr
    lateinit var binding: Fragment2Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment2Binding.inflate(layoutInflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

meStatus()
qtherStutus()

    }

    private fun qtherStutus() {

        val listItem= arrayListOf<StatusQther>(

            StatusQther("Jaber","Yersday,20:07",""),
       /*     StatusQther(),
            StatusQther(),
            StatusQther(),
            StatusQther(),
            StatusQther(),
            StatusQther(),

im kavan nikfarjam
ii

*/
        )


    }

    private fun meStatus() {
        val list = arrayListOf<Status>(
            Status("My status","Yesterday,19:18",R.drawable.ic_horiz,"https://www.toptoop.ir/files/images/01-khordad/siyah-(20).jpg")
        )

    myAdapterMeStatus=AdapterMeStatus(list)
        binding.resyclerMe.adapter=myAdapterMeStatus
        binding.resyclerMe.layoutManager=LinearLayoutManager(context,RecyclerView.VERTICAL,false)



    }

}