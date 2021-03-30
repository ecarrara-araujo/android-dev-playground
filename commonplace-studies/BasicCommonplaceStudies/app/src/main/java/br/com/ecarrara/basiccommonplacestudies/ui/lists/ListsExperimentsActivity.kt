package br.com.ecarrara.basiccommonplacestudies.ui.lists

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.ecarrara.basiccommonplacestudies.databinding.ActivityListsExperimentsBinding
import br.com.ecarrara.basiccommonplacestudies.extensions.navigateTo
import br.com.ecarrara.basiccommonplacestudies.ui.lists.carousels.ListWithCarouselsExperimentsActivity

class ListsExperimentsActivity : AppCompatActivity() {

    private lateinit var screenBinding: ActivityListsExperimentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        screenBinding = ActivityListsExperimentsBinding.inflate(layoutInflater)
        setContentView(screenBinding.root)
        setUpButtons()
    }

    private fun setUpButtons() {
        screenBinding.openCarouselExperimentsButton.setOnClickListener {
            navigateTo(ListWithCarouselsExperimentsActivity::class.java)
        }
    }
}
