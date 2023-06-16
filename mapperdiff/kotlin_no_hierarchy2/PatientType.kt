package org.somda.protosdc.biceps.model


data class PatientType(
    val enumType: EnumType,
) {
    enum class EnumType {
        Unspec,
        Ad,
        Ado,
        Ped,
        Inf,
        Neo,
        Oth,
    }
}
