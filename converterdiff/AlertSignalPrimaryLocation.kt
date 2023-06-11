package org.somda.protosdc.biceps.model


data class AlertSignalPrimaryLocation (
    val enumType: EnumType,
) {
    enum class EnumType {
        Loc, Rem
    }
}
