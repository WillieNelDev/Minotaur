package za.co.williewikkelspies.minotaur.domain.sms

interface SmsRepository {

    fun getSmsList(): List<Sms>
}