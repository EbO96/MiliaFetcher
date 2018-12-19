package pl.ebo96.miliafetcher

import com.bumptech.glide.load.model.ModelLoader
import com.bumptech.glide.load.model.ModelLoaderFactory
import com.bumptech.glide.load.model.MultiModelLoaderFactory
import java.nio.ByteBuffer

class MyImageModelLoaderFactory : ModelLoaderFactory<MyImage, ByteBuffer> {

    override fun build(multiFactory: MultiModelLoaderFactory): ModelLoader<MyImage, ByteBuffer> = MyImageModelLoader()

    override fun teardown() {
    }
}