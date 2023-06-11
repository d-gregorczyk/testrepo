package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractGet
import org.somda.protosdc.biceps.model.QualifiedName

data class GetContextStatesByFilter (
    val abstractGet: AbstractGet,
    val filter: List<String> = listOf(),
    val contextTypeAttr: QualifiedName? = null,
)
