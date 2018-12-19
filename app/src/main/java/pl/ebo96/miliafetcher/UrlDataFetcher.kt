package pl.ebo96.miliafetcher

import com.bumptech.glide.Priority
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.data.DataFetcher
import java.nio.ByteBuffer

class UrlDataFetcher(private val myImage: MyImage) : DataFetcher<ByteBuffer> {

    override fun getDataClass(): Class<ByteBuffer> = ByteBuffer::class.java

    override fun getDataSource(): DataSource = DataSource.REMOTE

    override fun loadData(priority: Priority, callback: DataFetcher.DataCallback<in ByteBuffer>) {

    }

    override fun cancel() {
    }

    override fun cleanup() {
    }
}