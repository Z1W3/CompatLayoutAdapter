package catt.compat.layout.enums

import android.support.annotation.IntDef


@IntDef(
    Units.COMPLEX_UNIT_WIDTH,
    Units.COMPLEX_UNIT_HEIGHT,

    Units.COMPLEX_UNIT_MARGIN_START,
    Units.COMPLEX_UNIT_MARGIN_END,
    Units.COMPLEX_UNIT_LEFT_MARGIN,
    Units.COMPLEX_UNIT_RIGHT_MARGIN,
    Units.COMPLEX_UNIT_TOP_MARGIN,
    Units.COMPLEX_UNIT_BOTTOM_MARGIN,

    Units.COMPLEX_UNIT_PADDING_TOP,
    Units.COMPLEX_UNIT_PADDING_BOTTOM,
    Units.COMPLEX_UNIT_PADDING_START,
    Units.COMPLEX_UNIT_PADDING_END,
    Units.COMPLEX_UNIT_PADDING_LEFT,
    Units.COMPLEX_UNIT_PADDING_RIGHT,

    Units.COMPLEX_UNIT_TEXT_SIZE,
    Units.COMPLEX_UNIT_LINE_SPACING_EXTRA,

    Units.COMPLEX_UNIT_RADIUS,
    Units.COMPLEX_UNIT_BOTTOM_LEFT_RADIUS,
    Units.COMPLEX_UNIT_BOTTOM_RIGHT_RADIUS,
    Units.COMPLEX_UNIT_TOP_LEFT_RADIUS,
    Units.COMPLEX_UNIT_TOP_RIGHT_RADIUS
)
@Retention(AnnotationRetention.SOURCE)
annotation class UnitClubs