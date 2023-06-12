package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractDescriptor
import org.somda.protosdc.biceps.model.HandleRef
import kotlin.time.Duration

data class AbstractOperationDescriptor(
    val abstractDescriptor: AbstractDescriptor,
    val operationTargetAttr: HandleRef,
    val maxTimeToFinishAttr: Duration? = null,
    val invocationEffectiveTimeoutAttr: Duration? = null,
    val retriggerableAttr: Boolean? = null,
    data class AccessLevelAttr(
        enum class EnumType {
            Usr,
            CSUsr,
            RO,
            SP,
            Oth,
        }
        val enumType: EnumType,
    )
    val accessLevelAttr: AccessLevelAttr? = null,
)
