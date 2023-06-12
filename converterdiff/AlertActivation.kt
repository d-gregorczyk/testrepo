package org.somda.protosdc.biceps.model


data class AlertActivation(
    enum class EnumType {
        On,
        Off,
        Psd,
    }
    val enumType: EnumType,
)
