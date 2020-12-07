package br.com.ecarrara.basiccommonplacestudies.ui.textfields

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import br.com.ecarrara.basiccommonplacestudies.R
import br.com.ecarrara.basiccommonplacestudies.databinding.ActivityTextFieldsExperimentsBinding

class TextFieldsExperimentsActivity : AppCompatActivity() {

    private lateinit var viewBindings: ActivityTextFieldsExperimentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBindings = ActivityTextFieldsExperimentsBinding.inflate(layoutInflater)
        setContentView(viewBindings.root)
        setUpDropDowns()
    }

    private fun setUpDropDowns() {
        val items = listOf("Abacaxi", "Laranja", "Chocolate")
        viewBindings.filledDropdownAutocompleteTextView.setAdapter(
            ArrayAdapter(this, R.layout.list_item_text_input_dropdown, items)
        )
        viewBindings.outlinedDropdownAutocompleteTextView.setAdapter(
            ArrayAdapter(this, R.layout.list_item_text_input_dropdown, items)
        )
    }
}
