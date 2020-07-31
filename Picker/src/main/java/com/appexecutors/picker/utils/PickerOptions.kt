package com.appexecutors.picker.utils

import java.io.Serializable

class PickerOptions : Serializable{

    var maxCount = 10
    var allowFrontCamera = true
    var excludeVideos = false
    var maxVideoDuration = 30

    companion object{
        @JvmStatic
        fun init(): PickerOptions{
            return PickerOptions()
        }
    }
}