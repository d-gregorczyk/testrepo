package org.somda.protosdc.biceps.model


data class RetrievabilityMethod(
    enum class EnumType {
        Get,
        Per,
        Ep,
        Strm,
    }
    val enumType: EnumType,
)
