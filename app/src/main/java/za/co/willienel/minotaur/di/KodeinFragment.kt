package za.co.willienel.minotaur.di

import android.os.Bundle
import org.kodein.di.KodeinAware
import org.kodein.di.KodeinTrigger
import org.kodein.di.android.x.kodein
import za.co.willienel.minotaur.ui.base.BaseFragment

abstract class KodeinFragment : BaseFragment(), KodeinAware {

    override val kodein by kodein()
    override val kodeinTrigger = KodeinTrigger()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        kodeinTrigger.trigger()
    }
}