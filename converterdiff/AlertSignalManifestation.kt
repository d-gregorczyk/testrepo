package org.somda.protosdc.biceps.model


data class AlertSignalManifestation (
    val enumType: EnumType,
) {
    enum class EnumType {
        Aud, Vis, Tan, Oth
    }
}
