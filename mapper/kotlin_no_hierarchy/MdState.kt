package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.AbstractStateOneOf
import org.somda.protosdc.biceps.model.VersionCounter

data class MdState(
    val extensionElement: Extension? = null,
val state: List<AbstractStateOneOf> = listOf(),
    val stateVersionAttr: VersionCounter? = null,
)
