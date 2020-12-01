package br.com.ecarrara.basiccommonplacestudies.ui.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import br.com.ecarrara.basiccommonplacestudies.databinding.ActivityRadioButtonExperimentsBinding
import br.com.ecarrara.basiccommonplacestudies.extensions.showToast

class RadioButtonExperimentsActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityRadioButtonExperimentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityRadioButtonExperimentsBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        setUpRadioGroup()
    }

    private fun setUpRadioGroup() {
        viewBinding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
            showToast(
                "Group Checked Radio Changed, now selected: ${findViewById<RadioButton>(checkedId).text}"
            )
        }

        viewBinding.radioButtonSelected.setOnCheckedChangeListener { radioButton, isChecked ->
            showToast("Selected Radio isChecked: $isChecked")
        }
    }
}
