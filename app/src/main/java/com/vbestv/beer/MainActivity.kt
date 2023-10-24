package com.vbestv.beer

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vbestv.beer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)

        binding.findBeer.setOnClickListener {
            binding.textView.text = "Beer color is ${binding.beerColor.selectedItem} : \n ${getBeers(
                binding.beerColor.selectedItem as String
            )}"
        }
    }
    fun getBeers(color:String):List<String>{
        return when (color){
            "Light" -> listOf("Jail Pale Ale", "Lager Lite")
            "Amber" -> listOf("Jack Amber", "Red Moose")
            "Brown" -> listOf("Brown Bear Beer", "Bock Brownie")
            else -> listOf("Gout Stout", "Dark Daniel")
        }
    }
}