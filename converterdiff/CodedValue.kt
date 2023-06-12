package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.LocalizedText
import org.somda.protosdc.biceps.model.CodeIdentifier
import org.somda.protosdc.biceps.model.SymbolicCodeName

data class CodedValue(
    val extensionElement: Extension? = null,
    val codingSystemName: List<LocalizedText> = listOf(),
    val conceptDescription: List<LocalizedText> = listOf(),
    val translation: List<Translation> = listOf(),
    val codeAttr: CodeIdentifier,
    val codingSystemAttr: String? = null,
    val codingSystemVersionAttr: String? = null,
    val symbolicCodeNameAttr: SymbolicCodeName? = null,
) {
    data class Translation(
        val extensionElement: Extension? = null,
        val codeAttr: CodeIdentifier,
        val codingSystemAttr: String? = null,
        val codingSystemVersionAttr: String? = null,
    )
}
