package org.somda.protosdc.biceps.model


data class AlertConditionPriority(
    val enumType: EnumType,
) {
    enum class EnumType {
        Lo,
        Me,
        Hi,
        None,
    }
}
