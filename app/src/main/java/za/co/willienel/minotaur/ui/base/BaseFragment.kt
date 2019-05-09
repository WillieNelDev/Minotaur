package za.co.willienel.minotaur.ui.base

import androidx.fragment.app.Fragment
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import za.co.willienel.minotaur.ui.base.listeners.ViewListener
import za.co.willienel.minotaur.ui.base.listeners.ViewModelListener

abstract class BaseFragment : Fragment() {

    private val subscriptions: CompositeDisposable = CompositeDisposable()

    override fun onResume() {
        super.onResume()
        registerListeners()
    }

    private fun registerListeners() {

        if (this is ViewListener) {
            registerViewListener()
        }

        if (this is ViewModelListener) {
            registerViewModelListener()
        }
    }

    override fun onPause() {
        super.onPause()
        unregisterListeners()
    }

    private fun unregisterListeners() {

        if (this is ViewListener) {
            unregisterViewListener()
        }

        if (this is ViewModelListener) {
            unregisterViewModelListener()
        }
    }

    override fun onDestroy() {
        clearSubscriptions()
        super.onDestroy()
    }

    fun addSubscription(disposable: Disposable) {
        subscriptions.add(disposable)
    }

    private fun clearSubscriptions() {
        subscriptions.clear()
    }
}