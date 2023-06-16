package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.ContainmentTreeEntry
import org.somda.protosdc.biceps.model.ContainmentTreeInfo

data class ContainmentTree(
    val extensionElement: Extension? = null,
    val entry: List<ContainmentTreeEntry> = listOf(),
    val containmentTreeInfoAttr: ContainmentTreeInfo,
)
