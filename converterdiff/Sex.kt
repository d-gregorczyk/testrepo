package org.somda.protosdc.biceps.model


data class Sex(
    enum class EnumType {
        Unspec,
        M,
        F,
        Unkn,
    }
    val enumType: EnumType,
)
