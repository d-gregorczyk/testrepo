package org.somda.protosdc.biceps.model


data class PatientType(
    enum class EnumType {
        Unspec,
        Ad,
        Ado,
        Ped,
        Inf,
        Neo,
        Oth,
    }
    val enumType: EnumType,
)
