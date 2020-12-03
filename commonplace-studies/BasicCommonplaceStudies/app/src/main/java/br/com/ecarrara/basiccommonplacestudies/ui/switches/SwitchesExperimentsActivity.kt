package br.com.ecarrara.basiccommonplacestudies.ui.switches

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.ecarrara.basiccommonplacestudies.R
import br.com.ecarrara.basiccommonplacestudies.databinding.ActivitySwitchesExperimentsBinding
import br.com.ecarrara.basiccommonplacestudies.extensions.showToast

class SwitchesExperimentsActivity : AppCompatActivity() {

    private lateinit var viewBindings: ActivitySwitchesExperimentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBindings = ActivitySwitchesExperimentsBinding.inflate(layoutInflater)
        setContentView(viewBindings.root)
        setUpSwitches()
    }

    private fun setUpSwitches() {
        with(viewBindings) {
            checkedSwitch.setOnCheckedChangeListener { buttonView, isChecked ->
                showToast("Checked Switch isChecked: $isChecked")
            }
        }
    }
}
