package com.example.navigation

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Student(val name : String, val id: Long) : Parcelable {
}