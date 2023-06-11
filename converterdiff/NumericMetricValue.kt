package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractMetricValue
import java.math.BigDecimal

data class NumericMetricValue (
    val abstractMetricValue: AbstractMetricValue,
    val valueAttr: BigDecimal? = null,
)
