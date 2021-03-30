package br.com.ecarrara.basiccommonplacestudies.ui.lists.carousels

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.ecarrara.basiccommonplacestudies.databinding.ActivityListWithCarouselsExperimentsBinding

class ListWithCarouselsExperimentsActivity : AppCompatActivity() {

    private lateinit var screenBinding: ActivityListWithCarouselsExperimentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        screenBinding = ActivityListWithCarouselsExperimentsBinding.inflate(layoutInflater)
        setContentView(screenBinding.root)
    }
}
