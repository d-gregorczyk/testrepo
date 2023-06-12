package org.somda.protosdc.biceps.model


data class DerivationMethod(
    enum class EnumType {
        Auto,
        Man,
    }
    val enumType: EnumType,
)
