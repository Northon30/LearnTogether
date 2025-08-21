package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                    ) {
                    LearningImage(
                        titre = stringResource(R.string.titre),
                        text1 = stringResource(R.string.text1),
                        text2 =stringResource(R.string.text2),
                    )
                }
            }
        }
    }
}


@Composable
fun LearningImage(titre: String, text1: String, text2: String, modifier: Modifier = Modifier) {
val image = painterResource(R.drawable.learnt)
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ){

        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier,


        )

        Text(
            text = titre,
            fontSize = 24.sp,
            modifier = modifier
                .padding(16.dp)
        )

        Text(
            text = text1,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                )
        )

        Text(
            text = text2,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(16.dp)

        )
    }
}



    @Preview(showBackground = true)
@Composable
fun LearnPreview() {
    LearnTogetherTheme {
        LearningImage(
            stringResource(R.string.titre),
            stringResource(R.string.text1),
            stringResource(R.string.text2)
        )
    }
}