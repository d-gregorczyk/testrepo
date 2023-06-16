package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractReport
import org.somda.protosdc.biceps.model.SampleArrayValue
import org.somda.protosdc.biceps.model.HandleRef
import org.somda.protosdc.biceps.model.VersionCounter

data class ObservedValueStream(
    val abstractReport: AbstractReport,
    val value: List<Value> = listOf(),
) {
    data class Value(
        val value: SampleArrayValue? = null,
        val metricAttr: HandleRef,
        val stateVersionAttr: VersionCounter? = null,
    )
}
