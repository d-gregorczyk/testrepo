package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractSet
import org.somda.protosdc.biceps.model.AbstractMetricStateOneOf

data class SetMetricState (
    val abstractSet: AbstractSet,
    val proposedMetricState: List<AbstractMetricStateOneOf> = listOf(),
)
