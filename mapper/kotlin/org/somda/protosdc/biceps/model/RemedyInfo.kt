package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.LocalizedText

data class RemedyInfo(
    val extensionElement: Extension? = null,
val description: List<LocalizedText> = listOf(),
)
