package org.somda.protosdc.biceps.model


data class ContextAssociation (
    val enumType: EnumType,
) {
    enum class EnumType {
        No, Pre, Assoc, Dis
    }
}
