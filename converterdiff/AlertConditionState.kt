package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractAlertState
import kotlin.time.Duration
import org.somda.protosdc.biceps.model.AlertConditionPriority
import org.somda.protosdc.biceps.model.Timestamp

data class AlertConditionState(
    val abstractAlertState: AbstractAlertState,
    val actualConditionGenerationDelayAttr: Duration? = null,
    val actualPriorityAttr: AlertConditionPriority? = null,
    val rankAttr: Int? = null,
    val presenceAttr: Boolean? = null,
    val determinationTimeAttr: Timestamp? = null,
)
