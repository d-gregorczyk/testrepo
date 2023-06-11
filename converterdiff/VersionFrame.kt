package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.ReferencedVersion

data class VersionFrame(
    val startAttr: ReferencedVersion? = null,
    val endAttr: ReferencedVersion? = null,
)
