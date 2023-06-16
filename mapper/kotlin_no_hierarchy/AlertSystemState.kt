package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractAlertState
import org.somda.protosdc.biceps.model.SystemSignalActivation
import org.somda.protosdc.biceps.model.Timestamp
import org.somda.protosdc.biceps.model.AlertConditionReference

data class AlertSystemState(
    val abstractAlertState: AbstractAlertState,
val systemSignalActivation: List<SystemSignalActivation> = listOf(),
    val lastSelfCheckAttr: Timestamp? = null,
    val selfCheckCountAttr: Long? = null,
    val presentPhysiologicalAlarmConditionsAttr: AlertConditionReference? = null,
    val presentTechnicalAlarmConditionsAttr: AlertConditionReference? = null,
)
