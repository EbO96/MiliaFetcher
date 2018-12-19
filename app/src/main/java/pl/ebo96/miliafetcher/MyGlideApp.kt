package pl.ebo96.miliafetcher

import android.content.Context
import com.bumptech.glide.Glide
import com.bumptech.glide.Registry
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import java.nio.ByteBuffer

@GlideModule
class MyGlideApp : AppGlideModule() {

    override fun registerComponents(context: Context, glide: Glide, registry: Registry) {
        registry.prepend(MyImage::class.java, ByteBuffer::class.java, MyImageModelLoaderFactory())
    }
}