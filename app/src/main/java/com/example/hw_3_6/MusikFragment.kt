package com.example.hw_3_6

import android.annotation.SuppressLint
import android.content.ClipData.Item
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import com.example.hw_3_6.databinding.FragmentMusikBinding

class MusikFragment : Fragment() {
    private lateinit var binding: FragmentMusikBinding
    private var songList = arrayListOf(
        Musik(1, "Blank Spase", "Taylor Switw", 3.22),
        Musik(2, "Watch Me", "Silento", 5.36),
        Musik(3, "Earned it", "The Weekend", 4.51),
        Musik(4, "The Hills", "The Weekend", 3.41),
        Musik(5, "Writing's On The Wall", null, 5.33)
    )
    private val bundle = Bundle()
    private val promotionsFragment:PromotionsFragment=PromotionsFragment()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMusikBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = MusikAdapter(songList,this::onClick)
        binding.rvMusik.adapter = adapter


        }
    fun onClick(position: Int){
        bundle.putSerializable("key",songList[position])
        promotionsFragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.promot_fragment,promotionsFragment).addToBackStack(null).commit()
    }
}








//    private lateinit var binding: ActivityMainBinding
//    private val musikList = arrayListOf(
//        Musik(1,"Blank Spase","Taylor Switw", 3.22),
//        Musik(2,"Watch Me","Silento", 5.36),
//        Musik(3,"Earned it","The Weekend", 4.51),
//        Musik(4,"The Hills","The Weekend", 3.41),
//        Musik(5,"Writing's On The Wall",null, 5.33))
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        supportFragmentManager.beginTransaction().add(R.id.musik,MusikFragment()).commit()
//        val adapter = MusikAdapter (musikList)
//        binding.rvMusik.adapter = adapter
//
//
//    }
//}

