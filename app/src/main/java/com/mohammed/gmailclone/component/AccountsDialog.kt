package com.mohammed.gmailclone.component

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.outlined.ManageAccounts
import androidx.compose.material.icons.outlined.PersonAddAlt
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.mohammed.gmailclone.R
import com.mohammed.gmailclone.accountList
import com.mohammed.gmailclone.model.Account

@Composable
fun AccountsDialog(openDialog: MutableState<Boolean>) {
    Dialog(onDismissRequest = { openDialog.value = false },
        properties = DialogProperties(dismissOnClickOutside = false)) {
        AccountDialogUi(openDialog)
    }
}


@Composable
fun AccountDialogUi(openDialog: MutableState<Boolean>,modifier: Modifier = Modifier) {
    Card {
        Column(modifier.padding(bottom = 16.dp)) {

            Row(
                modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { openDialog.value = false }) {
                    Icon(Icons.Filled.Close, contentDescription = "Close")
                }
                Image(
                    painter = painterResource(id = R.drawable.google), contentDescription = null,
                    modifier
                        .size(30.dp)
                        .weight(2.0f)
                )
            }

            AccountItem(account = accountList[0], modifier)

            Row(
                modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Card(
                    shape = RoundedCornerShape(50.dp),
                    modifier = modifier.requiredWidth(150.dp),
                    border = BorderStroke(1.dp, Color.Gray)
                ) {
                    Text(
                        text = "Google Account",
                        modifier.padding(8.dp),
                        textAlign = TextAlign.Center
                    )
                }
            }

            Divider(modifier.padding(top = 16.dp))

            AccountItem(account = accountList[1], modifier)
            AccountItem(account = accountList[2], modifier)

            AddAccount(
                icon = Icons.Outlined.PersonAddAlt,
                title = "Add another account"
            )
            AddAccount(
                icon = Icons.Outlined.ManageAccounts,
                title = "Manage account on this device"
            )

            Divider(modifier.padding(top = 16.dp))

            Row(
                modifier
                    .padding(start = 16.dp, top = 16.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Privacy Policy")
                Card(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .size(4.dp),
                    shape = CircleShape,
                    backgroundColor = Color.Black
                ) {}
                Text(text = "Terms Of Service")
            }
        }

    }
}


@Composable
private fun AccountItem(account: Account, modifier: Modifier) {
    Row(
        modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 16.dp)
    ) {

        if (account.icon != null) {
            Image(
                painter = painterResource(id = account.icon),
                contentDescription = "Image profile",
                modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colors.onBackground)
            )
        } else {
            Card(
                modifier = modifier
                    .padding(8.dp)
                    .size(40.dp)
                    .clip(CircleShape),
                backgroundColor = Color.Green
            ) {
                Text(
                    text = account.userName.first().uppercase(),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }

        Column(
            modifier
                .weight(2.0f)
                .padding(start = 16.dp, bottom = 16.dp)
        ) {
            Text(text = account.userName, fontWeight = FontWeight.SemiBold)
            Text(text = account.email, fontSize = 12.sp)
        }

        Text(text = "${account.unReadMails}+", modifier.padding(start = 16.dp, end = 16.dp))
    }
}

@Composable
fun AddAccount(icon: ImageVector, title: String) {
    Row(
        modifier = Modifier
            .padding(start = 16.dp, top = 16.dp)
            .fillMaxWidth()
    ) {
        Icon(imageVector = icon, contentDescription = null)
        Text(
            text = title,
            modifier = Modifier
                .weight(2.0f)
                .padding(start = 16.dp)
        )
    }
}

@SuppressLint("UnrememberedMutableState")
@Preview(showBackground = true)
@Composable
fun AccountDialogUiPreview() {
    AccountDialogUi(openDialog = mutableStateOf(false))
}
