package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractMetricState
import org.somda.protosdc.biceps.model.StringMetricValue

data class StringMetricState (
    val abstractMetricState: AbstractMetricState,
    val metricValue: StringMetricValue? = null,
)
