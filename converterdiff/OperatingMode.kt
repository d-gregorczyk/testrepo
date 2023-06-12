package org.somda.protosdc.biceps.model


data class OperatingMode(
    enum class EnumType {
        Dis,
        En,
        NA,
    }
    val enumType: EnumType,
)
