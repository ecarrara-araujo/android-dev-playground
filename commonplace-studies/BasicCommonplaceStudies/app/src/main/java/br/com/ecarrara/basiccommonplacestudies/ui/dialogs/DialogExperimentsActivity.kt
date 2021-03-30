package br.com.ecarrara.basiccommonplacestudies.ui.dialogs

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.ecarrara.basiccommonplacestudies.R
import br.com.ecarrara.basiccommonplacestudies.databinding.ActivityDialogExperimentsBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class DialogExperimentsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDialogExperimentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDialogExperimentsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpButtons()
    }

    private fun setUpButtons() {
        with(binding) {
            showAlertDialogButton.setOnClickListener {
                MaterialAlertDialogBuilder(this@DialogExperimentsActivity)
                    .setTitle(R.string.dialog_experiments_dialog_title)
                    .setMessage(R.string.dialog_experiments_dialog_supporting_text)
                    .setPositiveButton(R.string.dialog_experiments_dialog_confirmation_button) { _, _ ->
                        showButtonClickedMessage()
                    }
                    .setNegativeButton(R.string.dialog_experiments_dialog_cancelation_button) { _, _ ->
                        showButtonClickedMessage()
                    }
                    .show()
            }
        }
    }

    private fun showButtonClickedMessage() {
        Toast.makeText(this, R.string.dialog_experiments_button_tapped, Toast.LENGTH_SHORT)
            .show()
    }
}
