package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractGet
import org.somda.protosdc.biceps.model.InstanceIdentifierOneOf
import org.somda.protosdc.biceps.model.QualifiedName

data class GetContextStatesByIdentification (
    val abstractGet: AbstractGet,
    val identification: List<InstanceIdentifierOneOf> = listOf(),
    val contextTypeAttr: QualifiedName? = null,
)
