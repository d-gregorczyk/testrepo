package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.VersionCounter

data class MdibVersionGroup(
    val mdibVersionAttr: VersionCounter? = null,
    val sequenceIdAttr: String,
    val instanceIdAttr: Long? = null,
)
