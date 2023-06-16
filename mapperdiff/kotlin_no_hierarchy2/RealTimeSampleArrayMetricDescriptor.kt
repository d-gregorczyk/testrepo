package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractMetricDescriptor
import org.somda.protosdc.biceps.model.Range
import java.math.BigDecimal
import kotlin.time.Duration

data class RealTimeSampleArrayMetricDescriptor(
    val abstractMetricDescriptor: AbstractMetricDescriptor,
    val technicalRange: List<Range> = listOf(),
    val resolutionAttr: BigDecimal,
    val samplePeriodAttr: Duration,
)
