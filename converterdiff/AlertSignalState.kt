package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractAlertState
import kotlin.time.Duration
import org.somda.protosdc.biceps.model.AlertSignalPresence
import org.somda.protosdc.biceps.model.AlertSignalPrimaryLocation

data class AlertSignalState (
    val abstractAlertState: AbstractAlertState,
    val actualSignalGenerationDelayAttr: Duration? = null,
    val presenceAttr: AlertSignalPresence? = null,
    val locationAttr: AlertSignalPrimaryLocation? = null,
    val slotAttr: Int? = null,
)
