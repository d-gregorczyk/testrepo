package org.somda.protosdc.biceps.model


data class CalibrationType(
    val enumType: EnumType,
) {
    enum class EnumType {
        Offset,
        Gain,
        TP,
        Unspec,
    }
}
