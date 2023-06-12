package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractAlertDescriptor
import org.somda.protosdc.biceps.model.HandleRef
import org.somda.protosdc.biceps.model.CauseInfo
import org.somda.protosdc.biceps.model.AlertConditionKind
import org.somda.protosdc.biceps.model.AlertConditionPriority
import kotlin.time.Duration

data class AlertConditionDescriptor(
    val abstractAlertDescriptor: AbstractAlertDescriptor,
    val source: List<HandleRef> = listOf(),
    val causeInfo: List<CauseInfo> = listOf(),
    val kindAttr: AlertConditionKind,
    val priorityAttr: AlertConditionPriority,
    val defaultConditionGenerationDelayAttr: Duration? = null,
    val canEscalateAttr: CanEscalateAttr? = null,
    val canDeescalateAttr: CanDeescalateAttr? = null,
) {
    data class CanEscalateAttr(
        val enumType: EnumType,
    ) {
        enum class EnumType {
            Lo,
            Me,
            Hi,
        }
    }
    data class CanDeescalateAttr(
        val enumType: EnumType,
    ) {
        enum class EnumType {
            Me,
            Lo,
            None,
        }
    }
}
