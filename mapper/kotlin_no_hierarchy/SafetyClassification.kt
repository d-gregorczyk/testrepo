package org.somda.protosdc.biceps.model


data class SafetyClassification(
    val enumType: EnumType,
) {
    enum class EnumType {
        Inf,
        MedA,
        MedB,
        MedC,
    }
}
