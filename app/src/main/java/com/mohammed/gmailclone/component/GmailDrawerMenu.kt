package com.mohammed.gmailclone.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mohammed.gmailclone.menuList
import com.mohammed.gmailclone.model.DrawerMenuData


@Composable
fun GmailDrawerMenu(scrollState:ScrollState) {
    Column(modifier = Modifier.verticalScroll(scrollState)) {
        Text(
            text = "Gmail",
            color = Color.Red,
            modifier = Modifier.padding(top = 20.dp, start = 20.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        menuList.forEach { item ->
            when {
                item.isDivider -> {
                    Divider(modifier = Modifier.padding(top = 20.dp, bottom = 20.dp))
                }
                item.isHeader -> {
                    Text(
                        text = item.title!!,
                        fontWeight = FontWeight.Light,
                        modifier = Modifier.padding(top = 20.dp, bottom = 20.dp, start = 20.dp)
                    )
                }
                else -> {
                    MailDrawerItem(item)
                }
            }
        }
    }
}

@Composable
fun MailDrawerItem(item: DrawerMenuData) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .requiredHeight(50.dp)
            .padding(top = 16.dp)
    ) {
        Icon(
            imageVector = item.icon!!,
            contentDescription = item.title,
            modifier = Modifier
                .size(50.dp)
                .weight(0.5f)
        )
        Text(text = item.title!!, modifier = Modifier.weight(2.0f))
    }
}

