package za.co.williewikkelspies.minotaur.ui

import android.os.Bundle
import za.co.williewikkelspies.minotaur.R
import za.co.williewikkelspies.minotaur.ui.base.BaseActivity
import za.co.williewikkelspies.minotaur.ui.sms.list.SmsListFragment

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            addRootFragment(SmsListFragment())
        }
    }
}
