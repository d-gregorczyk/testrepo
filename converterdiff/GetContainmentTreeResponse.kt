package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractGetResponse
import org.somda.protosdc.biceps.model.ContainmentTree

data class GetContainmentTreeResponse (
    val abstractGetResponse: AbstractGetResponse,
    val containmentTree: ContainmentTree,
)
