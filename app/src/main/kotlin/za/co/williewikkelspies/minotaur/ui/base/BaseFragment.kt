package za.co.williewikkelspies.minotaur.ui.base

import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    abstract fun registerViewListener()
    abstract fun unregisterViewListener()
    abstract fun registerViewModelListeners()
    abstract fun unregisterViewModelListeners()

    override fun onResume() {
        super.onResume()
        registerViewListener()
        registerViewModelListeners()
    }

    override fun onPause() {
        super.onPause()
        unregisterViewListener()
        unregisterViewModelListeners()
    }
}