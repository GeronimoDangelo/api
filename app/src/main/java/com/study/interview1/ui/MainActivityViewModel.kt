package com.study.interview1.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.study.interview1.domain.model.User
import com.study.interview1.domain.repository.UserRepository
import com.study.interview1.domain.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val repository: UserRepository
): ViewModel() {


    private val _userState: MutableLiveData<Resource<User>> = MutableLiveData()
    val userState: LiveData<Resource<User>> = _userState

    private val _isLoading: MutableLiveData<Boolean> = MutableLiveData(true)
    val isLoading: LiveData<Boolean> = _isLoading


    init {
        getUser()
    }

    fun getUser(){
        viewModelScope.launch {
            _userState.value = repository.fetchUser()
            _isLoading.value = false
        }
    }



}