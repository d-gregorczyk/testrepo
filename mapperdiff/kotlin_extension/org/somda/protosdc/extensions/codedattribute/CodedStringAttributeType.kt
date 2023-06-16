package org.somda.protosdc.extensions.codedattribute

import org.somda.protosdc.extensions.codedattribute.MdcAttribute

data class CodedStringAttributeType(
    val mdcAttributeElement: MdcAttribute,
    val value: String,
)
