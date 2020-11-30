package br.com.ecarrara.basiccommonplacestudies.ui.button

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.ecarrara.basiccommonplacestudies.databinding.ActivityButtonExperimentsBinding
import com.google.android.material.button.MaterialButton

class ButtonExperimentsActivity : AppCompatActivity() {

    private lateinit var screenBindings: ActivityButtonExperimentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        screenBindings = ActivityButtonExperimentsBinding.inflate(layoutInflater)
        setContentView(screenBindings.root)
        setUpMaterialButton()
        setUpToggleGroup()
        setUpFavoriteButton()
    }

    private fun setUpToggleGroup() {
        screenBindings.materialToggleButtonGroup
            .addOnButtonCheckedListener { group, checkedId, isChecked ->
                showToast("Toggled: $checkedId", Toast.LENGTH_LONG)
            }
    }

    private fun setUpMaterialButton() {
        screenBindings.materialButton.setOnClickListener {
            showToast("This is a material Toast")
        }
    }

    private fun setUpFavoriteButton() {
        screenBindings.customFavoriteButton.setOnClickListener {
            val isChecked = (screenBindings.customFavoriteButton as? MaterialButton)?.isChecked
            showToast("Favorite Button clicked isChecked: $isChecked")
        }
    }

    private fun showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()
    }
}
