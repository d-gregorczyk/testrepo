package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractDescriptor
import org.somda.protosdc.biceps.model.HandleRef
import kotlin.time.Duration

data class AbstractOperationDescriptor (
    val abstractDescriptor: AbstractDescriptor,
    val operationTargetAttr: HandleRef,
    val maxTimeToFinishAttr: Duration? = null,
    val invocationEffectiveTimeoutAttr: Duration? = null,
    val retriggerableAttr: Boolean? = null,
    val accessLevelAttr: AccessLevelAttr? = null,
) {
    data class AccessLevelAttr (
        val enumType: EnumType,
    ) {
        enum class EnumType {
            Usr, CSUsr, RO, SP, Oth
        }
    }
}
