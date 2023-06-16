package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractMetricState
import org.somda.protosdc.biceps.model.SampleArrayValue
import org.somda.protosdc.biceps.model.Range

data class RealTimeSampleArrayMetricState(
    val abstractMetricState: AbstractMetricState,
    val metricValue: SampleArrayValue? = null,
val physiologicalRange: List<Range> = listOf(),
)
