package org.somda.protosdc.biceps.model


data class AlertConditionMonitoredLimits(
    val enumType: EnumType,
) {
    enum class EnumType {
        All,
        LoOff,
        HiOff,
        None,
    }
}
