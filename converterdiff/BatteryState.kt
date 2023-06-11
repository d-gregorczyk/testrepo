package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractDeviceComponentState
import org.somda.protosdc.biceps.model.Measurement

data class BatteryState (
    val abstractDeviceComponentState: AbstractDeviceComponentState,
    val capacityRemaining: Measurement? = null,
    val voltage: Measurement? = null,
    val current: Measurement? = null,
    val temperature: Measurement? = null,
    val remainingBatteryTime: Measurement? = null,
    val chargeStatusAttr: ChargeStatusAttr? = null,
    val chargeCyclesAttr: Int? = null,
) {
    data class ChargeStatusAttr (
        val enumType: EnumType,
    ) {
        enum class EnumType {
            Ful, ChB, DisChB, DEB
        }
    }
}
