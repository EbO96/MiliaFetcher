package pl.ebo96.miliafetcher

import com.bumptech.glide.load.Options
import com.bumptech.glide.load.model.ModelLoader
import com.bumptech.glide.signature.ObjectKey
import java.nio.ByteBuffer

class MyImageModelLoader : ModelLoader<MyImage, ByteBuffer> {

    override fun buildLoadData(
        model: MyImage,
        width: Int,
        height: Int,
        options: Options
    ): ModelLoader.LoadData<ByteBuffer>? {
        return ModelLoader.LoadData(ObjectKey(model), UrlDataFetcher(model))
    }

    override fun handles(model: MyImage): Boolean {
        return model.photoUrl?.startsWith("http") ?: false
    }
}