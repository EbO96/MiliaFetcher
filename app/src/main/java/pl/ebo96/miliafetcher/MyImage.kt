package pl.ebo96.miliafetcher

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MyImage(@PrimaryKey var photoId: Long = -1L) {

    var photoUrl: String? = ""

    override fun equals(other: Any?): Boolean {
        val otherImage = other as? MyImage ?: return false
        return otherImage.photoId == photoId &&
                otherImage.photoUrl == photoUrl
    }
}