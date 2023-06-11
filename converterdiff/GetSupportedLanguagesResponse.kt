package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractGetResponse

data class GetSupportedLanguagesResponse(
    val abstractGetResponse: AbstractGetResponse,
    val lang: List<String> = listOf(),
)
