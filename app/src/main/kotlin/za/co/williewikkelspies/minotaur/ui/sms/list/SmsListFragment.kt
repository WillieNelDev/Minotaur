package za.co.williewikkelspies.minotaur.ui.sms.list

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import org.kodein.di.generic.instance
import za.co.williewikkelspies.minotaur.di.KodeinFragment

class SmsListFragment : KodeinFragment() {

    private val viewModelFactory: ViewModelProvider.Factory by instance()

    private lateinit var smsListViewModel: SmsListViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        smsListViewModel = ViewModelProviders.of(this, viewModelFactory).get(SmsListViewModel::class.java)
    }

    override fun registerViewListener() {
    }

    override fun unregisterViewListener() {
    }

    override fun registerViewModelListeners() {
    }

    override fun unregisterViewModelListeners() {
    }
}