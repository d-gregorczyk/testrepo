package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractContextState
import org.somda.protosdc.biceps.model.LocationDetail

data class LocationContextState (
    val abstractContextState: AbstractContextState,
    val locationDetail: LocationDetail? = null,
)
