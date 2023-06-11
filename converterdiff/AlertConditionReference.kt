package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.HandleRef

data class AlertConditionReference(
    val handleRef: List<HandleRef> = listOf(),
)
