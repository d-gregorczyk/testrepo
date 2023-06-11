package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractGetResponse
import org.somda.protosdc.biceps.model.AbstractContextStateOneOf

data class GetContextStatesByFilterResponse (
    val abstractGetResponse: AbstractGetResponse,
    val contextState: List<AbstractContextStateOneOf> = listOf(),
)
