package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension

data class LocationDetail (
    val extensionElement: Extension? = null,
    val poCAttr: String? = null,
    val roomAttr: String? = null,
    val bedAttr: String? = null,
    val facilityAttr: String? = null,
    val buildingAttr: String? = null,
    val floorAttr: String? = null,
)
