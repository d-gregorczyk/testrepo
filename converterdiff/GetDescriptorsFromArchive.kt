package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractGet
import org.somda.protosdc.biceps.model.VersionFrame
import org.somda.protosdc.biceps.model.TimeFrame
import org.somda.protosdc.biceps.model.HandleRef

data class GetDescriptorsFromArchive(
    val abstractGet: AbstractGet,
    val descriptorRevisions: VersionFrame? = null,
    val timeFrame: TimeFrame? = null,
    val handle: List<HandleRef> = listOf(),
)
