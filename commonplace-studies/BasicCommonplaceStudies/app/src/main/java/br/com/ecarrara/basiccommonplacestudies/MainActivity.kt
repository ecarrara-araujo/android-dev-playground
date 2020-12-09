package br.com.ecarrara.basiccommonplacestudies

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.ecarrara.basiccommonplacestudies.databinding.ActivityMainBinding
import br.com.ecarrara.basiccommonplacestudies.ui.button.ButtonExperimentsActivity
import br.com.ecarrara.basiccommonplacestudies.ui.checkbox.CheckboxExperimentsActivity
import br.com.ecarrara.basiccommonplacestudies.ui.radiobutton.RadioButtonExperimentsActivity
import br.com.ecarrara.basiccommonplacestudies.ui.sliders.SlidersExperimentsActivity
import br.com.ecarrara.basiccommonplacestudies.ui.switches.SwitchesExperimentsActivity
import br.com.ecarrara.basiccommonplacestudies.ui.textfields.TextFieldsExperimentsActivity

class MainActivity : AppCompatActivity() {

    private lateinit var screenBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        screenBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(screenBinding.root)
        setUpButtons()
    }

    private fun setUpButtons() {
        with(screenBinding) {
            buttonExperimentsButton.setOnClickListener {
                startActivity(Intent(this@MainActivity, ButtonExperimentsActivity::class.java))
            }
            checkboxExperimentsButton.setOnClickListener {
                startActivity(Intent(this@MainActivity, CheckboxExperimentsActivity::class.java))
            }
            radioButtonsExperimentsButton.setOnClickListener {
                startActivity(Intent(this@MainActivity, RadioButtonExperimentsActivity::class.java))
            }
            switchesExperimentsButton.setOnClickListener {
                startActivity(Intent(this@MainActivity, SwitchesExperimentsActivity::class.java))
            }
            textInputExperimentsButton.setOnClickListener {
                startActivity(Intent(this@MainActivity, TextFieldsExperimentsActivity::class.java))
            }
            slidersExperimentsButton.setOnClickListener {
                startActivity(Intent(this@MainActivity, SlidersExperimentsActivity::class.java))
            }
        }
    }
}
