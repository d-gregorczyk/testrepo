package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractSet
import java.math.BigDecimal

data class SetValue (
    val abstractSet: AbstractSet,
    val requestedNumericValue: BigDecimal,
)
