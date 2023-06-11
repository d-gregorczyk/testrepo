package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractOperationState
import org.somda.protosdc.biceps.model.Range

data class SetValueOperationState(
    val abstractOperationState: AbstractOperationState,
    val allowedRange: List<Range> = listOf(),
)
