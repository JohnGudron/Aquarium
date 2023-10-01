package org.hyperskill.aquarium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageAnimals =
            (intent.getSerializableExtra("imageAnimals") ?: listOf(R.drawable.image1)) as List<Int>
        val nameAnimals =
            (intent.getSerializableExtra("nameAnimals") ?: listOf("Koi Carp")) as List<String>
        val descriptionAnimals = (intent.getSerializableExtra("descriptionAnimals") ?: listOf(
            "These colorful, ornamental fish are a variety of the Amur carp. " +
                    "They were originally found in Central Europe and Asia, " +
                    "but they’ve spread to many other parts of the world. " +
                    "Koi carp are popular with breeders, and there are currently over 100 varieties " +
                    "created through breeding.\n" +
                    "\n" +
                    "The average age of a koi carp can vary based on the part of the world it’s bred in. " +
                    "Carps bred outside of Japan have an average lifespan of around 15 years," +
                    " while carps bred in Japan can live 40 years or more. The oldest koi carp on record," +
                    " which was a fish named Hanako, reportedly lived for 226 years!",
        )) as List<String>


        findViewById<TextView>(R.id.tv_name).text = nameAnimals[0]
        findViewById<TextView>(R.id.tv_description).text = descriptionAnimals[0]
    }
}
