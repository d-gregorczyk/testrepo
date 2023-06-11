package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.MdDescription
import org.somda.protosdc.biceps.model.MdState
import org.somda.protosdc.biceps.model.MdibVersionGroup

data class Mdib (
    val extensionElement: Extension? = null,
    val mdDescription: MdDescription? = null,
    val mdState: MdState? = null,
    val mdibVersionGroupAttr: MdibVersionGroup,
)
