package org.somda.protosdc.biceps.model


data class MetricCategory(
    enum class EnumType {
        Unspec,
        Msrmt,
        Clc,
        Set,
        Preset,
        Rcmm,
    }
    val enumType: EnumType,
)
