package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractMetricState
import org.somda.protosdc.biceps.model.NumericMetricValue
import org.somda.protosdc.biceps.model.Range
import kotlin.time.Duration

data class NumericMetricState(
    val abstractMetricState: AbstractMetricState,
    val metricValue: NumericMetricValue? = null,
    val physiologicalRange: List<Range> = listOf(),
    val activeAveragingPeriodAttr: Duration? = null,
)
