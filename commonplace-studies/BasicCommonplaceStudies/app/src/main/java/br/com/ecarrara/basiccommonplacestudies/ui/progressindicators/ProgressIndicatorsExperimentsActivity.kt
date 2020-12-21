package br.com.ecarrara.basiccommonplacestudies.ui.progressindicators

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.ecarrara.basiccommonplacestudies.databinding.ActivityProgressIndicatorsExperimentsBinding

private const val INITIAL_PROGRESS = 25

class ProgressIndicatorsExperimentsActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityProgressIndicatorsExperimentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityProgressIndicatorsExperimentsBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        setUpNativeProgressIndicators()
    }

    private fun setUpNativeProgressIndicators() {
        with(viewBinding) {
            nativeDeterminateProgressTextInputEditText.setText(INITIAL_PROGRESS.toString())

            determinateNativeProgress.progress = INITIAL_PROGRESS
            materialCircularDeterminateProgressIndicator.progress = INITIAL_PROGRESS
            materialLinearDeterminateProgressIndicator.progress = INITIAL_PROGRESS

            setNativeDeterminateProgressButton.setOnClickListener {
                determinateNativeProgress.progress =
                    nativeDeterminateProgressTextInputEditText.text.toString().toInt()
            }

            setNativeDeterminateProgressButton.setOnClickListener {
                val progress = nativeDeterminateProgressTextInputEditText.text.toString().toInt()
                determinateNativeProgress.progress = progress
                materialCircularDeterminateProgressIndicator.progress = progress
                materialLinearDeterminateProgressIndicator.progress = progress
            }
        }
    }
}
