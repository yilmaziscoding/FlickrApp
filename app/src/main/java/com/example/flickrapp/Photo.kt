package com.example.flickrapp

import android.os.Parcelable
import android.util.Log
import kotlinx.android.parcel.Parcelize
import java.io.IOException
import java.io.ObjectStreamException
import java.io.Serializable

@Parcelize
class Photo(var title: String, var author: String, var authorId: String, var link: String, var tags: String, var image: String) : Parcelable

