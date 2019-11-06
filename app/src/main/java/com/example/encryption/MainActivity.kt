package com.example.encryption

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.encryption.databinding.ActivityMainBinding
import com.example.encryption.validator.ValidatorClass

class MainActivity : AppCompatActivity() {


    lateinit var bi: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bi = DataBindingUtil.setContentView(this, R.layout.activity_main)
        bi.callback = this

    }

    fun btnSubmit(view: View) {
        ValidatorClass.EmptyCheckingContainer(this, bi.formValidateLayout)
    }
}
