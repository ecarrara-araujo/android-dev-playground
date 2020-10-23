package br.com.ecarrara.compose_codelab_layout

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.ConstraintLayout
import androidx.compose.foundation.layout.Dimension
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import br.com.ecarrara.compose_codelab_layout.ui.ComposeCodelabLayoutTheme

@Composable
fun ConstraintLayoutContent() {
    ConstraintLayout {
        val (button1, button2, text) = createRefs()

        Button(
            onClick = { /* will do something */ },
            // Assign the reference "button" to the Button composable
            // and constrain it to the top of the ConstraintLayout
            modifier = Modifier.constrainAs(button1) {
                top.linkTo(parent.top, margin = 16.dp)
            }
        ) {
            Text(text = "Button 1")
        }

        // Assign reference "text" to the Text Composable
        // and constrain it to the Bottom of the Button composable
        Text(
            text = "Text",
            modifier = Modifier.constrainAs(text) {
                top.linkTo(button1.bottom, margin = 16.dp)
                // centers the text horizontally in the ConstraintLayout
//                centerHorizontallyTo(parent)
                centerAround(button1.end)
            }
        )

        val barrier = createEndBarrier(button1, text)
        Button(
            onClick = { /* will do something */ },
            modifier = Modifier.constrainAs(button2) {
                top.linkTo(parent.top, margin = 16.dp)
                start.linkTo(barrier)
            }
        ) {
            Text(text = "Button 2")
        }
    }
}

@Preview
@Composable
fun ConstraintLayoutContentPreview() {
    ComposeCodelabLayoutTheme {
        ConstraintLayoutContent()
    }
}


@Composable
fun ConstraintLayoutWithLongTexts() {
    ConstraintLayout {
        val text = createRef()

        val guideline = createGuidelineFromStart(fraction = 0.5f)

        Text(
            text = "This is a very very very very very very very long text",
            modifier = Modifier.constrainAs(text) {
                linkTo(start = guideline, end = parent.end)
                width = Dimension.preferredWrapContent
            }
        )
    }
}

@Preview
@Composable
fun ConstraintLayoutWithLongTextsPreview() {
    ComposeCodelabLayoutTheme {
        ConstraintLayoutWithLongTexts()
    }
}
