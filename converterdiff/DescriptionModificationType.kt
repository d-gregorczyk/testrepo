package org.somda.protosdc.biceps.model


data class DescriptionModificationType(
    enum class EnumType {
        Crt,
        Upt,
        Del,
    }
    val enumType: EnumType,
)
