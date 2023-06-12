package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractMetricValue
import org.somda.protosdc.biceps.model.RealTimeValueType

data class SampleArrayValue(
    val abstractMetricValue: AbstractMetricValue,
    val applyAnnotation: List<ApplyAnnotation> = listOf(),
    val samplesAttr: RealTimeValueType? = null,
) {
    data class ApplyAnnotation(
        val annotationIndexAttr: Int,
        val sampleIndexAttr: Int,
    )
}
