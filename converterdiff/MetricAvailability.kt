package org.somda.protosdc.biceps.model


data class MetricAvailability(
    enum class EnumType {
        Intr,
        Cont,
    }
    val enumType: EnumType,
)
