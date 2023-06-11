package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractGetResponse
import org.somda.protosdc.biceps.model.AbstractDescriptorOneOf

data class GetDescriptorResponse(
    val abstractGetResponse: AbstractGetResponse,
    val descriptor: List<AbstractDescriptorOneOf> = listOf(),
)
