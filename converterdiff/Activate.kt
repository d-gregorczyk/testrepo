package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractSet
import org.somda.protosdc.biceps.model.Extension

data class Activate(
    val abstractSet: AbstractSet,
    val argument: List<Argument> = listOf(),
) {
    data class Argument(
        val extensionElement: Extension? = null,
        val argValue: String,
    )
}
