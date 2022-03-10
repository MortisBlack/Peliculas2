package urrego.jesus.peliculas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdaptadorPeliculas: BaseAdapter {
    lateinit var context: Context
    var peliculas: ArrayList<Pelicula> = ArrayList()

    constructor(context: Context, peliculas: ArrayList<Pelicula>) {
        this.context = context
        this.peliculas = peliculas
    }

    override fun getCount(): Int {
        // Indica el numero de objetos en mi lista
        return peliculas.size
    }

    override fun getItem(position: Int): Any {
        // indica el elemento individual con el cual puedo interactuar
        return peliculas[position]
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
        val vista = inflador.inflate(R.layout.pelicula_view, null)

        var iv_img: ImageView = vista.findViewById(R.id.img_view)
        var tv_nombre: TextView = vista.findViewById(R.id.tv_nombre)

        var pelicula: Pelicula = peliculas[position]

        iv_img.setImageResource(pelicula.img)
        tv_nombre.setText(pelicula.name)

        return vista
    }
}