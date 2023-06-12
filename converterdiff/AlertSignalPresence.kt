package org.somda.protosdc.biceps.model


data class AlertSignalPresence(
    enum class EnumType {
        On,
        Off,
        Latch,
        Ack,
    }
    val enumType: EnumType,
)
