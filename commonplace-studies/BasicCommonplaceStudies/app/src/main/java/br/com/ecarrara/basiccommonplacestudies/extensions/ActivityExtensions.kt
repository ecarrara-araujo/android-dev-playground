package br.com.ecarrara.basiccommonplacestudies.extensions

import android.app.Activity
import android.content.Intent

fun Activity.navigateTo(activityClass: Class<*>) {
    startActivity(Intent(this, activityClass))
}
