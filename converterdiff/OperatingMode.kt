package org.somda.protosdc.biceps.model


data class OperatingMode(
    val enumType: EnumType,
) {
    enum class EnumType {
        Dis,
        En,
        NA,
    }
}
