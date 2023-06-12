package org.somda.protosdc.biceps.model


data class MeasurementValidity(
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
    val enumType: EnumType,
)
