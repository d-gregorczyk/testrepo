package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.MdsDescriptor
import org.somda.protosdc.biceps.model.VersionCounter

data class MdDescription(
    val extensionElement: Extension? = null,
val mds: List<MdsDescriptor> = listOf(),
    val descriptionVersionAttr: VersionCounter? = null,
)
