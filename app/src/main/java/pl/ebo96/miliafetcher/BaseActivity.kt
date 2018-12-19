package pl.ebo96.miliafetcher

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity

@SuppressLint("Registered")
abstract class BaseActivity : AppCompatActivity() {

    val component by lazy { (application as MiliaApp).miliaAppComponent }
}