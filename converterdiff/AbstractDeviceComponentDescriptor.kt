package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractDescriptor
import org.somda.protosdc.biceps.model.CodedValue
import org.somda.protosdc.biceps.model.InstanceIdentifierOneOf

data class AbstractDeviceComponentDescriptor (
    val abstractDescriptor: AbstractDescriptor,
    val productionSpecification: List<ProductionSpecification> = listOf(),
) {
    data class ProductionSpecification (
        val specType: CodedValue,
        val productionSpec: String,
        val componentId: InstanceIdentifierOneOf? = null,
    )
}
