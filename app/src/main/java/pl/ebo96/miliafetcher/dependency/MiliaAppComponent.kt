package pl.ebo96.miliafetcher.dependency

import dagger.Component
import pl.ebo96.miliafetcher.BaseActivity
import pl.ebo96.miliafetcher.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [DatabaseModule::class])
interface MiliaAppComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(mainActivity: BaseActivity)
}