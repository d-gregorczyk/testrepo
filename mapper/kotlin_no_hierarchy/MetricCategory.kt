package org.somda.protosdc.biceps.model


data class MetricCategory(
    val enumType: EnumType,
) {
    enum class EnumType {
        Unspec,
        Msrmt,
        Clc,
        Set,
        Preset,
        Rcmm,
    }
}
