package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractGetResponse
import org.somda.protosdc.biceps.model.AbstractDescriptorOneOf

data class GetDescriptorsFromArchiveResponse(
    val abstractGetResponse: AbstractGetResponse,
val descriptor: List<AbstractDescriptorOneOf> = listOf(),
)
