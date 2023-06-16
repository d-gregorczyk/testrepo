package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractSet
import org.somda.protosdc.biceps.model.AbstractAlertStateOneOf

data class SetAlertState(
    val abstractSet: AbstractSet,
    val proposedAlertState: AbstractAlertStateOneOf,
)
