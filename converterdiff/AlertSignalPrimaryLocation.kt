package org.somda.protosdc.biceps.model


data class AlertSignalPrimaryLocation(
    enum class EnumType {
        Loc,
        Rem,
    }
    val enumType: EnumType,
)
