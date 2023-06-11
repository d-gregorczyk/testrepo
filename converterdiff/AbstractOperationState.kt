package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractState
import org.somda.protosdc.biceps.model.OperatingMode

data class AbstractOperationState(
    val abstractState: AbstractState,
    val operatingModeAttr: OperatingMode,
)
