package org.somda.protosdc.biceps.model


data class MetricAvailability (
    val enumType: EnumType,
) {
    enum class EnumType {
        Intr, Cont
    }
}
