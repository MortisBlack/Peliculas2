package urrego.jesus.peliculas.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import urrego.jesus.peliculas.*
import urrego.jesus.peliculas.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel
    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    var series: ArrayList<Serie> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root
        /*
        val textView: TextView = binding.textGallery
        galleryViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        */
        llenar_series()

        var adaptador = AdaptadorSeries(root.context, series)

        var listview: ListView = binding.listviewSeries

        listview.adapter = adaptador

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
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
}