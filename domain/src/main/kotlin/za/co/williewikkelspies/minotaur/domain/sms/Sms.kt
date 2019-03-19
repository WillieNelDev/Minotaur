package za.co.williewikkelspies.minotaur.domain.sms

import java.util.*

data class Sms(val id: Int, val threadId: Int, val address: Int, val body: String, val read: Boolean, val date: Date)