package org.somda.protosdc.biceps.model


data class Extension(
    data class Item(
        val mustUnderstand: Boolean,
        val extensionData: Any,
    )
    val item: List<Item> = listOf(),
)
