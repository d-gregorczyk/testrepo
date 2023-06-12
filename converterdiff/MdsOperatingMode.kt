package org.somda.protosdc.biceps.model


data class MdsOperatingMode(
    enum class EnumType {
        Nml,
        Dmo,
        Srv,
        Mtn,
    }
    val enumType: EnumType,
)
