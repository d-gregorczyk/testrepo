package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.InvocationInfo
import org.somda.protosdc.biceps.model.MdibVersionGroup

data class AbstractSetResponse(
    val extensionElement: Extension? = null,
    val invocationInfo: InvocationInfo,
    val mdibVersionGroupAttr: MdibVersionGroup,
)
