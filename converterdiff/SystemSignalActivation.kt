package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AlertSignalManifestation
import org.somda.protosdc.biceps.model.AlertActivation

data class SystemSignalActivation(
    val manifestationAttr: AlertSignalManifestation,
    val stateAttr: AlertActivation,
)
