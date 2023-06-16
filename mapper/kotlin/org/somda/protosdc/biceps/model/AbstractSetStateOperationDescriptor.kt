package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractOperationDescriptor

data class AbstractSetStateOperationDescriptor(
    val abstractOperationDescriptor: AbstractOperationDescriptor,
val modifiableData: List<String> = listOf(),
)
