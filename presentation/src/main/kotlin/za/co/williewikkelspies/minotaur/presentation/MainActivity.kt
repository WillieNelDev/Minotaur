package za.co.williewikkelspies.minotaur.presentation

import android.os.Bundle
import za.co.williewikkelspies.minotaur.R
import za.co.williewikkelspies.minotaur.presentation.base.BaseActivity
import za.co.williewikkelspies.minotaur.presentation.sms.list.SmsListFragment

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            addRootFragment(SmsListFragment())
        }
    }
}
