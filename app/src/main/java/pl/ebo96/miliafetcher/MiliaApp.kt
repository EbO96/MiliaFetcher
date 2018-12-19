package pl.ebo96.miliafetcher

import android.app.Application
import pl.ebo96.miliafetcher.dependency.DaggerMiliaAppComponent
import pl.ebo96.miliafetcher.dependency.DatabaseModule
import pl.ebo96.miliafetcher.dependency.MiliaAppComponent

class MiliaApp : Application() {

    lateinit var miliaAppComponent: MiliaAppComponent

    override fun onCreate() {
        super.onCreate()
        miliaAppComponent = DaggerMiliaAppComponent
            .builder()
            .databaseModule(DatabaseModule(this))
            .build()
    }
}