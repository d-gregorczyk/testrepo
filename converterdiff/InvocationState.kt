package org.somda.protosdc.biceps.model


data class InvocationState(
    enum class EnumType {
        Wait,
        Start,
        Cnclld,
        CnclldMan,
        Fin,
        FinMod,
        Fail,
    }
    val enumType: EnumType,
)
