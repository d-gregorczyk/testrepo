package org.somda.protosdc.biceps.model


data class AlertConditionPriority(
    enum class EnumType {
        Lo,
        Me,
        Hi,
        None,
    }
    val enumType: EnumType,
)
