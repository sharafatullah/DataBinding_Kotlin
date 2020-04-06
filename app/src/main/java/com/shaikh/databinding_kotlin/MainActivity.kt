package com.shaikh.databinding_kotlin

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.shaikh.databinding_kotlin.data.User
import com.shaikh.databinding_kotlin.databinding.ActivityMainBinding
import com.shaikh.databinding_kotlin.handler.OnClickHandlerInterface

class MainActivity : AppCompatActivity(), OnClickHandlerInterface {

    //declaring the Binding class
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //assign the layout file in binding class object
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //set the data source class which reflect in layout file
        binding.viewModel = User("aadan","Fadnavis","Software Engineer",10000);

        binding.handler = this;
    }

    override fun onClick(view: View) {
        Toast.makeText(this,"Button clicked",Toast.LENGTH_SHORT).show()
    }
}
