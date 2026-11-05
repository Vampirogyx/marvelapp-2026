package edu.iesam.marvelapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.marvelapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        // Crear un fichero SharedPreferences para verlo
        /*val xml = SuperHeroXmlLocalDataSource()
        xml.save(mutableListOf(SuperHero("1", "SuperMan","super-man","https://super"),
        SuperHero("2", "BatMan","bat-man","https://bat"),
        SuperHero("3", "GreenLanter","green-lantern","https://lantern")))

        val superHero = xml.findById("2")
        Log.d(MainActivity::class.java.simpleName, superHero.toString())

         */

    }
}