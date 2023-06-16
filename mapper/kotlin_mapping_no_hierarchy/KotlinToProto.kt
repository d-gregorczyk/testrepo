package org.somda.protosdc.proto.mapping

class KotlinToProto {
    companion object {

        fun mapProtoDecimalToBigDecimal(value: java.math.BigDecimal): org.somda.protosdc.proto.model.common.Decimal {
            return org.somda.protosdc.proto.model.common.Decimal.newBuilder()
                .setValue(value.unscaledValue().longValueExact())
                .setScale(value.scale())
                .build()
        }

        fun map_org_somda_protosdc_biceps_model_Extension_Item(source: org.somda.protosdc.biceps.model.Extension.Item): org.somda.protosdc.proto.model.biceps.ExtensionMsg.ItemMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ExtensionMsg.ItemMsg.newBuilder()
            builder.mustUnderstand = source.mustUnderstand
            builder.extensionData = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapAny(source.extensionData)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_Extension(source: org.somda.protosdc.biceps.model.Extension): org.somda.protosdc.proto.model.biceps.ExtensionMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ExtensionMsg.newBuilder()
            builder.addAllItem(source.item.map { map_org_somda_protosdc_biceps_model_Extension_Item(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_QualifiedName(source: org.somda.protosdc.biceps.model.QualifiedName): org.somda.protosdc.proto.model.biceps.QualifiedNameMsg {
            val builder = org.somda.protosdc.proto.model.biceps.QualifiedNameMsg.newBuilder()
            builder.namespace = source.namespace
            builder.localName = source.localName
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_MdsOperatingMode_EnumType(source: org.somda.protosdc.biceps.model.MdsOperatingMode.EnumType): org.somda.protosdc.proto.model.biceps.MdsOperatingModeMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.MdsOperatingMode.EnumType.Nml -> org.somda.protosdc.proto.model.biceps.MdsOperatingModeMsg.EnumType.NML
                org.somda.protosdc.biceps.model.MdsOperatingMode.EnumType.Dmo -> org.somda.protosdc.proto.model.biceps.MdsOperatingModeMsg.EnumType.DMO
                org.somda.protosdc.biceps.model.MdsOperatingMode.EnumType.Srv -> org.somda.protosdc.proto.model.biceps.MdsOperatingModeMsg.EnumType.SRV
                org.somda.protosdc.biceps.model.MdsOperatingMode.EnumType.Mtn -> org.somda.protosdc.proto.model.biceps.MdsOperatingModeMsg.EnumType.MTN
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_MdsOperatingMode(source: org.somda.protosdc.biceps.model.MdsOperatingMode): org.somda.protosdc.proto.model.biceps.MdsOperatingModeMsg {
            val builder = org.somda.protosdc.proto.model.biceps.MdsOperatingModeMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_MdsOperatingMode_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_DescriptionModificationType_EnumType(source: org.somda.protosdc.biceps.model.DescriptionModificationType.EnumType): org.somda.protosdc.proto.model.biceps.DescriptionModificationTypeMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.DescriptionModificationType.EnumType.Crt -> org.somda.protosdc.proto.model.biceps.DescriptionModificationTypeMsg.EnumType.CRT
                org.somda.protosdc.biceps.model.DescriptionModificationType.EnumType.Upt -> org.somda.protosdc.proto.model.biceps.DescriptionModificationTypeMsg.EnumType.UPT
                org.somda.protosdc.biceps.model.DescriptionModificationType.EnumType.Del -> org.somda.protosdc.proto.model.biceps.DescriptionModificationTypeMsg.EnumType.DEL
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_DescriptionModificationType(source: org.somda.protosdc.biceps.model.DescriptionModificationType): org.somda.protosdc.proto.model.biceps.DescriptionModificationTypeMsg {
            val builder = org.somda.protosdc.proto.model.biceps.DescriptionModificationTypeMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_DescriptionModificationType_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AlertSignalPrimaryLocation_EnumType(source: org.somda.protosdc.biceps.model.AlertSignalPrimaryLocation.EnumType): org.somda.protosdc.proto.model.biceps.AlertSignalPrimaryLocationMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.AlertSignalPrimaryLocation.EnumType.Loc -> org.somda.protosdc.proto.model.biceps.AlertSignalPrimaryLocationMsg.EnumType.LOC
                org.somda.protosdc.biceps.model.AlertSignalPrimaryLocation.EnumType.Rem -> org.somda.protosdc.proto.model.biceps.AlertSignalPrimaryLocationMsg.EnumType.REM
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AlertSignalPrimaryLocation(source: org.somda.protosdc.biceps.model.AlertSignalPrimaryLocation): org.somda.protosdc.proto.model.biceps.AlertSignalPrimaryLocationMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AlertSignalPrimaryLocationMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_AlertSignalPrimaryLocation_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_MetricAvailability_EnumType(source: org.somda.protosdc.biceps.model.MetricAvailability.EnumType): org.somda.protosdc.proto.model.biceps.MetricAvailabilityMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.MetricAvailability.EnumType.Intr -> org.somda.protosdc.proto.model.biceps.MetricAvailabilityMsg.EnumType.INTR
                org.somda.protosdc.biceps.model.MetricAvailability.EnumType.Cont -> org.somda.protosdc.proto.model.biceps.MetricAvailabilityMsg.EnumType.CONT
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_MetricAvailability(source: org.somda.protosdc.biceps.model.MetricAvailability): org.somda.protosdc.proto.model.biceps.MetricAvailabilityMsg {
            val builder = org.somda.protosdc.proto.model.biceps.MetricAvailabilityMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_MetricAvailability_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ContextAssociation_EnumType(source: org.somda.protosdc.biceps.model.ContextAssociation.EnumType): org.somda.protosdc.proto.model.biceps.ContextAssociationMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.ContextAssociation.EnumType.No -> org.somda.protosdc.proto.model.biceps.ContextAssociationMsg.EnumType.NO
                org.somda.protosdc.biceps.model.ContextAssociation.EnumType.Pre -> org.somda.protosdc.proto.model.biceps.ContextAssociationMsg.EnumType.PRE
                org.somda.protosdc.biceps.model.ContextAssociation.EnumType.Assoc -> org.somda.protosdc.proto.model.biceps.ContextAssociationMsg.EnumType.ASSOC
                org.somda.protosdc.biceps.model.ContextAssociation.EnumType.Dis -> org.somda.protosdc.proto.model.biceps.ContextAssociationMsg.EnumType.DIS
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_ContextAssociation(source: org.somda.protosdc.biceps.model.ContextAssociation): org.somda.protosdc.proto.model.biceps.ContextAssociationMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ContextAssociationMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_ContextAssociation_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AlertSignalManifestation_EnumType(source: org.somda.protosdc.biceps.model.AlertSignalManifestation.EnumType): org.somda.protosdc.proto.model.biceps.AlertSignalManifestationMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.AlertSignalManifestation.EnumType.Aud -> org.somda.protosdc.proto.model.biceps.AlertSignalManifestationMsg.EnumType.AUD
                org.somda.protosdc.biceps.model.AlertSignalManifestation.EnumType.Vis -> org.somda.protosdc.proto.model.biceps.AlertSignalManifestationMsg.EnumType.VIS
                org.somda.protosdc.biceps.model.AlertSignalManifestation.EnumType.Tan -> org.somda.protosdc.proto.model.biceps.AlertSignalManifestationMsg.EnumType.TAN
                org.somda.protosdc.biceps.model.AlertSignalManifestation.EnumType.Oth -> org.somda.protosdc.proto.model.biceps.AlertSignalManifestationMsg.EnumType.OTH
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AlertSignalManifestation(source: org.somda.protosdc.biceps.model.AlertSignalManifestation): org.somda.protosdc.proto.model.biceps.AlertSignalManifestationMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AlertSignalManifestationMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_AlertSignalManifestation_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_CalibrationType_EnumType(source: org.somda.protosdc.biceps.model.CalibrationType.EnumType): org.somda.protosdc.proto.model.biceps.CalibrationTypeMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.CalibrationType.EnumType.Offset -> org.somda.protosdc.proto.model.biceps.CalibrationTypeMsg.EnumType.OFFSET
                org.somda.protosdc.biceps.model.CalibrationType.EnumType.Gain -> org.somda.protosdc.proto.model.biceps.CalibrationTypeMsg.EnumType.GAIN
                org.somda.protosdc.biceps.model.CalibrationType.EnumType.TP -> org.somda.protosdc.proto.model.biceps.CalibrationTypeMsg.EnumType.TP
                org.somda.protosdc.biceps.model.CalibrationType.EnumType.Unspec -> org.somda.protosdc.proto.model.biceps.CalibrationTypeMsg.EnumType.UNSPEC
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_CalibrationType(source: org.somda.protosdc.biceps.model.CalibrationType): org.somda.protosdc.proto.model.biceps.CalibrationTypeMsg {
            val builder = org.somda.protosdc.proto.model.biceps.CalibrationTypeMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_CalibrationType_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_LocalizedTextWidth_EnumType(source: org.somda.protosdc.biceps.model.LocalizedTextWidth.EnumType): org.somda.protosdc.proto.model.biceps.LocalizedTextWidthMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.LocalizedTextWidth.EnumType.xs -> org.somda.protosdc.proto.model.biceps.LocalizedTextWidthMsg.EnumType.XS
                org.somda.protosdc.biceps.model.LocalizedTextWidth.EnumType.s -> org.somda.protosdc.proto.model.biceps.LocalizedTextWidthMsg.EnumType.S
                org.somda.protosdc.biceps.model.LocalizedTextWidth.EnumType.m -> org.somda.protosdc.proto.model.biceps.LocalizedTextWidthMsg.EnumType.M
                org.somda.protosdc.biceps.model.LocalizedTextWidth.EnumType.l -> org.somda.protosdc.proto.model.biceps.LocalizedTextWidthMsg.EnumType.L
                org.somda.protosdc.biceps.model.LocalizedTextWidth.EnumType.xl -> org.somda.protosdc.proto.model.biceps.LocalizedTextWidthMsg.EnumType.XL
                org.somda.protosdc.biceps.model.LocalizedTextWidth.EnumType.xxl -> org.somda.protosdc.proto.model.biceps.LocalizedTextWidthMsg.EnumType.XXL
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_LocalizedTextWidth(source: org.somda.protosdc.biceps.model.LocalizedTextWidth): org.somda.protosdc.proto.model.biceps.LocalizedTextWidthMsg {
            val builder = org.somda.protosdc.proto.model.biceps.LocalizedTextWidthMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_LocalizedTextWidth_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_DerivationMethod_EnumType(source: org.somda.protosdc.biceps.model.DerivationMethod.EnumType): org.somda.protosdc.proto.model.biceps.DerivationMethodMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.DerivationMethod.EnumType.Auto -> org.somda.protosdc.proto.model.biceps.DerivationMethodMsg.EnumType.AUTO
                org.somda.protosdc.biceps.model.DerivationMethod.EnumType.Man -> org.somda.protosdc.proto.model.biceps.DerivationMethodMsg.EnumType.MAN
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_DerivationMethod(source: org.somda.protosdc.biceps.model.DerivationMethod): org.somda.protosdc.proto.model.biceps.DerivationMethodMsg {
            val builder = org.somda.protosdc.proto.model.biceps.DerivationMethodMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_DerivationMethod_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_InvocationState_EnumType(source: org.somda.protosdc.biceps.model.InvocationState.EnumType): org.somda.protosdc.proto.model.biceps.InvocationStateMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.InvocationState.EnumType.Wait -> org.somda.protosdc.proto.model.biceps.InvocationStateMsg.EnumType.WAIT
                org.somda.protosdc.biceps.model.InvocationState.EnumType.Start -> org.somda.protosdc.proto.model.biceps.InvocationStateMsg.EnumType.START
                org.somda.protosdc.biceps.model.InvocationState.EnumType.Cnclld -> org.somda.protosdc.proto.model.biceps.InvocationStateMsg.EnumType.CNCLLD
                org.somda.protosdc.biceps.model.InvocationState.EnumType.CnclldMan -> org.somda.protosdc.proto.model.biceps.InvocationStateMsg.EnumType.CNCLLD_MAN
                org.somda.protosdc.biceps.model.InvocationState.EnumType.Fin -> org.somda.protosdc.proto.model.biceps.InvocationStateMsg.EnumType.FIN
                org.somda.protosdc.biceps.model.InvocationState.EnumType.FinMod -> org.somda.protosdc.proto.model.biceps.InvocationStateMsg.EnumType.FIN_MOD
                org.somda.protosdc.biceps.model.InvocationState.EnumType.Fail -> org.somda.protosdc.proto.model.biceps.InvocationStateMsg.EnumType.FAIL
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_InvocationState(source: org.somda.protosdc.biceps.model.InvocationState): org.somda.protosdc.proto.model.biceps.InvocationStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.InvocationStateMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_InvocationState_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SafetyClassification_EnumType(source: org.somda.protosdc.biceps.model.SafetyClassification.EnumType): org.somda.protosdc.proto.model.biceps.SafetyClassificationMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.SafetyClassification.EnumType.Inf -> org.somda.protosdc.proto.model.biceps.SafetyClassificationMsg.EnumType.INF
                org.somda.protosdc.biceps.model.SafetyClassification.EnumType.MedA -> org.somda.protosdc.proto.model.biceps.SafetyClassificationMsg.EnumType.MED_A
                org.somda.protosdc.biceps.model.SafetyClassification.EnumType.MedB -> org.somda.protosdc.proto.model.biceps.SafetyClassificationMsg.EnumType.MED_B
                org.somda.protosdc.biceps.model.SafetyClassification.EnumType.MedC -> org.somda.protosdc.proto.model.biceps.SafetyClassificationMsg.EnumType.MED_C
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_SafetyClassification(source: org.somda.protosdc.biceps.model.SafetyClassification): org.somda.protosdc.proto.model.biceps.SafetyClassificationMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SafetyClassificationMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_SafetyClassification_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_TimeZone(source: org.somda.protosdc.biceps.model.TimeZone): org.somda.protosdc.proto.model.biceps.TimeZoneMsg {
            val builder = org.somda.protosdc.proto.model.biceps.TimeZoneMsg.newBuilder()
            builder.string = source.string
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AlertConditionKind_EnumType(source: org.somda.protosdc.biceps.model.AlertConditionKind.EnumType): org.somda.protosdc.proto.model.biceps.AlertConditionKindMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.AlertConditionKind.EnumType.Phy -> org.somda.protosdc.proto.model.biceps.AlertConditionKindMsg.EnumType.PHY
                org.somda.protosdc.biceps.model.AlertConditionKind.EnumType.Tec -> org.somda.protosdc.proto.model.biceps.AlertConditionKindMsg.EnumType.TEC
                org.somda.protosdc.biceps.model.AlertConditionKind.EnumType.Oth -> org.somda.protosdc.proto.model.biceps.AlertConditionKindMsg.EnumType.OTH
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AlertConditionKind(source: org.somda.protosdc.biceps.model.AlertConditionKind): org.somda.protosdc.proto.model.biceps.AlertConditionKindMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AlertConditionKindMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_AlertConditionKind_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_MeasurementValidity_EnumType(source: org.somda.protosdc.biceps.model.MeasurementValidity.EnumType): org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.MeasurementValidity.EnumType.Vld -> org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType.VLD
                org.somda.protosdc.biceps.model.MeasurementValidity.EnumType.Vldated -> org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType.VLDATED
                org.somda.protosdc.biceps.model.MeasurementValidity.EnumType.Ong -> org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType.ONG
                org.somda.protosdc.biceps.model.MeasurementValidity.EnumType.Qst -> org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType.QST
                org.somda.protosdc.biceps.model.MeasurementValidity.EnumType.Calib -> org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType.CALIB
                org.somda.protosdc.biceps.model.MeasurementValidity.EnumType.Inv -> org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType.INV
                org.somda.protosdc.biceps.model.MeasurementValidity.EnumType.Oflw -> org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType.OFLW
                org.somda.protosdc.biceps.model.MeasurementValidity.EnumType.Uflw -> org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType.UFLW
                org.somda.protosdc.biceps.model.MeasurementValidity.EnumType.NA -> org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType.NA
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_MeasurementValidity(source: org.somda.protosdc.biceps.model.MeasurementValidity): org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg {
            val builder = org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_MeasurementValidity_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_Handle(source: org.somda.protosdc.biceps.model.Handle): org.somda.protosdc.proto.model.biceps.HandleMsg {
            val builder = org.somda.protosdc.proto.model.biceps.HandleMsg.newBuilder()
            builder.string = source.string
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_HandleRef(source: org.somda.protosdc.biceps.model.HandleRef): org.somda.protosdc.proto.model.biceps.HandleRefMsg {
            val builder = org.somda.protosdc.proto.model.biceps.HandleRefMsg.newBuilder()
            builder.string = source.string
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_OperatingMode_EnumType(source: org.somda.protosdc.biceps.model.OperatingMode.EnumType): org.somda.protosdc.proto.model.biceps.OperatingModeMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.OperatingMode.EnumType.Dis -> org.somda.protosdc.proto.model.biceps.OperatingModeMsg.EnumType.DIS
                org.somda.protosdc.biceps.model.OperatingMode.EnumType.En -> org.somda.protosdc.proto.model.biceps.OperatingModeMsg.EnumType.EN
                org.somda.protosdc.biceps.model.OperatingMode.EnumType.NA -> org.somda.protosdc.proto.model.biceps.OperatingModeMsg.EnumType.NA
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_OperatingMode(source: org.somda.protosdc.biceps.model.OperatingMode): org.somda.protosdc.proto.model.biceps.OperatingModeMsg {
            val builder = org.somda.protosdc.proto.model.biceps.OperatingModeMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_OperatingMode_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_TransactionId(source: org.somda.protosdc.biceps.model.TransactionId): org.somda.protosdc.proto.model.biceps.TransactionIdMsg {
            val builder = org.somda.protosdc.proto.model.biceps.TransactionIdMsg.newBuilder()
            builder.unsignedInt = source.unsignedInt
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_LocalizedTextContent(source: org.somda.protosdc.biceps.model.LocalizedTextContent): org.somda.protosdc.proto.model.biceps.LocalizedTextContentMsg {
            val builder = org.somda.protosdc.proto.model.biceps.LocalizedTextContentMsg.newBuilder()
            builder.string = source.string
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_RetrievabilityMethod_EnumType(source: org.somda.protosdc.biceps.model.RetrievabilityMethod.EnumType): org.somda.protosdc.proto.model.biceps.RetrievabilityMethodMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.RetrievabilityMethod.EnumType.Get -> org.somda.protosdc.proto.model.biceps.RetrievabilityMethodMsg.EnumType.GET
                org.somda.protosdc.biceps.model.RetrievabilityMethod.EnumType.Per -> org.somda.protosdc.proto.model.biceps.RetrievabilityMethodMsg.EnumType.PER
                org.somda.protosdc.biceps.model.RetrievabilityMethod.EnumType.Ep -> org.somda.protosdc.proto.model.biceps.RetrievabilityMethodMsg.EnumType.EP
                org.somda.protosdc.biceps.model.RetrievabilityMethod.EnumType.Strm -> org.somda.protosdc.proto.model.biceps.RetrievabilityMethodMsg.EnumType.STRM
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_RetrievabilityMethod(source: org.somda.protosdc.biceps.model.RetrievabilityMethod): org.somda.protosdc.proto.model.biceps.RetrievabilityMethodMsg {
            val builder = org.somda.protosdc.proto.model.biceps.RetrievabilityMethodMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_RetrievabilityMethod_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_CalibrationState_EnumType(source: org.somda.protosdc.biceps.model.CalibrationState.EnumType): org.somda.protosdc.proto.model.biceps.CalibrationStateMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.CalibrationState.EnumType.No -> org.somda.protosdc.proto.model.biceps.CalibrationStateMsg.EnumType.NO
                org.somda.protosdc.biceps.model.CalibrationState.EnumType.Req -> org.somda.protosdc.proto.model.biceps.CalibrationStateMsg.EnumType.REQ
                org.somda.protosdc.biceps.model.CalibrationState.EnumType.Run -> org.somda.protosdc.proto.model.biceps.CalibrationStateMsg.EnumType.RUN
                org.somda.protosdc.biceps.model.CalibrationState.EnumType.Cal -> org.somda.protosdc.proto.model.biceps.CalibrationStateMsg.EnumType.CAL
                org.somda.protosdc.biceps.model.CalibrationState.EnumType.Oth -> org.somda.protosdc.proto.model.biceps.CalibrationStateMsg.EnumType.OTH
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_CalibrationState(source: org.somda.protosdc.biceps.model.CalibrationState): org.somda.protosdc.proto.model.biceps.CalibrationStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.CalibrationStateMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_CalibrationState_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AlertConditionReference(source: org.somda.protosdc.biceps.model.AlertConditionReference): org.somda.protosdc.proto.model.biceps.AlertConditionReferenceMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AlertConditionReferenceMsg.newBuilder()
            builder.addAllHandleRef(source.handleRef.map { map_org_somda_protosdc_biceps_model_HandleRef(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_MetricCategory_EnumType(source: org.somda.protosdc.biceps.model.MetricCategory.EnumType): org.somda.protosdc.proto.model.biceps.MetricCategoryMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.MetricCategory.EnumType.Unspec -> org.somda.protosdc.proto.model.biceps.MetricCategoryMsg.EnumType.UNSPEC
                org.somda.protosdc.biceps.model.MetricCategory.EnumType.Msrmt -> org.somda.protosdc.proto.model.biceps.MetricCategoryMsg.EnumType.MSRMT
                org.somda.protosdc.biceps.model.MetricCategory.EnumType.Clc -> org.somda.protosdc.proto.model.biceps.MetricCategoryMsg.EnumType.CLC
                org.somda.protosdc.biceps.model.MetricCategory.EnumType.Set -> org.somda.protosdc.proto.model.biceps.MetricCategoryMsg.EnumType.SET
                org.somda.protosdc.biceps.model.MetricCategory.EnumType.Preset -> org.somda.protosdc.proto.model.biceps.MetricCategoryMsg.EnumType.PRESET
                org.somda.protosdc.biceps.model.MetricCategory.EnumType.Rcmm -> org.somda.protosdc.proto.model.biceps.MetricCategoryMsg.EnumType.RCMM
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_MetricCategory(source: org.somda.protosdc.biceps.model.MetricCategory): org.somda.protosdc.proto.model.biceps.MetricCategoryMsg {
            val builder = org.somda.protosdc.proto.model.biceps.MetricCategoryMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_MetricCategory_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AlertConditionPriority_EnumType(source: org.somda.protosdc.biceps.model.AlertConditionPriority.EnumType): org.somda.protosdc.proto.model.biceps.AlertConditionPriorityMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.AlertConditionPriority.EnumType.Lo -> org.somda.protosdc.proto.model.biceps.AlertConditionPriorityMsg.EnumType.LO
                org.somda.protosdc.biceps.model.AlertConditionPriority.EnumType.Me -> org.somda.protosdc.proto.model.biceps.AlertConditionPriorityMsg.EnumType.ME
                org.somda.protosdc.biceps.model.AlertConditionPriority.EnumType.Hi -> org.somda.protosdc.proto.model.biceps.AlertConditionPriorityMsg.EnumType.HI
                org.somda.protosdc.biceps.model.AlertConditionPriority.EnumType.None -> org.somda.protosdc.proto.model.biceps.AlertConditionPriorityMsg.EnumType.NONE
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AlertConditionPriority(source: org.somda.protosdc.biceps.model.AlertConditionPriority): org.somda.protosdc.proto.model.biceps.AlertConditionPriorityMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AlertConditionPriorityMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_AlertConditionPriority_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AlertSignalPresence_EnumType(source: org.somda.protosdc.biceps.model.AlertSignalPresence.EnumType): org.somda.protosdc.proto.model.biceps.AlertSignalPresenceMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.AlertSignalPresence.EnumType.On -> org.somda.protosdc.proto.model.biceps.AlertSignalPresenceMsg.EnumType.ON
                org.somda.protosdc.biceps.model.AlertSignalPresence.EnumType.Off -> org.somda.protosdc.proto.model.biceps.AlertSignalPresenceMsg.EnumType.OFF
                org.somda.protosdc.biceps.model.AlertSignalPresence.EnumType.Latch -> org.somda.protosdc.proto.model.biceps.AlertSignalPresenceMsg.EnumType.LATCH
                org.somda.protosdc.biceps.model.AlertSignalPresence.EnumType.Ack -> org.somda.protosdc.proto.model.biceps.AlertSignalPresenceMsg.EnumType.ACK
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AlertSignalPresence(source: org.somda.protosdc.biceps.model.AlertSignalPresence): org.somda.protosdc.proto.model.biceps.AlertSignalPresenceMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AlertSignalPresenceMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_AlertSignalPresence_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_Timestamp(source: org.somda.protosdc.biceps.model.Timestamp): org.somda.protosdc.proto.model.biceps.TimestampMsg {
            val builder = org.somda.protosdc.proto.model.biceps.TimestampMsg.newBuilder()
            builder.unsignedLong = source.unsignedLong
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_RealTimeValueType(source: org.somda.protosdc.biceps.model.RealTimeValueType): org.somda.protosdc.proto.model.biceps.RealTimeValueTypeMsg {
            val builder = org.somda.protosdc.proto.model.biceps.RealTimeValueTypeMsg.newBuilder()
            builder.addAllDecimal(source.decimal.map { mapProtoDecimalToBigDecimal(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_LocalizedTextRef(source: org.somda.protosdc.biceps.model.LocalizedTextRef): org.somda.protosdc.proto.model.biceps.LocalizedTextRefMsg {
            val builder = org.somda.protosdc.proto.model.biceps.LocalizedTextRefMsg.newBuilder()
            builder.string = source.string
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_InvocationError_EnumType(source: org.somda.protosdc.biceps.model.InvocationError.EnumType): org.somda.protosdc.proto.model.biceps.InvocationErrorMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.InvocationError.EnumType.Unspec -> org.somda.protosdc.proto.model.biceps.InvocationErrorMsg.EnumType.UNSPEC
                org.somda.protosdc.biceps.model.InvocationError.EnumType.Unkn -> org.somda.protosdc.proto.model.biceps.InvocationErrorMsg.EnumType.UNKN
                org.somda.protosdc.biceps.model.InvocationError.EnumType.Inv -> org.somda.protosdc.proto.model.biceps.InvocationErrorMsg.EnumType.INV
                org.somda.protosdc.biceps.model.InvocationError.EnumType.Oth -> org.somda.protosdc.proto.model.biceps.InvocationErrorMsg.EnumType.OTH
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_InvocationError(source: org.somda.protosdc.biceps.model.InvocationError): org.somda.protosdc.proto.model.biceps.InvocationErrorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.InvocationErrorMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_InvocationError_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_QualityIndicator(source: org.somda.protosdc.biceps.model.QualityIndicator): org.somda.protosdc.proto.model.biceps.QualityIndicatorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.QualityIndicatorMsg.newBuilder()
            builder.decimal = mapProtoDecimalToBigDecimal(source.decimal)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_Sex_EnumType(source: org.somda.protosdc.biceps.model.Sex.EnumType): org.somda.protosdc.proto.model.biceps.SexMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.Sex.EnumType.Unspec -> org.somda.protosdc.proto.model.biceps.SexMsg.EnumType.UNSPEC
                org.somda.protosdc.biceps.model.Sex.EnumType.M -> org.somda.protosdc.proto.model.biceps.SexMsg.EnumType.M
                org.somda.protosdc.biceps.model.Sex.EnumType.F -> org.somda.protosdc.proto.model.biceps.SexMsg.EnumType.F
                org.somda.protosdc.biceps.model.Sex.EnumType.Unkn -> org.somda.protosdc.proto.model.biceps.SexMsg.EnumType.UNKN
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_Sex(source: org.somda.protosdc.biceps.model.Sex): org.somda.protosdc.proto.model.biceps.SexMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SexMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_Sex_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SymbolicCodeName(source: org.somda.protosdc.biceps.model.SymbolicCodeName): org.somda.protosdc.proto.model.biceps.SymbolicCodeNameMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SymbolicCodeNameMsg.newBuilder()
            builder.string = source.string
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AlertConditionMonitoredLimits_EnumType(source: org.somda.protosdc.biceps.model.AlertConditionMonitoredLimits.EnumType): org.somda.protosdc.proto.model.biceps.AlertConditionMonitoredLimitsMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.AlertConditionMonitoredLimits.EnumType.All -> org.somda.protosdc.proto.model.biceps.AlertConditionMonitoredLimitsMsg.EnumType.ALL
                org.somda.protosdc.biceps.model.AlertConditionMonitoredLimits.EnumType.LoOff -> org.somda.protosdc.proto.model.biceps.AlertConditionMonitoredLimitsMsg.EnumType.LO_OFF
                org.somda.protosdc.biceps.model.AlertConditionMonitoredLimits.EnumType.HiOff -> org.somda.protosdc.proto.model.biceps.AlertConditionMonitoredLimitsMsg.EnumType.HI_OFF
                org.somda.protosdc.biceps.model.AlertConditionMonitoredLimits.EnumType.None -> org.somda.protosdc.proto.model.biceps.AlertConditionMonitoredLimitsMsg.EnumType.NONE
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AlertConditionMonitoredLimits(source: org.somda.protosdc.biceps.model.AlertConditionMonitoredLimits): org.somda.protosdc.proto.model.biceps.AlertConditionMonitoredLimitsMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AlertConditionMonitoredLimitsMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_AlertConditionMonitoredLimits_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_PatientType_EnumType(source: org.somda.protosdc.biceps.model.PatientType.EnumType): org.somda.protosdc.proto.model.biceps.PatientTypeMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.PatientType.EnumType.Unspec -> org.somda.protosdc.proto.model.biceps.PatientTypeMsg.EnumType.UNSPEC
                org.somda.protosdc.biceps.model.PatientType.EnumType.Ad -> org.somda.protosdc.proto.model.biceps.PatientTypeMsg.EnumType.AD
                org.somda.protosdc.biceps.model.PatientType.EnumType.Ado -> org.somda.protosdc.proto.model.biceps.PatientTypeMsg.EnumType.ADO
                org.somda.protosdc.biceps.model.PatientType.EnumType.Ped -> org.somda.protosdc.proto.model.biceps.PatientTypeMsg.EnumType.PED
                org.somda.protosdc.biceps.model.PatientType.EnumType.Inf -> org.somda.protosdc.proto.model.biceps.PatientTypeMsg.EnumType.INF
                org.somda.protosdc.biceps.model.PatientType.EnumType.Neo -> org.somda.protosdc.proto.model.biceps.PatientTypeMsg.EnumType.NEO
                org.somda.protosdc.biceps.model.PatientType.EnumType.Oth -> org.somda.protosdc.proto.model.biceps.PatientTypeMsg.EnumType.OTH
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_PatientType(source: org.somda.protosdc.biceps.model.PatientType): org.somda.protosdc.proto.model.biceps.PatientTypeMsg {
            val builder = org.somda.protosdc.proto.model.biceps.PatientTypeMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_PatientType_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GenerationMode_EnumType(source: org.somda.protosdc.biceps.model.GenerationMode.EnumType): org.somda.protosdc.proto.model.biceps.GenerationModeMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.GenerationMode.EnumType.Real -> org.somda.protosdc.proto.model.biceps.GenerationModeMsg.EnumType.REAL
                org.somda.protosdc.biceps.model.GenerationMode.EnumType.Test -> org.somda.protosdc.proto.model.biceps.GenerationModeMsg.EnumType.TEST
                org.somda.protosdc.biceps.model.GenerationMode.EnumType.Demo -> org.somda.protosdc.proto.model.biceps.GenerationModeMsg.EnumType.DEMO
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_GenerationMode(source: org.somda.protosdc.biceps.model.GenerationMode): org.somda.protosdc.proto.model.biceps.GenerationModeMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GenerationModeMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_GenerationMode_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_VersionCounter(source: org.somda.protosdc.biceps.model.VersionCounter): org.somda.protosdc.proto.model.biceps.VersionCounterMsg {
            val builder = org.somda.protosdc.proto.model.biceps.VersionCounterMsg.newBuilder()
            builder.unsignedLong = source.unsignedLong
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_CodeIdentifier(source: org.somda.protosdc.biceps.model.CodeIdentifier): org.somda.protosdc.proto.model.biceps.CodeIdentifierMsg {
            val builder = org.somda.protosdc.proto.model.biceps.CodeIdentifierMsg.newBuilder()
            builder.string = source.string
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ComponentActivation_EnumType(source: org.somda.protosdc.biceps.model.ComponentActivation.EnumType): org.somda.protosdc.proto.model.biceps.ComponentActivationMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.ComponentActivation.EnumType.On -> org.somda.protosdc.proto.model.biceps.ComponentActivationMsg.EnumType.ON
                org.somda.protosdc.biceps.model.ComponentActivation.EnumType.NotRdy -> org.somda.protosdc.proto.model.biceps.ComponentActivationMsg.EnumType.NOT_RDY
                org.somda.protosdc.biceps.model.ComponentActivation.EnumType.StndBy -> org.somda.protosdc.proto.model.biceps.ComponentActivationMsg.EnumType.STND_BY
                org.somda.protosdc.biceps.model.ComponentActivation.EnumType.Off -> org.somda.protosdc.proto.model.biceps.ComponentActivationMsg.EnumType.OFF
                org.somda.protosdc.biceps.model.ComponentActivation.EnumType.Shtdn -> org.somda.protosdc.proto.model.biceps.ComponentActivationMsg.EnumType.SHTDN
                org.somda.protosdc.biceps.model.ComponentActivation.EnumType.Fail -> org.somda.protosdc.proto.model.biceps.ComponentActivationMsg.EnumType.FAIL
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_ComponentActivation(source: org.somda.protosdc.biceps.model.ComponentActivation): org.somda.protosdc.proto.model.biceps.ComponentActivationMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ComponentActivationMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_ComponentActivation_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AlertActivation_EnumType(source: org.somda.protosdc.biceps.model.AlertActivation.EnumType): org.somda.protosdc.proto.model.biceps.AlertActivationMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.AlertActivation.EnumType.On -> org.somda.protosdc.proto.model.biceps.AlertActivationMsg.EnumType.ON
                org.somda.protosdc.biceps.model.AlertActivation.EnumType.Off -> org.somda.protosdc.proto.model.biceps.AlertActivationMsg.EnumType.OFF
                org.somda.protosdc.biceps.model.AlertActivation.EnumType.Psd -> org.somda.protosdc.proto.model.biceps.AlertActivationMsg.EnumType.PSD
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AlertActivation(source: org.somda.protosdc.biceps.model.AlertActivation): org.somda.protosdc.proto.model.biceps.AlertActivationMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AlertActivationMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_AlertActivation_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_TimeFrame(source: org.somda.protosdc.biceps.model.TimeFrame): org.somda.protosdc.proto.model.biceps.TimeFrameMsg {
            val builder = org.somda.protosdc.proto.model.biceps.TimeFrameMsg.newBuilder()
            source.startAttr?.let { field -> builder.startAttr = map_org_somda_protosdc_biceps_model_Timestamp(field) }
            source.endAttr?.let { field -> builder.endAttr = map_org_somda_protosdc_biceps_model_Timestamp(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SystemSignalActivation(source: org.somda.protosdc.biceps.model.SystemSignalActivation): org.somda.protosdc.proto.model.biceps.SystemSignalActivationMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SystemSignalActivationMsg.newBuilder()
            builder.manifestationAttr = map_org_somda_protosdc_biceps_model_AlertSignalManifestation(source.manifestationAttr)
            builder.stateAttr = map_org_somda_protosdc_biceps_model_AlertActivation(source.stateAttr)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_MdibVersionGroup(source: org.somda.protosdc.biceps.model.MdibVersionGroup): org.somda.protosdc.proto.model.biceps.MdibVersionGroupMsg {
            val builder = org.somda.protosdc.proto.model.biceps.MdibVersionGroupMsg.newBuilder()
            source.mdibVersionAttr?.let { field -> builder.mdibVersionAttr = map_org_somda_protosdc_biceps_model_VersionCounter(field) }
            builder.sequenceIdAttr = source.sequenceIdAttr
            source.instanceIdAttr?.let { field -> builder.instanceIdAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToUInt64(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ContainmentTreeInfo(source: org.somda.protosdc.biceps.model.ContainmentTreeInfo): org.somda.protosdc.proto.model.biceps.ContainmentTreeInfoMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ContainmentTreeInfoMsg.newBuilder()
            source.handleRefAttr?.let { field -> builder.handleRefAttr = map_org_somda_protosdc_biceps_model_HandleRef(field) }
            source.parentHandleRefAttr?.let { field -> builder.parentHandleRefAttr = map_org_somda_protosdc_biceps_model_HandleRef(field) }
            source.entryTypeAttr?.let { field -> builder.entryTypeAttr = map_org_somda_protosdc_biceps_model_QualifiedName(field) }
            source.childrenCountAttr?.let { field -> builder.childrenCountAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToInt32Value(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_EntryRef(source: org.somda.protosdc.biceps.model.EntryRef): org.somda.protosdc.proto.model.biceps.EntryRefMsg {
            val builder = org.somda.protosdc.proto.model.biceps.EntryRefMsg.newBuilder()
            builder.addAllHandleRef(source.handleRef.map { map_org_somda_protosdc_biceps_model_HandleRef(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ReferencedVersion(source: org.somda.protosdc.biceps.model.ReferencedVersion): org.somda.protosdc.proto.model.biceps.ReferencedVersionMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ReferencedVersionMsg.newBuilder()
            builder.versionCounter = map_org_somda_protosdc_biceps_model_VersionCounter(source.versionCounter)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_OperationRef(source: org.somda.protosdc.biceps.model.OperationRef): org.somda.protosdc.proto.model.biceps.OperationRefMsg {
            val builder = org.somda.protosdc.proto.model.biceps.OperationRefMsg.newBuilder()
            builder.addAllHandleRef(source.handleRef.map { map_org_somda_protosdc_biceps_model_HandleRef(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractReport(source: org.somda.protosdc.biceps.model.AbstractReport): org.somda.protosdc.proto.model.biceps.AbstractReportMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractReportMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.mdibVersionGroupAttr = map_org_somda_protosdc_biceps_model_MdibVersionGroup(source.mdibVersionGroupAttr)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractReportPart(source: org.somda.protosdc.biceps.model.AbstractReportPart): org.somda.protosdc.proto.model.biceps.AbstractReportPartMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractReportPartMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            source.sourceMds?.let { field -> builder.sourceMds = map_org_somda_protosdc_biceps_model_HandleRef(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_LocationDetail(source: org.somda.protosdc.biceps.model.LocationDetail): org.somda.protosdc.proto.model.biceps.LocationDetailMsg {
            val builder = org.somda.protosdc.proto.model.biceps.LocationDetailMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            source.poCAttr?.let { field -> builder.poCAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            source.roomAttr?.let { field -> builder.roomAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            source.bedAttr?.let { field -> builder.bedAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            source.facilityAttr?.let { field -> builder.facilityAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            source.buildingAttr?.let { field -> builder.buildingAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            source.floorAttr?.let { field -> builder.floorAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_VersionFrame(source: org.somda.protosdc.biceps.model.VersionFrame): org.somda.protosdc.proto.model.biceps.VersionFrameMsg {
            val builder = org.somda.protosdc.proto.model.biceps.VersionFrameMsg.newBuilder()
            source.startAttr?.let { field -> builder.startAttr = map_org_somda_protosdc_biceps_model_ReferencedVersion(field) }
            source.endAttr?.let { field -> builder.endAttr = map_org_somda_protosdc_biceps_model_ReferencedVersion(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_LocalizedText(source: org.somda.protosdc.biceps.model.LocalizedText): org.somda.protosdc.proto.model.biceps.LocalizedTextMsg {
            val builder = org.somda.protosdc.proto.model.biceps.LocalizedTextMsg.newBuilder()
            builder.localizedTextContent = map_org_somda_protosdc_biceps_model_LocalizedTextContent(source.localizedTextContent)
            source.refAttr?.let { field -> builder.refAttr = map_org_somda_protosdc_biceps_model_LocalizedTextRef(field) }
            source.langAttr?.let { field -> builder.langAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            source.versionAttr?.let { field -> builder.versionAttr = map_org_somda_protosdc_biceps_model_ReferencedVersion(field) }
            source.textWidthAttr?.let { field -> builder.textWidthAttr = map_org_somda_protosdc_biceps_model_LocalizedTextWidth(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_RetrievabilityInfo(source: org.somda.protosdc.biceps.model.RetrievabilityInfo): org.somda.protosdc.proto.model.biceps.RetrievabilityInfoMsg {
            val builder = org.somda.protosdc.proto.model.biceps.RetrievabilityInfoMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.methodAttr = map_org_somda_protosdc_biceps_model_RetrievabilityMethod(source.methodAttr)
            source.updatePeriodAttr?.let { field -> builder.updatePeriodAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractGet(source: org.somda.protosdc.biceps.model.AbstractGet): org.somda.protosdc.proto.model.biceps.AbstractGetMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractGetMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractState(source: org.somda.protosdc.biceps.model.AbstractState): org.somda.protosdc.proto.model.biceps.AbstractStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractStateMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            source.stateVersionAttr?.let { field -> builder.stateVersionAttr = map_org_somda_protosdc_biceps_model_VersionCounter(field) }
            builder.descriptorHandleAttr = map_org_somda_protosdc_biceps_model_HandleRef(source.descriptorHandleAttr)
            source.descriptorVersionAttr?.let { field -> builder.descriptorVersionAttr = map_org_somda_protosdc_biceps_model_ReferencedVersion(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractGetResponse(source: org.somda.protosdc.biceps.model.AbstractGetResponse): org.somda.protosdc.proto.model.biceps.AbstractGetResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractGetResponseMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.mdibVersionGroupAttr = map_org_somda_protosdc_biceps_model_MdibVersionGroup(source.mdibVersionGroupAttr)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_Range(source: org.somda.protosdc.biceps.model.Range): org.somda.protosdc.proto.model.biceps.RangeMsg {
            val builder = org.somda.protosdc.proto.model.biceps.RangeMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            source.lowerAttr?.let { field -> builder.lowerAttr = mapProtoDecimalToBigDecimal(field) }
            source.upperAttr?.let { field -> builder.upperAttr = mapProtoDecimalToBigDecimal(field) }
            source.stepWidthAttr?.let { field -> builder.stepWidthAttr = mapProtoDecimalToBigDecimal(field) }
            source.relativeAccuracyAttr?.let { field -> builder.relativeAccuracyAttr = mapProtoDecimalToBigDecimal(field) }
            source.absoluteAccuracyAttr?.let { field -> builder.absoluteAccuracyAttr = mapProtoDecimalToBigDecimal(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractSet(source: org.somda.protosdc.biceps.model.AbstractSet): org.somda.protosdc.proto.model.biceps.AbstractSetMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractSetMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.operationHandleRef = map_org_somda_protosdc_biceps_model_HandleRef(source.operationHandleRef)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_BaseDemographics(source: org.somda.protosdc.biceps.model.BaseDemographics): org.somda.protosdc.proto.model.biceps.BaseDemographicsMsg {
            val builder = org.somda.protosdc.proto.model.biceps.BaseDemographicsMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            source.givenname?.let { field -> builder.givenname = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            builder.addAllMiddlename(source.middlename.map { it }.toList())
            source.familyname?.let { field -> builder.familyname = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            source.birthname?.let { field -> builder.birthname = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            source.title?.let { field -> builder.title = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractOperationState(source: org.somda.protosdc.biceps.model.AbstractOperationState): org.somda.protosdc.proto.model.biceps.AbstractOperationStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractOperationStateMsg.newBuilder()
            builder.abstractState = map_org_somda_protosdc_biceps_model_AbstractState(source.abstractState)
            builder.operatingModeAttr = map_org_somda_protosdc_biceps_model_OperatingMode(source.operatingModeAttr)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_CodedValue_Translation(source: org.somda.protosdc.biceps.model.CodedValue.Translation): org.somda.protosdc.proto.model.biceps.CodedValueMsg.TranslationMsg {
            val builder = org.somda.protosdc.proto.model.biceps.CodedValueMsg.TranslationMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.codeAttr = map_org_somda_protosdc_biceps_model_CodeIdentifier(source.codeAttr)
            source.codingSystemAttr?.let { field -> builder.codingSystemAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            source.codingSystemVersionAttr?.let { field -> builder.codingSystemVersionAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_CodedValue(source: org.somda.protosdc.biceps.model.CodedValue): org.somda.protosdc.proto.model.biceps.CodedValueMsg {
            val builder = org.somda.protosdc.proto.model.biceps.CodedValueMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.addAllCodingSystemName(source.codingSystemName.map { map_org_somda_protosdc_biceps_model_LocalizedText(it) }.toList())
            builder.addAllConceptDescription(source.conceptDescription.map { map_org_somda_protosdc_biceps_model_LocalizedText(it) }.toList())
            builder.addAllTranslation(source.translation.map { map_org_somda_protosdc_biceps_model_CodedValue_Translation(it) }.toList())
            builder.codeAttr = map_org_somda_protosdc_biceps_model_CodeIdentifier(source.codeAttr)
            source.codingSystemAttr?.let { field -> builder.codingSystemAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            source.codingSystemVersionAttr?.let { field -> builder.codingSystemVersionAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            source.symbolicCodeNameAttr?.let { field -> builder.symbolicCodeNameAttr = map_org_somda_protosdc_biceps_model_SymbolicCodeName(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetMdState(source: org.somda.protosdc.biceps.model.GetMdState): org.somda.protosdc.proto.model.biceps.GetMdStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetMdStateMsg.newBuilder()
            builder.abstractGet = map_org_somda_protosdc_biceps_model_AbstractGet(source.abstractGet)
            builder.addAllHandleRef(source.handleRef.map { map_org_somda_protosdc_biceps_model_HandleRef(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_Activate_Argument(source: org.somda.protosdc.biceps.model.Activate.Argument): org.somda.protosdc.proto.model.biceps.ActivateMsg.ArgumentMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ActivateMsg.ArgumentMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.argValue = source.argValue
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_Activate(source: org.somda.protosdc.biceps.model.Activate): org.somda.protosdc.proto.model.biceps.ActivateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ActivateMsg.newBuilder()
            builder.abstractSet = map_org_somda_protosdc_biceps_model_AbstractSet(source.abstractSet)
            builder.addAllArgument(source.argument.map { map_org_somda_protosdc_biceps_model_Activate_Argument(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetMdDescription(source: org.somda.protosdc.biceps.model.GetMdDescription): org.somda.protosdc.proto.model.biceps.GetMdDescriptionMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetMdDescriptionMsg.newBuilder()
            builder.abstractGet = map_org_somda_protosdc_biceps_model_AbstractGet(source.abstractGet)
            builder.addAllHandleRef(source.handleRef.map { map_org_somda_protosdc_biceps_model_HandleRef(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetStatesFromArchive(source: org.somda.protosdc.biceps.model.GetStatesFromArchive): org.somda.protosdc.proto.model.biceps.GetStatesFromArchiveMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetStatesFromArchiveMsg.newBuilder()
            builder.abstractGet = map_org_somda_protosdc_biceps_model_AbstractGet(source.abstractGet)
            source.stateRevisions?.let { field -> builder.stateRevisions = map_org_somda_protosdc_biceps_model_VersionFrame(field) }
            source.timeFrame?.let { field -> builder.timeFrame = map_org_somda_protosdc_biceps_model_TimeFrame(field) }
            builder.addAllHandle(source.handle.map { map_org_somda_protosdc_biceps_model_HandleRef(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SystemErrorReport_ReportPart(source: org.somda.protosdc.biceps.model.SystemErrorReport.ReportPart): org.somda.protosdc.proto.model.biceps.SystemErrorReportMsg.ReportPartMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SystemErrorReportMsg.ReportPartMsg.newBuilder()
            builder.abstractReportPart = map_org_somda_protosdc_biceps_model_AbstractReportPart(source.abstractReportPart)
            builder.errorCode = map_org_somda_protosdc_biceps_model_CodedValue(source.errorCode)
            source.errorInfo?.let { field -> builder.errorInfo = map_org_somda_protosdc_biceps_model_LocalizedText(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SystemErrorReport(source: org.somda.protosdc.biceps.model.SystemErrorReport): org.somda.protosdc.proto.model.biceps.SystemErrorReportMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SystemErrorReportMsg.newBuilder()
            builder.abstractReport = map_org_somda_protosdc_biceps_model_AbstractReport(source.abstractReport)
            builder.addAllReportPart(source.reportPart.map { map_org_somda_protosdc_biceps_model_SystemErrorReport_ReportPart(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetLocalizedText(source: org.somda.protosdc.biceps.model.GetLocalizedText): org.somda.protosdc.proto.model.biceps.GetLocalizedTextMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetLocalizedTextMsg.newBuilder()
            builder.abstractGet = map_org_somda_protosdc_biceps_model_AbstractGet(source.abstractGet)
            builder.addAllRef(source.ref.map { map_org_somda_protosdc_biceps_model_LocalizedTextRef(it) }.toList())
            source.version?.let { field -> builder.version = map_org_somda_protosdc_biceps_model_ReferencedVersion(field) }
            builder.addAllLang(source.lang.map { it }.toList())
            builder.addAllTextWidth(source.textWidth.map { map_org_somda_protosdc_biceps_model_LocalizedTextWidth(it) }.toList())
            builder.addAllNumberOfLines(source.numberOfLines.map { it }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetDescriptorsFromArchive(source: org.somda.protosdc.biceps.model.GetDescriptorsFromArchive): org.somda.protosdc.proto.model.biceps.GetDescriptorsFromArchiveMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetDescriptorsFromArchiveMsg.newBuilder()
            builder.abstractGet = map_org_somda_protosdc_biceps_model_AbstractGet(source.abstractGet)
            source.descriptorRevisions?.let { field -> builder.descriptorRevisions = map_org_somda_protosdc_biceps_model_VersionFrame(field) }
            source.timeFrame?.let { field -> builder.timeFrame = map_org_somda_protosdc_biceps_model_TimeFrame(field) }
            builder.addAllHandle(source.handle.map { map_org_somda_protosdc_biceps_model_HandleRef(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetDescriptor(source: org.somda.protosdc.biceps.model.GetDescriptor): org.somda.protosdc.proto.model.biceps.GetDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetDescriptorMsg.newBuilder()
            builder.abstractGet = map_org_somda_protosdc_biceps_model_AbstractGet(source.abstractGet)
            builder.addAllHandleRef(source.handleRef.map { map_org_somda_protosdc_biceps_model_HandleRef(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetContextStates(source: org.somda.protosdc.biceps.model.GetContextStates): org.somda.protosdc.proto.model.biceps.GetContextStatesMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetContextStatesMsg.newBuilder()
            builder.abstractGet = map_org_somda_protosdc_biceps_model_AbstractGet(source.abstractGet)
            builder.addAllHandleRef(source.handleRef.map { map_org_somda_protosdc_biceps_model_HandleRef(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_Retrievability(source: org.somda.protosdc.biceps.model.Retrievability): org.somda.protosdc.proto.model.biceps.RetrievabilityMsg {
            val builder = org.somda.protosdc.proto.model.biceps.RetrievabilityMsg.newBuilder()
            builder.addAllBy(source.by.map { map_org_somda_protosdc_biceps_model_RetrievabilityInfo(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetLocalizedTextResponse(source: org.somda.protosdc.biceps.model.GetLocalizedTextResponse): org.somda.protosdc.proto.model.biceps.GetLocalizedTextResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetLocalizedTextResponseMsg.newBuilder()
            builder.abstractGetResponse = map_org_somda_protosdc_biceps_model_AbstractGetResponse(source.abstractGetResponse)
            builder.addAllText(source.text.map { map_org_somda_protosdc_biceps_model_LocalizedText(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetSupportedLanguages(source: org.somda.protosdc.biceps.model.GetSupportedLanguages): org.somda.protosdc.proto.model.biceps.GetSupportedLanguagesMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetSupportedLanguagesMsg.newBuilder()
            builder.abstractGet = map_org_somda_protosdc_biceps_model_AbstractGet(source.abstractGet)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetMdib(source: org.somda.protosdc.biceps.model.GetMdib): org.somda.protosdc.proto.model.biceps.GetMdibMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetMdibMsg.newBuilder()
            builder.abstractGet = map_org_somda_protosdc_biceps_model_AbstractGet(source.abstractGet)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetValue(source: org.somda.protosdc.biceps.model.SetValue): org.somda.protosdc.proto.model.biceps.SetValueMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetValueMsg.newBuilder()
            builder.abstractSet = map_org_somda_protosdc_biceps_model_AbstractSet(source.abstractSet)
            builder.requestedNumericValue = mapProtoDecimalToBigDecimal(source.requestedNumericValue)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetContextStatesByFilter(source: org.somda.protosdc.biceps.model.GetContextStatesByFilter): org.somda.protosdc.proto.model.biceps.GetContextStatesByFilterMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetContextStatesByFilterMsg.newBuilder()
            builder.abstractGet = map_org_somda_protosdc_biceps_model_AbstractGet(source.abstractGet)
            builder.addAllFilter(source.filter.map { it }.toList())
            source.contextTypeAttr?.let { field -> builder.contextTypeAttr = map_org_somda_protosdc_biceps_model_QualifiedName(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetString(source: org.somda.protosdc.biceps.model.SetString): org.somda.protosdc.proto.model.biceps.SetStringMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetStringMsg.newBuilder()
            builder.abstractSet = map_org_somda_protosdc_biceps_model_AbstractSet(source.abstractSet)
            builder.requestedStringValue = source.requestedStringValue
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetSupportedLanguagesResponse(source: org.somda.protosdc.biceps.model.GetSupportedLanguagesResponse): org.somda.protosdc.proto.model.biceps.GetSupportedLanguagesResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetSupportedLanguagesResponseMsg.newBuilder()
            builder.abstractGetResponse = map_org_somda_protosdc_biceps_model_AbstractGetResponse(source.abstractGetResponse)
            builder.addAllLang(source.lang.map { it }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetContainmentTree(source: org.somda.protosdc.biceps.model.GetContainmentTree): org.somda.protosdc.proto.model.biceps.GetContainmentTreeMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetContainmentTreeMsg.newBuilder()
            builder.abstractGet = map_org_somda_protosdc_biceps_model_AbstractGet(source.abstractGet)
            builder.addAllHandleRef(source.handleRef.map { map_org_somda_protosdc_biceps_model_HandleRef(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetContextStateOperationState(source: org.somda.protosdc.biceps.model.SetContextStateOperationState): org.somda.protosdc.proto.model.biceps.SetContextStateOperationStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetContextStateOperationStateMsg.newBuilder()
            builder.abstractOperationState = map_org_somda_protosdc_biceps_model_AbstractOperationState(source.abstractOperationState)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_RemedyInfo(source: org.somda.protosdc.biceps.model.RemedyInfo): org.somda.protosdc.proto.model.biceps.RemedyInfoMsg {
            val builder = org.somda.protosdc.proto.model.biceps.RemedyInfoMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.addAllDescription(source.description.map { map_org_somda_protosdc_biceps_model_LocalizedText(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_InvocationInfo(source: org.somda.protosdc.biceps.model.InvocationInfo): org.somda.protosdc.proto.model.biceps.InvocationInfoMsg {
            val builder = org.somda.protosdc.proto.model.biceps.InvocationInfoMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.transactionId = map_org_somda_protosdc_biceps_model_TransactionId(source.transactionId)
            builder.invocationState = map_org_somda_protosdc_biceps_model_InvocationState(source.invocationState)
            source.invocationError?.let { field -> builder.invocationError = map_org_somda_protosdc_biceps_model_InvocationError(field) }
            builder.addAllInvocationErrorMessage(source.invocationErrorMessage.map { map_org_somda_protosdc_biceps_model_LocalizedText(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ContainmentTreeEntry(source: org.somda.protosdc.biceps.model.ContainmentTreeEntry): org.somda.protosdc.proto.model.biceps.ContainmentTreeEntryMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ContainmentTreeEntryMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            source.type?.let { field -> builder.type = map_org_somda_protosdc_biceps_model_CodedValue(field) }
            builder.containmentTreeInfoAttr = map_org_somda_protosdc_biceps_model_ContainmentTreeInfo(source.containmentTreeInfoAttr)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractMetricValue_MetricQuality(source: org.somda.protosdc.biceps.model.AbstractMetricValue.MetricQuality): org.somda.protosdc.proto.model.biceps.AbstractMetricValueMsg.MetricQualityMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractMetricValueMsg.MetricQualityMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.validityAttr = map_org_somda_protosdc_biceps_model_MeasurementValidity(source.validityAttr)
            source.modeAttr?.let { field -> builder.modeAttr = map_org_somda_protosdc_biceps_model_GenerationMode(field) }
            source.qiAttr?.let { field -> builder.qiAttr = map_org_somda_protosdc_biceps_model_QualityIndicator(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractMetricValue_Annotation(source: org.somda.protosdc.biceps.model.AbstractMetricValue.Annotation): org.somda.protosdc.proto.model.biceps.AbstractMetricValueMsg.AnnotationMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractMetricValueMsg.AnnotationMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.type = map_org_somda_protosdc_biceps_model_CodedValue(source.type)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractMetricValue(source: org.somda.protosdc.biceps.model.AbstractMetricValue): org.somda.protosdc.proto.model.biceps.AbstractMetricValueMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractMetricValueMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.metricQuality = map_org_somda_protosdc_biceps_model_AbstractMetricValue_MetricQuality(source.metricQuality)
            builder.addAllAnnotation(source.annotation.map { map_org_somda_protosdc_biceps_model_AbstractMetricValue_Annotation(it) }.toList())
            source.startTimeAttr?.let { field -> builder.startTimeAttr = map_org_somda_protosdc_biceps_model_Timestamp(field) }
            source.stopTimeAttr?.let { field -> builder.stopTimeAttr = map_org_somda_protosdc_biceps_model_Timestamp(field) }
            source.determinationTimeAttr?.let { field -> builder.determinationTimeAttr = map_org_somda_protosdc_biceps_model_Timestamp(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_StringMetricValue(source: org.somda.protosdc.biceps.model.StringMetricValue): org.somda.protosdc.proto.model.biceps.StringMetricValueMsg {
            val builder = org.somda.protosdc.proto.model.biceps.StringMetricValueMsg.newBuilder()
            builder.abstractMetricValue = map_org_somda_protosdc_biceps_model_AbstractMetricValue(source.abstractMetricValue)
            source.valueAttr?.let { field -> builder.valueAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_NumericMetricValue(source: org.somda.protosdc.biceps.model.NumericMetricValue): org.somda.protosdc.proto.model.biceps.NumericMetricValueMsg {
            val builder = org.somda.protosdc.proto.model.biceps.NumericMetricValueMsg.newBuilder()
            builder.abstractMetricValue = map_org_somda_protosdc_biceps_model_AbstractMetricValue(source.abstractMetricValue)
            source.valueAttr?.let { field -> builder.valueAttr = mapProtoDecimalToBigDecimal(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetValueOperationState(source: org.somda.protosdc.biceps.model.SetValueOperationState): org.somda.protosdc.proto.model.biceps.SetValueOperationStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetValueOperationStateMsg.newBuilder()
            builder.abstractOperationState = map_org_somda_protosdc_biceps_model_AbstractOperationState(source.abstractOperationState)
            builder.addAllAllowedRange(source.allowedRange.map { map_org_somda_protosdc_biceps_model_Range(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetComponentStateOperationState(source: org.somda.protosdc.biceps.model.SetComponentStateOperationState): org.somda.protosdc.proto.model.biceps.SetComponentStateOperationStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetComponentStateOperationStateMsg.newBuilder()
            builder.abstractOperationState = map_org_somda_protosdc_biceps_model_AbstractOperationState(source.abstractOperationState)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractAlertState(source: org.somda.protosdc.biceps.model.AbstractAlertState): org.somda.protosdc.proto.model.biceps.AbstractAlertStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractAlertStateMsg.newBuilder()
            builder.abstractState = map_org_somda_protosdc_biceps_model_AbstractState(source.abstractState)
            builder.activationStateAttr = map_org_somda_protosdc_biceps_model_AlertActivation(source.activationStateAttr)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_PhysicalConnectorInfo(source: org.somda.protosdc.biceps.model.PhysicalConnectorInfo): org.somda.protosdc.proto.model.biceps.PhysicalConnectorInfoMsg {
            val builder = org.somda.protosdc.proto.model.biceps.PhysicalConnectorInfoMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.addAllLabel(source.label.map { map_org_somda_protosdc_biceps_model_LocalizedText(it) }.toList())
            source.numberAttr?.let { field -> builder.numberAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToInt32Value(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetMetricStateOperationState(source: org.somda.protosdc.biceps.model.SetMetricStateOperationState): org.somda.protosdc.proto.model.biceps.SetMetricStateOperationStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetMetricStateOperationStateMsg.newBuilder()
            builder.abstractOperationState = map_org_somda_protosdc_biceps_model_AbstractOperationState(source.abstractOperationState)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_InstanceIdentifier_RootAttr(source: org.somda.protosdc.biceps.model.InstanceIdentifier.RootAttr): org.somda.protosdc.proto.model.biceps.InstanceIdentifierMsg.RootAttrMsg {
            val builder = org.somda.protosdc.proto.model.biceps.InstanceIdentifierMsg.RootAttrMsg.newBuilder()
            builder.anyURI = source.anyURI
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_InstanceIdentifier_ExtensionAttr(source: org.somda.protosdc.biceps.model.InstanceIdentifier.ExtensionAttr): org.somda.protosdc.proto.model.biceps.InstanceIdentifierMsg.ExtensionAttrMsg {
            val builder = org.somda.protosdc.proto.model.biceps.InstanceIdentifierMsg.ExtensionAttrMsg.newBuilder()
            builder.string = source.string
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_InstanceIdentifier(source: org.somda.protosdc.biceps.model.InstanceIdentifier): org.somda.protosdc.proto.model.biceps.InstanceIdentifierMsg {
            val builder = org.somda.protosdc.proto.model.biceps.InstanceIdentifierMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            source.type?.let { field -> builder.type = map_org_somda_protosdc_biceps_model_CodedValue(field) }
            builder.addAllIdentifierName(source.identifierName.map { map_org_somda_protosdc_biceps_model_LocalizedText(it) }.toList())
            source.rootAttr?.let { field -> builder.rootAttr = map_org_somda_protosdc_biceps_model_InstanceIdentifier_RootAttr(field) }
            source.extensionAttr?.let { field -> builder.extensionAttr = map_org_somda_protosdc_biceps_model_InstanceIdentifier_ExtensionAttr(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AlertConditionState(source: org.somda.protosdc.biceps.model.AlertConditionState): org.somda.protosdc.proto.model.biceps.AlertConditionStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AlertConditionStateMsg.newBuilder()
            builder.abstractAlertState = map_org_somda_protosdc_biceps_model_AbstractAlertState(source.abstractAlertState)
            source.actualConditionGenerationDelayAttr?.let { field -> builder.actualConditionGenerationDelayAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            source.actualPriorityAttr?.let { field -> builder.actualPriorityAttr = map_org_somda_protosdc_biceps_model_AlertConditionPriority(field) }
            source.rankAttr?.let { field -> builder.rankAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToInt32Value(field) }
            source.presenceAttr?.let { field -> builder.presenceAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToBoolValue(field) }
            source.determinationTimeAttr?.let { field -> builder.determinationTimeAttr = map_org_somda_protosdc_biceps_model_Timestamp(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractSetResponse(source: org.somda.protosdc.biceps.model.AbstractSetResponse): org.somda.protosdc.proto.model.biceps.AbstractSetResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractSetResponseMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.invocationInfo = map_org_somda_protosdc_biceps_model_InvocationInfo(source.invocationInfo)
            builder.mdibVersionGroupAttr = map_org_somda_protosdc_biceps_model_MdibVersionGroup(source.mdibVersionGroupAttr)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AlertSystemState(source: org.somda.protosdc.biceps.model.AlertSystemState): org.somda.protosdc.proto.model.biceps.AlertSystemStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AlertSystemStateMsg.newBuilder()
            builder.abstractAlertState = map_org_somda_protosdc_biceps_model_AbstractAlertState(source.abstractAlertState)
            builder.addAllSystemSignalActivation(source.systemSignalActivation.map { map_org_somda_protosdc_biceps_model_SystemSignalActivation(it) }.toList())
            source.lastSelfCheckAttr?.let { field -> builder.lastSelfCheckAttr = map_org_somda_protosdc_biceps_model_Timestamp(field) }
            source.selfCheckCountAttr?.let { field -> builder.selfCheckCountAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToInt64Value(field) }
            source.presentPhysiologicalAlarmConditionsAttr?.let { field -> builder.presentPhysiologicalAlarmConditionsAttr = map_org_somda_protosdc_biceps_model_AlertConditionReference(field) }
            source.presentTechnicalAlarmConditionsAttr?.let { field -> builder.presentTechnicalAlarmConditionsAttr = map_org_somda_protosdc_biceps_model_AlertConditionReference(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_CauseInfo(source: org.somda.protosdc.biceps.model.CauseInfo): org.somda.protosdc.proto.model.biceps.CauseInfoMsg {
            val builder = org.somda.protosdc.proto.model.biceps.CauseInfoMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            source.remedyInfo?.let { field -> builder.remedyInfo = map_org_somda_protosdc_biceps_model_RemedyInfo(field) }
            builder.addAllDescription(source.description.map { map_org_somda_protosdc_biceps_model_LocalizedText(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractMultiState(source: org.somda.protosdc.biceps.model.AbstractMultiState): org.somda.protosdc.proto.model.biceps.AbstractMultiStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractMultiStateMsg.newBuilder()
            builder.abstractState = map_org_somda_protosdc_biceps_model_AbstractState(source.abstractState)
            source.category?.let { field -> builder.category = map_org_somda_protosdc_biceps_model_CodedValue(field) }
            builder.handleAttr = map_org_somda_protosdc_biceps_model_Handle(source.handleAttr)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_Measurement(source: org.somda.protosdc.biceps.model.Measurement): org.somda.protosdc.proto.model.biceps.MeasurementMsg {
            val builder = org.somda.protosdc.proto.model.biceps.MeasurementMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.measurementUnit = map_org_somda_protosdc_biceps_model_CodedValue(source.measurementUnit)
            builder.measuredValueAttr = mapProtoDecimalToBigDecimal(source.measuredValueAttr)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetAlertStateOperationState(source: org.somda.protosdc.biceps.model.SetAlertStateOperationState): org.somda.protosdc.proto.model.biceps.SetAlertStateOperationStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetAlertStateOperationStateMsg.newBuilder()
            builder.abstractOperationState = map_org_somda_protosdc_biceps_model_AbstractOperationState(source.abstractOperationState)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractDescriptor(source: org.somda.protosdc.biceps.model.AbstractDescriptor): org.somda.protosdc.proto.model.biceps.AbstractDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractDescriptorMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            source.type?.let { field -> builder.type = map_org_somda_protosdc_biceps_model_CodedValue(field) }
            builder.handleAttr = map_org_somda_protosdc_biceps_model_Handle(source.handleAttr)
            source.descriptorVersionAttr?.let { field -> builder.descriptorVersionAttr = map_org_somda_protosdc_biceps_model_VersionCounter(field) }
            source.safetyClassificationAttr?.let { field -> builder.safetyClassificationAttr = map_org_somda_protosdc_biceps_model_SafetyClassification(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetStringOperationState_AllowedValues(source: org.somda.protosdc.biceps.model.SetStringOperationState.AllowedValues): org.somda.protosdc.proto.model.biceps.SetStringOperationStateMsg.AllowedValuesMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetStringOperationStateMsg.AllowedValuesMsg.newBuilder()
            builder.addAllValue(source.value.map { it }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetStringOperationState(source: org.somda.protosdc.biceps.model.SetStringOperationState): org.somda.protosdc.proto.model.biceps.SetStringOperationStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetStringOperationStateMsg.newBuilder()
            builder.abstractOperationState = map_org_somda_protosdc_biceps_model_AbstractOperationState(source.abstractOperationState)
            source.allowedValues?.let { field -> builder.allowedValues = map_org_somda_protosdc_biceps_model_SetStringOperationState_AllowedValues(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_PatientDemographicsCoreData_DateOfBirth(source: org.somda.protosdc.biceps.model.PatientDemographicsCoreData.DateOfBirth): org.somda.protosdc.proto.model.biceps.PatientDemographicsCoreDataMsg.DateOfBirthMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.PatientDemographicsCoreData.DateOfBirth.valueLocalDateTime -> org.somda.protosdc.proto.model.biceps.PatientDemographicsCoreDataMsg.DateOfBirthMsg.newBuilder().setDateTime(org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapLocalDateTime(source.value)).build()
                is org.somda.protosdc.biceps.model.PatientDemographicsCoreData.DateOfBirth.valueLocalDate -> org.somda.protosdc.proto.model.biceps.PatientDemographicsCoreDataMsg.DateOfBirthMsg.newBuilder().setDate(org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapLocalDate(source.value)).build()
                is org.somda.protosdc.biceps.model.PatientDemographicsCoreData.DateOfBirth.valueYearMonth -> org.somda.protosdc.proto.model.biceps.PatientDemographicsCoreDataMsg.DateOfBirthMsg.newBuilder().setGYearMonth(org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapYearMonth(source.value)).build()
                is org.somda.protosdc.biceps.model.PatientDemographicsCoreData.DateOfBirth.valueYear -> org.somda.protosdc.proto.model.biceps.PatientDemographicsCoreDataMsg.DateOfBirthMsg.newBuilder().setGYear(org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapYear(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_PatientDemographicsCoreData(source: org.somda.protosdc.biceps.model.PatientDemographicsCoreData): org.somda.protosdc.proto.model.biceps.PatientDemographicsCoreDataMsg {
            val builder = org.somda.protosdc.proto.model.biceps.PatientDemographicsCoreDataMsg.newBuilder()
            builder.baseDemographics = map_org_somda_protosdc_biceps_model_BaseDemographics(source.baseDemographics)
            source.sex?.let { field -> builder.sex = map_org_somda_protosdc_biceps_model_Sex(field) }
            source.patientType?.let { field -> builder.patientType = map_org_somda_protosdc_biceps_model_PatientType(field) }
            source.dateOfBirth?.let { field -> builder.dateOfBirth = map_org_somda_protosdc_biceps_model_PatientDemographicsCoreData_DateOfBirth(field) }
            source.height?.let { field -> builder.height = map_org_somda_protosdc_biceps_model_Measurement(field) }
            source.weight?.let { field -> builder.weight = map_org_somda_protosdc_biceps_model_Measurement(field) }
            source.race?.let { field -> builder.race = map_org_somda_protosdc_biceps_model_CodedValue(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ActivateOperationState(source: org.somda.protosdc.biceps.model.ActivateOperationState): org.somda.protosdc.proto.model.biceps.ActivateOperationStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ActivateOperationStateMsg.newBuilder()
            builder.abstractOperationState = map_org_somda_protosdc_biceps_model_AbstractOperationState(source.abstractOperationState)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractMetricState(source: org.somda.protosdc.biceps.model.AbstractMetricState): org.somda.protosdc.proto.model.biceps.AbstractMetricStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractMetricStateMsg.newBuilder()
            builder.abstractState = map_org_somda_protosdc_biceps_model_AbstractState(source.abstractState)
            builder.addAllBodySite(source.bodySite.map { map_org_somda_protosdc_biceps_model_CodedValue(it) }.toList())
            source.physicalConnector?.let { field -> builder.physicalConnector = map_org_somda_protosdc_biceps_model_PhysicalConnectorInfo(field) }
            source.activationStateAttr?.let { field -> builder.activationStateAttr = map_org_somda_protosdc_biceps_model_ComponentActivation(field) }
            source.activeDeterminationPeriodAttr?.let { field -> builder.activeDeterminationPeriodAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            source.lifeTimePeriodAttr?.let { field -> builder.lifeTimePeriodAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ActivateResponse(source: org.somda.protosdc.biceps.model.ActivateResponse): org.somda.protosdc.proto.model.biceps.ActivateResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ActivateResponseMsg.newBuilder()
            builder.abstractSetResponse = map_org_somda_protosdc_biceps_model_AbstractSetResponse(source.abstractSetResponse)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetStringResponse(source: org.somda.protosdc.biceps.model.SetStringResponse): org.somda.protosdc.proto.model.biceps.SetStringResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetStringResponseMsg.newBuilder()
            builder.abstractSetResponse = map_org_somda_protosdc_biceps_model_AbstractSetResponse(source.abstractSetResponse)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetValueResponse(source: org.somda.protosdc.biceps.model.SetValueResponse): org.somda.protosdc.proto.model.biceps.SetValueResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetValueResponseMsg.newBuilder()
            builder.abstractSetResponse = map_org_somda_protosdc_biceps_model_AbstractSetResponse(source.abstractSetResponse)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetComponentStateResponse(source: org.somda.protosdc.biceps.model.SetComponentStateResponse): org.somda.protosdc.proto.model.biceps.SetComponentStateResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetComponentStateResponseMsg.newBuilder()
            builder.abstractSetResponse = map_org_somda_protosdc_biceps_model_AbstractSetResponse(source.abstractSetResponse)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetMetricStateResponse(source: org.somda.protosdc.biceps.model.SetMetricStateResponse): org.somda.protosdc.proto.model.biceps.SetMetricStateResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetMetricStateResponseMsg.newBuilder()
            builder.abstractSetResponse = map_org_somda_protosdc_biceps_model_AbstractSetResponse(source.abstractSetResponse)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetContextStateResponse(source: org.somda.protosdc.biceps.model.SetContextStateResponse): org.somda.protosdc.proto.model.biceps.SetContextStateResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetContextStateResponseMsg.newBuilder()
            builder.abstractSetResponse = map_org_somda_protosdc_biceps_model_AbstractSetResponse(source.abstractSetResponse)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetAlertStateResponse(source: org.somda.protosdc.biceps.model.SetAlertStateResponse): org.somda.protosdc.proto.model.biceps.SetAlertStateResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetAlertStateResponseMsg.newBuilder()
            builder.abstractSetResponse = map_org_somda_protosdc_biceps_model_AbstractSetResponse(source.abstractSetResponse)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ClinicalInfo_Criticality_EnumType(source: org.somda.protosdc.biceps.model.ClinicalInfo.Criticality.EnumType): org.somda.protosdc.proto.model.biceps.ClinicalInfoMsg.CriticalityMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.ClinicalInfo.Criticality.EnumType.Lo -> org.somda.protosdc.proto.model.biceps.ClinicalInfoMsg.CriticalityMsg.EnumType.LO
                org.somda.protosdc.biceps.model.ClinicalInfo.Criticality.EnumType.Hi -> org.somda.protosdc.proto.model.biceps.ClinicalInfoMsg.CriticalityMsg.EnumType.HI
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_ClinicalInfo_Criticality(source: org.somda.protosdc.biceps.model.ClinicalInfo.Criticality): org.somda.protosdc.proto.model.biceps.ClinicalInfoMsg.CriticalityMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ClinicalInfoMsg.CriticalityMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_ClinicalInfo_Criticality_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ClinicalInfo_RelatedMeasurement_ReferenceRange(source: org.somda.protosdc.biceps.model.ClinicalInfo.RelatedMeasurement.ReferenceRange): org.somda.protosdc.proto.model.biceps.ClinicalInfoMsg.RelatedMeasurementMsg.ReferenceRangeMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ClinicalInfoMsg.RelatedMeasurementMsg.ReferenceRangeMsg.newBuilder()
            builder.range = map_org_somda_protosdc_biceps_model_Range(source.range)
            source.meaning?.let { field -> builder.meaning = map_org_somda_protosdc_biceps_model_CodedValue(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ClinicalInfo_RelatedMeasurement(source: org.somda.protosdc.biceps.model.ClinicalInfo.RelatedMeasurement): org.somda.protosdc.proto.model.biceps.ClinicalInfoMsg.RelatedMeasurementMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ClinicalInfoMsg.RelatedMeasurementMsg.newBuilder()
            builder.value = map_org_somda_protosdc_biceps_model_Measurement(source.value)
            builder.addAllReferenceRange(source.referenceRange.map { map_org_somda_protosdc_biceps_model_ClinicalInfo_RelatedMeasurement_ReferenceRange(it) }.toList())
            source.validityAttr?.let { field -> builder.validityAttr = map_org_somda_protosdc_biceps_model_MeasurementValidity(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ClinicalInfo(source: org.somda.protosdc.biceps.model.ClinicalInfo): org.somda.protosdc.proto.model.biceps.ClinicalInfoMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ClinicalInfoMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            source.type?.let { field -> builder.type = map_org_somda_protosdc_biceps_model_CodedValue(field) }
            source.code?.let { field -> builder.code = map_org_somda_protosdc_biceps_model_CodedValue(field) }
            source.criticality?.let { field -> builder.criticality = map_org_somda_protosdc_biceps_model_ClinicalInfo_Criticality(field) }
            builder.addAllDescription(source.description.map { map_org_somda_protosdc_biceps_model_LocalizedText(it) }.toList())
            builder.addAllRelatedMeasurement(source.relatedMeasurement.map { map_org_somda_protosdc_biceps_model_ClinicalInfo_RelatedMeasurement(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_OperatingJurisdiction(source: org.somda.protosdc.biceps.model.OperatingJurisdiction): org.somda.protosdc.proto.model.biceps.OperatingJurisdictionMsg {
            val builder = org.somda.protosdc.proto.model.biceps.OperatingJurisdictionMsg.newBuilder()
            builder.instanceIdentifier = map_org_somda_protosdc_biceps_model_InstanceIdentifier(source.instanceIdentifier)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractAlertDescriptor(source: org.somda.protosdc.biceps.model.AbstractAlertDescriptor): org.somda.protosdc.proto.model.biceps.AbstractAlertDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractAlertDescriptorMsg.newBuilder()
            builder.abstractDescriptor = map_org_somda_protosdc_biceps_model_AbstractDescriptor(source.abstractDescriptor)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SampleArrayValue_ApplyAnnotation(source: org.somda.protosdc.biceps.model.SampleArrayValue.ApplyAnnotation): org.somda.protosdc.proto.model.biceps.SampleArrayValueMsg.ApplyAnnotationMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SampleArrayValueMsg.ApplyAnnotationMsg.newBuilder()
            builder.annotationIndexAttr = source.annotationIndexAttr
            builder.sampleIndexAttr = source.sampleIndexAttr
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SampleArrayValue(source: org.somda.protosdc.biceps.model.SampleArrayValue): org.somda.protosdc.proto.model.biceps.SampleArrayValueMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SampleArrayValueMsg.newBuilder()
            builder.abstractMetricValue = map_org_somda_protosdc_biceps_model_AbstractMetricValue(source.abstractMetricValue)
            builder.addAllApplyAnnotation(source.applyAnnotation.map { map_org_somda_protosdc_biceps_model_SampleArrayValue_ApplyAnnotation(it) }.toList())
            source.samplesAttr?.let { field -> builder.samplesAttr = map_org_somda_protosdc_biceps_model_RealTimeValueType(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ContainmentTree(source: org.somda.protosdc.biceps.model.ContainmentTree): org.somda.protosdc.proto.model.biceps.ContainmentTreeMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ContainmentTreeMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.addAllEntry(source.entry.map { map_org_somda_protosdc_biceps_model_ContainmentTreeEntry(it) }.toList())
            builder.containmentTreeInfoAttr = map_org_somda_protosdc_biceps_model_ContainmentTreeInfo(source.containmentTreeInfoAttr)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_LimitAlertConditionState(source: org.somda.protosdc.biceps.model.LimitAlertConditionState): org.somda.protosdc.proto.model.biceps.LimitAlertConditionStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.LimitAlertConditionStateMsg.newBuilder()
            builder.alertConditionState = map_org_somda_protosdc_biceps_model_AlertConditionState(source.alertConditionState)
            builder.limits = map_org_somda_protosdc_biceps_model_Range(source.limits)
            builder.monitoredAlertLimitsAttr = map_org_somda_protosdc_biceps_model_AlertConditionMonitoredLimits(source.monitoredAlertLimitsAttr)
            source.autoLimitActivationStateAttr?.let { field -> builder.autoLimitActivationStateAttr = map_org_somda_protosdc_biceps_model_AlertActivation(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_RealTimeSampleArrayMetricState(source: org.somda.protosdc.biceps.model.RealTimeSampleArrayMetricState): org.somda.protosdc.proto.model.biceps.RealTimeSampleArrayMetricStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.RealTimeSampleArrayMetricStateMsg.newBuilder()
            builder.abstractMetricState = map_org_somda_protosdc_biceps_model_AbstractMetricState(source.abstractMetricState)
            source.metricValue?.let { field -> builder.metricValue = map_org_somda_protosdc_biceps_model_SampleArrayValue(field) }
            builder.addAllPhysiologicalRange(source.physiologicalRange.map { map_org_somda_protosdc_biceps_model_Range(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_CalibrationInfo_CalibrationDocumentation_CalibrationResult(source: org.somda.protosdc.biceps.model.CalibrationInfo.CalibrationDocumentation.CalibrationResult): org.somda.protosdc.proto.model.biceps.CalibrationInfoMsg.CalibrationDocumentationMsg.CalibrationResultMsg {
            val builder = org.somda.protosdc.proto.model.biceps.CalibrationInfoMsg.CalibrationDocumentationMsg.CalibrationResultMsg.newBuilder()
            builder.code = map_org_somda_protosdc_biceps_model_CodedValue(source.code)
            builder.value = map_org_somda_protosdc_biceps_model_Measurement(source.value)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_CalibrationInfo_CalibrationDocumentation(source: org.somda.protosdc.biceps.model.CalibrationInfo.CalibrationDocumentation): org.somda.protosdc.proto.model.biceps.CalibrationInfoMsg.CalibrationDocumentationMsg {
            val builder = org.somda.protosdc.proto.model.biceps.CalibrationInfoMsg.CalibrationDocumentationMsg.newBuilder()
            builder.addAllDocumentation(source.documentation.map { map_org_somda_protosdc_biceps_model_LocalizedText(it) }.toList())
            builder.addAllCalibrationResult(source.calibrationResult.map { map_org_somda_protosdc_biceps_model_CalibrationInfo_CalibrationDocumentation_CalibrationResult(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_CalibrationInfo(source: org.somda.protosdc.biceps.model.CalibrationInfo): org.somda.protosdc.proto.model.biceps.CalibrationInfoMsg {
            val builder = org.somda.protosdc.proto.model.biceps.CalibrationInfoMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.addAllCalibrationDocumentation(source.calibrationDocumentation.map { map_org_somda_protosdc_biceps_model_CalibrationInfo_CalibrationDocumentation(it) }.toList())
            source.componentCalibrationStateAttr?.let { field -> builder.componentCalibrationStateAttr = map_org_somda_protosdc_biceps_model_CalibrationState(field) }
            source.typeAttr?.let { field -> builder.typeAttr = map_org_somda_protosdc_biceps_model_CalibrationType(field) }
            source.timeAttr?.let { field -> builder.timeAttr = map_org_somda_protosdc_biceps_model_Timestamp(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AlertSignalState(source: org.somda.protosdc.biceps.model.AlertSignalState): org.somda.protosdc.proto.model.biceps.AlertSignalStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AlertSignalStateMsg.newBuilder()
            builder.abstractAlertState = map_org_somda_protosdc_biceps_model_AbstractAlertState(source.abstractAlertState)
            source.actualSignalGenerationDelayAttr?.let { field -> builder.actualSignalGenerationDelayAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            source.presenceAttr?.let { field -> builder.presenceAttr = map_org_somda_protosdc_biceps_model_AlertSignalPresence(field) }
            source.locationAttr?.let { field -> builder.locationAttr = map_org_somda_protosdc_biceps_model_AlertSignalPrimaryLocation(field) }
            source.slotAttr?.let { field -> builder.slotAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToUInt32(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractOperationDescriptor_AccessLevelAttr_EnumType(source: org.somda.protosdc.biceps.model.AbstractOperationDescriptor.AccessLevelAttr.EnumType): org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorMsg.AccessLevelAttrMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.AbstractOperationDescriptor.AccessLevelAttr.EnumType.Usr -> org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorMsg.AccessLevelAttrMsg.EnumType.USR
                org.somda.protosdc.biceps.model.AbstractOperationDescriptor.AccessLevelAttr.EnumType.CSUsr -> org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorMsg.AccessLevelAttrMsg.EnumType.CS_USR
                org.somda.protosdc.biceps.model.AbstractOperationDescriptor.AccessLevelAttr.EnumType.RO -> org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorMsg.AccessLevelAttrMsg.EnumType.RO
                org.somda.protosdc.biceps.model.AbstractOperationDescriptor.AccessLevelAttr.EnumType.SP -> org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorMsg.AccessLevelAttrMsg.EnumType.SP
                org.somda.protosdc.biceps.model.AbstractOperationDescriptor.AccessLevelAttr.EnumType.Oth -> org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorMsg.AccessLevelAttrMsg.EnumType.OTH
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractOperationDescriptor_AccessLevelAttr(source: org.somda.protosdc.biceps.model.AbstractOperationDescriptor.AccessLevelAttr): org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorMsg.AccessLevelAttrMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorMsg.AccessLevelAttrMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_AbstractOperationDescriptor_AccessLevelAttr_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractOperationDescriptor(source: org.somda.protosdc.biceps.model.AbstractOperationDescriptor): org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorMsg.newBuilder()
            builder.abstractDescriptor = map_org_somda_protosdc_biceps_model_AbstractDescriptor(source.abstractDescriptor)
            builder.operationTargetAttr = map_org_somda_protosdc_biceps_model_HandleRef(source.operationTargetAttr)
            source.maxTimeToFinishAttr?.let { field -> builder.maxTimeToFinishAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            source.invocationEffectiveTimeoutAttr?.let { field -> builder.invocationEffectiveTimeoutAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            source.retriggerableAttr?.let { field -> builder.retriggerableAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToBoolValue(field) }
            source.accessLevelAttr?.let { field -> builder.accessLevelAttr = map_org_somda_protosdc_biceps_model_AbstractOperationDescriptor_AccessLevelAttr(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_NumericMetricState(source: org.somda.protosdc.biceps.model.NumericMetricState): org.somda.protosdc.proto.model.biceps.NumericMetricStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.NumericMetricStateMsg.newBuilder()
            builder.abstractMetricState = map_org_somda_protosdc_biceps_model_AbstractMetricState(source.abstractMetricState)
            source.metricValue?.let { field -> builder.metricValue = map_org_somda_protosdc_biceps_model_NumericMetricValue(field) }
            builder.addAllPhysiologicalRange(source.physiologicalRange.map { map_org_somda_protosdc_biceps_model_Range(it) }.toList())
            source.activeAveragingPeriodAttr?.let { field -> builder.activeAveragingPeriodAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractContextDescriptor(source: org.somda.protosdc.biceps.model.AbstractContextDescriptor): org.somda.protosdc.proto.model.biceps.AbstractContextDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractContextDescriptorMsg.newBuilder()
            builder.abstractDescriptor = map_org_somda_protosdc_biceps_model_AbstractDescriptor(source.abstractDescriptor)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_MeansContextDescriptor(source: org.somda.protosdc.biceps.model.MeansContextDescriptor): org.somda.protosdc.proto.model.biceps.MeansContextDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.MeansContextDescriptorMsg.newBuilder()
            builder.abstractContextDescriptor = map_org_somda_protosdc_biceps_model_AbstractContextDescriptor(source.abstractContextDescriptor)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_WorkflowContextDescriptor(source: org.somda.protosdc.biceps.model.WorkflowContextDescriptor): org.somda.protosdc.proto.model.biceps.WorkflowContextDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.WorkflowContextDescriptorMsg.newBuilder()
            builder.abstractContextDescriptor = map_org_somda_protosdc_biceps_model_AbstractContextDescriptor(source.abstractContextDescriptor)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AlertConditionDescriptor_CanEscalateAttr_EnumType(source: org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanEscalateAttr.EnumType): org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanEscalateAttrMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanEscalateAttr.EnumType.Lo -> org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanEscalateAttrMsg.EnumType.LO
                org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanEscalateAttr.EnumType.Me -> org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanEscalateAttrMsg.EnumType.ME
                org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanEscalateAttr.EnumType.Hi -> org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanEscalateAttrMsg.EnumType.HI
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AlertConditionDescriptor_CanEscalateAttr(source: org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanEscalateAttr): org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanEscalateAttrMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanEscalateAttrMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_AlertConditionDescriptor_CanEscalateAttr_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AlertConditionDescriptor_CanDeescalateAttr_EnumType(source: org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanDeescalateAttr.EnumType): org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanDeescalateAttrMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanDeescalateAttr.EnumType.Me -> org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanDeescalateAttrMsg.EnumType.ME
                org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanDeescalateAttr.EnumType.Lo -> org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanDeescalateAttrMsg.EnumType.LO
                org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanDeescalateAttr.EnumType.None -> org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanDeescalateAttrMsg.EnumType.NONE
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AlertConditionDescriptor_CanDeescalateAttr(source: org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanDeescalateAttr): org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanDeescalateAttrMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanDeescalateAttrMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_AlertConditionDescriptor_CanDeescalateAttr_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AlertConditionDescriptor(source: org.somda.protosdc.biceps.model.AlertConditionDescriptor): org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.newBuilder()
            builder.abstractAlertDescriptor = map_org_somda_protosdc_biceps_model_AbstractAlertDescriptor(source.abstractAlertDescriptor)
            builder.addAllSource(source.source.map { map_org_somda_protosdc_biceps_model_HandleRef(it) }.toList())
            builder.addAllCauseInfo(source.causeInfo.map { map_org_somda_protosdc_biceps_model_CauseInfo(it) }.toList())
            builder.kindAttr = map_org_somda_protosdc_biceps_model_AlertConditionKind(source.kindAttr)
            builder.priorityAttr = map_org_somda_protosdc_biceps_model_AlertConditionPriority(source.priorityAttr)
            source.defaultConditionGenerationDelayAttr?.let { field -> builder.defaultConditionGenerationDelayAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            source.canEscalateAttr?.let { field -> builder.canEscalateAttr = map_org_somda_protosdc_biceps_model_AlertConditionDescriptor_CanEscalateAttr(field) }
            source.canDeescalateAttr?.let { field -> builder.canDeescalateAttr = map_org_somda_protosdc_biceps_model_AlertConditionDescriptor_CanDeescalateAttr(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_DistributionSampleArrayMetricState(source: org.somda.protosdc.biceps.model.DistributionSampleArrayMetricState): org.somda.protosdc.proto.model.biceps.DistributionSampleArrayMetricStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.DistributionSampleArrayMetricStateMsg.newBuilder()
            builder.abstractMetricState = map_org_somda_protosdc_biceps_model_AbstractMetricState(source.abstractMetricState)
            source.metricValue?.let { field -> builder.metricValue = map_org_somda_protosdc_biceps_model_SampleArrayValue(field) }
            builder.addAllPhysiologicalRange(source.physiologicalRange.map { map_org_somda_protosdc_biceps_model_Range(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_PatientContextDescriptor(source: org.somda.protosdc.biceps.model.PatientContextDescriptor): org.somda.protosdc.proto.model.biceps.PatientContextDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.PatientContextDescriptorMsg.newBuilder()
            builder.abstractContextDescriptor = map_org_somda_protosdc_biceps_model_AbstractContextDescriptor(source.abstractContextDescriptor)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AlertSignalDescriptor(source: org.somda.protosdc.biceps.model.AlertSignalDescriptor): org.somda.protosdc.proto.model.biceps.AlertSignalDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AlertSignalDescriptorMsg.newBuilder()
            builder.abstractAlertDescriptor = map_org_somda_protosdc_biceps_model_AbstractAlertDescriptor(source.abstractAlertDescriptor)
            source.conditionSignaledAttr?.let { field -> builder.conditionSignaledAttr = map_org_somda_protosdc_biceps_model_HandleRef(field) }
            builder.manifestationAttr = map_org_somda_protosdc_biceps_model_AlertSignalManifestation(source.manifestationAttr)
            builder.latchingAttr = source.latchingAttr
            source.defaultSignalGenerationDelayAttr?.let { field -> builder.defaultSignalGenerationDelayAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            source.minSignalGenerationDelayAttr?.let { field -> builder.minSignalGenerationDelayAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            source.maxSignalGenerationDelayAttr?.let { field -> builder.maxSignalGenerationDelayAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            source.signalDelegationSupportedAttr?.let { field -> builder.signalDelegationSupportedAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToBoolValue(field) }
            source.acknowledgementSupportedAttr?.let { field -> builder.acknowledgementSupportedAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToBoolValue(field) }
            source.acknowledgeTimeoutAttr?.let { field -> builder.acknowledgeTimeoutAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_StringMetricState(source: org.somda.protosdc.biceps.model.StringMetricState): org.somda.protosdc.proto.model.biceps.StringMetricStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.StringMetricStateMsg.newBuilder()
            builder.abstractMetricState = map_org_somda_protosdc_biceps_model_AbstractMetricState(source.abstractMetricState)
            source.metricValue?.let { field -> builder.metricValue = map_org_somda_protosdc_biceps_model_StringMetricValue(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ObservedValueStream_Value(source: org.somda.protosdc.biceps.model.ObservedValueStream.Value): org.somda.protosdc.proto.model.biceps.ObservedValueStreamMsg.ValueMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ObservedValueStreamMsg.ValueMsg.newBuilder()
            source.value?.let { field -> builder.value = map_org_somda_protosdc_biceps_model_SampleArrayValue(field) }
            builder.metricAttr = map_org_somda_protosdc_biceps_model_HandleRef(source.metricAttr)
            source.stateVersionAttr?.let { field -> builder.stateVersionAttr = map_org_somda_protosdc_biceps_model_VersionCounter(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ObservedValueStream(source: org.somda.protosdc.biceps.model.ObservedValueStream): org.somda.protosdc.proto.model.biceps.ObservedValueStreamMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ObservedValueStreamMsg.newBuilder()
            builder.abstractReport = map_org_somda_protosdc_biceps_model_AbstractReport(source.abstractReport)
            builder.addAllValue(source.value.map { map_org_somda_protosdc_biceps_model_ObservedValueStream_Value(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_WaveformStream(source: org.somda.protosdc.biceps.model.WaveformStream): org.somda.protosdc.proto.model.biceps.WaveformStreamMsg {
            val builder = org.somda.protosdc.proto.model.biceps.WaveformStreamMsg.newBuilder()
            builder.abstractReport = map_org_somda_protosdc_biceps_model_AbstractReport(source.abstractReport)
            builder.addAllState(source.state.map { map_org_somda_protosdc_biceps_model_RealTimeSampleArrayMetricState(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetContainmentTreeResponse(source: org.somda.protosdc.biceps.model.GetContainmentTreeResponse): org.somda.protosdc.proto.model.biceps.GetContainmentTreeResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetContainmentTreeResponseMsg.newBuilder()
            builder.abstractGetResponse = map_org_somda_protosdc_biceps_model_AbstractGetResponse(source.abstractGetResponse)
            builder.containmentTree = map_org_somda_protosdc_biceps_model_ContainmentTree(source.containmentTree)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_LimitAlertConditionDescriptor(source: org.somda.protosdc.biceps.model.LimitAlertConditionDescriptor): org.somda.protosdc.proto.model.biceps.LimitAlertConditionDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.LimitAlertConditionDescriptorMsg.newBuilder()
            builder.alertConditionDescriptor = map_org_somda_protosdc_biceps_model_AlertConditionDescriptor(source.alertConditionDescriptor)
            builder.maxLimits = map_org_somda_protosdc_biceps_model_Range(source.maxLimits)
            source.autoLimitSupportedAttr?.let { field -> builder.autoLimitSupportedAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToBoolValue(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_OperatorContextDescriptor(source: org.somda.protosdc.biceps.model.OperatorContextDescriptor): org.somda.protosdc.proto.model.biceps.OperatorContextDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.OperatorContextDescriptorMsg.newBuilder()
            builder.abstractContextDescriptor = map_org_somda_protosdc_biceps_model_AbstractContextDescriptor(source.abstractContextDescriptor)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractDeviceComponentState(source: org.somda.protosdc.biceps.model.AbstractDeviceComponentState): org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateMsg.newBuilder()
            builder.abstractState = map_org_somda_protosdc_biceps_model_AbstractState(source.abstractState)
            source.calibrationInfo?.let { field -> builder.calibrationInfo = map_org_somda_protosdc_biceps_model_CalibrationInfo(field) }
            source.nextCalibration?.let { field -> builder.nextCalibration = map_org_somda_protosdc_biceps_model_CalibrationInfo(field) }
            source.physicalConnector?.let { field -> builder.physicalConnector = map_org_somda_protosdc_biceps_model_PhysicalConnectorInfo(field) }
            source.activationStateAttr?.let { field -> builder.activationStateAttr = map_org_somda_protosdc_biceps_model_ComponentActivation(field) }
            source.operatingHoursAttr?.let { field -> builder.operatingHoursAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToUInt32(field) }
            source.operatingCyclesAttr?.let { field -> builder.operatingCyclesAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToInt32Value(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ChannelState(source: org.somda.protosdc.biceps.model.ChannelState): org.somda.protosdc.proto.model.biceps.ChannelStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ChannelStateMsg.newBuilder()
            builder.abstractDeviceComponentState = map_org_somda_protosdc_biceps_model_AbstractDeviceComponentState(source.abstractDeviceComponentState)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetStringOperationDescriptor(source: org.somda.protosdc.biceps.model.SetStringOperationDescriptor): org.somda.protosdc.proto.model.biceps.SetStringOperationDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetStringOperationDescriptorMsg.newBuilder()
            builder.abstractOperationDescriptor = map_org_somda_protosdc_biceps_model_AbstractOperationDescriptor(source.abstractOperationDescriptor)
            source.maxLengthAttr?.let { field -> builder.maxLengthAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToUInt64(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ClockState(source: org.somda.protosdc.biceps.model.ClockState): org.somda.protosdc.proto.model.biceps.ClockStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ClockStateMsg.newBuilder()
            builder.abstractDeviceComponentState = map_org_somda_protosdc_biceps_model_AbstractDeviceComponentState(source.abstractDeviceComponentState)
            source.activeSyncProtocol?.let { field -> builder.activeSyncProtocol = map_org_somda_protosdc_biceps_model_CodedValue(field) }
            builder.addAllReferenceSource(source.referenceSource.map { it }.toList())
            source.dateAndTimeAttr?.let { field -> builder.dateAndTimeAttr = map_org_somda_protosdc_biceps_model_Timestamp(field) }
            builder.remoteSyncAttr = source.remoteSyncAttr
            source.accuracyAttr?.let { field -> builder.accuracyAttr = mapProtoDecimalToBigDecimal(field) }
            source.lastSetAttr?.let { field -> builder.lastSetAttr = map_org_somda_protosdc_biceps_model_Timestamp(field) }
            source.timeZoneAttr?.let { field -> builder.timeZoneAttr = map_org_somda_protosdc_biceps_model_TimeZone(field) }
            source.criticalUseAttr?.let { field -> builder.criticalUseAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToBoolValue(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractSetStateOperationDescriptor(source: org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptor): org.somda.protosdc.proto.model.biceps.AbstractSetStateOperationDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractSetStateOperationDescriptorMsg.newBuilder()
            builder.abstractOperationDescriptor = map_org_somda_protosdc_biceps_model_AbstractOperationDescriptor(source.abstractOperationDescriptor)
            builder.addAllModifiableData(source.modifiableData.map { it }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_EnsembleContextDescriptor(source: org.somda.protosdc.biceps.model.EnsembleContextDescriptor): org.somda.protosdc.proto.model.biceps.EnsembleContextDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.EnsembleContextDescriptorMsg.newBuilder()
            builder.abstractContextDescriptor = map_org_somda_protosdc_biceps_model_AbstractContextDescriptor(source.abstractContextDescriptor)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_EnumStringMetricState(source: org.somda.protosdc.biceps.model.EnumStringMetricState): org.somda.protosdc.proto.model.biceps.EnumStringMetricStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.EnumStringMetricStateMsg.newBuilder()
            builder.stringMetricState = map_org_somda_protosdc_biceps_model_StringMetricState(source.stringMetricState)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetComponentStateOperationDescriptor(source: org.somda.protosdc.biceps.model.SetComponentStateOperationDescriptor): org.somda.protosdc.proto.model.biceps.SetComponentStateOperationDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetComponentStateOperationDescriptorMsg.newBuilder()
            builder.abstractSetStateOperationDescriptor = map_org_somda_protosdc_biceps_model_AbstractSetStateOperationDescriptor(source.abstractSetStateOperationDescriptor)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SystemContextState(source: org.somda.protosdc.biceps.model.SystemContextState): org.somda.protosdc.proto.model.biceps.SystemContextStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SystemContextStateMsg.newBuilder()
            builder.abstractDeviceComponentState = map_org_somda_protosdc_biceps_model_AbstractDeviceComponentState(source.abstractDeviceComponentState)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractComplexDeviceComponentState(source: org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentState): org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentStateMsg.newBuilder()
            builder.abstractDeviceComponentState = map_org_somda_protosdc_biceps_model_AbstractDeviceComponentState(source.abstractDeviceComponentState)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetAlertStateOperationDescriptor(source: org.somda.protosdc.biceps.model.SetAlertStateOperationDescriptor): org.somda.protosdc.proto.model.biceps.SetAlertStateOperationDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetAlertStateOperationDescriptorMsg.newBuilder()
            builder.abstractSetStateOperationDescriptor = map_org_somda_protosdc_biceps_model_AbstractSetStateOperationDescriptor(source.abstractSetStateOperationDescriptor)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetValueOperationDescriptor(source: org.somda.protosdc.biceps.model.SetValueOperationDescriptor): org.somda.protosdc.proto.model.biceps.SetValueOperationDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetValueOperationDescriptorMsg.newBuilder()
            builder.abstractOperationDescriptor = map_org_somda_protosdc_biceps_model_AbstractOperationDescriptor(source.abstractOperationDescriptor)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_LocationContextDescriptor(source: org.somda.protosdc.biceps.model.LocationContextDescriptor): org.somda.protosdc.proto.model.biceps.LocationContextDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.LocationContextDescriptorMsg.newBuilder()
            builder.abstractContextDescriptor = map_org_somda_protosdc_biceps_model_AbstractContextDescriptor(source.abstractContextDescriptor)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetMetricStateOperationDescriptor(source: org.somda.protosdc.biceps.model.SetMetricStateOperationDescriptor): org.somda.protosdc.proto.model.biceps.SetMetricStateOperationDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetMetricStateOperationDescriptorMsg.newBuilder()
            builder.abstractSetStateOperationDescriptor = map_org_somda_protosdc_biceps_model_AbstractSetStateOperationDescriptor(source.abstractSetStateOperationDescriptor)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_VmdState(source: org.somda.protosdc.biceps.model.VmdState): org.somda.protosdc.proto.model.biceps.VmdStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.VmdStateMsg.newBuilder()
            builder.abstractComplexDeviceComponentState = map_org_somda_protosdc_biceps_model_AbstractComplexDeviceComponentState(source.abstractComplexDeviceComponentState)
            source.operatingJurisdiction?.let { field -> builder.operatingJurisdiction = map_org_somda_protosdc_biceps_model_OperatingJurisdiction(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetContextStateOperationDescriptor(source: org.somda.protosdc.biceps.model.SetContextStateOperationDescriptor): org.somda.protosdc.proto.model.biceps.SetContextStateOperationDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetContextStateOperationDescriptorMsg.newBuilder()
            builder.abstractSetStateOperationDescriptor = map_org_somda_protosdc_biceps_model_AbstractSetStateOperationDescriptor(source.abstractSetStateOperationDescriptor)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ActivateOperationDescriptor_Argument(source: org.somda.protosdc.biceps.model.ActivateOperationDescriptor.Argument): org.somda.protosdc.proto.model.biceps.ActivateOperationDescriptorMsg.ArgumentMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ActivateOperationDescriptorMsg.ArgumentMsg.newBuilder()
            builder.argName = map_org_somda_protosdc_biceps_model_CodedValue(source.argName)
            builder.arg = map_org_somda_protosdc_biceps_model_QualifiedName(source.arg)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ActivateOperationDescriptor(source: org.somda.protosdc.biceps.model.ActivateOperationDescriptor): org.somda.protosdc.proto.model.biceps.ActivateOperationDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ActivateOperationDescriptorMsg.newBuilder()
            builder.abstractSetStateOperationDescriptor = map_org_somda_protosdc_biceps_model_AbstractSetStateOperationDescriptor(source.abstractSetStateOperationDescriptor)
            builder.addAllArgument(source.argument.map { map_org_somda_protosdc_biceps_model_ActivateOperationDescriptor_Argument(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_BatteryState_ChargeStatusAttr_EnumType(source: org.somda.protosdc.biceps.model.BatteryState.ChargeStatusAttr.EnumType): org.somda.protosdc.proto.model.biceps.BatteryStateMsg.ChargeStatusAttrMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.BatteryState.ChargeStatusAttr.EnumType.Ful -> org.somda.protosdc.proto.model.biceps.BatteryStateMsg.ChargeStatusAttrMsg.EnumType.FUL
                org.somda.protosdc.biceps.model.BatteryState.ChargeStatusAttr.EnumType.ChB -> org.somda.protosdc.proto.model.biceps.BatteryStateMsg.ChargeStatusAttrMsg.EnumType.CH_B
                org.somda.protosdc.biceps.model.BatteryState.ChargeStatusAttr.EnumType.DisChB -> org.somda.protosdc.proto.model.biceps.BatteryStateMsg.ChargeStatusAttrMsg.EnumType.DIS_CH_B
                org.somda.protosdc.biceps.model.BatteryState.ChargeStatusAttr.EnumType.DEB -> org.somda.protosdc.proto.model.biceps.BatteryStateMsg.ChargeStatusAttrMsg.EnumType.DEB
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_BatteryState_ChargeStatusAttr(source: org.somda.protosdc.biceps.model.BatteryState.ChargeStatusAttr): org.somda.protosdc.proto.model.biceps.BatteryStateMsg.ChargeStatusAttrMsg {
            val builder = org.somda.protosdc.proto.model.biceps.BatteryStateMsg.ChargeStatusAttrMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_BatteryState_ChargeStatusAttr_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_BatteryState(source: org.somda.protosdc.biceps.model.BatteryState): org.somda.protosdc.proto.model.biceps.BatteryStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.BatteryStateMsg.newBuilder()
            builder.abstractDeviceComponentState = map_org_somda_protosdc_biceps_model_AbstractDeviceComponentState(source.abstractDeviceComponentState)
            source.capacityRemaining?.let { field -> builder.capacityRemaining = map_org_somda_protosdc_biceps_model_Measurement(field) }
            source.voltage?.let { field -> builder.voltage = map_org_somda_protosdc_biceps_model_Measurement(field) }
            source.current?.let { field -> builder.current = map_org_somda_protosdc_biceps_model_Measurement(field) }
            source.temperature?.let { field -> builder.temperature = map_org_somda_protosdc_biceps_model_Measurement(field) }
            source.remainingBatteryTime?.let { field -> builder.remainingBatteryTime = map_org_somda_protosdc_biceps_model_Measurement(field) }
            source.chargeStatusAttr?.let { field -> builder.chargeStatusAttr = map_org_somda_protosdc_biceps_model_BatteryState_ChargeStatusAttr(field) }
            source.chargeCyclesAttr?.let { field -> builder.chargeCyclesAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToUInt32(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_MdsState(source: org.somda.protosdc.biceps.model.MdsState): org.somda.protosdc.proto.model.biceps.MdsStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.MdsStateMsg.newBuilder()
            builder.abstractComplexDeviceComponentState = map_org_somda_protosdc_biceps_model_AbstractComplexDeviceComponentState(source.abstractComplexDeviceComponentState)
            source.operatingJurisdiction?.let { field -> builder.operatingJurisdiction = map_org_somda_protosdc_biceps_model_OperatingJurisdiction(field) }
            source.langAttr?.let { field -> builder.langAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            source.operatingModeAttr?.let { field -> builder.operatingModeAttr = map_org_somda_protosdc_biceps_model_MdsOperatingMode(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ScoState_OperationGroup(source: org.somda.protosdc.biceps.model.ScoState.OperationGroup): org.somda.protosdc.proto.model.biceps.ScoStateMsg.OperationGroupMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ScoStateMsg.OperationGroupMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.type = map_org_somda_protosdc_biceps_model_CodedValue(source.type)
            source.operatingModeAttr?.let { field -> builder.operatingModeAttr = map_org_somda_protosdc_biceps_model_OperatingMode(field) }
            source.operationsAttr?.let { field -> builder.operationsAttr = map_org_somda_protosdc_biceps_model_OperationRef(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ScoState(source: org.somda.protosdc.biceps.model.ScoState): org.somda.protosdc.proto.model.biceps.ScoStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ScoStateMsg.newBuilder()
            builder.abstractDeviceComponentState = map_org_somda_protosdc_biceps_model_AbstractDeviceComponentState(source.abstractDeviceComponentState)
            builder.addAllOperationGroup(source.operationGroup.map { map_org_somda_protosdc_biceps_model_ScoState_OperationGroup(it) }.toList())
            source.invocationRequestedAttr?.let { field -> builder.invocationRequestedAttr = map_org_somda_protosdc_biceps_model_OperationRef(field) }
            source.invocationRequiredAttr?.let { field -> builder.invocationRequiredAttr = map_org_somda_protosdc_biceps_model_OperationRef(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_LocalizedTextContentOneOf(source: org.somda.protosdc.biceps.model.LocalizedTextContentOneOf): org.somda.protosdc.proto.model.biceps.LocalizedTextContentOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.LocalizedTextContentOneOf.valueLocalizedTextContent -> org.somda.protosdc.proto.model.biceps.LocalizedTextContentOneOfMsg.newBuilder().setLocalizedTextContent(map_org_somda_protosdc_biceps_model_LocalizedTextContent(source.value)).build()
                is org.somda.protosdc.biceps.model.LocalizedTextContentOneOf.valueLocalizedText -> org.somda.protosdc.proto.model.biceps.LocalizedTextContentOneOfMsg.newBuilder().setLocalizedText(map_org_somda_protosdc_biceps_model_LocalizedText(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractOperationStateOneOf(source: org.somda.protosdc.biceps.model.AbstractOperationStateOneOf): org.somda.protosdc.proto.model.biceps.AbstractOperationStateOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractOperationStateOneOf.valueAbstractOperationState -> org.somda.protosdc.proto.model.biceps.AbstractOperationStateOneOfMsg.newBuilder().setAbstractOperationState(map_org_somda_protosdc_biceps_model_AbstractOperationState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractOperationStateOneOf.valueActivateOperationState -> org.somda.protosdc.proto.model.biceps.AbstractOperationStateOneOfMsg.newBuilder().setActivateOperationState(map_org_somda_protosdc_biceps_model_ActivateOperationState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractOperationStateOneOf.valueSetAlertStateOperationState -> org.somda.protosdc.proto.model.biceps.AbstractOperationStateOneOfMsg.newBuilder().setSetAlertStateOperationState(map_org_somda_protosdc_biceps_model_SetAlertStateOperationState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractOperationStateOneOf.valueSetComponentStateOperationState -> org.somda.protosdc.proto.model.biceps.AbstractOperationStateOneOfMsg.newBuilder().setSetComponentStateOperationState(map_org_somda_protosdc_biceps_model_SetComponentStateOperationState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractOperationStateOneOf.valueSetContextStateOperationState -> org.somda.protosdc.proto.model.biceps.AbstractOperationStateOneOfMsg.newBuilder().setSetContextStateOperationState(map_org_somda_protosdc_biceps_model_SetContextStateOperationState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractOperationStateOneOf.valueSetMetricStateOperationState -> org.somda.protosdc.proto.model.biceps.AbstractOperationStateOneOfMsg.newBuilder().setSetMetricStateOperationState(map_org_somda_protosdc_biceps_model_SetMetricStateOperationState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractOperationStateOneOf.valueSetStringOperationState -> org.somda.protosdc.proto.model.biceps.AbstractOperationStateOneOfMsg.newBuilder().setSetStringOperationState(map_org_somda_protosdc_biceps_model_SetStringOperationState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractOperationStateOneOf.valueSetValueOperationState -> org.somda.protosdc.proto.model.biceps.AbstractOperationStateOneOfMsg.newBuilder().setSetValueOperationState(map_org_somda_protosdc_biceps_model_SetValueOperationState(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractMetricValueOneOf(source: org.somda.protosdc.biceps.model.AbstractMetricValueOneOf): org.somda.protosdc.proto.model.biceps.AbstractMetricValueOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractMetricValueOneOf.valueAbstractMetricValue -> org.somda.protosdc.proto.model.biceps.AbstractMetricValueOneOfMsg.newBuilder().setAbstractMetricValue(map_org_somda_protosdc_biceps_model_AbstractMetricValue(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMetricValueOneOf.valueNumericMetricValue -> org.somda.protosdc.proto.model.biceps.AbstractMetricValueOneOfMsg.newBuilder().setNumericMetricValue(map_org_somda_protosdc_biceps_model_NumericMetricValue(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMetricValueOneOf.valueSampleArrayValue -> org.somda.protosdc.proto.model.biceps.AbstractMetricValueOneOfMsg.newBuilder().setSampleArrayValue(map_org_somda_protosdc_biceps_model_SampleArrayValue(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMetricValueOneOf.valueStringMetricValue -> org.somda.protosdc.proto.model.biceps.AbstractMetricValueOneOfMsg.newBuilder().setStringMetricValue(map_org_somda_protosdc_biceps_model_StringMetricValue(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractAlertStateOneOf(source: org.somda.protosdc.biceps.model.AbstractAlertStateOneOf): org.somda.protosdc.proto.model.biceps.AbstractAlertStateOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractAlertStateOneOf.valueAbstractAlertState -> org.somda.protosdc.proto.model.biceps.AbstractAlertStateOneOfMsg.newBuilder().setAbstractAlertState(map_org_somda_protosdc_biceps_model_AbstractAlertState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractAlertStateOneOf.valueAlertConditionState -> org.somda.protosdc.proto.model.biceps.AbstractAlertStateOneOfMsg.newBuilder().setAlertConditionState(map_org_somda_protosdc_biceps_model_AlertConditionState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractAlertStateOneOf.valueAlertSignalState -> org.somda.protosdc.proto.model.biceps.AbstractAlertStateOneOfMsg.newBuilder().setAlertSignalState(map_org_somda_protosdc_biceps_model_AlertSignalState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractAlertStateOneOf.valueAlertSystemState -> org.somda.protosdc.proto.model.biceps.AbstractAlertStateOneOfMsg.newBuilder().setAlertSystemState(map_org_somda_protosdc_biceps_model_AlertSystemState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractAlertStateOneOf.valueLimitAlertConditionState -> org.somda.protosdc.proto.model.biceps.AbstractAlertStateOneOfMsg.newBuilder().setLimitAlertConditionState(map_org_somda_protosdc_biceps_model_LimitAlertConditionState(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractSetResponseOneOf(source: org.somda.protosdc.biceps.model.AbstractSetResponseOneOf): org.somda.protosdc.proto.model.biceps.AbstractSetResponseOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractSetResponseOneOf.valueAbstractSetResponse -> org.somda.protosdc.proto.model.biceps.AbstractSetResponseOneOfMsg.newBuilder().setAbstractSetResponse(map_org_somda_protosdc_biceps_model_AbstractSetResponse(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractSetResponseOneOf.valueActivateResponse -> org.somda.protosdc.proto.model.biceps.AbstractSetResponseOneOfMsg.newBuilder().setActivateResponse(map_org_somda_protosdc_biceps_model_ActivateResponse(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractSetResponseOneOf.valueSetAlertStateResponse -> org.somda.protosdc.proto.model.biceps.AbstractSetResponseOneOfMsg.newBuilder().setSetAlertStateResponse(map_org_somda_protosdc_biceps_model_SetAlertStateResponse(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractSetResponseOneOf.valueSetComponentStateResponse -> org.somda.protosdc.proto.model.biceps.AbstractSetResponseOneOfMsg.newBuilder().setSetComponentStateResponse(map_org_somda_protosdc_biceps_model_SetComponentStateResponse(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractSetResponseOneOf.valueSetContextStateResponse -> org.somda.protosdc.proto.model.biceps.AbstractSetResponseOneOfMsg.newBuilder().setSetContextStateResponse(map_org_somda_protosdc_biceps_model_SetContextStateResponse(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractSetResponseOneOf.valueSetMetricStateResponse -> org.somda.protosdc.proto.model.biceps.AbstractSetResponseOneOfMsg.newBuilder().setSetMetricStateResponse(map_org_somda_protosdc_biceps_model_SetMetricStateResponse(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractSetResponseOneOf.valueSetStringResponse -> org.somda.protosdc.proto.model.biceps.AbstractSetResponseOneOfMsg.newBuilder().setSetStringResponse(map_org_somda_protosdc_biceps_model_SetStringResponse(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractSetResponseOneOf.valueSetValueResponse -> org.somda.protosdc.proto.model.biceps.AbstractSetResponseOneOfMsg.newBuilder().setSetValueResponse(map_org_somda_protosdc_biceps_model_SetValueResponse(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(source: org.somda.protosdc.biceps.model.InstanceIdentifierOneOf): org.somda.protosdc.proto.model.biceps.InstanceIdentifierOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.InstanceIdentifierOneOf.valueInstanceIdentifier -> org.somda.protosdc.proto.model.biceps.InstanceIdentifierOneOfMsg.newBuilder().setInstanceIdentifier(map_org_somda_protosdc_biceps_model_InstanceIdentifier(source.value)).build()
                is org.somda.protosdc.biceps.model.InstanceIdentifierOneOf.valueOperatingJurisdiction -> org.somda.protosdc.proto.model.biceps.InstanceIdentifierOneOfMsg.newBuilder().setOperatingJurisdiction(map_org_somda_protosdc_biceps_model_OperatingJurisdiction(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AlertConditionStateOneOf(source: org.somda.protosdc.biceps.model.AlertConditionStateOneOf): org.somda.protosdc.proto.model.biceps.AlertConditionStateOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AlertConditionStateOneOf.valueAlertConditionState -> org.somda.protosdc.proto.model.biceps.AlertConditionStateOneOfMsg.newBuilder().setAlertConditionState(map_org_somda_protosdc_biceps_model_AlertConditionState(source.value)).build()
                is org.somda.protosdc.biceps.model.AlertConditionStateOneOf.valueLimitAlertConditionState -> org.somda.protosdc.proto.model.biceps.AlertConditionStateOneOfMsg.newBuilder().setLimitAlertConditionState(map_org_somda_protosdc_biceps_model_LimitAlertConditionState(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractMetricStateOneOf(source: org.somda.protosdc.biceps.model.AbstractMetricStateOneOf): org.somda.protosdc.proto.model.biceps.AbstractMetricStateOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractMetricStateOneOf.valueAbstractMetricState -> org.somda.protosdc.proto.model.biceps.AbstractMetricStateOneOfMsg.newBuilder().setAbstractMetricState(map_org_somda_protosdc_biceps_model_AbstractMetricState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMetricStateOneOf.valueDistributionSampleArrayMetricState -> org.somda.protosdc.proto.model.biceps.AbstractMetricStateOneOfMsg.newBuilder().setDistributionSampleArrayMetricState(map_org_somda_protosdc_biceps_model_DistributionSampleArrayMetricState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMetricStateOneOf.valueEnumStringMetricState -> org.somda.protosdc.proto.model.biceps.AbstractMetricStateOneOfMsg.newBuilder().setEnumStringMetricState(map_org_somda_protosdc_biceps_model_EnumStringMetricState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMetricStateOneOf.valueNumericMetricState -> org.somda.protosdc.proto.model.biceps.AbstractMetricStateOneOfMsg.newBuilder().setNumericMetricState(map_org_somda_protosdc_biceps_model_NumericMetricState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMetricStateOneOf.valueRealTimeSampleArrayMetricState -> org.somda.protosdc.proto.model.biceps.AbstractMetricStateOneOfMsg.newBuilder().setRealTimeSampleArrayMetricState(map_org_somda_protosdc_biceps_model_RealTimeSampleArrayMetricState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMetricStateOneOf.valueStringMetricState -> org.somda.protosdc.proto.model.biceps.AbstractMetricStateOneOfMsg.newBuilder().setStringMetricState(map_org_somda_protosdc_biceps_model_StringMetricState(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractContextDescriptorOneOf(source: org.somda.protosdc.biceps.model.AbstractContextDescriptorOneOf): org.somda.protosdc.proto.model.biceps.AbstractContextDescriptorOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractContextDescriptorOneOf.valueAbstractContextDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractContextDescriptorOneOfMsg.newBuilder().setAbstractContextDescriptor(map_org_somda_protosdc_biceps_model_AbstractContextDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractContextDescriptorOneOf.valueEnsembleContextDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractContextDescriptorOneOfMsg.newBuilder().setEnsembleContextDescriptor(map_org_somda_protosdc_biceps_model_EnsembleContextDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractContextDescriptorOneOf.valueLocationContextDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractContextDescriptorOneOfMsg.newBuilder().setLocationContextDescriptor(map_org_somda_protosdc_biceps_model_LocationContextDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractContextDescriptorOneOf.valueMeansContextDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractContextDescriptorOneOfMsg.newBuilder().setMeansContextDescriptor(map_org_somda_protosdc_biceps_model_MeansContextDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractContextDescriptorOneOf.valueOperatorContextDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractContextDescriptorOneOfMsg.newBuilder().setOperatorContextDescriptor(map_org_somda_protosdc_biceps_model_OperatorContextDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractContextDescriptorOneOf.valuePatientContextDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractContextDescriptorOneOfMsg.newBuilder().setPatientContextDescriptor(map_org_somda_protosdc_biceps_model_PatientContextDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractContextDescriptorOneOf.valueWorkflowContextDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractContextDescriptorOneOfMsg.newBuilder().setWorkflowContextDescriptor(map_org_somda_protosdc_biceps_model_WorkflowContextDescriptor(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AlertConditionDescriptorOneOf(source: org.somda.protosdc.biceps.model.AlertConditionDescriptorOneOf): org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AlertConditionDescriptorOneOf.valueAlertConditionDescriptor -> org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorOneOfMsg.newBuilder().setAlertConditionDescriptor(map_org_somda_protosdc_biceps_model_AlertConditionDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AlertConditionDescriptorOneOf.valueLimitAlertConditionDescriptor -> org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorOneOfMsg.newBuilder().setLimitAlertConditionDescriptor(map_org_somda_protosdc_biceps_model_LimitAlertConditionDescriptor(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractDeviceComponentStateOneOf(source: org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf): org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf.valueAbstractDeviceComponentState -> org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg.newBuilder().setAbstractDeviceComponentState(map_org_somda_protosdc_biceps_model_AbstractDeviceComponentState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf.valueAbstractComplexDeviceComponentState -> org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg.newBuilder().setAbstractComplexDeviceComponentState(map_org_somda_protosdc_biceps_model_AbstractComplexDeviceComponentState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf.valueBatteryState -> org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg.newBuilder().setBatteryState(map_org_somda_protosdc_biceps_model_BatteryState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf.valueChannelState -> org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg.newBuilder().setChannelState(map_org_somda_protosdc_biceps_model_ChannelState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf.valueClockState -> org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg.newBuilder().setClockState(map_org_somda_protosdc_biceps_model_ClockState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf.valueMdsState -> org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg.newBuilder().setMdsState(map_org_somda_protosdc_biceps_model_MdsState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf.valueScoState -> org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg.newBuilder().setScoState(map_org_somda_protosdc_biceps_model_ScoState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf.valueSystemContextState -> org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg.newBuilder().setSystemContextState(map_org_somda_protosdc_biceps_model_SystemContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf.valueVmdState -> org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg.newBuilder().setVmdState(map_org_somda_protosdc_biceps_model_VmdState(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractOperationDescriptorOneOf(source: org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf): org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf.valueAbstractOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg.newBuilder().setAbstractOperationDescriptor(map_org_somda_protosdc_biceps_model_AbstractOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf.valueAbstractSetStateOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg.newBuilder().setAbstractSetStateOperationDescriptor(map_org_somda_protosdc_biceps_model_AbstractSetStateOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf.valueActivateOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg.newBuilder().setActivateOperationDescriptor(map_org_somda_protosdc_biceps_model_ActivateOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf.valueSetAlertStateOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg.newBuilder().setSetAlertStateOperationDescriptor(map_org_somda_protosdc_biceps_model_SetAlertStateOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf.valueSetComponentStateOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg.newBuilder().setSetComponentStateOperationDescriptor(map_org_somda_protosdc_biceps_model_SetComponentStateOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf.valueSetContextStateOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg.newBuilder().setSetContextStateOperationDescriptor(map_org_somda_protosdc_biceps_model_SetContextStateOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf.valueSetMetricStateOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg.newBuilder().setSetMetricStateOperationDescriptor(map_org_somda_protosdc_biceps_model_SetMetricStateOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf.valueSetStringOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg.newBuilder().setSetStringOperationDescriptor(map_org_somda_protosdc_biceps_model_SetStringOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf.valueSetValueOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg.newBuilder().setSetValueOperationDescriptor(map_org_somda_protosdc_biceps_model_SetValueOperationDescriptor(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_StringMetricStateOneOf(source: org.somda.protosdc.biceps.model.StringMetricStateOneOf): org.somda.protosdc.proto.model.biceps.StringMetricStateOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.StringMetricStateOneOf.valueStringMetricState -> org.somda.protosdc.proto.model.biceps.StringMetricStateOneOfMsg.newBuilder().setStringMetricState(map_org_somda_protosdc_biceps_model_StringMetricState(source.value)).build()
                is org.somda.protosdc.biceps.model.StringMetricStateOneOf.valueEnumStringMetricState -> org.somda.protosdc.proto.model.biceps.StringMetricStateOneOfMsg.newBuilder().setEnumStringMetricState(map_org_somda_protosdc_biceps_model_EnumStringMetricState(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractSetStateOperationDescriptorOneOf(source: org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptorOneOf): org.somda.protosdc.proto.model.biceps.AbstractSetStateOperationDescriptorOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptorOneOf.valueAbstractSetStateOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractSetStateOperationDescriptorOneOfMsg.newBuilder().setAbstractSetStateOperationDescriptor(map_org_somda_protosdc_biceps_model_AbstractSetStateOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptorOneOf.valueActivateOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractSetStateOperationDescriptorOneOfMsg.newBuilder().setActivateOperationDescriptor(map_org_somda_protosdc_biceps_model_ActivateOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptorOneOf.valueSetAlertStateOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractSetStateOperationDescriptorOneOfMsg.newBuilder().setSetAlertStateOperationDescriptor(map_org_somda_protosdc_biceps_model_SetAlertStateOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptorOneOf.valueSetComponentStateOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractSetStateOperationDescriptorOneOfMsg.newBuilder().setSetComponentStateOperationDescriptor(map_org_somda_protosdc_biceps_model_SetComponentStateOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptorOneOf.valueSetContextStateOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractSetStateOperationDescriptorOneOfMsg.newBuilder().setSetContextStateOperationDescriptor(map_org_somda_protosdc_biceps_model_SetContextStateOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptorOneOf.valueSetMetricStateOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractSetStateOperationDescriptorOneOfMsg.newBuilder().setSetMetricStateOperationDescriptor(map_org_somda_protosdc_biceps_model_SetMetricStateOperationDescriptor(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractComplexDeviceComponentStateOneOf(source: org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentStateOneOf): org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentStateOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentStateOneOf.valueAbstractComplexDeviceComponentState -> org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentStateOneOfMsg.newBuilder().setAbstractComplexDeviceComponentState(map_org_somda_protosdc_biceps_model_AbstractComplexDeviceComponentState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentStateOneOf.valueMdsState -> org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentStateOneOfMsg.newBuilder().setMdsState(map_org_somda_protosdc_biceps_model_MdsState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentStateOneOf.valueVmdState -> org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentStateOneOfMsg.newBuilder().setVmdState(map_org_somda_protosdc_biceps_model_VmdState(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractOperationalStateReport_ReportPart(source: org.somda.protosdc.biceps.model.AbstractOperationalStateReport.ReportPart): org.somda.protosdc.proto.model.biceps.AbstractOperationalStateReportMsg.ReportPartMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractOperationalStateReportMsg.ReportPartMsg.newBuilder()
            builder.abstractReportPart = map_org_somda_protosdc_biceps_model_AbstractReportPart(source.abstractReportPart)
            builder.addAllOperationState(source.operationState.map { map_org_somda_protosdc_biceps_model_AbstractOperationStateOneOf(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractOperationalStateReport(source: org.somda.protosdc.biceps.model.AbstractOperationalStateReport): org.somda.protosdc.proto.model.biceps.AbstractOperationalStateReportMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractOperationalStateReportMsg.newBuilder()
            builder.abstractReport = map_org_somda_protosdc_biceps_model_AbstractReport(source.abstractReport)
            builder.addAllReportPart(source.reportPart.map { map_org_somda_protosdc_biceps_model_AbstractOperationalStateReport_ReportPart(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractAlertReport_ReportPart(source: org.somda.protosdc.biceps.model.AbstractAlertReport.ReportPart): org.somda.protosdc.proto.model.biceps.AbstractAlertReportMsg.ReportPartMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractAlertReportMsg.ReportPartMsg.newBuilder()
            builder.abstractReportPart = map_org_somda_protosdc_biceps_model_AbstractReportPart(source.abstractReportPart)
            builder.addAllAlertState(source.alertState.map { map_org_somda_protosdc_biceps_model_AbstractAlertStateOneOf(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractAlertReport(source: org.somda.protosdc.biceps.model.AbstractAlertReport): org.somda.protosdc.proto.model.biceps.AbstractAlertReportMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractAlertReportMsg.newBuilder()
            builder.abstractReport = map_org_somda_protosdc_biceps_model_AbstractReport(source.abstractReport)
            builder.addAllReportPart(source.reportPart.map { map_org_somda_protosdc_biceps_model_AbstractAlertReport_ReportPart(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ImagingProcedure(source: org.somda.protosdc.biceps.model.ImagingProcedure): org.somda.protosdc.proto.model.biceps.ImagingProcedureMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ImagingProcedureMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.accessionIdentifier = map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(source.accessionIdentifier)
            builder.requestedProcedureId = map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(source.requestedProcedureId)
            builder.studyInstanceUid = map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(source.studyInstanceUid)
            builder.scheduledProcedureStepId = map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(source.scheduledProcedureStepId)
            source.modality?.let { field -> builder.modality = map_org_somda_protosdc_biceps_model_CodedValue(field) }
            source.protocolCode?.let { field -> builder.protocolCode = map_org_somda_protosdc_biceps_model_CodedValue(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ApprovedJurisdictions(source: org.somda.protosdc.biceps.model.ApprovedJurisdictions): org.somda.protosdc.proto.model.biceps.ApprovedJurisdictionsMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ApprovedJurisdictionsMsg.newBuilder()
            builder.addAllApprovedJurisdiction(source.approvedJurisdiction.map { map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetContextStatesByIdentification(source: org.somda.protosdc.biceps.model.GetContextStatesByIdentification): org.somda.protosdc.proto.model.biceps.GetContextStatesByIdentificationMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetContextStatesByIdentificationMsg.newBuilder()
            builder.abstractGet = map_org_somda_protosdc_biceps_model_AbstractGet(source.abstractGet)
            builder.addAllIdentification(source.identification.map { map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(it) }.toList())
            source.contextTypeAttr?.let { field -> builder.contextTypeAttr = map_org_somda_protosdc_biceps_model_QualifiedName(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetAlertState(source: org.somda.protosdc.biceps.model.SetAlertState): org.somda.protosdc.proto.model.biceps.SetAlertStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetAlertStateMsg.newBuilder()
            builder.abstractSet = map_org_somda_protosdc_biceps_model_AbstractSet(source.abstractSet)
            builder.proposedAlertState = map_org_somda_protosdc_biceps_model_AbstractAlertStateOneOf(source.proposedAlertState)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_PeriodicAlertReport(source: org.somda.protosdc.biceps.model.PeriodicAlertReport): org.somda.protosdc.proto.model.biceps.PeriodicAlertReportMsg {
            val builder = org.somda.protosdc.proto.model.biceps.PeriodicAlertReportMsg.newBuilder()
            builder.abstractAlertReport = map_org_somda_protosdc_biceps_model_AbstractAlertReport(source.abstractAlertReport)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_PeriodicOperationalStateReport(source: org.somda.protosdc.biceps.model.PeriodicOperationalStateReport): org.somda.protosdc.proto.model.biceps.PeriodicOperationalStateReportMsg {
            val builder = org.somda.protosdc.proto.model.biceps.PeriodicOperationalStateReportMsg.newBuilder()
            builder.abstractOperationalStateReport = map_org_somda_protosdc_biceps_model_AbstractOperationalStateReport(source.abstractOperationalStateReport)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetMetricState(source: org.somda.protosdc.biceps.model.SetMetricState): org.somda.protosdc.proto.model.biceps.SetMetricStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetMetricStateMsg.newBuilder()
            builder.abstractSet = map_org_somda_protosdc_biceps_model_AbstractSet(source.abstractSet)
            builder.addAllProposedMetricState(source.proposedMetricState.map { map_org_somda_protosdc_biceps_model_AbstractMetricStateOneOf(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_EpisodicAlertReport(source: org.somda.protosdc.biceps.model.EpisodicAlertReport): org.somda.protosdc.proto.model.biceps.EpisodicAlertReportMsg {
            val builder = org.somda.protosdc.proto.model.biceps.EpisodicAlertReportMsg.newBuilder()
            builder.abstractAlertReport = map_org_somda_protosdc_biceps_model_AbstractAlertReport(source.abstractAlertReport)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_EpisodicOperationalStateReport(source: org.somda.protosdc.biceps.model.EpisodicOperationalStateReport): org.somda.protosdc.proto.model.biceps.EpisodicOperationalStateReportMsg {
            val builder = org.somda.protosdc.proto.model.biceps.EpisodicOperationalStateReportMsg.newBuilder()
            builder.abstractOperationalStateReport = map_org_somda_protosdc_biceps_model_AbstractOperationalStateReport(source.abstractOperationalStateReport)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_OperationInvokedReport_ReportPart(source: org.somda.protosdc.biceps.model.OperationInvokedReport.ReportPart): org.somda.protosdc.proto.model.biceps.OperationInvokedReportMsg.ReportPartMsg {
            val builder = org.somda.protosdc.proto.model.biceps.OperationInvokedReportMsg.ReportPartMsg.newBuilder()
            builder.abstractReportPart = map_org_somda_protosdc_biceps_model_AbstractReportPart(source.abstractReportPart)
            builder.invocationInfo = map_org_somda_protosdc_biceps_model_InvocationInfo(source.invocationInfo)
            builder.invocationSource = map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(source.invocationSource)
            builder.operationHandleRefAttr = map_org_somda_protosdc_biceps_model_HandleRef(source.operationHandleRefAttr)
            source.operationTargetAttr?.let { field -> builder.operationTargetAttr = map_org_somda_protosdc_biceps_model_HandleRef(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_OperationInvokedReport(source: org.somda.protosdc.biceps.model.OperationInvokedReport): org.somda.protosdc.proto.model.biceps.OperationInvokedReportMsg {
            val builder = org.somda.protosdc.proto.model.biceps.OperationInvokedReportMsg.newBuilder()
            builder.abstractReport = map_org_somda_protosdc_biceps_model_AbstractReport(source.abstractReport)
            builder.addAllReportPart(source.reportPart.map { map_org_somda_protosdc_biceps_model_OperationInvokedReport_ReportPart(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractDeviceComponentDescriptor_ProductionSpecification(source: org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptor.ProductionSpecification): org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorMsg.ProductionSpecificationMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorMsg.ProductionSpecificationMsg.newBuilder()
            builder.specType = map_org_somda_protosdc_biceps_model_CodedValue(source.specType)
            builder.productionSpec = source.productionSpec
            source.componentId?.let { field -> builder.componentId = map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractDeviceComponentDescriptor(source: org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptor): org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorMsg.newBuilder()
            builder.abstractDescriptor = map_org_somda_protosdc_biceps_model_AbstractDescriptor(source.abstractDescriptor)
            builder.addAllProductionSpecification(source.productionSpecification.map { map_org_somda_protosdc_biceps_model_AbstractDeviceComponentDescriptor_ProductionSpecification(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractContextState(source: org.somda.protosdc.biceps.model.AbstractContextState): org.somda.protosdc.proto.model.biceps.AbstractContextStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractContextStateMsg.newBuilder()
            builder.abstractMultiState = map_org_somda_protosdc_biceps_model_AbstractMultiState(source.abstractMultiState)
            builder.addAllValidator(source.validator.map { map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(it) }.toList())
            builder.addAllIdentification(source.identification.map { map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(it) }.toList())
            source.contextAssociationAttr?.let { field -> builder.contextAssociationAttr = map_org_somda_protosdc_biceps_model_ContextAssociation(field) }
            source.bindingMdibVersionAttr?.let { field -> builder.bindingMdibVersionAttr = map_org_somda_protosdc_biceps_model_ReferencedVersion(field) }
            source.unbindingMdibVersionAttr?.let { field -> builder.unbindingMdibVersionAttr = map_org_somda_protosdc_biceps_model_ReferencedVersion(field) }
            source.bindingStartTimeAttr?.let { field -> builder.bindingStartTimeAttr = map_org_somda_protosdc_biceps_model_Timestamp(field) }
            source.bindingEndTimeAttr?.let { field -> builder.bindingEndTimeAttr = map_org_somda_protosdc_biceps_model_Timestamp(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractMetricDescriptor_Relation_KindAttr_EnumType(source: org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation.KindAttr.EnumType): org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg.KindAttrMsg.EnumType {
            return when (source) {
                org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation.KindAttr.EnumType.Rcm -> org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg.KindAttrMsg.EnumType.RCM
                org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation.KindAttr.EnumType.PS -> org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg.KindAttrMsg.EnumType.PS
                org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation.KindAttr.EnumType.SST -> org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg.KindAttrMsg.EnumType.SST
                org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation.KindAttr.EnumType.ECE -> org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg.KindAttrMsg.EnumType.ECE
                org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation.KindAttr.EnumType.DCE -> org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg.KindAttrMsg.EnumType.DCE
                org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation.KindAttr.EnumType.Oth -> org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg.KindAttrMsg.EnumType.OTH
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractMetricDescriptor_Relation_KindAttr(source: org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation.KindAttr): org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg.KindAttrMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg.KindAttrMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_biceps_model_AbstractMetricDescriptor_Relation_KindAttr_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractMetricDescriptor_Relation(source: org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation): org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            source.code?.let { field -> builder.code = map_org_somda_protosdc_biceps_model_CodedValue(field) }
            source.identification?.let { field -> builder.identification = map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(field) }
            builder.kindAttr = map_org_somda_protosdc_biceps_model_AbstractMetricDescriptor_Relation_KindAttr(source.kindAttr)
            builder.entriesAttr = map_org_somda_protosdc_biceps_model_EntryRef(source.entriesAttr)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractMetricDescriptor(source: org.somda.protosdc.biceps.model.AbstractMetricDescriptor): org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.newBuilder()
            builder.abstractDescriptor = map_org_somda_protosdc_biceps_model_AbstractDescriptor(source.abstractDescriptor)
            builder.unit = map_org_somda_protosdc_biceps_model_CodedValue(source.unit)
            builder.addAllBodySite(source.bodySite.map { map_org_somda_protosdc_biceps_model_CodedValue(it) }.toList())
            builder.addAllRelation(source.relation.map { map_org_somda_protosdc_biceps_model_AbstractMetricDescriptor_Relation(it) }.toList())
            builder.metricCategoryAttr = map_org_somda_protosdc_biceps_model_MetricCategory(source.metricCategoryAttr)
            source.derivationMethodAttr?.let { field -> builder.derivationMethodAttr = map_org_somda_protosdc_biceps_model_DerivationMethod(field) }
            builder.metricAvailabilityAttr = map_org_somda_protosdc_biceps_model_MetricAvailability(source.metricAvailabilityAttr)
            source.maxMeasurementTimeAttr?.let { field -> builder.maxMeasurementTimeAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            source.maxDelayTimeAttr?.let { field -> builder.maxDelayTimeAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            source.determinationPeriodAttr?.let { field -> builder.determinationPeriodAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            source.lifeTimePeriodAttr?.let { field -> builder.lifeTimePeriodAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            source.activationDurationAttr?.let { field -> builder.activationDurationAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ClockDescriptor(source: org.somda.protosdc.biceps.model.ClockDescriptor): org.somda.protosdc.proto.model.biceps.ClockDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ClockDescriptorMsg.newBuilder()
            builder.abstractDeviceComponentDescriptor = map_org_somda_protosdc_biceps_model_AbstractDeviceComponentDescriptor(source.abstractDeviceComponentDescriptor)
            builder.addAllTimeProtocol(source.timeProtocol.map { map_org_somda_protosdc_biceps_model_CodedValue(it) }.toList())
            source.resolutionAttr?.let { field -> builder.resolutionAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_NumericMetricDescriptor(source: org.somda.protosdc.biceps.model.NumericMetricDescriptor): org.somda.protosdc.proto.model.biceps.NumericMetricDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.NumericMetricDescriptorMsg.newBuilder()
            builder.abstractMetricDescriptor = map_org_somda_protosdc_biceps_model_AbstractMetricDescriptor(source.abstractMetricDescriptor)
            builder.addAllTechnicalRange(source.technicalRange.map { map_org_somda_protosdc_biceps_model_Range(it) }.toList())
            builder.resolutionAttr = mapProtoDecimalToBigDecimal(source.resolutionAttr)
            source.averagingPeriodAttr?.let { field -> builder.averagingPeriodAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_BatteryDescriptor(source: org.somda.protosdc.biceps.model.BatteryDescriptor): org.somda.protosdc.proto.model.biceps.BatteryDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.BatteryDescriptorMsg.newBuilder()
            builder.abstractDeviceComponentDescriptor = map_org_somda_protosdc_biceps_model_AbstractDeviceComponentDescriptor(source.abstractDeviceComponentDescriptor)
            source.capacityFullCharge?.let { field -> builder.capacityFullCharge = map_org_somda_protosdc_biceps_model_Measurement(field) }
            source.capacitySpecified?.let { field -> builder.capacitySpecified = map_org_somda_protosdc_biceps_model_Measurement(field) }
            source.voltageSpecified?.let { field -> builder.voltageSpecified = map_org_somda_protosdc_biceps_model_Measurement(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_LocationReference(source: org.somda.protosdc.biceps.model.LocationReference): org.somda.protosdc.proto.model.biceps.LocationReferenceMsg {
            val builder = org.somda.protosdc.proto.model.biceps.LocationReferenceMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.addAllIdentification(source.identification.map { map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(it) }.toList())
            source.locationDetail?.let { field -> builder.locationDetail = map_org_somda_protosdc_biceps_model_LocationDetail(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractMetricReport_ReportPart(source: org.somda.protosdc.biceps.model.AbstractMetricReport.ReportPart): org.somda.protosdc.proto.model.biceps.AbstractMetricReportMsg.ReportPartMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractMetricReportMsg.ReportPartMsg.newBuilder()
            builder.abstractReportPart = map_org_somda_protosdc_biceps_model_AbstractReportPart(source.abstractReportPart)
            builder.addAllMetricState(source.metricState.map { map_org_somda_protosdc_biceps_model_AbstractMetricStateOneOf(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractMetricReport(source: org.somda.protosdc.biceps.model.AbstractMetricReport): org.somda.protosdc.proto.model.biceps.AbstractMetricReportMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractMetricReportMsg.newBuilder()
            builder.abstractReport = map_org_somda_protosdc_biceps_model_AbstractReport(source.abstractReport)
            builder.addAllReportPart(source.reportPart.map { map_org_somda_protosdc_biceps_model_AbstractMetricReport_ReportPart(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_EnsembleContextState(source: org.somda.protosdc.biceps.model.EnsembleContextState): org.somda.protosdc.proto.model.biceps.EnsembleContextStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.EnsembleContextStateMsg.newBuilder()
            builder.abstractContextState = map_org_somda_protosdc_biceps_model_AbstractContextState(source.abstractContextState)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_PeriodicMetricReport(source: org.somda.protosdc.biceps.model.PeriodicMetricReport): org.somda.protosdc.proto.model.biceps.PeriodicMetricReportMsg {
            val builder = org.somda.protosdc.proto.model.biceps.PeriodicMetricReportMsg.newBuilder()
            builder.abstractMetricReport = map_org_somda_protosdc_biceps_model_AbstractMetricReport(source.abstractMetricReport)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_EpisodicMetricReport(source: org.somda.protosdc.biceps.model.EpisodicMetricReport): org.somda.protosdc.proto.model.biceps.EpisodicMetricReportMsg {
            val builder = org.somda.protosdc.proto.model.biceps.EpisodicMetricReportMsg.newBuilder()
            builder.abstractMetricReport = map_org_somda_protosdc_biceps_model_AbstractMetricReport(source.abstractMetricReport)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_DistributionSampleArrayMetricDescriptor(source: org.somda.protosdc.biceps.model.DistributionSampleArrayMetricDescriptor): org.somda.protosdc.proto.model.biceps.DistributionSampleArrayMetricDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.DistributionSampleArrayMetricDescriptorMsg.newBuilder()
            builder.abstractMetricDescriptor = map_org_somda_protosdc_biceps_model_AbstractMetricDescriptor(source.abstractMetricDescriptor)
            builder.addAllTechnicalRange(source.technicalRange.map { map_org_somda_protosdc_biceps_model_Range(it) }.toList())
            builder.domainUnit = map_org_somda_protosdc_biceps_model_CodedValue(source.domainUnit)
            builder.distributionRange = map_org_somda_protosdc_biceps_model_Range(source.distributionRange)
            builder.resolutionAttr = mapProtoDecimalToBigDecimal(source.resolutionAttr)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_RealTimeSampleArrayMetricDescriptor(source: org.somda.protosdc.biceps.model.RealTimeSampleArrayMetricDescriptor): org.somda.protosdc.proto.model.biceps.RealTimeSampleArrayMetricDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.RealTimeSampleArrayMetricDescriptorMsg.newBuilder()
            builder.abstractMetricDescriptor = map_org_somda_protosdc_biceps_model_AbstractMetricDescriptor(source.abstractMetricDescriptor)
            builder.addAllTechnicalRange(source.technicalRange.map { map_org_somda_protosdc_biceps_model_Range(it) }.toList())
            builder.resolutionAttr = mapProtoDecimalToBigDecimal(source.resolutionAttr)
            builder.samplePeriodAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(source.samplePeriodAttr)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AlertSystemDescriptor(source: org.somda.protosdc.biceps.model.AlertSystemDescriptor): org.somda.protosdc.proto.model.biceps.AlertSystemDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AlertSystemDescriptorMsg.newBuilder()
            builder.abstractAlertDescriptor = map_org_somda_protosdc_biceps_model_AbstractAlertDescriptor(source.abstractAlertDescriptor)
            builder.addAllAlertCondition(source.alertCondition.map { map_org_somda_protosdc_biceps_model_AlertConditionDescriptorOneOf(it) }.toList())
            builder.addAllAlertSignal(source.alertSignal.map { map_org_somda_protosdc_biceps_model_AlertSignalDescriptor(it) }.toList())
            source.maxPhysiologicalParallelAlarmsAttr?.let { field -> builder.maxPhysiologicalParallelAlarmsAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToUInt32(field) }
            source.maxTechnicalParallelAlarmsAttr?.let { field -> builder.maxTechnicalParallelAlarmsAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToUInt32(field) }
            source.selfCheckPeriodAttr?.let { field -> builder.selfCheckPeriodAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapDuration(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_LocationContextState(source: org.somda.protosdc.biceps.model.LocationContextState): org.somda.protosdc.proto.model.biceps.LocationContextStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.LocationContextStateMsg.newBuilder()
            builder.abstractContextState = map_org_somda_protosdc_biceps_model_AbstractContextState(source.abstractContextState)
            source.locationDetail?.let { field -> builder.locationDetail = map_org_somda_protosdc_biceps_model_LocationDetail(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_StringMetricDescriptor(source: org.somda.protosdc.biceps.model.StringMetricDescriptor): org.somda.protosdc.proto.model.biceps.StringMetricDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.StringMetricDescriptorMsg.newBuilder()
            builder.abstractMetricDescriptor = map_org_somda_protosdc_biceps_model_AbstractMetricDescriptor(source.abstractMetricDescriptor)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_MeansContextState(source: org.somda.protosdc.biceps.model.MeansContextState): org.somda.protosdc.proto.model.biceps.MeansContextStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.MeansContextStateMsg.newBuilder()
            builder.abstractContextState = map_org_somda_protosdc_biceps_model_AbstractContextState(source.abstractContextState)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_ScoDescriptor(source: org.somda.protosdc.biceps.model.ScoDescriptor): org.somda.protosdc.proto.model.biceps.ScoDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ScoDescriptorMsg.newBuilder()
            builder.abstractDeviceComponentDescriptor = map_org_somda_protosdc_biceps_model_AbstractDeviceComponentDescriptor(source.abstractDeviceComponentDescriptor)
            builder.addAllOperation(source.operation.map { map_org_somda_protosdc_biceps_model_AbstractOperationDescriptorOneOf(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetComponentState(source: org.somda.protosdc.biceps.model.SetComponentState): org.somda.protosdc.proto.model.biceps.SetComponentStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetComponentStateMsg.newBuilder()
            builder.abstractSet = map_org_somda_protosdc_biceps_model_AbstractSet(source.abstractSet)
            builder.addAllProposedComponentState(source.proposedComponentState.map { map_org_somda_protosdc_biceps_model_AbstractDeviceComponentStateOneOf(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractComponentReport_ReportPart(source: org.somda.protosdc.biceps.model.AbstractComponentReport.ReportPart): org.somda.protosdc.proto.model.biceps.AbstractComponentReportMsg.ReportPartMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractComponentReportMsg.ReportPartMsg.newBuilder()
            builder.abstractReportPart = map_org_somda_protosdc_biceps_model_AbstractReportPart(source.abstractReportPart)
            builder.addAllComponentState(source.componentState.map { map_org_somda_protosdc_biceps_model_AbstractDeviceComponentStateOneOf(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractComponentReport(source: org.somda.protosdc.biceps.model.AbstractComponentReport): org.somda.protosdc.proto.model.biceps.AbstractComponentReportMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractComponentReportMsg.newBuilder()
            builder.abstractReport = map_org_somda_protosdc_biceps_model_AbstractReport(source.abstractReport)
            builder.addAllReportPart(source.reportPart.map { map_org_somda_protosdc_biceps_model_AbstractComponentReport_ReportPart(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SystemContextDescriptor(source: org.somda.protosdc.biceps.model.SystemContextDescriptor): org.somda.protosdc.proto.model.biceps.SystemContextDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SystemContextDescriptorMsg.newBuilder()
            builder.abstractDeviceComponentDescriptor = map_org_somda_protosdc_biceps_model_AbstractDeviceComponentDescriptor(source.abstractDeviceComponentDescriptor)
            source.patientContext?.let { field -> builder.patientContext = map_org_somda_protosdc_biceps_model_PatientContextDescriptor(field) }
            source.locationContext?.let { field -> builder.locationContext = map_org_somda_protosdc_biceps_model_LocationContextDescriptor(field) }
            builder.addAllEnsembleContext(source.ensembleContext.map { map_org_somda_protosdc_biceps_model_EnsembleContextDescriptor(it) }.toList())
            builder.addAllOperatorContext(source.operatorContext.map { map_org_somda_protosdc_biceps_model_OperatorContextDescriptor(it) }.toList())
            builder.addAllWorkflowContext(source.workflowContext.map { map_org_somda_protosdc_biceps_model_WorkflowContextDescriptor(it) }.toList())
            builder.addAllMeansContext(source.meansContext.map { map_org_somda_protosdc_biceps_model_MeansContextDescriptor(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractComplexDeviceComponentDescriptor(source: org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentDescriptor): org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentDescriptorMsg.newBuilder()
            builder.abstractDeviceComponentDescriptor = map_org_somda_protosdc_biceps_model_AbstractDeviceComponentDescriptor(source.abstractDeviceComponentDescriptor)
            source.alertSystem?.let { field -> builder.alertSystem = map_org_somda_protosdc_biceps_model_AlertSystemDescriptor(field) }
            source.sco?.let { field -> builder.sco = map_org_somda_protosdc_biceps_model_ScoDescriptor(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_EnumStringMetricDescriptor_AllowedValue(source: org.somda.protosdc.biceps.model.EnumStringMetricDescriptor.AllowedValue): org.somda.protosdc.proto.model.biceps.EnumStringMetricDescriptorMsg.AllowedValueMsg {
            val builder = org.somda.protosdc.proto.model.biceps.EnumStringMetricDescriptorMsg.AllowedValueMsg.newBuilder()
            builder.value = source.value
            source.type?.let { field -> builder.type = map_org_somda_protosdc_biceps_model_CodedValue(field) }
            source.identification?.let { field -> builder.identification = map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(field) }
            source.characteristic?.let { field -> builder.characteristic = map_org_somda_protosdc_biceps_model_Measurement(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_EnumStringMetricDescriptor(source: org.somda.protosdc.biceps.model.EnumStringMetricDescriptor): org.somda.protosdc.proto.model.biceps.EnumStringMetricDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.EnumStringMetricDescriptorMsg.newBuilder()
            builder.stringMetricDescriptor = map_org_somda_protosdc_biceps_model_StringMetricDescriptor(source.stringMetricDescriptor)
            builder.addAllAllowedValue(source.allowedValue.map { map_org_somda_protosdc_biceps_model_EnumStringMetricDescriptor_AllowedValue(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_PeriodicComponentReport(source: org.somda.protosdc.biceps.model.PeriodicComponentReport): org.somda.protosdc.proto.model.biceps.PeriodicComponentReportMsg {
            val builder = org.somda.protosdc.proto.model.biceps.PeriodicComponentReportMsg.newBuilder()
            builder.abstractComponentReport = map_org_somda_protosdc_biceps_model_AbstractComponentReport(source.abstractComponentReport)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_EpisodicComponentReport(source: org.somda.protosdc.biceps.model.EpisodicComponentReport): org.somda.protosdc.proto.model.biceps.EpisodicComponentReportMsg {
            val builder = org.somda.protosdc.proto.model.biceps.EpisodicComponentReportMsg.newBuilder()
            builder.abstractComponentReport = map_org_somda_protosdc_biceps_model_AbstractComponentReport(source.abstractComponentReport)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractGetOneOf(source: org.somda.protosdc.biceps.model.AbstractGetOneOf): org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractGetOneOf.valueAbstractGet -> org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.newBuilder().setAbstractGet(map_org_somda_protosdc_biceps_model_AbstractGet(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetOneOf.valueGetContainmentTree -> org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.newBuilder().setGetContainmentTree(map_org_somda_protosdc_biceps_model_GetContainmentTree(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetOneOf.valueGetContextStates -> org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.newBuilder().setGetContextStates(map_org_somda_protosdc_biceps_model_GetContextStates(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetOneOf.valueGetContextStatesByFilter -> org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.newBuilder().setGetContextStatesByFilter(map_org_somda_protosdc_biceps_model_GetContextStatesByFilter(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetOneOf.valueGetContextStatesByIdentification -> org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.newBuilder().setGetContextStatesByIdentification(map_org_somda_protosdc_biceps_model_GetContextStatesByIdentification(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetOneOf.valueGetDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.newBuilder().setGetDescriptor(map_org_somda_protosdc_biceps_model_GetDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetOneOf.valueGetDescriptorsFromArchive -> org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.newBuilder().setGetDescriptorsFromArchive(map_org_somda_protosdc_biceps_model_GetDescriptorsFromArchive(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetOneOf.valueGetLocalizedText -> org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.newBuilder().setGetLocalizedText(map_org_somda_protosdc_biceps_model_GetLocalizedText(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetOneOf.valueGetMdDescription -> org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.newBuilder().setGetMdDescription(map_org_somda_protosdc_biceps_model_GetMdDescription(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetOneOf.valueGetMdState -> org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.newBuilder().setGetMdState(map_org_somda_protosdc_biceps_model_GetMdState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetOneOf.valueGetMdib -> org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.newBuilder().setGetMdib(map_org_somda_protosdc_biceps_model_GetMdib(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetOneOf.valueGetStatesFromArchive -> org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.newBuilder().setGetStatesFromArchive(map_org_somda_protosdc_biceps_model_GetStatesFromArchive(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetOneOf.valueGetSupportedLanguages -> org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.newBuilder().setGetSupportedLanguages(map_org_somda_protosdc_biceps_model_GetSupportedLanguages(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractAlertReportOneOf(source: org.somda.protosdc.biceps.model.AbstractAlertReportOneOf): org.somda.protosdc.proto.model.biceps.AbstractAlertReportOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractAlertReportOneOf.valueAbstractAlertReport -> org.somda.protosdc.proto.model.biceps.AbstractAlertReportOneOfMsg.newBuilder().setAbstractAlertReport(map_org_somda_protosdc_biceps_model_AbstractAlertReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractAlertReportOneOf.valueEpisodicAlertReport -> org.somda.protosdc.proto.model.biceps.AbstractAlertReportOneOfMsg.newBuilder().setEpisodicAlertReport(map_org_somda_protosdc_biceps_model_EpisodicAlertReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractAlertReportOneOf.valuePeriodicAlertReport -> org.somda.protosdc.proto.model.biceps.AbstractAlertReportOneOfMsg.newBuilder().setPeriodicAlertReport(map_org_somda_protosdc_biceps_model_PeriodicAlertReport(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractOperationalStateReportOneOf(source: org.somda.protosdc.biceps.model.AbstractOperationalStateReportOneOf): org.somda.protosdc.proto.model.biceps.AbstractOperationalStateReportOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractOperationalStateReportOneOf.valueAbstractOperationalStateReport -> org.somda.protosdc.proto.model.biceps.AbstractOperationalStateReportOneOfMsg.newBuilder().setAbstractOperationalStateReport(map_org_somda_protosdc_biceps_model_AbstractOperationalStateReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractOperationalStateReportOneOf.valueEpisodicOperationalStateReport -> org.somda.protosdc.proto.model.biceps.AbstractOperationalStateReportOneOfMsg.newBuilder().setEpisodicOperationalStateReport(map_org_somda_protosdc_biceps_model_EpisodicOperationalStateReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractOperationalStateReportOneOf.valuePeriodicOperationalStateReport -> org.somda.protosdc.proto.model.biceps.AbstractOperationalStateReportOneOfMsg.newBuilder().setPeriodicOperationalStateReport(map_org_somda_protosdc_biceps_model_PeriodicOperationalStateReport(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractMetricDescriptorOneOf(source: org.somda.protosdc.biceps.model.AbstractMetricDescriptorOneOf): org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractMetricDescriptorOneOf.valueAbstractMetricDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorOneOfMsg.newBuilder().setAbstractMetricDescriptor(map_org_somda_protosdc_biceps_model_AbstractMetricDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMetricDescriptorOneOf.valueDistributionSampleArrayMetricDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorOneOfMsg.newBuilder().setDistributionSampleArrayMetricDescriptor(map_org_somda_protosdc_biceps_model_DistributionSampleArrayMetricDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMetricDescriptorOneOf.valueEnumStringMetricDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorOneOfMsg.newBuilder().setEnumStringMetricDescriptor(map_org_somda_protosdc_biceps_model_EnumStringMetricDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMetricDescriptorOneOf.valueNumericMetricDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorOneOfMsg.newBuilder().setNumericMetricDescriptor(map_org_somda_protosdc_biceps_model_NumericMetricDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMetricDescriptorOneOf.valueRealTimeSampleArrayMetricDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorOneOfMsg.newBuilder().setRealTimeSampleArrayMetricDescriptor(map_org_somda_protosdc_biceps_model_RealTimeSampleArrayMetricDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMetricDescriptorOneOf.valueStringMetricDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorOneOfMsg.newBuilder().setStringMetricDescriptor(map_org_somda_protosdc_biceps_model_StringMetricDescriptor(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractAlertDescriptorOneOf(source: org.somda.protosdc.biceps.model.AbstractAlertDescriptorOneOf): org.somda.protosdc.proto.model.biceps.AbstractAlertDescriptorOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractAlertDescriptorOneOf.valueAbstractAlertDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractAlertDescriptorOneOfMsg.newBuilder().setAbstractAlertDescriptor(map_org_somda_protosdc_biceps_model_AbstractAlertDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractAlertDescriptorOneOf.valueAlertConditionDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractAlertDescriptorOneOfMsg.newBuilder().setAlertConditionDescriptor(map_org_somda_protosdc_biceps_model_AlertConditionDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractAlertDescriptorOneOf.valueAlertSignalDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractAlertDescriptorOneOfMsg.newBuilder().setAlertSignalDescriptor(map_org_somda_protosdc_biceps_model_AlertSignalDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractAlertDescriptorOneOf.valueAlertSystemDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractAlertDescriptorOneOfMsg.newBuilder().setAlertSystemDescriptor(map_org_somda_protosdc_biceps_model_AlertSystemDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractAlertDescriptorOneOf.valueLimitAlertConditionDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractAlertDescriptorOneOfMsg.newBuilder().setLimitAlertConditionDescriptor(map_org_somda_protosdc_biceps_model_LimitAlertConditionDescriptor(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractMetricReportOneOf(source: org.somda.protosdc.biceps.model.AbstractMetricReportOneOf): org.somda.protosdc.proto.model.biceps.AbstractMetricReportOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractMetricReportOneOf.valueAbstractMetricReport -> org.somda.protosdc.proto.model.biceps.AbstractMetricReportOneOfMsg.newBuilder().setAbstractMetricReport(map_org_somda_protosdc_biceps_model_AbstractMetricReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMetricReportOneOf.valueEpisodicMetricReport -> org.somda.protosdc.proto.model.biceps.AbstractMetricReportOneOfMsg.newBuilder().setEpisodicMetricReport(map_org_somda_protosdc_biceps_model_EpisodicMetricReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMetricReportOneOf.valuePeriodicMetricReport -> org.somda.protosdc.proto.model.biceps.AbstractMetricReportOneOfMsg.newBuilder().setPeriodicMetricReport(map_org_somda_protosdc_biceps_model_PeriodicMetricReport(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_StringMetricDescriptorOneOf(source: org.somda.protosdc.biceps.model.StringMetricDescriptorOneOf): org.somda.protosdc.proto.model.biceps.StringMetricDescriptorOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.StringMetricDescriptorOneOf.valueStringMetricDescriptor -> org.somda.protosdc.proto.model.biceps.StringMetricDescriptorOneOfMsg.newBuilder().setStringMetricDescriptor(map_org_somda_protosdc_biceps_model_StringMetricDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.StringMetricDescriptorOneOf.valueEnumStringMetricDescriptor -> org.somda.protosdc.proto.model.biceps.StringMetricDescriptorOneOfMsg.newBuilder().setEnumStringMetricDescriptor(map_org_somda_protosdc_biceps_model_EnumStringMetricDescriptor(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractComponentReportOneOf(source: org.somda.protosdc.biceps.model.AbstractComponentReportOneOf): org.somda.protosdc.proto.model.biceps.AbstractComponentReportOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractComponentReportOneOf.valueAbstractComponentReport -> org.somda.protosdc.proto.model.biceps.AbstractComponentReportOneOfMsg.newBuilder().setAbstractComponentReport(map_org_somda_protosdc_biceps_model_AbstractComponentReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractComponentReportOneOf.valueEpisodicComponentReport -> org.somda.protosdc.proto.model.biceps.AbstractComponentReportOneOfMsg.newBuilder().setEpisodicComponentReport(map_org_somda_protosdc_biceps_model_EpisodicComponentReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractComponentReportOneOf.valuePeriodicComponentReport -> org.somda.protosdc.proto.model.biceps.AbstractComponentReportOneOfMsg.newBuilder().setPeriodicComponentReport(map_org_somda_protosdc_biceps_model_PeriodicComponentReport(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_ChannelDescriptor(source: org.somda.protosdc.biceps.model.ChannelDescriptor): org.somda.protosdc.proto.model.biceps.ChannelDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.ChannelDescriptorMsg.newBuilder()
            builder.abstractDeviceComponentDescriptor = map_org_somda_protosdc_biceps_model_AbstractDeviceComponentDescriptor(source.abstractDeviceComponentDescriptor)
            builder.addAllMetric(source.metric.map { map_org_somda_protosdc_biceps_model_AbstractMetricDescriptorOneOf(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_VmdDescriptor(source: org.somda.protosdc.biceps.model.VmdDescriptor): org.somda.protosdc.proto.model.biceps.VmdDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.VmdDescriptorMsg.newBuilder()
            builder.abstractComplexDeviceComponentDescriptor = map_org_somda_protosdc_biceps_model_AbstractComplexDeviceComponentDescriptor(source.abstractComplexDeviceComponentDescriptor)
            source.approvedJurisdictions?.let { field -> builder.approvedJurisdictions = map_org_somda_protosdc_biceps_model_ApprovedJurisdictions(field) }
            builder.addAllChannel(source.channel.map { map_org_somda_protosdc_biceps_model_ChannelDescriptor(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_MdsDescriptor_MetaData_Udi(source: org.somda.protosdc.biceps.model.MdsDescriptor.MetaData.Udi): org.somda.protosdc.proto.model.biceps.MdsDescriptorMsg.MetaDataMsg.UdiMsg {
            val builder = org.somda.protosdc.proto.model.biceps.MdsDescriptorMsg.MetaDataMsg.UdiMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.deviceIdentifier = source.deviceIdentifier
            builder.humanReadableForm = source.humanReadableForm
            builder.issuer = map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(source.issuer)
            source.jurisdiction?.let { field -> builder.jurisdiction = map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_MdsDescriptor_MetaData(source: org.somda.protosdc.biceps.model.MdsDescriptor.MetaData): org.somda.protosdc.proto.model.biceps.MdsDescriptorMsg.MetaDataMsg {
            val builder = org.somda.protosdc.proto.model.biceps.MdsDescriptorMsg.MetaDataMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.addAllUdi(source.udi.map { map_org_somda_protosdc_biceps_model_MdsDescriptor_MetaData_Udi(it) }.toList())
            source.lotNumber?.let { field -> builder.lotNumber = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            builder.addAllManufacturer(source.manufacturer.map { map_org_somda_protosdc_biceps_model_LocalizedText(it) }.toList())
            source.manufactureDate?.let { field -> builder.manufactureDate = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapLocalDateTimeOptional(field) }
            source.expirationDate?.let { field -> builder.expirationDate = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapLocalDateTimeOptional(field) }
            builder.addAllModelName(source.modelName.map { map_org_somda_protosdc_biceps_model_LocalizedText(it) }.toList())
            source.modelNumber?.let { field -> builder.modelNumber = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            builder.addAllSerialNumber(source.serialNumber.map { it }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_MdsDescriptor(source: org.somda.protosdc.biceps.model.MdsDescriptor): org.somda.protosdc.proto.model.biceps.MdsDescriptorMsg {
            val builder = org.somda.protosdc.proto.model.biceps.MdsDescriptorMsg.newBuilder()
            builder.abstractComplexDeviceComponentDescriptor = map_org_somda_protosdc_biceps_model_AbstractComplexDeviceComponentDescriptor(source.abstractComplexDeviceComponentDescriptor)
            source.metaData?.let { field -> builder.metaData = map_org_somda_protosdc_biceps_model_MdsDescriptor_MetaData(field) }
            source.systemContext?.let { field -> builder.systemContext = map_org_somda_protosdc_biceps_model_SystemContextDescriptor(field) }
            source.clock?.let { field -> builder.clock = map_org_somda_protosdc_biceps_model_ClockDescriptor(field) }
            builder.addAllBattery(source.battery.map { map_org_somda_protosdc_biceps_model_BatteryDescriptor(it) }.toList())
            source.approvedJurisdictions?.let { field -> builder.approvedJurisdictions = map_org_somda_protosdc_biceps_model_ApprovedJurisdictions(field) }
            builder.addAllVmd(source.vmd.map { map_org_somda_protosdc_biceps_model_VmdDescriptor(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_MdDescription(source: org.somda.protosdc.biceps.model.MdDescription): org.somda.protosdc.proto.model.biceps.MdDescriptionMsg {
            val builder = org.somda.protosdc.proto.model.biceps.MdDescriptionMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.addAllMds(source.mds.map { map_org_somda_protosdc_biceps_model_MdsDescriptor(it) }.toList())
            source.descriptionVersionAttr?.let { field -> builder.descriptionVersionAttr = map_org_somda_protosdc_biceps_model_VersionCounter(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetMdDescriptionResponse(source: org.somda.protosdc.biceps.model.GetMdDescriptionResponse): org.somda.protosdc.proto.model.biceps.GetMdDescriptionResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetMdDescriptionResponseMsg.newBuilder()
            builder.abstractGetResponse = map_org_somda_protosdc_biceps_model_AbstractGetResponse(source.abstractGetResponse)
            builder.mdDescription = map_org_somda_protosdc_biceps_model_MdDescription(source.mdDescription)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractDescriptorOneOf(source: org.somda.protosdc.biceps.model.AbstractDescriptorOneOf): org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueAbstractDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setAbstractDescriptor(map_org_somda_protosdc_biceps_model_AbstractDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueAbstractAlertDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setAbstractAlertDescriptor(map_org_somda_protosdc_biceps_model_AbstractAlertDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueAbstractComplexDeviceComponentDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setAbstractComplexDeviceComponentDescriptor(map_org_somda_protosdc_biceps_model_AbstractComplexDeviceComponentDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueAbstractContextDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setAbstractContextDescriptor(map_org_somda_protosdc_biceps_model_AbstractContextDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueAbstractDeviceComponentDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setAbstractDeviceComponentDescriptor(map_org_somda_protosdc_biceps_model_AbstractDeviceComponentDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueAbstractMetricDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setAbstractMetricDescriptor(map_org_somda_protosdc_biceps_model_AbstractMetricDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueAbstractOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setAbstractOperationDescriptor(map_org_somda_protosdc_biceps_model_AbstractOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueAbstractSetStateOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setAbstractSetStateOperationDescriptor(map_org_somda_protosdc_biceps_model_AbstractSetStateOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueActivateOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setActivateOperationDescriptor(map_org_somda_protosdc_biceps_model_ActivateOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueAlertConditionDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setAlertConditionDescriptor(map_org_somda_protosdc_biceps_model_AlertConditionDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueAlertSignalDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setAlertSignalDescriptor(map_org_somda_protosdc_biceps_model_AlertSignalDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueAlertSystemDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setAlertSystemDescriptor(map_org_somda_protosdc_biceps_model_AlertSystemDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueBatteryDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setBatteryDescriptor(map_org_somda_protosdc_biceps_model_BatteryDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueChannelDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setChannelDescriptor(map_org_somda_protosdc_biceps_model_ChannelDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueClockDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setClockDescriptor(map_org_somda_protosdc_biceps_model_ClockDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueDistributionSampleArrayMetricDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setDistributionSampleArrayMetricDescriptor(map_org_somda_protosdc_biceps_model_DistributionSampleArrayMetricDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueEnsembleContextDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setEnsembleContextDescriptor(map_org_somda_protosdc_biceps_model_EnsembleContextDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueEnumStringMetricDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setEnumStringMetricDescriptor(map_org_somda_protosdc_biceps_model_EnumStringMetricDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueLimitAlertConditionDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setLimitAlertConditionDescriptor(map_org_somda_protosdc_biceps_model_LimitAlertConditionDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueLocationContextDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setLocationContextDescriptor(map_org_somda_protosdc_biceps_model_LocationContextDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueMdsDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setMdsDescriptor(map_org_somda_protosdc_biceps_model_MdsDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueMeansContextDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setMeansContextDescriptor(map_org_somda_protosdc_biceps_model_MeansContextDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueNumericMetricDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setNumericMetricDescriptor(map_org_somda_protosdc_biceps_model_NumericMetricDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueOperatorContextDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setOperatorContextDescriptor(map_org_somda_protosdc_biceps_model_OperatorContextDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valuePatientContextDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setPatientContextDescriptor(map_org_somda_protosdc_biceps_model_PatientContextDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueRealTimeSampleArrayMetricDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setRealTimeSampleArrayMetricDescriptor(map_org_somda_protosdc_biceps_model_RealTimeSampleArrayMetricDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueScoDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setScoDescriptor(map_org_somda_protosdc_biceps_model_ScoDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueSetAlertStateOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setSetAlertStateOperationDescriptor(map_org_somda_protosdc_biceps_model_SetAlertStateOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueSetComponentStateOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setSetComponentStateOperationDescriptor(map_org_somda_protosdc_biceps_model_SetComponentStateOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueSetContextStateOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setSetContextStateOperationDescriptor(map_org_somda_protosdc_biceps_model_SetContextStateOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueSetMetricStateOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setSetMetricStateOperationDescriptor(map_org_somda_protosdc_biceps_model_SetMetricStateOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueSetStringOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setSetStringOperationDescriptor(map_org_somda_protosdc_biceps_model_SetStringOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueSetValueOperationDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setSetValueOperationDescriptor(map_org_somda_protosdc_biceps_model_SetValueOperationDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueStringMetricDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setStringMetricDescriptor(map_org_somda_protosdc_biceps_model_StringMetricDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueSystemContextDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setSystemContextDescriptor(map_org_somda_protosdc_biceps_model_SystemContextDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueVmdDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setVmdDescriptor(map_org_somda_protosdc_biceps_model_VmdDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.valueWorkflowContextDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.newBuilder().setWorkflowContextDescriptor(map_org_somda_protosdc_biceps_model_WorkflowContextDescriptor(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractDeviceComponentDescriptorOneOf(source: org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf): org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf.valueAbstractDeviceComponentDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg.newBuilder().setAbstractDeviceComponentDescriptor(map_org_somda_protosdc_biceps_model_AbstractDeviceComponentDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf.valueAbstractComplexDeviceComponentDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg.newBuilder().setAbstractComplexDeviceComponentDescriptor(map_org_somda_protosdc_biceps_model_AbstractComplexDeviceComponentDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf.valueBatteryDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg.newBuilder().setBatteryDescriptor(map_org_somda_protosdc_biceps_model_BatteryDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf.valueChannelDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg.newBuilder().setChannelDescriptor(map_org_somda_protosdc_biceps_model_ChannelDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf.valueClockDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg.newBuilder().setClockDescriptor(map_org_somda_protosdc_biceps_model_ClockDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf.valueMdsDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg.newBuilder().setMdsDescriptor(map_org_somda_protosdc_biceps_model_MdsDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf.valueScoDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg.newBuilder().setScoDescriptor(map_org_somda_protosdc_biceps_model_ScoDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf.valueSystemContextDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg.newBuilder().setSystemContextDescriptor(map_org_somda_protosdc_biceps_model_SystemContextDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf.valueVmdDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg.newBuilder().setVmdDescriptor(map_org_somda_protosdc_biceps_model_VmdDescriptor(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractComplexDeviceComponentDescriptorOneOf(source: org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentDescriptorOneOf): org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentDescriptorOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentDescriptorOneOf.valueAbstractComplexDeviceComponentDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentDescriptorOneOfMsg.newBuilder().setAbstractComplexDeviceComponentDescriptor(map_org_somda_protosdc_biceps_model_AbstractComplexDeviceComponentDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentDescriptorOneOf.valueMdsDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentDescriptorOneOfMsg.newBuilder().setMdsDescriptor(map_org_somda_protosdc_biceps_model_MdsDescriptor(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentDescriptorOneOf.valueVmdDescriptor -> org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentDescriptorOneOfMsg.newBuilder().setVmdDescriptor(map_org_somda_protosdc_biceps_model_VmdDescriptor(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_GetDescriptorResponse(source: org.somda.protosdc.biceps.model.GetDescriptorResponse): org.somda.protosdc.proto.model.biceps.GetDescriptorResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetDescriptorResponseMsg.newBuilder()
            builder.abstractGetResponse = map_org_somda_protosdc_biceps_model_AbstractGetResponse(source.abstractGetResponse)
            builder.addAllPDescriptor(source.descriptor.map { map_org_somda_protosdc_biceps_model_AbstractDescriptorOneOf(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetDescriptorsFromArchiveResponse(source: org.somda.protosdc.biceps.model.GetDescriptorsFromArchiveResponse): org.somda.protosdc.proto.model.biceps.GetDescriptorsFromArchiveResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetDescriptorsFromArchiveResponseMsg.newBuilder()
            builder.abstractGetResponse = map_org_somda_protosdc_biceps_model_AbstractGetResponse(source.abstractGetResponse)
            builder.addAllPDescriptor(source.descriptor.map { map_org_somda_protosdc_biceps_model_AbstractDescriptorOneOf(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_BaseDemographicsOneOf(source: org.somda.protosdc.biceps.model.BaseDemographicsOneOf): org.somda.protosdc.proto.model.biceps.BaseDemographicsOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.BaseDemographicsOneOf.valueBaseDemographics -> org.somda.protosdc.proto.model.biceps.BaseDemographicsOneOfMsg.newBuilder().setBaseDemographics(map_org_somda_protosdc_biceps_model_BaseDemographics(source.value)).build()
                is org.somda.protosdc.biceps.model.BaseDemographicsOneOf.valueNeonatalPatientDemographicsCoreData -> org.somda.protosdc.proto.model.biceps.BaseDemographicsOneOfMsg.newBuilder().setNeonatalPatientDemographicsCoreData(map_org_somda_protosdc_biceps_model_NeonatalPatientDemographicsCoreData(source.value)).build()
                is org.somda.protosdc.biceps.model.BaseDemographicsOneOf.valuePatientDemographicsCoreData -> org.somda.protosdc.proto.model.biceps.BaseDemographicsOneOfMsg.newBuilder().setPatientDemographicsCoreData(map_org_somda_protosdc_biceps_model_PatientDemographicsCoreData(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_PersonReference(source: org.somda.protosdc.biceps.model.PersonReference): org.somda.protosdc.proto.model.biceps.PersonReferenceMsg {
            val builder = org.somda.protosdc.proto.model.biceps.PersonReferenceMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.addAllIdentification(source.identification.map { map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(it) }.toList())
            source.name?.let { field -> builder.name = map_org_somda_protosdc_biceps_model_BaseDemographicsOneOf(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_PersonParticipation(source: org.somda.protosdc.biceps.model.PersonParticipation): org.somda.protosdc.proto.model.biceps.PersonParticipationMsg {
            val builder = org.somda.protosdc.proto.model.biceps.PersonParticipationMsg.newBuilder()
            builder.personReference = map_org_somda_protosdc_biceps_model_PersonReference(source.personReference)
            builder.addAllRole(source.role.map { map_org_somda_protosdc_biceps_model_CodedValue(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_OrderDetail(source: org.somda.protosdc.biceps.model.OrderDetail): org.somda.protosdc.proto.model.biceps.OrderDetailMsg {
            val builder = org.somda.protosdc.proto.model.biceps.OrderDetailMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            source.start?.let { field -> builder.start = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapLocalDateTimeOptional(field) }
            source.end?.let { field -> builder.end = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapLocalDateTimeOptional(field) }
            builder.addAllPerformer(source.performer.map { map_org_somda_protosdc_biceps_model_PersonParticipation(it) }.toList())
            builder.addAllService(source.service.map { map_org_somda_protosdc_biceps_model_CodedValue(it) }.toList())
            builder.addAllImagingProcedure(source.imagingProcedure.map { map_org_somda_protosdc_biceps_model_ImagingProcedure(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_OperatorContextState(source: org.somda.protosdc.biceps.model.OperatorContextState): org.somda.protosdc.proto.model.biceps.OperatorContextStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.OperatorContextStateMsg.newBuilder()
            builder.abstractContextState = map_org_somda_protosdc_biceps_model_AbstractContextState(source.abstractContextState)
            source.operatorDetails?.let { field -> builder.operatorDetails = map_org_somda_protosdc_biceps_model_BaseDemographicsOneOf(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_PersonReferenceOneOf(source: org.somda.protosdc.biceps.model.PersonReferenceOneOf): org.somda.protosdc.proto.model.biceps.PersonReferenceOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.PersonReferenceOneOf.valuePersonReference -> org.somda.protosdc.proto.model.biceps.PersonReferenceOneOfMsg.newBuilder().setPersonReference(map_org_somda_protosdc_biceps_model_PersonReference(source.value)).build()
                is org.somda.protosdc.biceps.model.PersonReferenceOneOf.valuePersonParticipation -> org.somda.protosdc.proto.model.biceps.PersonReferenceOneOfMsg.newBuilder().setPersonParticipation(map_org_somda_protosdc_biceps_model_PersonParticipation(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_NeonatalPatientDemographicsCoreData(source: org.somda.protosdc.biceps.model.NeonatalPatientDemographicsCoreData): org.somda.protosdc.proto.model.biceps.NeonatalPatientDemographicsCoreDataMsg {
            val builder = org.somda.protosdc.proto.model.biceps.NeonatalPatientDemographicsCoreDataMsg.newBuilder()
            builder.patientDemographicsCoreData = map_org_somda_protosdc_biceps_model_PatientDemographicsCoreData(source.patientDemographicsCoreData)
            source.gestationalAge?.let { field -> builder.gestationalAge = map_org_somda_protosdc_biceps_model_Measurement(field) }
            source.birthLength?.let { field -> builder.birthLength = map_org_somda_protosdc_biceps_model_Measurement(field) }
            source.birthWeight?.let { field -> builder.birthWeight = map_org_somda_protosdc_biceps_model_Measurement(field) }
            source.headCircumference?.let { field -> builder.headCircumference = map_org_somda_protosdc_biceps_model_Measurement(field) }
            source.mother?.let { field -> builder.mother = map_org_somda_protosdc_biceps_model_PersonReferenceOneOf(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_WorkflowContextState_WorkflowDetail_RequestedOrderDetail(source: org.somda.protosdc.biceps.model.WorkflowContextState.WorkflowDetail.RequestedOrderDetail): org.somda.protosdc.proto.model.biceps.WorkflowContextStateMsg.WorkflowDetailMsg.RequestedOrderDetailMsg {
            val builder = org.somda.protosdc.proto.model.biceps.WorkflowContextStateMsg.WorkflowDetailMsg.RequestedOrderDetailMsg.newBuilder()
            builder.orderDetail = map_org_somda_protosdc_biceps_model_OrderDetail(source.orderDetail)
            source.referringPhysician?.let { field -> builder.referringPhysician = map_org_somda_protosdc_biceps_model_PersonReferenceOneOf(field) }
            source.requestingPhysician?.let { field -> builder.requestingPhysician = map_org_somda_protosdc_biceps_model_PersonReferenceOneOf(field) }
            builder.placerOrderNumber = map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(source.placerOrderNumber)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_WorkflowContextState_WorkflowDetail_PerformedOrderDetail(source: org.somda.protosdc.biceps.model.WorkflowContextState.WorkflowDetail.PerformedOrderDetail): org.somda.protosdc.proto.model.biceps.WorkflowContextStateMsg.WorkflowDetailMsg.PerformedOrderDetailMsg {
            val builder = org.somda.protosdc.proto.model.biceps.WorkflowContextStateMsg.WorkflowDetailMsg.PerformedOrderDetailMsg.newBuilder()
            builder.orderDetail = map_org_somda_protosdc_biceps_model_OrderDetail(source.orderDetail)
            source.fillerOrderNumber?.let { field -> builder.fillerOrderNumber = map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(field) }
            builder.addAllResultingClinicalInfo(source.resultingClinicalInfo.map { map_org_somda_protosdc_biceps_model_ClinicalInfo(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_WorkflowContextState_WorkflowDetail(source: org.somda.protosdc.biceps.model.WorkflowContextState.WorkflowDetail): org.somda.protosdc.proto.model.biceps.WorkflowContextStateMsg.WorkflowDetailMsg {
            val builder = org.somda.protosdc.proto.model.biceps.WorkflowContextStateMsg.WorkflowDetailMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.patient = map_org_somda_protosdc_biceps_model_PersonReferenceOneOf(source.patient)
            source.assignedLocation?.let { field -> builder.assignedLocation = map_org_somda_protosdc_biceps_model_LocationReference(field) }
            source.visitNumber?.let { field -> builder.visitNumber = map_org_somda_protosdc_biceps_model_InstanceIdentifierOneOf(field) }
            builder.addAllDangerCode(source.dangerCode.map { map_org_somda_protosdc_biceps_model_CodedValue(it) }.toList())
            builder.addAllRelevantClinicalInfo(source.relevantClinicalInfo.map { map_org_somda_protosdc_biceps_model_ClinicalInfo(it) }.toList())
            source.requestedOrderDetail?.let { field -> builder.requestedOrderDetail = map_org_somda_protosdc_biceps_model_WorkflowContextState_WorkflowDetail_RequestedOrderDetail(field) }
            source.performedOrderDetail?.let { field -> builder.performedOrderDetail = map_org_somda_protosdc_biceps_model_WorkflowContextState_WorkflowDetail_PerformedOrderDetail(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_WorkflowContextState(source: org.somda.protosdc.biceps.model.WorkflowContextState): org.somda.protosdc.proto.model.biceps.WorkflowContextStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.WorkflowContextStateMsg.newBuilder()
            builder.abstractContextState = map_org_somda_protosdc_biceps_model_AbstractContextState(source.abstractContextState)
            source.workflowDetail?.let { field -> builder.workflowDetail = map_org_somda_protosdc_biceps_model_WorkflowContextState_WorkflowDetail(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_PatientDemographicsCoreDataOneOf(source: org.somda.protosdc.biceps.model.PatientDemographicsCoreDataOneOf): org.somda.protosdc.proto.model.biceps.PatientDemographicsCoreDataOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.PatientDemographicsCoreDataOneOf.valuePatientDemographicsCoreData -> org.somda.protosdc.proto.model.biceps.PatientDemographicsCoreDataOneOfMsg.newBuilder().setPatientDemographicsCoreData(map_org_somda_protosdc_biceps_model_PatientDemographicsCoreData(source.value)).build()
                is org.somda.protosdc.biceps.model.PatientDemographicsCoreDataOneOf.valueNeonatalPatientDemographicsCoreData -> org.somda.protosdc.proto.model.biceps.PatientDemographicsCoreDataOneOfMsg.newBuilder().setNeonatalPatientDemographicsCoreData(map_org_somda_protosdc_biceps_model_NeonatalPatientDemographicsCoreData(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_PatientContextState(source: org.somda.protosdc.biceps.model.PatientContextState): org.somda.protosdc.proto.model.biceps.PatientContextStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.PatientContextStateMsg.newBuilder()
            builder.abstractContextState = map_org_somda_protosdc_biceps_model_AbstractContextState(source.abstractContextState)
            source.coreData?.let { field -> builder.coreData = map_org_somda_protosdc_biceps_model_PatientDemographicsCoreDataOneOf(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractStateOneOf(source: org.somda.protosdc.biceps.model.AbstractStateOneOf): org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueAbstractState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setAbstractState(map_org_somda_protosdc_biceps_model_AbstractState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueAbstractAlertState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setAbstractAlertState(map_org_somda_protosdc_biceps_model_AbstractAlertState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueAbstractComplexDeviceComponentState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setAbstractComplexDeviceComponentState(map_org_somda_protosdc_biceps_model_AbstractComplexDeviceComponentState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueAbstractContextState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setAbstractContextState(map_org_somda_protosdc_biceps_model_AbstractContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueAbstractDeviceComponentState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setAbstractDeviceComponentState(map_org_somda_protosdc_biceps_model_AbstractDeviceComponentState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueAbstractMetricState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setAbstractMetricState(map_org_somda_protosdc_biceps_model_AbstractMetricState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueAbstractMultiState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setAbstractMultiState(map_org_somda_protosdc_biceps_model_AbstractMultiState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueAbstractOperationState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setAbstractOperationState(map_org_somda_protosdc_biceps_model_AbstractOperationState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueActivateOperationState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setActivateOperationState(map_org_somda_protosdc_biceps_model_ActivateOperationState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueAlertConditionState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setAlertConditionState(map_org_somda_protosdc_biceps_model_AlertConditionState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueAlertSignalState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setAlertSignalState(map_org_somda_protosdc_biceps_model_AlertSignalState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueAlertSystemState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setAlertSystemState(map_org_somda_protosdc_biceps_model_AlertSystemState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueBatteryState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setBatteryState(map_org_somda_protosdc_biceps_model_BatteryState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueChannelState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setChannelState(map_org_somda_protosdc_biceps_model_ChannelState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueClockState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setClockState(map_org_somda_protosdc_biceps_model_ClockState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueDistributionSampleArrayMetricState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setDistributionSampleArrayMetricState(map_org_somda_protosdc_biceps_model_DistributionSampleArrayMetricState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueEnsembleContextState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setEnsembleContextState(map_org_somda_protosdc_biceps_model_EnsembleContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueEnumStringMetricState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setEnumStringMetricState(map_org_somda_protosdc_biceps_model_EnumStringMetricState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueLimitAlertConditionState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setLimitAlertConditionState(map_org_somda_protosdc_biceps_model_LimitAlertConditionState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueLocationContextState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setLocationContextState(map_org_somda_protosdc_biceps_model_LocationContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueMdsState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setMdsState(map_org_somda_protosdc_biceps_model_MdsState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueMeansContextState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setMeansContextState(map_org_somda_protosdc_biceps_model_MeansContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueNumericMetricState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setNumericMetricState(map_org_somda_protosdc_biceps_model_NumericMetricState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueOperatorContextState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setOperatorContextState(map_org_somda_protosdc_biceps_model_OperatorContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valuePatientContextState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setPatientContextState(map_org_somda_protosdc_biceps_model_PatientContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueRealTimeSampleArrayMetricState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setRealTimeSampleArrayMetricState(map_org_somda_protosdc_biceps_model_RealTimeSampleArrayMetricState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueScoState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setScoState(map_org_somda_protosdc_biceps_model_ScoState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueSetAlertStateOperationState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setSetAlertStateOperationState(map_org_somda_protosdc_biceps_model_SetAlertStateOperationState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueSetComponentStateOperationState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setSetComponentStateOperationState(map_org_somda_protosdc_biceps_model_SetComponentStateOperationState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueSetContextStateOperationState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setSetContextStateOperationState(map_org_somda_protosdc_biceps_model_SetContextStateOperationState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueSetMetricStateOperationState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setSetMetricStateOperationState(map_org_somda_protosdc_biceps_model_SetMetricStateOperationState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueSetStringOperationState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setSetStringOperationState(map_org_somda_protosdc_biceps_model_SetStringOperationState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueSetValueOperationState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setSetValueOperationState(map_org_somda_protosdc_biceps_model_SetValueOperationState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueStringMetricState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setStringMetricState(map_org_somda_protosdc_biceps_model_StringMetricState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueSystemContextState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setSystemContextState(map_org_somda_protosdc_biceps_model_SystemContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueVmdState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setVmdState(map_org_somda_protosdc_biceps_model_VmdState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractStateOneOf.valueWorkflowContextState -> org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.newBuilder().setWorkflowContextState(map_org_somda_protosdc_biceps_model_WorkflowContextState(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractMultiStateOneOf(source: org.somda.protosdc.biceps.model.AbstractMultiStateOneOf): org.somda.protosdc.proto.model.biceps.AbstractMultiStateOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractMultiStateOneOf.valueAbstractMultiState -> org.somda.protosdc.proto.model.biceps.AbstractMultiStateOneOfMsg.newBuilder().setAbstractMultiState(map_org_somda_protosdc_biceps_model_AbstractMultiState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMultiStateOneOf.valueAbstractContextState -> org.somda.protosdc.proto.model.biceps.AbstractMultiStateOneOfMsg.newBuilder().setAbstractContextState(map_org_somda_protosdc_biceps_model_AbstractContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMultiStateOneOf.valueEnsembleContextState -> org.somda.protosdc.proto.model.biceps.AbstractMultiStateOneOfMsg.newBuilder().setEnsembleContextState(map_org_somda_protosdc_biceps_model_EnsembleContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMultiStateOneOf.valueLocationContextState -> org.somda.protosdc.proto.model.biceps.AbstractMultiStateOneOfMsg.newBuilder().setLocationContextState(map_org_somda_protosdc_biceps_model_LocationContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMultiStateOneOf.valueMeansContextState -> org.somda.protosdc.proto.model.biceps.AbstractMultiStateOneOfMsg.newBuilder().setMeansContextState(map_org_somda_protosdc_biceps_model_MeansContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMultiStateOneOf.valueOperatorContextState -> org.somda.protosdc.proto.model.biceps.AbstractMultiStateOneOfMsg.newBuilder().setOperatorContextState(map_org_somda_protosdc_biceps_model_OperatorContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMultiStateOneOf.valuePatientContextState -> org.somda.protosdc.proto.model.biceps.AbstractMultiStateOneOfMsg.newBuilder().setPatientContextState(map_org_somda_protosdc_biceps_model_PatientContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractMultiStateOneOf.valueWorkflowContextState -> org.somda.protosdc.proto.model.biceps.AbstractMultiStateOneOfMsg.newBuilder().setWorkflowContextState(map_org_somda_protosdc_biceps_model_WorkflowContextState(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractContextStateOneOf(source: org.somda.protosdc.biceps.model.AbstractContextStateOneOf): org.somda.protosdc.proto.model.biceps.AbstractContextStateOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractContextStateOneOf.valueAbstractContextState -> org.somda.protosdc.proto.model.biceps.AbstractContextStateOneOfMsg.newBuilder().setAbstractContextState(map_org_somda_protosdc_biceps_model_AbstractContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractContextStateOneOf.valueEnsembleContextState -> org.somda.protosdc.proto.model.biceps.AbstractContextStateOneOfMsg.newBuilder().setEnsembleContextState(map_org_somda_protosdc_biceps_model_EnsembleContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractContextStateOneOf.valueLocationContextState -> org.somda.protosdc.proto.model.biceps.AbstractContextStateOneOfMsg.newBuilder().setLocationContextState(map_org_somda_protosdc_biceps_model_LocationContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractContextStateOneOf.valueMeansContextState -> org.somda.protosdc.proto.model.biceps.AbstractContextStateOneOfMsg.newBuilder().setMeansContextState(map_org_somda_protosdc_biceps_model_MeansContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractContextStateOneOf.valueOperatorContextState -> org.somda.protosdc.proto.model.biceps.AbstractContextStateOneOfMsg.newBuilder().setOperatorContextState(map_org_somda_protosdc_biceps_model_OperatorContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractContextStateOneOf.valuePatientContextState -> org.somda.protosdc.proto.model.biceps.AbstractContextStateOneOfMsg.newBuilder().setPatientContextState(map_org_somda_protosdc_biceps_model_PatientContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractContextStateOneOf.valueWorkflowContextState -> org.somda.protosdc.proto.model.biceps.AbstractContextStateOneOfMsg.newBuilder().setWorkflowContextState(map_org_somda_protosdc_biceps_model_WorkflowContextState(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_MdState(source: org.somda.protosdc.biceps.model.MdState): org.somda.protosdc.proto.model.biceps.MdStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.MdStateMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            builder.addAllState(source.state.map { map_org_somda_protosdc_biceps_model_AbstractStateOneOf(it) }.toList())
            source.stateVersionAttr?.let { field -> builder.stateVersionAttr = map_org_somda_protosdc_biceps_model_VersionCounter(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetStatesFromArchiveResponse(source: org.somda.protosdc.biceps.model.GetStatesFromArchiveResponse): org.somda.protosdc.proto.model.biceps.GetStatesFromArchiveResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetStatesFromArchiveResponseMsg.newBuilder()
            builder.abstractGetResponse = map_org_somda_protosdc_biceps_model_AbstractGetResponse(source.abstractGetResponse)
            builder.addAllState(source.state.map { map_org_somda_protosdc_biceps_model_AbstractStateOneOf(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetMdStateResponse(source: org.somda.protosdc.biceps.model.GetMdStateResponse): org.somda.protosdc.proto.model.biceps.GetMdStateResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetMdStateResponseMsg.newBuilder()
            builder.abstractGetResponse = map_org_somda_protosdc_biceps_model_AbstractGetResponse(source.abstractGetResponse)
            builder.mdState = map_org_somda_protosdc_biceps_model_MdState(source.mdState)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_DescriptionModificationReport_ReportPart(source: org.somda.protosdc.biceps.model.DescriptionModificationReport.ReportPart): org.somda.protosdc.proto.model.biceps.DescriptionModificationReportMsg.ReportPartMsg {
            val builder = org.somda.protosdc.proto.model.biceps.DescriptionModificationReportMsg.ReportPartMsg.newBuilder()
            builder.abstractReportPart = map_org_somda_protosdc_biceps_model_AbstractReportPart(source.abstractReportPart)
            builder.addAllPDescriptor(source.descriptor.map { map_org_somda_protosdc_biceps_model_AbstractDescriptorOneOf(it) }.toList())
            builder.addAllState(source.state.map { map_org_somda_protosdc_biceps_model_AbstractStateOneOf(it) }.toList())
            source.parentDescriptorAttr?.let { field -> builder.parentDescriptorAttr = map_org_somda_protosdc_biceps_model_HandleRef(field) }
            source.modificationTypeAttr?.let { field -> builder.modificationTypeAttr = map_org_somda_protosdc_biceps_model_DescriptionModificationType(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_DescriptionModificationReport(source: org.somda.protosdc.biceps.model.DescriptionModificationReport): org.somda.protosdc.proto.model.biceps.DescriptionModificationReportMsg {
            val builder = org.somda.protosdc.proto.model.biceps.DescriptionModificationReportMsg.newBuilder()
            builder.abstractReport = map_org_somda_protosdc_biceps_model_AbstractReport(source.abstractReport)
            builder.addAllReportPart(source.reportPart.map { map_org_somda_protosdc_biceps_model_DescriptionModificationReport_ReportPart(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetContextStatesByIdentificationResponse(source: org.somda.protosdc.biceps.model.GetContextStatesByIdentificationResponse): org.somda.protosdc.proto.model.biceps.GetContextStatesByIdentificationResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetContextStatesByIdentificationResponseMsg.newBuilder()
            builder.abstractGetResponse = map_org_somda_protosdc_biceps_model_AbstractGetResponse(source.abstractGetResponse)
            builder.addAllContextState(source.contextState.map { map_org_somda_protosdc_biceps_model_AbstractContextStateOneOf(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetContextStatesResponse(source: org.somda.protosdc.biceps.model.GetContextStatesResponse): org.somda.protosdc.proto.model.biceps.GetContextStatesResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetContextStatesResponseMsg.newBuilder()
            builder.abstractGetResponse = map_org_somda_protosdc_biceps_model_AbstractGetResponse(source.abstractGetResponse)
            builder.addAllContextState(source.contextState.map { map_org_somda_protosdc_biceps_model_AbstractContextStateOneOf(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_SetContextState(source: org.somda.protosdc.biceps.model.SetContextState): org.somda.protosdc.proto.model.biceps.SetContextStateMsg {
            val builder = org.somda.protosdc.proto.model.biceps.SetContextStateMsg.newBuilder()
            builder.abstractSet = map_org_somda_protosdc_biceps_model_AbstractSet(source.abstractSet)
            builder.addAllProposedContextState(source.proposedContextState.map { map_org_somda_protosdc_biceps_model_AbstractContextStateOneOf(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetContextStatesByFilterResponse(source: org.somda.protosdc.biceps.model.GetContextStatesByFilterResponse): org.somda.protosdc.proto.model.biceps.GetContextStatesByFilterResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetContextStatesByFilterResponseMsg.newBuilder()
            builder.abstractGetResponse = map_org_somda_protosdc_biceps_model_AbstractGetResponse(source.abstractGetResponse)
            builder.addAllContextState(source.contextState.map { map_org_somda_protosdc_biceps_model_AbstractContextStateOneOf(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractContextReport_ReportPart(source: org.somda.protosdc.biceps.model.AbstractContextReport.ReportPart): org.somda.protosdc.proto.model.biceps.AbstractContextReportMsg.ReportPartMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractContextReportMsg.ReportPartMsg.newBuilder()
            builder.abstractReportPart = map_org_somda_protosdc_biceps_model_AbstractReportPart(source.abstractReportPart)
            builder.addAllContextState(source.contextState.map { map_org_somda_protosdc_biceps_model_AbstractContextStateOneOf(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractContextReport(source: org.somda.protosdc.biceps.model.AbstractContextReport): org.somda.protosdc.proto.model.biceps.AbstractContextReportMsg {
            val builder = org.somda.protosdc.proto.model.biceps.AbstractContextReportMsg.newBuilder()
            builder.abstractReport = map_org_somda_protosdc_biceps_model_AbstractReport(source.abstractReport)
            builder.addAllReportPart(source.reportPart.map { map_org_somda_protosdc_biceps_model_AbstractContextReport_ReportPart(it) }.toList())
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_PeriodicContextReport(source: org.somda.protosdc.biceps.model.PeriodicContextReport): org.somda.protosdc.proto.model.biceps.PeriodicContextReportMsg {
            val builder = org.somda.protosdc.proto.model.biceps.PeriodicContextReportMsg.newBuilder()
            builder.abstractContextReport = map_org_somda_protosdc_biceps_model_AbstractContextReport(source.abstractContextReport)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_EpisodicContextReport(source: org.somda.protosdc.biceps.model.EpisodicContextReport): org.somda.protosdc.proto.model.biceps.EpisodicContextReportMsg {
            val builder = org.somda.protosdc.proto.model.biceps.EpisodicContextReportMsg.newBuilder()
            builder.abstractContextReport = map_org_somda_protosdc_biceps_model_AbstractContextReport(source.abstractContextReport)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_Mdib(source: org.somda.protosdc.biceps.model.Mdib): org.somda.protosdc.proto.model.biceps.MdibMsg {
            val builder = org.somda.protosdc.proto.model.biceps.MdibMsg.newBuilder()
            source.extensionElement?.let { field -> builder.extensionElement = map_org_somda_protosdc_biceps_model_Extension(field) }
            source.mdDescription?.let { field -> builder.mdDescription = map_org_somda_protosdc_biceps_model_MdDescription(field) }
            source.mdState?.let { field -> builder.mdState = map_org_somda_protosdc_biceps_model_MdState(field) }
            builder.mdibVersionGroupAttr = map_org_somda_protosdc_biceps_model_MdibVersionGroup(source.mdibVersionGroupAttr)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_GetMdibResponse(source: org.somda.protosdc.biceps.model.GetMdibResponse): org.somda.protosdc.proto.model.biceps.GetMdibResponseMsg {
            val builder = org.somda.protosdc.proto.model.biceps.GetMdibResponseMsg.newBuilder()
            builder.abstractGetResponse = map_org_somda_protosdc_biceps_model_AbstractGetResponse(source.abstractGetResponse)
            builder.mdib = map_org_somda_protosdc_biceps_model_Mdib(source.mdib)
            return builder.build()
        }
        fun map_org_somda_protosdc_biceps_model_AbstractGetResponseOneOf(source: org.somda.protosdc.biceps.model.AbstractGetResponseOneOf): org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.valueAbstractGetResponse -> org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.newBuilder().setAbstractGetResponse(map_org_somda_protosdc_biceps_model_AbstractGetResponse(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.valueGetContainmentTreeResponse -> org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.newBuilder().setGetContainmentTreeResponse(map_org_somda_protosdc_biceps_model_GetContainmentTreeResponse(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.valueGetContextStatesByFilterResponse -> org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.newBuilder().setGetContextStatesByFilterResponse(map_org_somda_protosdc_biceps_model_GetContextStatesByFilterResponse(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.valueGetContextStatesByIdentificationResponse -> org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.newBuilder().setGetContextStatesByIdentificationResponse(map_org_somda_protosdc_biceps_model_GetContextStatesByIdentificationResponse(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.valueGetContextStatesResponse -> org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.newBuilder().setGetContextStatesResponse(map_org_somda_protosdc_biceps_model_GetContextStatesResponse(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.valueGetDescriptorResponse -> org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.newBuilder().setGetDescriptorResponse(map_org_somda_protosdc_biceps_model_GetDescriptorResponse(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.valueGetDescriptorsFromArchiveResponse -> org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.newBuilder().setGetDescriptorsFromArchiveResponse(map_org_somda_protosdc_biceps_model_GetDescriptorsFromArchiveResponse(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.valueGetLocalizedTextResponse -> org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.newBuilder().setGetLocalizedTextResponse(map_org_somda_protosdc_biceps_model_GetLocalizedTextResponse(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.valueGetMdDescriptionResponse -> org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.newBuilder().setGetMdDescriptionResponse(map_org_somda_protosdc_biceps_model_GetMdDescriptionResponse(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.valueGetMdStateResponse -> org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.newBuilder().setGetMdStateResponse(map_org_somda_protosdc_biceps_model_GetMdStateResponse(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.valueGetMdibResponse -> org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.newBuilder().setGetMdibResponse(map_org_somda_protosdc_biceps_model_GetMdibResponse(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.valueGetStatesFromArchiveResponse -> org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.newBuilder().setGetStatesFromArchiveResponse(map_org_somda_protosdc_biceps_model_GetStatesFromArchiveResponse(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.valueGetSupportedLanguagesResponse -> org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.newBuilder().setGetSupportedLanguagesResponse(map_org_somda_protosdc_biceps_model_GetSupportedLanguagesResponse(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractSetOneOf(source: org.somda.protosdc.biceps.model.AbstractSetOneOf): org.somda.protosdc.proto.model.biceps.AbstractSetOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractSetOneOf.valueAbstractSet -> org.somda.protosdc.proto.model.biceps.AbstractSetOneOfMsg.newBuilder().setAbstractSet(map_org_somda_protosdc_biceps_model_AbstractSet(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractSetOneOf.valueActivate -> org.somda.protosdc.proto.model.biceps.AbstractSetOneOfMsg.newBuilder().setActivate(map_org_somda_protosdc_biceps_model_Activate(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractSetOneOf.valueSetAlertState -> org.somda.protosdc.proto.model.biceps.AbstractSetOneOfMsg.newBuilder().setSetAlertState(map_org_somda_protosdc_biceps_model_SetAlertState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractSetOneOf.valueSetComponentState -> org.somda.protosdc.proto.model.biceps.AbstractSetOneOfMsg.newBuilder().setSetComponentState(map_org_somda_protosdc_biceps_model_SetComponentState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractSetOneOf.valueSetContextState -> org.somda.protosdc.proto.model.biceps.AbstractSetOneOfMsg.newBuilder().setSetContextState(map_org_somda_protosdc_biceps_model_SetContextState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractSetOneOf.valueSetMetricState -> org.somda.protosdc.proto.model.biceps.AbstractSetOneOfMsg.newBuilder().setSetMetricState(map_org_somda_protosdc_biceps_model_SetMetricState(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractSetOneOf.valueSetString -> org.somda.protosdc.proto.model.biceps.AbstractSetOneOfMsg.newBuilder().setSetString(map_org_somda_protosdc_biceps_model_SetString(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractSetOneOf.valueSetValue -> org.somda.protosdc.proto.model.biceps.AbstractSetOneOfMsg.newBuilder().setSetValue(map_org_somda_protosdc_biceps_model_SetValue(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractReportOneOf(source: org.somda.protosdc.biceps.model.AbstractReportOneOf): org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valueAbstractReport -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setAbstractReport(map_org_somda_protosdc_biceps_model_AbstractReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valueAbstractAlertReport -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setAbstractAlertReport(map_org_somda_protosdc_biceps_model_AbstractAlertReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valueAbstractComponentReport -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setAbstractComponentReport(map_org_somda_protosdc_biceps_model_AbstractComponentReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valueAbstractContextReport -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setAbstractContextReport(map_org_somda_protosdc_biceps_model_AbstractContextReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valueAbstractMetricReport -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setAbstractMetricReport(map_org_somda_protosdc_biceps_model_AbstractMetricReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valueAbstractOperationalStateReport -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setAbstractOperationalStateReport(map_org_somda_protosdc_biceps_model_AbstractOperationalStateReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valueDescriptionModificationReport -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setDescriptionModificationReport(map_org_somda_protosdc_biceps_model_DescriptionModificationReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valueEpisodicAlertReport -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setEpisodicAlertReport(map_org_somda_protosdc_biceps_model_EpisodicAlertReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valueEpisodicComponentReport -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setEpisodicComponentReport(map_org_somda_protosdc_biceps_model_EpisodicComponentReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valueEpisodicContextReport -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setEpisodicContextReport(map_org_somda_protosdc_biceps_model_EpisodicContextReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valueEpisodicMetricReport -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setEpisodicMetricReport(map_org_somda_protosdc_biceps_model_EpisodicMetricReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valueEpisodicOperationalStateReport -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setEpisodicOperationalStateReport(map_org_somda_protosdc_biceps_model_EpisodicOperationalStateReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valueObservedValueStream -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setObservedValueStream(map_org_somda_protosdc_biceps_model_ObservedValueStream(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valueOperationInvokedReport -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setOperationInvokedReport(map_org_somda_protosdc_biceps_model_OperationInvokedReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valuePeriodicAlertReport -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setPeriodicAlertReport(map_org_somda_protosdc_biceps_model_PeriodicAlertReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valuePeriodicComponentReport -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setPeriodicComponentReport(map_org_somda_protosdc_biceps_model_PeriodicComponentReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valuePeriodicContextReport -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setPeriodicContextReport(map_org_somda_protosdc_biceps_model_PeriodicContextReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valuePeriodicMetricReport -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setPeriodicMetricReport(map_org_somda_protosdc_biceps_model_PeriodicMetricReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valuePeriodicOperationalStateReport -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setPeriodicOperationalStateReport(map_org_somda_protosdc_biceps_model_PeriodicOperationalStateReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valueSystemErrorReport -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setSystemErrorReport(map_org_somda_protosdc_biceps_model_SystemErrorReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractReportOneOf.valueWaveformStream -> org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.newBuilder().setWaveformStream(map_org_somda_protosdc_biceps_model_WaveformStream(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_biceps_model_AbstractContextReportOneOf(source: org.somda.protosdc.biceps.model.AbstractContextReportOneOf): org.somda.protosdc.proto.model.biceps.AbstractContextReportOneOfMsg {
            return when (source) {
                is org.somda.protosdc.biceps.model.AbstractContextReportOneOf.valueAbstractContextReport -> org.somda.protosdc.proto.model.biceps.AbstractContextReportOneOfMsg.newBuilder().setAbstractContextReport(map_org_somda_protosdc_biceps_model_AbstractContextReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractContextReportOneOf.valueEpisodicContextReport -> org.somda.protosdc.proto.model.biceps.AbstractContextReportOneOfMsg.newBuilder().setEpisodicContextReport(map_org_somda_protosdc_biceps_model_EpisodicContextReport(source.value)).build()
                is org.somda.protosdc.biceps.model.AbstractContextReportOneOf.valuePeriodicContextReport -> org.somda.protosdc.proto.model.biceps.AbstractContextReportOneOfMsg.newBuilder().setPeriodicContextReport(map_org_somda_protosdc_biceps_model_PeriodicContextReport(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
    }
}
