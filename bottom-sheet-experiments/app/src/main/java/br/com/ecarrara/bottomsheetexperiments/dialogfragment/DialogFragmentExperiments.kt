package br.com.ecarrara.bottomsheetexperiments.dialogfragment

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import br.com.ecarrara.bottomsheetexperiments.R

import kotlinx.android.synthetic.main.activity_dialog_fragment_experiments.*

class DialogFragmentExperiments : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_fragment_experiments)

        openBottomSheetWithEditText.setOnClickListener {
            BSDialogWithEditTextFragment.show(supportFragmentManager)
        }
    }

}
