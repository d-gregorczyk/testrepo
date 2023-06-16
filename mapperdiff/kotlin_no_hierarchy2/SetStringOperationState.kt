package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractOperationState

data class SetStringOperationState(
    val abstractOperationState: AbstractOperationState,
    val allowedValues: AllowedValues? = null,
) {
    data class AllowedValues(
        val value: List<String> = listOf(),
    )
}