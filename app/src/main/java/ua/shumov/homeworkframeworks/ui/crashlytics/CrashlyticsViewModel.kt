package ua.shumov.homeworkframeworks.ui.crashlytics

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CrashlyticsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Crashlytics Fragment"
    }
    val text: LiveData<String> = _text
}