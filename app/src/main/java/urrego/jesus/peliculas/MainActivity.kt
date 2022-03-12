package urrego.jesus.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    // Lista de peliculas completamente vacia
    var peliculas: ArrayList<Pelicula> = ArrayList()
    var series: ArrayList<Serie> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    /*
        llenar_peliculas()
        llenar_series()

        var adaptador_peliculas = AdaptadorPeliculas(this, peliculas)
        var adaptador_series = AdaptadorSeries(this, series)

        var listview_peliculas: ListView = findViewById(R.id.listview)
        var listview_series: ListView = findViewById(R.id.listview)

        listview_peliculas.adapter = adaptador_peliculas
        listview_series.adapter = adaptador_series

         */
    }

    /*
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

    fun llenar_series() {

        val office = Serie(
            1,
            getString(R.string.office_name),
            getString(R.string.office_year),
            getString(R.string.office_description),
            getString(R.string.office_seasons),
            R.drawable.office
        )
        series.add(office)

        val bigbang = Serie(
            2,
            getString(R.string.bigbang_name),
            getString(R.string.bigbang_year),
            getString(R.string.bigbang_description),
            getString(R.string.bigbang_seasons),
            R.drawable.bigbang
        )
        series.add(bigbang)

        val simpsons = Serie(
            3,
            getString(R.string.simpsons_name),
            getString(R.string.simpsons_year),
            getString(R.string.simpsons_description),
            getString(R.string.simpsons_seasons),
            R.drawable.simpsons
        )
        series.add(simpsons)

        val trigun = Serie(
            4,
            getString(R.string.trigun_name),
            getString(R.string.trigun_year),
            getString(R.string.trigun_description),
            getString(R.string.trigun_seasons),
            R.drawable.trigun
        )
        series.add(trigun)

        val vikings = Serie(
            5,
            getString(R.string.vikings_name),
            getString(R.string.vikings_year),
            getString(R.string.vikings_description),
            getString(R.string.vikings_seasons),
            R.drawable.vkings
        )
        series.add(vikings)
    }

     */
}