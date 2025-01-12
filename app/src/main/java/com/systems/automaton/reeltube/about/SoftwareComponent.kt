package com.systems.automaton.reeltube.about

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class SoftwareComponent
@JvmOverloads
constructor(
    val name: String,
    val years: String,
    val copyrightOwner: String,
    val link: String,
    val license: License,
    val version: String? = null
) : Parcelable
