package za.co.willienel.minotaur.di

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import za.co.willienel.minotaur.di.modules.factoryModule

abstract class KodeinApp : Application(), KodeinAware {

    override val kodein by Kodein.lazy {

        import(factoryModule)
    }
}