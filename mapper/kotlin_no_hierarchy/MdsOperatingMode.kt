package org.somda.protosdc.biceps.model


data class MdsOperatingMode(
    val enumType: EnumType,
) {
    enum class EnumType {
        Nml,
        Dmo,
        Srv,
        Mtn,
    }
}
