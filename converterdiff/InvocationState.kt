package org.somda.protosdc.biceps.model


data class InvocationState (
    val enumType: EnumType,
) {
    enum class EnumType {
        Wait, Start, Cnclld, CnclldMan, Fin, FinMod, Fail
    }
}
