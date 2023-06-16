package org.somda.protosdc.biceps.model


data class Extension(
val item: List<Item> = listOf(),
) {
    data class Item(
        val mustUnderstand: Boolean,
        val extensionData: Any,
    )
}
