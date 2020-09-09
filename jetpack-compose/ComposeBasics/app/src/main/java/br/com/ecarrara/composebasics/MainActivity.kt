package br.com.ecarrara.composebasics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }
}

@Composable
private fun NewsStory() {
    val image = imageResource(id = R.drawable.header)

    Column(Modifier.padding(16.dp)) {
        Image(
                image,
                Modifier
                        .preferredHeight(180.dp)
                        .fillMaxWidth(),
                contentScale = ContentScale.Crop
        )

        Spacer(Modifier.preferredHeight(16.dp))

        Text(text = "A day in Shark Fin Cove")
        Text(text = "Davenport, California")
        Text(text = "December 2018")
    }
}

@Preview
@Composable
private fun DefaultPreview() {
    NewsStory()
}
