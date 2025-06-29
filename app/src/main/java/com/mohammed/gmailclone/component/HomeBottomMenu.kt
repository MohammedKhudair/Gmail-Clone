package com.mohammed.gmailclone.component

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mohammed.gmailclone.model.BottomMenuData

@Composable
fun HomeBottomMenu() {
    val menuItems = listOf(
        BottomMenuData.Mail,
        BottomMenuData.Meet
    )

    BottomNavigation(elevation = 3.dp) {
        menuItems.forEach {
            BottomNavigationItem(
                label = { Text(text = it.title) },
                selected = false,
                onClick = { /*TODO*/ },
                alwaysShowLabel = true,
                icon = { Icon(imageVector = it.icon, contentDescription = it.title) }
            )
        }
    }
}