package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.MdibVersionGroup

data class AbstractReport(
    val extensionElement: Extension? = null,
    val mdibVersionGroupAttr: MdibVersionGroup,
)
