package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.Timestamp
import org.somda.protosdc.biceps.model.MeasurementValidity
import org.somda.protosdc.biceps.model.GenerationMode
import org.somda.protosdc.biceps.model.QualityIndicator
import org.somda.protosdc.biceps.model.CodedValue

data class AbstractMetricValue(
    val extensionElement: Extension? = null,
    data class MetricQuality(
        val extensionElement: Extension? = null,
        val validityAttr: MeasurementValidity,
        val modeAttr: GenerationMode? = null,
        val qiAttr: QualityIndicator? = null,
    )
    val metricQuality: MetricQuality,
    data class Annotation(
        val extensionElement: Extension? = null,
        val type: CodedValue,
    )
    val annotation: List<Annotation> = listOf(),
    val startTimeAttr: Timestamp? = null,
    val stopTimeAttr: Timestamp? = null,
    val determinationTimeAttr: Timestamp? = null,
)
