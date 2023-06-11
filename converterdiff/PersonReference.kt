package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.InstanceIdentifierOneOf
import org.somda.protosdc.biceps.model.BaseDemographicsOneOf

data class PersonReference (
    val extensionElement: Extension? = null,
    val identification: List<InstanceIdentifierOneOf> = listOf(),
    val name: BaseDemographicsOneOf? = null,
)
