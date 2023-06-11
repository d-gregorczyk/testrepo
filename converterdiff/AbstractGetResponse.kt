package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.MdibVersionGroup

data class AbstractGetResponse (
    val extensionElement: Extension? = null,
    val mdibVersionGroupAttr: MdibVersionGroup,
)
