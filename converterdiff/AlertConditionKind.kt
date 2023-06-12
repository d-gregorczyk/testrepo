package org.somda.protosdc.biceps.model


data class AlertConditionKind(
    enum class EnumType {
        Phy,
        Tec,
        Oth,
    }
    val enumType: EnumType,
)
