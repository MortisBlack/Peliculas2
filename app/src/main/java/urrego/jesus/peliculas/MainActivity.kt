package urrego.jesus.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    // Lista de peliculas completamente vacia
    var peliculas: ArrayList<Pelicula> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llenar_peliculas()

        var adaptador = AdaptadorPeliculas(this, peliculas)

        var listview: ListView = findViewById(R.id.listview)

        listview.adapter = adaptador
    }

    fun llenar_peliculas() {

        val akira = Pelicula(
            1,
            getString(R.string.akira_name),
            getString(R.string.akira_year),
            getString(R.string.akira_description),
            getString(R.string.akira_duration),
            R.drawable.akira
        )
        peliculas.add(akira)

        val dollars = Pelicula(
            2,
            getString(R.string.dollars_name),
            getString(R.string.dollars_year),
            getString(R.string.dollars_description),
            getString(R.string.dollars_duration),
            R.drawable.dollars
        )
        peliculas.add(dollars)

        val drive = Pelicula(
            3,
            getString(R.string.drive_name),
            getString(R.string.drive_year),
            getString(R.string.dollars_description),
            getString(R.string.drive_duration),
            R.drawable.drive
        )
        peliculas.add(drive)

        val madmax = Pelicula(
            4,
            getString(R.string.madmax_name),
            getString(R.string.madmax_year),
            getString(R.string.madmax_description),
            getString(R.string.madmax_duration),
            R.drawable.madmax
        )
        peliculas.add(madmax)

        val orange = Pelicula(
            5,
            getString(R.string.orange_name),
            getString(R.string.orange_year),
            getString(R.string.orange_description),
            getString(R.string.orange_duration),
            R.drawable.orange
        )
        peliculas.add(orange)
    }
}