package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentDescriptor
import org.somda.protosdc.biceps.model.SystemContextDescriptor
import org.somda.protosdc.biceps.model.ClockDescriptor
import org.somda.protosdc.biceps.model.BatteryDescriptor
import org.somda.protosdc.biceps.model.ApprovedJurisdictions
import org.somda.protosdc.biceps.model.VmdDescriptor
import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.LocalizedText
import java.time.LocalDateTime
import org.somda.protosdc.biceps.model.InstanceIdentifierOneOf

data class MdsDescriptor(
    val abstractComplexDeviceComponentDescriptor: AbstractComplexDeviceComponentDescriptor,
    val metaData: MetaData? = null,
    val systemContext: SystemContextDescriptor? = null,
    val clock: ClockDescriptor? = null,
val battery: List<BatteryDescriptor> = listOf(),
    val approvedJurisdictions: ApprovedJurisdictions? = null,
val vmd: List<VmdDescriptor> = listOf(),
) {
    data class MetaData(
        val extensionElement: Extension? = null,
val udi: List<Udi> = listOf(),
        val lotNumber: String? = null,
val manufacturer: List<LocalizedText> = listOf(),
        val manufactureDate: LocalDateTime? = null,
        val expirationDate: LocalDateTime? = null,
val modelName: List<LocalizedText> = listOf(),
        val modelNumber: String? = null,
val serialNumber: List<String> = listOf(),
    ) {
        data class Udi(
            val extensionElement: Extension? = null,
            val deviceIdentifier: String,
            val humanReadableForm: String,
            val issuer: InstanceIdentifierOneOf,
            val jurisdiction: InstanceIdentifierOneOf? = null,
        )
    }
}
