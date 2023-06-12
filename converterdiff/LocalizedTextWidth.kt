package org.somda.protosdc.biceps.model


data class LocalizedTextWidth(
    enum class EnumType {
        xs,
        s,
        m,
        l,
        xl,
        xxl,
    }
    val enumType: EnumType,
)
