package io.idnow.docidv.sample

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController

class MainActivity : FragmentActivity() {
    // =============================================================================================
    // Activity methods
    // =============================================================================================
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        findNavController(R.id.container).handleDeepLink(intent)
    }
}