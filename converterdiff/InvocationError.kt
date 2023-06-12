package org.somda.protosdc.biceps.model


data class InvocationError(
    enum class EnumType {
        Unspec,
        Unkn,
        Inv,
        Oth,
    }
    val enumType: EnumType,
)
