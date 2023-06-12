package org.somda.protosdc.biceps.model


data class AlertConditionMonitoredLimits(
    enum class EnumType {
        All,
        LoOff,
        HiOff,
        None,
    }
    val enumType: EnumType,
)
