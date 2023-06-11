package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Timestamp

data class TimeFrame(
    val startAttr: Timestamp? = null,
    val endAttr: Timestamp? = null,
)
