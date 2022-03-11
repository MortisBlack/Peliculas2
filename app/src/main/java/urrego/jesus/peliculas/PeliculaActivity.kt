package urrego.jesus.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PeliculaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pelicula)

        val tv_img: ImageView = this.findViewById(R.id.img_pelicula)
        val tv_name: TextView = this.findViewById(R.id.tv_name_pelicula)
        val tv_year: TextView = this.findViewById(R.id.tv_year_pelicula)
        val tv_duration: TextView = this.findViewById(R.id.tv_duration_pelicula)
        val tv_description: TextView = this.findViewById(R.id.tv_description_pelicula)

        val bundle = intent.extras

        if(bundle != null) {
            var img: Int = bundle.getInt("img")
            var name: String = bundle.getString("name", "")
            var year: String = bundle.getString("year", "")
            var duration: String = bundle.getString("duration", "")
            var description: String = bundle.getString("description", "")

            tv_img.setImageResource(img)
            tv_name.setText(name)
            tv_year.setText(year)
            tv_duration.setText(duration)
            tv_description.setText(description)
        }
    }
}