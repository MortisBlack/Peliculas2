package urrego.jesus.peliculas

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdaptadorSeries: BaseAdapter {
    lateinit var context: Context
    var series: ArrayList<Serie> = ArrayList()

    constructor(context: Context, series: ArrayList<Serie>) {
        this.context = context
        this.series = series
    }

    override fun getCount(): Int {
        // Indica el numero de objetos en mi lista
        return series.size
    }

    override fun getItem(position: Int): Any {
        // indica el elemento individual con el cual puedo interactuar
        return series[position]
    }

    override fun getItemId(position: Int): Long {
        // Pide el id del elemento que estamos trabajando
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // Obtener un "inflador"
        /*
            Cuando yo tengo une elemento por debajo que se llama "listView"
            y le doy cada uno de mis objetos, cuando obtiene un objeto
            como se selecciona por debajo esta inflando mi vista y esta llenando
            con todos los elementos de ese objeto
         */

        val inflador = LayoutInflater.from(context)
        val vista = inflador.inflate(R.layout.activity_serie, null)

        var iv_img: ImageView = vista.findViewById(R.id.img_view)
        var tv_nombre: TextView = vista.findViewById(R.id.tv_nombre)

        var serie: Serie = series[position]

        iv_img.setImageResource(serie.img)
        tv_nombre.setText(serie.name)

        vista.setOnClickListener {
            // variable para crear una nueva vista, ya la veremos mas adelante
            val intent: Intent = Intent(context, PeliculaActivity::class.java)

            intent.putExtra("img", serie.img)
            intent.putExtra("name", serie.name)
            intent.putExtra("year", serie.year)
            intent.putExtra("seasons", serie.seasons)
            intent.putExtra("description", serie.description)

            context.startActivity(intent)
        }

        return vista
    }
}