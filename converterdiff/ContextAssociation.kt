package org.somda.protosdc.biceps.model


data class ContextAssociation(
    enum class EnumType {
        No,
        Pre,
        Assoc,
        Dis,
    }
    val enumType: EnumType,
)
