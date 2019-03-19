package za.co.williewikkelspies.minotaur.ui.base

import androidx.appcompat.app.AppCompatActivity
import za.co.williewikkelspies.minotaur.R

abstract class BaseActivity : AppCompatActivity() {

    fun addRootFragment(fragment: BaseFragment) {

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container_fragments, fragment, fragment::javaClass.name)
            .commit()
    }
}