package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.RetrievabilityMethod
import kotlin.time.Duration

data class RetrievabilityInfo (
    val extensionElement: Extension? = null,
    val methodAttr: RetrievabilityMethod,
    val updatePeriodAttr: Duration? = null,
)
