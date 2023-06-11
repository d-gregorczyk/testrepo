package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractGetResponse
import org.somda.protosdc.biceps.model.LocalizedText

data class GetLocalizedTextResponse (
    val abstractGetResponse: AbstractGetResponse,
    val text: List<LocalizedText> = listOf(),
)
