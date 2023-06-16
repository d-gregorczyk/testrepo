package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractSet
import org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf

data class SetComponentState(
    val abstractSet: AbstractSet,
val proposedComponentState: List<AbstractDeviceComponentStateOneOf> = listOf(),
)
