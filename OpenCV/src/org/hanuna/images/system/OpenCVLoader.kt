package org.hanuna.images.system

import org.opencv.core.Core

/**
 * Created by smevok on 5/11/14.
 */

public fun loadOpenCV() {
    System.loadLibrary("${Core.NATIVE_LIBRARY_NAME}")
}