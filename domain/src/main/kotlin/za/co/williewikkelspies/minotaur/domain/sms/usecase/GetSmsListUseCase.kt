package za.co.williewikkelspies.minotaur.domain.sms.usecase

import io.reactivex.Single
import za.co.williewikkelspies.minotaur.domain.sms.Sms
import za.co.williewikkelspies.minotaur.domain.sms.SmsRepository

class GetSmsListUseCase(private val smsRepository: SmsRepository) {

    fun getSmsList(): Single<List<Sms>> {

        val smsList = smsRepository.getSmsList()

        return Single.just(smsList)
    }
}