package org.somda.protosdc.extensions.codedattribute

import org.somda.protosdc.extensions.codedattribute.MdcAttribute

data class CodedIntegerAttributeType(
    val mdcAttributeElement: MdcAttribute,
    val value: Long,
)
