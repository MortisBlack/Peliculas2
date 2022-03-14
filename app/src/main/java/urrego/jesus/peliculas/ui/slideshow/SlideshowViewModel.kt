package urrego.jesus.peliculas.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Aquí irian mis favortios, si lo hubiera hecho... :c"
    }
    val text: LiveData<String> = _text
}