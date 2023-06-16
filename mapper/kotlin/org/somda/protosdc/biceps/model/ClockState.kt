package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractDeviceComponentState
import org.somda.protosdc.biceps.model.CodedValue
import org.somda.protosdc.biceps.model.Timestamp
import java.math.BigDecimal
import org.somda.protosdc.biceps.model.TimeZone

data class ClockState(
    val abstractDeviceComponentState: AbstractDeviceComponentState,
    val activeSyncProtocol: CodedValue? = null,
val referenceSource: List<String> = listOf(),
    val dateAndTimeAttr: Timestamp? = null,
    val remoteSyncAttr: Boolean,
    val accuracyAttr: BigDecimal? = null,
    val lastSetAttr: Timestamp? = null,
    val timeZoneAttr: TimeZone? = null,
    val criticalUseAttr: Boolean? = null,
)
