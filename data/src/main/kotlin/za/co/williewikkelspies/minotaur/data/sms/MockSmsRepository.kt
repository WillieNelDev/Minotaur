package za.co.williewikkelspies.minotaur.data.sms

import za.co.williewikkelspies.minotaur.domain.sms.Sms
import za.co.williewikkelspies.minotaur.domain.sms.SmsRepository
import java.util.*

class MockSmsRepository : SmsRepository {

    override fun getSmsList(): List<Sms> {

        val smsList = arrayListOf<Sms>()

        smsList.add(Sms(1, 1, 12345, "Test Sms 1", false, Date()))
        smsList.add(Sms(2, 1, 12345, "Test Sms 2", true, Date()))
        smsList.add(Sms(3, 2, 67890, "Test Sms 3", false, Date()))
        smsList.add(Sms(4, 2, 67890, "Test Sms 4", true, Date()))
        smsList.add(Sms(5, 1, 12345, "Test Sms 5", false, Date()))

        return smsList
    }
}