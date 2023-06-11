package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractGetResponse
import org.somda.protosdc.biceps.model.MdDescription

data class GetMdDescriptionResponse(
    val abstractGetResponse: AbstractGetResponse,
    val mdDescription: MdDescription,
)
