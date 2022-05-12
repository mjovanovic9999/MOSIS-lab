package elfak.mosis.myplaces

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import elfak.mosis.myplaces.databinding.ActivityMyPlacesListBinding
import java.util.ArrayList

class MyPlacesList : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMyPlacesListBinding

    private lateinit var places: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMyPlacesListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        places=ArrayList<String>()

        places.add("Mesto1")
        places.add("Mesto2")
        places.add("Mesto3")

        val view=findViewById<ListView>(R.id.my_places_list)

        val adapter: ArrayAdapter<String> = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, android.R.id.text1, places)
        view.adapter = adapter

    }

    override fun onSupportNavigateUp(): Boolean {
        return super.onSupportNavigateUp()
    }
}