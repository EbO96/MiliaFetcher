package pl.ebo96.miliafetcher

import android.os.Bundle
import pl.ebo96.miliafetcher.database.MyImageDao
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var myImageDao: MyImageDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.inject(this)
        myImageDao
    }
}
