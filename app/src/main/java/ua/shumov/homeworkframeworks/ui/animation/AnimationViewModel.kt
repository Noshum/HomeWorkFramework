package ua.shumov.homeworkframeworks.ui.animation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AnimationViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is animation Fragment"
    }
    val text: LiveData<String> = _text
}