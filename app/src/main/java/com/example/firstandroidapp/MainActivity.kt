package com.example.firstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.firstandroidapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var binding:ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        condition()

        binding?.butPhone?.setOnClickListener(this)
        binding?.butEmail?.setOnClickListener(this)
        binding?.butMessage?.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        when(view.id) {
            R.id.butPhone -> {
                binding?.result?.text = binding?.butPhone?.text
                condition()
            }
            R.id.butEmail -> {
                binding?.result?.text = binding?.butEmail?.text
                condition()
            }
            R.id.butMessage -> {
                binding?.result?.text = binding?.butMessage?.text
                condition()
            }
            }
        }



    private  fun condition() {

when(binding?.result?.text) {

    getString(R.string.phone) ->{ binding?.butPhone?.visibility = View.GONE
        binding?.butEmail?.visibility = View.VISIBLE
        binding?.butMessage?.visibility = View.VISIBLE

    }

    getString(R.string.email) ->

    {
        binding?.butEmail?.visibility = View.GONE
        binding?.butPhone?.visibility = View.VISIBLE
        binding?.butMessage?.visibility = View.VISIBLE

    }
    getString(R.string.message) ->
    {    binding?.butMessage?.visibility = View.GONE
        binding?.butPhone?.visibility = View.VISIBLE
        binding?.butEmail?.visibility = View.VISIBLE


    }
    getString(R.string.message) -> binding?.butMessage?.visibility = View.VISIBLE

    else -> {
        binding?.butPhone?.visibility = View.VISIBLE
        binding?.butEmail?.visibility = View.VISIBLE
        binding?.butMessage?.visibility = View.VISIBLE

    }


}


    }
}



