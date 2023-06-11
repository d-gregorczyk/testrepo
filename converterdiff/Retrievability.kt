package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.RetrievabilityInfo

data class Retrievability (
    val by: List<RetrievabilityInfo> = listOf(),
    val mustUnderstandAttr: Boolean? = null,
)
