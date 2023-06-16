package org.somda.protosdc.biceps.model


data class AlertSignalPresence(
    val enumType: EnumType,
) {
    enum class EnumType {
        On,
        Off,
        Latch,
        Ack,
    }
}
