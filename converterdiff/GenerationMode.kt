package org.somda.protosdc.biceps.model


data class GenerationMode(
    enum class EnumType {
        Real,
        Test,
        Demo,
    }
    val enumType: EnumType,
)
