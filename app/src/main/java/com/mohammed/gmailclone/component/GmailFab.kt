package com.mohammed.gmailclone.component

import androidx.compose.foundation.ScrollState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun GmailFab(scrollState: ScrollState) {

    if (scrollState.value > 9) {
        FloatingActionButton(
            onClick = { /*TODO*/ },
            backgroundColor = MaterialTheme.colors.surface
        ) {
            Icon(Icons.Outlined.Edit, contentDescription = "")
        }
    } else {
        ExtendedFloatingActionButton(text = { Text(text = "Compose") },
            icon = { Icon(Icons.Outlined.Edit, contentDescription = "") },
            onClick = { /*TODO*/ })
    }


}