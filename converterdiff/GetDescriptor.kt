package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractGet
import org.somda.protosdc.biceps.model.HandleRef

data class GetDescriptor (
    val abstractGet: AbstractGet,
    val handleRef: List<HandleRef> = listOf(),
)
