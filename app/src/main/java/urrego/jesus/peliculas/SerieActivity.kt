package urrego.jesus.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SerieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serie)

        val tv_img: ImageView = this.findViewById(R.id.img_serie)
        val tv_name: TextView = this.findViewById(R.id.tv_name_serie)
        val tv_year: TextView = this.findViewById(R.id.tv_year_serie)
        val tv_seasons: TextView = this.findViewById(R.id.tv_seasons_serie)
        val tv_description: TextView = this.findViewById(R.id.tv_description_serie)

        val bundle = intent.extras

        if(bundle != null) {
            var img: Int = bundle.getInt("img")
            var name: String = bundle.getString("name", "")
            var year: String = bundle.getString("year", "")
            var seasons: String = bundle.getString("seasons", "")
            var description: String = bundle.getString("description", "")

            tv_img.setImageResource(img)
            tv_name.setText(name)
            tv_year.setText(year)
            tv_seasons.setText(seasons)
            tv_description.setText(description)
        }
    }
}