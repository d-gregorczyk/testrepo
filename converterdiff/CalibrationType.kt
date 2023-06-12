package org.somda.protosdc.biceps.model


data class CalibrationType(
    enum class EnumType {
        Offset,
        Gain,
        TP,
        Unspec,
    }
    val enumType: EnumType,
)
