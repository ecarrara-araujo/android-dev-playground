package br.com.ecarrara.basiccommonplacestudies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.ecarrara.basiccommonplacestudies.databinding.ActivityMainBinding
import br.com.ecarrara.basiccommonplacestudies.extensions.navigateTo
import br.com.ecarrara.basiccommonplacestudies.ui.button.ButtonExperimentsActivity
import br.com.ecarrara.basiccommonplacestudies.ui.checkbox.CheckboxExperimentsActivity
import br.com.ecarrara.basiccommonplacestudies.ui.dialogs.DialogExperimentsActivity
import br.com.ecarrara.basiccommonplacestudies.ui.progressindicators.ProgressIndicatorsExperimentsActivity
import br.com.ecarrara.basiccommonplacestudies.ui.radiobutton.RadioButtonExperimentsActivity
import br.com.ecarrara.basiccommonplacestudies.ui.sliders.SlidersExperimentsActivity
import br.com.ecarrara.basiccommonplacestudies.ui.snackbars.SnackbarsExperimentsActivity
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
                navigateTo(ButtonExperimentsActivity::class.java)
            }
            checkboxExperimentsButton.setOnClickListener {
                navigateTo(CheckboxExperimentsActivity::class.java)
            }
            radioButtonsExperimentsButton.setOnClickListener {
                navigateTo(RadioButtonExperimentsActivity::class.java)
            }
            switchesExperimentsButton.setOnClickListener {
                navigateTo(SwitchesExperimentsActivity::class.java)
            }
            textInputExperimentsButton.setOnClickListener {
                navigateTo(TextFieldsExperimentsActivity::class.java)
            }
            slidersExperimentsButton.setOnClickListener {
                navigateTo(SlidersExperimentsActivity::class.java)
            }
            progressIndicatorsExperimentsButton.setOnClickListener {
                navigateTo(ProgressIndicatorsExperimentsActivity::class.java)
            }
            snackbarsExperimentsButton.setOnClickListener {
                navigateTo(SnackbarsExperimentsActivity::class.java)
            }
            dialogsExperimentsButton.setOnClickListener {
                navigateTo(DialogExperimentsActivity::class.java)
            }
        }
    }
}
