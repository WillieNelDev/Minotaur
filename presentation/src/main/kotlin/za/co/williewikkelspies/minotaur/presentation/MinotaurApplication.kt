package za.co.williewikkelspies.minotaur.presentation

import android.app.Application
import android.os.StrictMode
import com.squareup.leakcanary.LeakCanary
import za.co.williewikkelspies.minotaur.BuildConfig


class MinotaurApplication : Application() {

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