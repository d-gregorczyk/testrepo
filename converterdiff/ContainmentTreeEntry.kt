package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.CodedValue
import org.somda.protosdc.biceps.model.ContainmentTreeInfo

data class ContainmentTreeEntry(
    val extensionElement: Extension? = null,
    val type: CodedValue? = null,
    val containmentTreeInfoAttr: ContainmentTreeInfo,
)
