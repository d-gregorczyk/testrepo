package org.somda.protosdc.biceps.model


data class AlertSignalManifestation(
    enum class EnumType {
        Aud,
        Vis,
        Tan,
        Oth,
    }
    val enumType: EnumType,
)
