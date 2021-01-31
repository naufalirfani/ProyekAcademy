package com.naufal.proyekacademy.ui.bookmark

import com.naufal.proyekacademy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
