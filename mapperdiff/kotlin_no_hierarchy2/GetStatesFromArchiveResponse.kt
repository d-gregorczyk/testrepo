package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractGetResponse
import org.somda.protosdc.biceps.model.AbstractStateOneOf

data class GetStatesFromArchiveResponse(
    val abstractGetResponse: AbstractGetResponse,
    val state: List<AbstractStateOneOf> = listOf(),
)
