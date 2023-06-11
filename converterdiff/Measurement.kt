package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.CodedValue
import java.math.BigDecimal

data class Measurement (
    val extensionElement: Extension? = null,
    val measurementUnit: CodedValue,
    val measuredValueAttr: BigDecimal,
)
