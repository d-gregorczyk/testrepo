package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractState
import org.somda.protosdc.biceps.model.AlertActivation

data class AbstractAlertState(
    val abstractState: AbstractState,
    val activationStateAttr: AlertActivation,
)
