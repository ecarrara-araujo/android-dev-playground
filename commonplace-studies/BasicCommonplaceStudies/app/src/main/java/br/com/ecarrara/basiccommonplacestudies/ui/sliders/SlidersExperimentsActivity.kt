package br.com.ecarrara.basiccommonplacestudies.ui.sliders

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.ecarrara.basiccommonplacestudies.databinding.ActivitySlidersExperimentsBinding
import br.com.ecarrara.basiccommonplacestudies.extensions.showToast
import com.google.android.material.slider.Slider
import java.text.NumberFormat
import java.util.*

class SlidersExperimentsActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivitySlidersExperimentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySlidersExperimentsBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        setUpSliders()
    }

    private fun setUpSliders() {
        viewBinding.simpleContinuousSlider.addOnSliderTouchListener(
            object : Slider.OnSliderTouchListener {
                override fun onStartTrackingTouch(slider: Slider) {
                    showToast("Slider Touch Tracking Started")
                }

                override fun onStopTrackingTouch(slider: Slider) {
                    showToast("Slider Touch Tracking Stopped")
                    showToast("Final Value Selected: ${slider.value}")
                }
            }
        )
        viewBinding.simpleContinuousSlider.addOnChangeListener { slider, value, fromUser ->
            showToast("Continuous Slider Value Changed to: $value")
        }
        viewBinding.styledContinuousRangeSlider.setLabelFormatter { value ->
            NumberFormat.getCurrencyInstance().apply {
                maximumFractionDigits = 2
                currency = Currency.getInstance("GBP")

            }.format(value.toDouble())
        }
        viewBinding.styledDiscreteRangeSlider.setLabelFormatter { value ->
            NumberFormat.getCurrencyInstance().apply {
                maximumFractionDigits = 0
                currency = Currency.getInstance("GBP")

            }.format(value.toDouble())
        }
    }
}
