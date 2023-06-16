package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractGetResponse
import org.somda.protosdc.biceps.model.MdState

data class GetMdStateResponse(
    val abstractGetResponse: AbstractGetResponse,
    val mdState: MdState,
)
