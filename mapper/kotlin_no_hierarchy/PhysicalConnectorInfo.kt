package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.LocalizedText

data class PhysicalConnectorInfo(
    val extensionElement: Extension? = null,
val label: List<LocalizedText> = listOf(),
    val numberAttr: Int? = null,
)
