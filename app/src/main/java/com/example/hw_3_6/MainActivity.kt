package com.example.hw_3_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_3_6.databinding.ActivityMainBinding
import com.example.hw_3_6.databinding.ItemMusikBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().add(R.id.musik,MusikFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.fon,ImageFragment()).commit()



    }
}

// -Создать 2 фрагмента
// -2 фрагмента отобразить на Активити как на дизайне
// -Первый фргамент сверстать прям как в фигме, на 2ом сделать RecyclerView (10 песен)
// -При нажатии на элемент в ресайклере открывать 2ой активити.