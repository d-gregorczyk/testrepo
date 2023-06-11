package org.somda.protosdc.biceps.model


data class ComponentActivation (
    val enumType: EnumType,
) {
    enum class EnumType {
        On, NotRdy, StndBy, Off, Shtdn, Fail
    }
}
