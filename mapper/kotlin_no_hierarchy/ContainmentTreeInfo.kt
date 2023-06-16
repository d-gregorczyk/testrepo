package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.HandleRef
import org.somda.protosdc.biceps.model.QualifiedName

data class ContainmentTreeInfo(
    val handleRefAttr: HandleRef? = null,
    val parentHandleRefAttr: HandleRef? = null,
    val entryTypeAttr: QualifiedName? = null,
    val childrenCountAttr: Int? = null,
)
