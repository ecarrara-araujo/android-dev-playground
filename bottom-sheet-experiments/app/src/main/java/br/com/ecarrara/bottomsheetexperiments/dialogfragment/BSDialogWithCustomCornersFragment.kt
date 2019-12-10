package br.com.ecarrara.bottomsheetexperiments.dialogfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import br.com.ecarrara.bottomsheetexperiments.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

/**
 * This Dialog must have the top corners rounded.
 */
class BSDialogWithCustomCornersFragment : BottomSheetDialogFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NORMAL, R.style.RoundedCornersBottomSheetDialogTheme)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bsdialog_with_custom_corners, container, false)
    }

    companion object {
        @JvmStatic
        fun show(fragmentManager: FragmentManager) =
            BSDialogWithCustomCornersFragment().show(fragmentManager, null)
    }
}
