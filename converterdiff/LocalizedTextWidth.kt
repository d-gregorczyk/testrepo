package org.somda.protosdc.biceps.model


data class LocalizedTextWidth(
    val enumType: EnumType,
) {
    enum class EnumType {
        xs,
        s,
        m,
        l,
        xl,
        xxl,
    }
}
