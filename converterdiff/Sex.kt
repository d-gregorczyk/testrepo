package org.somda.protosdc.biceps.model


data class Sex (
    val enumType: EnumType,
) {
    enum class EnumType {
        Unspec, M, F, Unkn
    }
}
