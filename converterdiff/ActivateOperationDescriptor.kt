package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptor
import org.somda.protosdc.biceps.model.CodedValue
import org.somda.protosdc.biceps.model.QualifiedName

data class ActivateOperationDescriptor (
    val abstractSetStateOperationDescriptor: AbstractSetStateOperationDescriptor,
    val argument: List<Argument> = listOf(),
) {
    data class Argument (
        val argName: CodedValue,
        val arg: QualifiedName,
    )
}
