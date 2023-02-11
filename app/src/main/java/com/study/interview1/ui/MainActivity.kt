package com.study.interview1.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import com.study.interview1.databinding.ActivityMainBinding
import com.study.interview1.domain.extensions.load
import com.study.interview1.domain.model.User
import com.study.interview1.domain.util.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel : MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initObserver()
        initListeners()
    }

    private fun initListeners() {
        with(binding){
            btn.setOnClickListener {
                viewModel.getUser()
            }
        }
    }



    private fun initObserver() {
        viewModel.userState.observe(this){result ->
            when(result) {
                is Resource.Success -> result.data?.let { holderUserData(it) }
                is Resource.Error -> handleError()
            }
        }
        viewModel.isLoading.observe(this){
            handleLoading(it)
        }
    }

    private fun handleError() {
        Toast.makeText(this, "not data fetched", Toast.LENGTH_SHORT).show()
    }

    private fun handleLoading(isLoading : Boolean){
        with(binding){
            if (isLoading) {
                progress.visibility = View.VISIBLE
                userInfo.visibility = View.GONE
            } else {
                progress.visibility = View.GONE
                userInfo.visibility= View.VISIBLE
            }
        }
    }


    private fun holderUserData(data: User){
        with(binding){
            name.text = data.name
            userImg.load(data.img)
        }
    }

}