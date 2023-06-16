package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptor
import org.somda.protosdc.biceps.model.CodedValue
import kotlin.time.Duration

data class ClockDescriptor(
    val abstractDeviceComponentDescriptor: AbstractDeviceComponentDescriptor,
val timeProtocol: List<CodedValue> = listOf(),
    val resolutionAttr: Duration? = null,
)
