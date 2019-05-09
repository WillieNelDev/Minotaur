package za.co.willienel.minotaur.ui.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import io.reactivex.Completable
import za.co.willienel.minotaur.R
import za.co.willienel.minotaur.di.KodeinFragment
import java.util.concurrent.TimeUnit

class SplashFragment : KodeinFragment() {

    private lateinit var splashView: SplashView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        splashView = SplashView(inflater.inflate(R.layout.fragment_splash, container, false))
        return splashView.getRootView()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addSubscription(
            Completable
                .timer(3, TimeUnit.SECONDS)
                .subscribe {
                    findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToMainFragment())
                }
        )
    }
}