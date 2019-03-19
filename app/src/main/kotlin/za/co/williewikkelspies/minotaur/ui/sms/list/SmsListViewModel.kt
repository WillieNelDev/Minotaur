package za.co.williewikkelspies.minotaur.ui.sms.list

import androidx.lifecycle.ViewModel
import za.co.williewikkelspies.minotaur.domain.sms.usecase.GetSmsListUseCase

class SmsListViewModel(private val getSmsListUseCase: GetSmsListUseCase) : ViewModel() {
}