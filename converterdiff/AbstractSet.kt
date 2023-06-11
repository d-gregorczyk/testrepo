package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.HandleRef

data class AbstractSet (
    val extensionElement: Extension? = null,
    val operationHandleRef: HandleRef,
)
