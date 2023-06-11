package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractMetricValue

data class StringMetricValue (
    val abstractMetricValue: AbstractMetricValue,
    val valueAttr: String? = null,
)
