package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractSet
import org.somda.protosdc.biceps.model.AbstractContextStateOneOf

data class SetContextState(
    val abstractSet: AbstractSet,
val proposedContextState: List<AbstractContextStateOneOf> = listOf(),
)
