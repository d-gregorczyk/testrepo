package org.somda.protosdc.biceps.model


data class RetrievabilityMethod (
    val enumType: EnumType,
) {
    enum class EnumType {
        Get, Per, Ep, Strm
    }
}
