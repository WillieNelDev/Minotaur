package za.co.williewikkelspies.minotaur.di

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import za.co.williewikkelspies.minotaur.di.modules.factoryModule
import za.co.williewikkelspies.minotaur.di.modules.smsListModule

abstract class KodeinApp : Application(), KodeinAware {

    override val kodein by Kodein.lazy {

        import(smsListModule)
        import(factoryModule)
    }
}