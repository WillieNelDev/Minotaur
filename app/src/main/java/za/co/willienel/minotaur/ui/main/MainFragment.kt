package za.co.willienel.minotaur.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import za.co.willienel.minotaur.R
import za.co.willienel.minotaur.di.KodeinFragment

class MainFragment : KodeinFragment() {

    private lateinit var mainView: MainView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mainView = MainView(inflater.inflate(R.layout.fragment_main, container, false))
        return mainView.getRootView()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (activity as AppCompatActivity).setSupportActionBar(mainView.getToolbar())
    }
}