package za.co.willienel.minotaur.ui

import android.os.Bundle
import za.co.willienel.minotaur.R
import za.co.willienel.minotaur.di.KodeinActivity

class MainActivity : KodeinActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
