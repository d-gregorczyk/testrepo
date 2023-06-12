package org.somda.protosdc.biceps.model


data class CalibrationState(
    val enumType: EnumType,
) {
    enum class EnumType {
        No,
        Req,
        Run,
        Cal,
        Oth,
    }
}
