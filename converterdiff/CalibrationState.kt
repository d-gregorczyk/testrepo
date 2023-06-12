package org.somda.protosdc.biceps.model


data class CalibrationState(
    enum class EnumType {
        No,
        Req,
        Run,
        Cal,
        Oth,
    }
    val enumType: EnumType,
)
