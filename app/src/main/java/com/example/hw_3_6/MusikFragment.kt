package com.example.hw_3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_3_6.databinding.ActivityMainBinding
import com.example.hw_3_6.databinding.FragmentMusikBinding

class MusikFragment : Fragment() {
    private lateinit var binding: FragmentMusikBinding
    private var param2: String? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusikBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val musikList = arrayListOf(
            Musik(1, "Blank Spase", "Taylor Switw", 3.22),
            Musik(2, "Watch Me", "Silento", 5.36),
            Musik(3, "Earned it", "The Weekend", 4.51),
            Musik(4, "The Hills", "The Weekend", 3.41),
            Musik(5, "Writing's On The Wall", null, 5.33)
        )
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

