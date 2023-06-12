package org.somda.protosdc.biceps.model


data class SafetyClassification(
    enum class EnumType {
        Inf,
        MedA,
        MedB,
        MedC,
    }
    val enumType: EnumType,
)
