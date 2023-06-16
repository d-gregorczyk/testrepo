package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.CodedValue
import org.somda.protosdc.biceps.model.LocalizedText

data class InstanceIdentifier(
    val extensionElement: Extension? = null,
    val type: CodedValue? = null,
    val identifierName: List<LocalizedText> = listOf(),
    val rootAttr: RootAttr? = null,
    val extensionAttr: ExtensionAttr? = null,
) {
    data class RootAttr(
        val anyURI: String,
    )
    data class ExtensionAttr(
        val string: String,
    )
}
