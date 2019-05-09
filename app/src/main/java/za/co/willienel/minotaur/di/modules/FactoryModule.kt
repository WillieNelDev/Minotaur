package za.co.willienel.minotaur.di.modules

import androidx.lifecycle.ViewModelProvider
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton
import org.kodein.di.weakReference
import za.co.willienel.minotaur.ui.base.factory.ViewModelFactory

val factoryModule = Kodein.Module("factoryModule") {

    bind<ViewModelProvider.Factory>() with singleton(ref = weakReference) { ViewModelFactory(kodein) }
}