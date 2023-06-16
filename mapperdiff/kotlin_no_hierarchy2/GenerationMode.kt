package org.somda.protosdc.biceps.model


data class GenerationMode(
    val enumType: EnumType,
) {
    enum class EnumType {
        Real,
        Test,
        Demo,
    }
}
