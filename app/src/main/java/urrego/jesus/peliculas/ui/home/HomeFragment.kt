package urrego.jesus.peliculas.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import urrego.jesus.peliculas.AdaptadorPeliculas
import urrego.jesus.peliculas.Pelicula
import urrego.jesus.peliculas.R
import urrego.jesus.peliculas.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    var peliculas: ArrayList<Pelicula> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // val textView: TextView = binding.textHome
        //homeViewModel.text.observe(viewLifecycleOwner, Observer {
        //    textView.text = it
        //})

        llenar_peliculas()

        var adaptador = AdaptadorPeliculas(root.context, peliculas)

        var listview: ListView = binding.listviewMovies

        listview.adapter = adaptador

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
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