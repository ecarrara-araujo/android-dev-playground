package br.com.ecarrara.bottomsheetexperiments.dialogfragment

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import br.com.ecarrara.bottomsheetexperiments.R
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

/**
 * This Dialog has an EditText that must be completely visible
 */
class BSDialogWithEditTextFragment : BottomSheetDialogFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NORMAL, R.style.EditTextAdjustResizeDialogStyle)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bsdialog_with_edit_text, container, false)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.setOnShowListener {
            // This is needed because the BottomSheetDialog does not update the state in the BottomSheetBehavior
            // when it is opened. In our case we have an edit text and when they keyboard opens it causes a layout
            // update, if the BottomSheetBehavior state is not updated the Dialog will only be opened to the size of
            // its peek height (or min peek height), updating the state after the dialog is shown fixes that.
            (it as? BottomSheetDialog)?.behavior?.run { state = BottomSheetBehavior.STATE_EXPANDED }
        }
        return dialog
    }

    companion object {
        @JvmStatic
        fun show(fragmentManager: FragmentManager) =
            BSDialogWithEditTextFragment().show(fragmentManager, null)
    }
}
