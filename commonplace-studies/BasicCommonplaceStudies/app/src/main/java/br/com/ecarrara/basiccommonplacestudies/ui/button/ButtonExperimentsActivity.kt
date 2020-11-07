package br.com.ecarrara.basiccommonplacestudies.ui.button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.ecarrara.basiccommonplacestudies.databinding.ActivityButtonExperimentsBinding

class ButtonExperimentsActivity : AppCompatActivity() {

    private lateinit var screenBindings: ActivityButtonExperimentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        screenBindings = ActivityButtonExperimentsBinding.inflate(layoutInflater)
        setContentView(screenBindings.root)
        setUpMaterialButton()
        setUpSimpleButton()
    }

    private fun setUpMaterialButton() {
        screenBindings.materialButton.setOnClickListener {
            Toast.makeText(this, "This is a material Toast", Toast.LENGTH_LONG).show()
        }
    }

    private fun setUpSimpleButton() {
        screenBindings.simpleButton.setOnClickListener {
            Toast.makeText(this, "This is a simple toast", Toast.LENGTH_LONG).show()
        }
    }
}
