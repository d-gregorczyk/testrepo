package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractMetricValue
import org.somda.protosdc.biceps.model.RealTimeValueType

data class SampleArrayValue(
    val abstractMetricValue: AbstractMetricValue,
    data class ApplyAnnotation(
        val annotationIndexAttr: Int,
        val sampleIndexAttr: Int,
    )
    val applyAnnotation: List<ApplyAnnotation> = listOf(),
    val samplesAttr: RealTimeValueType? = null,
)
