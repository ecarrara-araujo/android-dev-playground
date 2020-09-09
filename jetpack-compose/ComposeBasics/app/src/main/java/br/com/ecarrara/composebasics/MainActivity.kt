package br.com.ecarrara.composebasics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import br.com.ecarrara.composebasics.ui.typography

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
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(4.dp)),
                contentScale = ContentScale.Crop
        )

        Spacer(Modifier.preferredHeight(16.dp))

        Text(
                text = "A day wandering through the sandhills in Shark Fin Cove, " +
                        "and a few of the sights I saw",
                style = typography.h6,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
        )
        Text(
                text = "Davenport, California",
                style = typography.body2
        )
        Text(
                text = "December 2018",
                style = typography.body2
        )
    }
}

@Preview
@Composable
private fun DefaultPreview() {
    NewsStory()
}
