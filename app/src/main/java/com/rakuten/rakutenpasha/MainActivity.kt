package com.rakuten.rakutenpasha

import android.content.ComponentName
import android.net.Uri
import android.os.Bundle
import android.util.Log

import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import androidx.browser.customtabs.CustomTabsClient


import androidx.browser.customtabs.CustomTabsIntent
import androidx.browser.customtabs.CustomTabsServiceConnection
import androidx.browser.customtabs.TrustedWebUtils
import androidx.fragment.app.FragmentActivity
import android.content.Intent




class MainActivity : AppCompatActivity() {

    private val SESSION_ID = 96375
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val customTabsIntent = CustomTabsIntent.Builder().build()

//        val intent = Intent(this, CameraActivity::class.java)
//        intent.putExtra("samplename", "abd")
//        startActivity(intent)

        var url = "https://pasha.rakuten.co.jp/today";
        var builder =  CustomTabsIntent.Builder();
        var customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(url));

//        TrustedWebUtils.launchAsTrustedWebActivity(
//            MainActivity.this,
//            mCustomTabsIntent,
//            Uri.parse("https://twa-demo.firebaseapp.com/"));
//    }
//        setContentView(R.layout.activity_main)
//        setSupportActionBar(toolbar)
//
//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

//    private inner class TwaCustomTabsServiceConnection : CustomTabsServiceConnection() {
//
//        override fun onCustomTabsServiceConnected(
//            componentName: ComponentName,
//            client: CustomTabsClient
//        ) {
//
//            // Creates a CustomTabsSession with a constant session id.
//            val session = client.newSession(null, SESSION_ID)
//
//            // Creates a CustomTabsIntent to launch the Trusted Web Activity.
//            mCustomTabsIntent = CustomTabsIntent.Builder(session).build()
//        }
//
//        override fun onServiceDisconnected(componentName: ComponentName) {
//            Log.d(FragmentActivity.TAG, "Twa CustomTab Service Disconnected")
//        }
//    }
}
