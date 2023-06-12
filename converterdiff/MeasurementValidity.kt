package org.somda.protosdc.biceps.model


data class MeasurementValidity(
    val enumType: EnumType,
) {
    enum class EnumType {
        Vld,
        Vldated,
        Ong,
        Qst,
        Calib,
        Inv,
        Oflw,
        Uflw,
        NA,
    }
}
