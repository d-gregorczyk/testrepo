package org.somda.protosdc.extensions.codedattribute


data class GenderType(
    val enumType: EnumType,
) {
    enum class EnumType {
        Male,
        Female,
        Other,
        Unknown,
    }
}
