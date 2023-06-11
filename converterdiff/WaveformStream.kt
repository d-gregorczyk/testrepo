package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractReport
import org.somda.protosdc.biceps.model.RealTimeSampleArrayMetricState

data class WaveformStream (
    val abstractReport: AbstractReport,
    val state: List<RealTimeSampleArrayMetricState> = listOf(),
)
