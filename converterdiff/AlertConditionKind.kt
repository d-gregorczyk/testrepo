package org.somda.protosdc.biceps.model


data class AlertConditionKind (
    val enumType: EnumType,
) {
    enum class EnumType {
        Phy, Tec, Oth
    }
}
