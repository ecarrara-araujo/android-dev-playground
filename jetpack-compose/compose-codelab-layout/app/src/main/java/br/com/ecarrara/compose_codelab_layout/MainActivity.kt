package br.com.ecarrara.compose_codelab_layout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalanceWallet
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import br.com.ecarrara.compose_codelab_layout.ui.ComposeCodelabLayoutTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCodelabLayoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    LayoutsCodelab()
                }
            }
        }
    }
}

@Composable
fun LayoutsCodelab() {
    Scaffold(
            topBar = {
                TopAppBar(
                        title = {
                            Text(text = "LayoutsCodelab")
                        },
                        actions = {
                            IconButton(onClick = { /* Do nothing for now */ }) {
                                Icon(Icons.Filled.AccountBalanceWallet)
                            }
                        }
                )
            },
            bottomBar = {
                BottomAppBar {
                    IconButton(onClick = { /* Do nothing for now */ }) {
                        Icon(Icons.Filled.Star)
                    }
                }
            },
            drawerContent = {
                Text(text = "Wololo menu")
            }
    ) { innerPadding ->
        BodyContent(Modifier.padding(innerPadding).padding(8.dp))
    }
}

@Composable
fun BodyContent(modifier: Modifier = Modifier) {
    Column(modifier) {
        Text(text = "Hi there!")
        Text(text = "Thanks for going through the Layouts Codelab")
    }
}

@Preview
@Composable
fun LayoutsCodelabPreview() {
    ComposeCodelabLayoutTheme {
        LayoutsCodelab()
    }
}


@Composable
fun PhotographerCard(modifier: Modifier = Modifier) {
    Row(modifier
            .padding(8.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(MaterialTheme.colors.surface)
            .clickable(onClick = { /* Does nothing for now */ })
            .padding(16.dp)
    ) {
        Surface(
                modifier = Modifier.preferredSize(50.dp),
                shape = CircleShape,
                color = MaterialTheme.colors.onSurface.copy(alpha = 0.2f)
        ) {

        }
        Column(
                modifier = Modifier
                        .padding(start = 8.dp)
                        .align(Alignment.CenterVertically)
        ) {
            Text(text = "Alfred Sisley", fontWeight = FontWeight.Bold)
            ProvideEmphasis(AmbientEmphasisLevels.current.medium) {
                Text(text = "3 minutes ago", style = MaterialTheme.typography.body2)
            }
        }
    }
}

@Preview
@Composable
fun PhotographerCardPreview() {
    ComposeCodelabLayoutTheme {
        PhotographerCard()
    }
}
