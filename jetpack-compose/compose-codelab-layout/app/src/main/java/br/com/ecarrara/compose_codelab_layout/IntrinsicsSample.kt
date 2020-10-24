package br.com.ecarrara.compose_codelab_layout

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import br.com.ecarrara.compose_codelab_layout.ui.ComposeCodelabLayoutTheme

@ExperimentalLayout
@Composable
fun TwoTexts(modifier: Modifier = Modifier, text1: String, text2: String) {
    Row (modifier = modifier.preferredHeight(IntrinsicSize.Min)) {
        Text(
            text = text1,
            modifier = Modifier.weight(1f)
                .padding(start = 4.dp)
                .wrapContentWidth(Alignment.CenterHorizontally)
                .align(Alignment.CenterVertically)
        )

        Divider(color = Color.Black, modifier = Modifier.fillMaxHeight().preferredWidth(1.dp))

        Text(
            text = text2,
            style = MaterialTheme.typography.h2,
            modifier = Modifier
                .weight(1f)
                .padding(end = 4.dp)
                .wrapContentWidth(Alignment.CenterHorizontally)
                .align(Alignment.CenterVertically)
        )
    }
}

@ExperimentalLayout
@Preview
@Composable
fun TwoTextsPreview() {
    ComposeCodelabLayoutTheme {
        Surface {
            TwoTexts(text1 = "Hi", text2 = "there")
        }
    }
}
