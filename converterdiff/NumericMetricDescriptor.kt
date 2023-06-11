package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractMetricDescriptor
import org.somda.protosdc.biceps.model.Range
import java.math.BigDecimal
import kotlin.time.Duration

data class NumericMetricDescriptor (
    val abstractMetricDescriptor: AbstractMetricDescriptor,
    val technicalRange: List<Range> = listOf(),
    val resolutionAttr: BigDecimal,
    val averagingPeriodAttr: Duration? = null,
)
