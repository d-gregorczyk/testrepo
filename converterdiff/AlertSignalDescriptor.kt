package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractAlertDescriptor
import org.somda.protosdc.biceps.model.HandleRef
import org.somda.protosdc.biceps.model.AlertSignalManifestation
import kotlin.time.Duration

data class AlertSignalDescriptor (
    val abstractAlertDescriptor: AbstractAlertDescriptor,
    val conditionSignaledAttr: HandleRef? = null,
    val manifestationAttr: AlertSignalManifestation,
    val latchingAttr: Boolean,
    val defaultSignalGenerationDelayAttr: Duration? = null,
    val minSignalGenerationDelayAttr: Duration? = null,
    val maxSignalGenerationDelayAttr: Duration? = null,
    val signalDelegationSupportedAttr: Boolean? = null,
    val acknowledgementSupportedAttr: Boolean? = null,
    val acknowledgeTimeoutAttr: Duration? = null,
)
