package org.somda.protosdc.biceps.model


data class DerivationMethod(
    val enumType: EnumType,
) {
    enum class EnumType {
        Auto,
        Man,
    }
}
