package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractOperationDescriptor

data class SetStringOperationDescriptor (
    val abstractOperationDescriptor: AbstractOperationDescriptor,
    val maxLengthAttr: Long? = null,
)
