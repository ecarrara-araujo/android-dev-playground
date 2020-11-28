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
        setUpToggleGroup()
    }

    private fun setUpToggleGroup() {
        screenBindings.materialToggleButtonGroup
            .addOnButtonCheckedListener { group, checkedId, isChecked ->
                Toast.makeText(this, "Toggled: $checkedId", Toast.LENGTH_LONG).show()
            }
    }

    private fun setUpMaterialButton() {
        screenBindings.materialButton.setOnClickListener {
            Toast.makeText(this, "This is a material Toast", Toast.LENGTH_LONG).show()
        }
    }
}
