package org.somda.protosdc.extensions.codedattribute

import org.somda.protosdc.extensions.codedattribute.CodedStringAttribute
import org.somda.protosdc.extensions.codedattribute.CodedIntegerAttribute
import org.somda.protosdc.extensions.codedattribute.CodedDecimalAttribute

data class CodedAttributesType(
    val codedStringAttributeElement: List<CodedStringAttribute> = listOf(),
    val codedIntegerAttributeElement: List<CodedIntegerAttribute> = listOf(),
    val codedDecimalAttributeElement: List<CodedDecimalAttribute> = listOf(),
    val mustUnderstandAttr: Boolean? = null,
)
