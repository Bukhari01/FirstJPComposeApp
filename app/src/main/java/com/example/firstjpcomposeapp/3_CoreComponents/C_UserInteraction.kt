package com.example.firstjpcomposeapp.`3_CoreComponents`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PartiallySelectable() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        SelectionContainer {
            Column {
                Text("This is a selectable text")
                Text("This is second Text")
                Text("This is the third Text")
                DisableSelection {
                    Text("But not this text")
                    Text("this is not selectable")
                }
            }
        }
    }
}




@Composable
fun AnnotatedStringWithListenerSample() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        val uriHandler = LocalUriHandler.current
        Text(
            buildAnnotatedString {
                append("Build better apps faster with")
                val link = LinkAnnotation.Url("https://www.youtube.com/",
                    TextLinkStyles(
                        SpanStyle(
                            color = Color.Blue
                        )
                    )
                ) {
                    val url =(it as LinkAnnotation.Url).url
                    uriHandler.openUri(url)
                }

                withLink(link){
                    append(" Youtube")
                }
            }
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewPartial() {
    AnnotatedStringWithListenerSample()
}
