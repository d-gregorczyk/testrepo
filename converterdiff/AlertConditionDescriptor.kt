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
    data class CanEscalateAttr(
        enum class EnumType {
            Lo,
            Me,
            Hi,
        }
        val enumType: EnumType,
    )
    val canEscalateAttr: CanEscalateAttr? = null,
    data class CanDeescalateAttr(
        enum class EnumType {
            Me,
            Lo,
            None,
        }
        val enumType: EnumType,
    )
    val canDeescalateAttr: CanDeescalateAttr? = null,
)
