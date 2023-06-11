package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.VersionCounter
import org.somda.protosdc.biceps.model.HandleRef
import org.somda.protosdc.biceps.model.ReferencedVersion

data class AbstractState (
    val extensionElement: Extension? = null,
    val stateVersionAttr: VersionCounter? = null,
    val descriptorHandleAttr: HandleRef,
    val descriptorVersionAttr: ReferencedVersion? = null,
)
