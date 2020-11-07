package br.com.ecarrara.basiccommonplacestudies

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.ecarrara.basiccommonplacestudies.databinding.ActivityMainBinding
import br.com.ecarrara.basiccommonplacestudies.ui.button.ButtonExperimentsActivity

class MainActivity : AppCompatActivity() {

    private lateinit var screenBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        screenBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(screenBinding.root)
        setUpButtons()
    }

    private fun setUpButtons() {
        screenBinding.buttonExperimentsButton.setOnClickListener {
            startActivity(Intent(this, ButtonExperimentsActivity::class.java))
        }
    }
}
