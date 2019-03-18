package za.co.williewikkelspies.minotaur.di.modules

import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.provider
import za.co.williewikkelspies.minotaur.presentation.sms.list.SmsListViewModel

val smsListModule = Kodein.Module("smsListModule") {

    bind<SmsListViewModel>(tag = SmsListViewModel::class.java.simpleName) with provider { SmsListViewModel() }
}