package org.somda.protosdc.biceps.model


data class InvocationError(
    val enumType: EnumType,
) {
    enum class EnumType {
        Unspec,
        Unkn,
        Inv,
        Oth,
    }
}
