package org.somda.protosdc.extensions.codedattribute

import org.somda.protosdc.extensions.codedattribute.MdcAttribute
import java.math.BigDecimal

data class CodedDecimalAttributeType(
    val mdcAttributeElement: MdcAttribute,
    val value: BigDecimal,
)
