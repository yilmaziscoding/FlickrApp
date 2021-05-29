package com.example.flickrapp

import android.bluetooth.BluetoothHidDeviceAppSdpSettings
import android.os.Bundle
import android.provider.ContactsContract
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.browse.*
import kotlinx.android.synthetic.main.content_user_details.*

class UserDetailsActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_details)

        activateToolbar(true)

  //      val photo = intent.getParcelableExtra<android.os.Parcelable>(PHOTO_TRANSFER) as Photo
        val photo = intent.extras?.getParcelable<Photo>(PHOTO_TRANSFER) as Photo
        

//        photo_title.text = "Title: " + photo.title
        photo_title.text = resources.getString(R.string.photo_title_text,photo.title)
//        photo_tags.text = "Tags: " + photo.tags
        photo_tags.text = resources.getString(R.string.photo_tags_text,photo.tags)
        photo_author.text = photo.author

        Picasso.with(this).load(photo.link)
            .error(R.drawable.placeholder)
            .placeholder(R.drawable.placeholder)
            .into(photo_image)






    }
}