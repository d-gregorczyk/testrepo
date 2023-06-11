package org.somda.protosdc.biceps.model


data class AlertActivation(
    val enumType: EnumType,
) {
    enum class EnumType {
        On,
        Off,
        Psd,
    }
}
