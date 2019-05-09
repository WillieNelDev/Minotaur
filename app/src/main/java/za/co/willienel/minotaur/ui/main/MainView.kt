package za.co.willienel.minotaur.ui.main

import android.view.View
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.fragment_main.view.*

class MainView(private val rootView: View) {

    fun getRootView(): View {
        return rootView
    }

    fun getToolbar(): Toolbar {
        return rootView.toolbar
    }
}