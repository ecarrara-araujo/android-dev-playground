package br.com.ecarrara.basiccommonplacestudies.ui.snackbars

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import br.com.ecarrara.basiccommonplacestudies.R
import br.com.ecarrara.basiccommonplacestudies.databinding.ActivitySnackbarsExperimentsBinding
import com.google.android.material.snackbar.Snackbar

class SnackbarsExperimentsActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivitySnackbarsExperimentsBinding

    private val snackbarAnchorView: View?
        get() = if (viewBinding.enableAnchorSwitch.isChecked) {
            viewBinding.anchorFab
        } else {
            null
        }

    private val isDisplayActionButtonEnabled: Boolean
        get() = viewBinding.showActionButtonSwitch.isChecked

    private val applyCustomStyling: Boolean
        get() = viewBinding.applyCustomStylingSwitch.isChecked

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySnackbarsExperimentsBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        setUpButtons()
    }

    private fun setUpButtons() {
        viewBinding.run {
            showCommonSnackbarButton.setOnClickListener {
                Snackbar.make(
                    root,
                    R.string.snackbars_experiments_snackbar_message,
                    Snackbar.LENGTH_LONG
                ).apply {
                    anchorView = snackbarAnchorView
                    setUpActionButton()
                    setUpCustomStyling()
                }.show()
            }
        }
    }

    private fun Snackbar.setUpActionButton() {
        if (isDisplayActionButtonEnabled) {
            setAction(R.string.snackbars_experiments_action_button) {
                Toast.makeText(
                    this@SnackbarsExperimentsActivity,
                    "Action from Snack",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun Snackbar.setUpCustomStyling() {
        if (applyCustomStyling) {
            setTextColor(
                ContextCompat.getColor(this@SnackbarsExperimentsActivity, R.color.blue)
            )
            setBackgroundTint(
                ContextCompat.getColor(this@SnackbarsExperimentsActivity, R.color.black)
            )
            animationMode = Snackbar.ANIMATION_MODE_SLIDE
            setActionTextColor(
                ContextCompat.getColor(this@SnackbarsExperimentsActivity, R.color.yellow)
            )
        }
    }
}
