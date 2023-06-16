package org.somda.protosdc.extensions.codedattribute

import org.somda.protosdc.biceps.model.CodeIdentifier
import org.somda.protosdc.biceps.model.SymbolicCodeName

data class MdcAttributeType(
    val codeAttr: CodeIdentifier,
    val codingSystemAttr: String? = null,
    val codingSystemVersionAttr: String? = null,
    val symbolicCodeNameAttr: SymbolicCodeName? = null,
)
