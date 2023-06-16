package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractDeviceComponentState
import org.somda.protosdc.biceps.model.OperationRef
import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.CodedValue
import org.somda.protosdc.biceps.model.OperatingMode

data class ScoState(
    val abstractDeviceComponentState: AbstractDeviceComponentState,
val operationGroup: List<OperationGroup> = listOf(),
    val invocationRequestedAttr: OperationRef? = null,
    val invocationRequiredAttr: OperationRef? = null,
) {
    data class OperationGroup(
        val extensionElement: Extension? = null,
        val type: CodedValue,
        val operatingModeAttr: OperatingMode? = null,
        val operationsAttr: OperationRef? = null,
    )
}
