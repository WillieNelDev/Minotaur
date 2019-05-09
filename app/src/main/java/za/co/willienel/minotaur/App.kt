package za.co.willienel.minotaur

import android.os.StrictMode
import com.squareup.leakcanary.LeakCanary
import za.co.willienel.minotaur.di.KodeinApp


class App : KodeinApp() {

    override fun onCreate() {
        configureStrictMode()
        super.onCreate()

        if (LeakCanary.isInAnalyzerProcess(this)) {
            return
        }

        LeakCanary.install(this)
    }

    private fun configureStrictMode() {

        if (BuildConfig.DEBUG) {

            StrictMode.setThreadPolicy(
                StrictMode.ThreadPolicy.Builder()
                    .detectAll()
                    .penaltyLog()
                    .build()
            )

            StrictMode.setVmPolicy(
                StrictMode.VmPolicy.Builder()
                    .detectAll()
                    .penaltyLog()
                    .build()
            )
        }
    }
}