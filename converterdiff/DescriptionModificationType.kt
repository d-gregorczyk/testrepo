package org.somda.protosdc.biceps.model


data class DescriptionModificationType(
    val enumType: EnumType,
) {
    enum class EnumType {
        Crt,
        Upt,
        Del,
    }
}
