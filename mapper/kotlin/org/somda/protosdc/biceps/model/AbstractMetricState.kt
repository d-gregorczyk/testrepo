package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractState
import org.somda.protosdc.biceps.model.CodedValue
import org.somda.protosdc.biceps.model.PhysicalConnectorInfo
import org.somda.protosdc.biceps.model.ComponentActivation
import kotlin.time.Duration

data class AbstractMetricState(
    val abstractState: AbstractState,
val bodySite: List<CodedValue> = listOf(),
    val physicalConnector: PhysicalConnectorInfo? = null,
    val activationStateAttr: ComponentActivation? = null,
    val activeDeterminationPeriodAttr: Duration? = null,
    val lifeTimePeriodAttr: Duration? = null,
)
