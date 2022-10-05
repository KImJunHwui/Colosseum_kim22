package com.kim.colosseum_kim2

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setUpEvents()
    abstract fun setValues()

}