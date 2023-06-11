package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import java.math.BigDecimal

data class Range(
    val extensionElement: Extension? = null,
    val lowerAttr: BigDecimal? = null,
    val upperAttr: BigDecimal? = null,
    val stepWidthAttr: BigDecimal? = null,
    val relativeAccuracyAttr: BigDecimal? = null,
    val absoluteAccuracyAttr: BigDecimal? = null,
)
