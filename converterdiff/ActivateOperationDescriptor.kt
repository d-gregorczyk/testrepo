package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptor
import org.somda.protosdc.biceps.model.CodedValue
import org.somda.protosdc.biceps.model.QualifiedName

data class ActivateOperationDescriptor(
    val abstractSetStateOperationDescriptor: AbstractSetStateOperationDescriptor,
    data class Argument(
        val argName: CodedValue,
        val arg: QualifiedName,
    )
    val argument: List<Argument> = listOf(),
)
