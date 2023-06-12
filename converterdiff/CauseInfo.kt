package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.RemedyInfo
import org.somda.protosdc.biceps.model.LocalizedText

data class CauseInfo(
    val extensionElement: Extension? = null,
    val remedyInfo: RemedyInfo? = null,
    val description: List<LocalizedText> = listOf(),
)
