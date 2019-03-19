package za.co.williewikkelspies.minotaur.di.modules

import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import za.co.williewikkelspies.minotaur.data.sms.MockSmsRepository
import za.co.williewikkelspies.minotaur.domain.sms.SmsRepository
import za.co.williewikkelspies.minotaur.domain.sms.usecase.GetSmsListUseCase
import za.co.williewikkelspies.minotaur.ui.sms.list.SmsListViewModel

val smsListModule = Kodein.Module("smsListModule") {

    bind<SmsRepository>() with provider { MockSmsRepository() }

    bind<GetSmsListUseCase>() with provider { GetSmsListUseCase(instance()) }

    bind<SmsListViewModel>(tag = SmsListViewModel::class.java.simpleName) with provider { SmsListViewModel(instance()) }
}