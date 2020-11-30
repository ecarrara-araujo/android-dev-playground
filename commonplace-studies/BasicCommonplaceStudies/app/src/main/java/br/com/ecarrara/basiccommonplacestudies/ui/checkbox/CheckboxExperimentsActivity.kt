package br.com.ecarrara.basiccommonplacestudies.ui.checkbox

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.ecarrara.basiccommonplacestudies.databinding.ActivityCheckboxExperimentsBinding
import br.com.ecarrara.basiccommonplacestudies.extensions.showToast

class CheckboxExperimentsActivity : AppCompatActivity() {

    private lateinit var screenBinding: ActivityCheckboxExperimentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        screenBinding = ActivityCheckboxExperimentsBinding.inflate(layoutInflater)
        setContentView(screenBinding.root)
        setUpCheckboxes()
    }

    private fun setUpCheckboxes() {
        with(screenBinding) {
            unselectedCheckbox.setOnCheckedChangeListener { buttonView, isChecked ->
                Toast.makeText(
                    this@CheckboxExperimentsActivity,
                    "Checkbox ${unselectedCheckbox.text} checked state: $isChecked",
                    Toast.LENGTH_SHORT
                ).show()
            }
            parentGroupCheckbox.setOnCheckedChangeListener { buttonView, isChecked ->
                option1CheckBox.isChecked = isChecked
                option2CheckBox.isChecked = isChecked
                option3CheckBox.isChecked = isChecked
                showToast("Checkbox ${screenBinding.parentGroupCheckbox.text} checked state: $isChecked")
            }
        }
    }
}
