package org.somda.protosdc.biceps.model


data class ComponentActivation(
    enum class EnumType {
        On,
        NotRdy,
        StndBy,
        Off,
        Shtdn,
        Fail,
    }
    val enumType: EnumType,
)
