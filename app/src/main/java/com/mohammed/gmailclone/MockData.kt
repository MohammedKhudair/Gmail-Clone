package com.mohammed.gmailclone

import com.mohammed.gmailclone.model.Account
import com.mohammed.gmailclone.model.DrawerMenuData
import com.mohammed.gmailclone.model.MailData

val menuList = listOf(
    DrawerMenuData.Divider,
    DrawerMenuData.AllInboxes,
    DrawerMenuData.Divider,
    DrawerMenuData.Primary,
    DrawerMenuData.Social,
    DrawerMenuData.Promotions,
    DrawerMenuData.HeaderOne,
    DrawerMenuData.Starred,
    DrawerMenuData.Snoozed,
    DrawerMenuData.Important,
    DrawerMenuData.Sent,
    DrawerMenuData.Schedule,
    DrawerMenuData.Outbox,
    DrawerMenuData.Draft,
    DrawerMenuData.AllMail,
    DrawerMenuData.HeaderTwo,
    DrawerMenuData.Calendar,
    DrawerMenuData.Contacts,
    DrawerMenuData.Divider,
    DrawerMenuData.Setting,
    DrawerMenuData.Help
)

val mailList = listOf(
    MailData(
        mailId = 1,
        userName = "Christy",
        subject = "Weekly Android News",
        body = "Hello Christy we have got exciting addition  to the android api",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 2,
        userName = "Agatha",
        subject = "Job Application",
        body = "This is regarding a job opportunity I found on your website.",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 3,
        userName = "Cecilia",
        subject = "Flutter News",
        body = "Hello Cecilia we have got exciting addition  to the Flutter api",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 4,
        userName = "Angelo",
        subject = "Email regarding job opportunity",
        body = "This is regarding a job opportunity for the profile or android developer in our organisation.",
        timeStamp = "21:10"
    ),
    MailData(
        mailId = 5,
        userName = "Sam",
        subject = "New Event has been created",
        body = "A new event has been added to your dashboard go check it out",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 6,
        userName = "Medium",
        subject = "JetPack compose for beginners",
        body = "This article will teach you all the basics of jetpack compose.",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 7,
        userName = "Netflix",
        subject = "A new Device is using your account",
        body = "If you did not sign in with a new device then go to settings and reset your password",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 8,
        userName = "Collins",
        subject = "A request for partnership",
        body = "This is a follow up email about the partnership request",
        timeStamp = "20:50"
    ),
    MailData(
        mailId = 9,
        userName = "Amazon",
        subject = "Your account has been created",
        body = "If you did not sign in with a new device then go to settings and reset your password",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 10,
        userName = "Jobs",
        subject = "New opportunity that suits you",
        body = "We have an opening that suits your profile kindly check it out and indicate your interest",
        timeStamp = "20:10"
    )
)

val accountList = listOf(
    Account(
        icon = R.drawable.ic_launcher_foreground,
        userName = "Mohammed Khudair",
        email = "mohammed57@gmail.com",
        unReadMails = 99
    ),

    Account(
        userName = "Assad Salam",
        email = "assadsalam44@gmail.com",
        unReadMails = 78
    ),
    Account(
        userName = "Roya Mohammed",
        email = "roya54@gmail.com",
        unReadMails = 33
    )

)