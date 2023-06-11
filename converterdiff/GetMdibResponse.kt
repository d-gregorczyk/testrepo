package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractGetResponse
import org.somda.protosdc.biceps.model.Mdib

data class GetMdibResponse (
    val abstractGetResponse: AbstractGetResponse,
    val mdib: Mdib,
)
