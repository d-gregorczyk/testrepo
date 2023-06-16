package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractMetricDescriptor
import org.somda.protosdc.biceps.model.Range
import org.somda.protosdc.biceps.model.CodedValue
import java.math.BigDecimal

data class DistributionSampleArrayMetricDescriptor(
    val abstractMetricDescriptor: AbstractMetricDescriptor,
    val technicalRange: List<Range> = listOf(),
    val domainUnit: CodedValue,
    val distributionRange: Range,
    val resolutionAttr: BigDecimal,
)
