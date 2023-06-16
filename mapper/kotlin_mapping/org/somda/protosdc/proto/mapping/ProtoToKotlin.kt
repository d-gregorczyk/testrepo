package org.somda.protosdc.proto.mapping

object ProtoToKotlin {
    fun mapProtoDecimalToBigDecimal(value: org.somda.protosdc.proto.model.common.Decimal): java.math.BigDecimal {
        return java.math.BigDecimal.valueOf(value.value, value.scale)
    }
    fun map_org_somda_protosdc_proto_model_biceps_ExtensionMsg_ItemMsg(source: org.somda.protosdc.proto.model.biceps.ExtensionMsg.ItemMsg): org.somda.protosdc.biceps.model.Extension.Item {
        return org.somda.protosdc.biceps.model.Extension.Item(
            mustUnderstand = source.mustUnderstand,
            extensionData = org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapAny(source.extensionData),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source: org.somda.protosdc.proto.model.biceps.ExtensionMsg): org.somda.protosdc.biceps.model.Extension {
        return org.somda.protosdc.biceps.model.Extension(
            item = source.itemList.toList().map { map_org_somda_protosdc_proto_model_biceps_ExtensionMsg_ItemMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_QualifiedNameMsg(source: org.somda.protosdc.proto.model.biceps.QualifiedNameMsg): org.somda.protosdc.biceps.model.QualifiedName {
        return org.somda.protosdc.biceps.model.QualifiedName(
            namespace = source.namespace,
            localName = source.localName,
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_MdsOperatingModeMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.MdsOperatingModeMsg.EnumType): org.somda.protosdc.biceps.model.MdsOperatingMode.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.MdsOperatingModeMsg.EnumType.NML -> org.somda.protosdc.biceps.model.MdsOperatingMode.EnumType.Nml
            org.somda.protosdc.proto.model.biceps.MdsOperatingModeMsg.EnumType.DMO -> org.somda.protosdc.biceps.model.MdsOperatingMode.EnumType.Dmo
            org.somda.protosdc.proto.model.biceps.MdsOperatingModeMsg.EnumType.SRV -> org.somda.protosdc.biceps.model.MdsOperatingMode.EnumType.Srv
            org.somda.protosdc.proto.model.biceps.MdsOperatingModeMsg.EnumType.MTN -> org.somda.protosdc.biceps.model.MdsOperatingMode.EnumType.Mtn
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_MdsOperatingModeMsg(source: org.somda.protosdc.proto.model.biceps.MdsOperatingModeMsg): org.somda.protosdc.biceps.model.MdsOperatingMode {
        return org.somda.protosdc.biceps.model.MdsOperatingMode(
            enumType = map_org_somda_protosdc_proto_model_biceps_MdsOperatingModeMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_DescriptionModificationTypeMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.DescriptionModificationTypeMsg.EnumType): org.somda.protosdc.biceps.model.DescriptionModificationType.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.DescriptionModificationTypeMsg.EnumType.CRT -> org.somda.protosdc.biceps.model.DescriptionModificationType.EnumType.Crt
            org.somda.protosdc.proto.model.biceps.DescriptionModificationTypeMsg.EnumType.UPT -> org.somda.protosdc.biceps.model.DescriptionModificationType.EnumType.Upt
            org.somda.protosdc.proto.model.biceps.DescriptionModificationTypeMsg.EnumType.DEL -> org.somda.protosdc.biceps.model.DescriptionModificationType.EnumType.Del
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_DescriptionModificationTypeMsg(source: org.somda.protosdc.proto.model.biceps.DescriptionModificationTypeMsg): org.somda.protosdc.biceps.model.DescriptionModificationType {
        return org.somda.protosdc.biceps.model.DescriptionModificationType(
            enumType = map_org_somda_protosdc_proto_model_biceps_DescriptionModificationTypeMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertSignalPrimaryLocationMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.AlertSignalPrimaryLocationMsg.EnumType): org.somda.protosdc.biceps.model.AlertSignalPrimaryLocation.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.AlertSignalPrimaryLocationMsg.EnumType.LOC -> org.somda.protosdc.biceps.model.AlertSignalPrimaryLocation.EnumType.Loc
            org.somda.protosdc.proto.model.biceps.AlertSignalPrimaryLocationMsg.EnumType.REM -> org.somda.protosdc.biceps.model.AlertSignalPrimaryLocation.EnumType.Rem
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertSignalPrimaryLocationMsg(source: org.somda.protosdc.proto.model.biceps.AlertSignalPrimaryLocationMsg): org.somda.protosdc.biceps.model.AlertSignalPrimaryLocation {
        return org.somda.protosdc.biceps.model.AlertSignalPrimaryLocation(
            enumType = map_org_somda_protosdc_proto_model_biceps_AlertSignalPrimaryLocationMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_MetricAvailabilityMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.MetricAvailabilityMsg.EnumType): org.somda.protosdc.biceps.model.MetricAvailability.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.MetricAvailabilityMsg.EnumType.INTR -> org.somda.protosdc.biceps.model.MetricAvailability.EnumType.Intr
            org.somda.protosdc.proto.model.biceps.MetricAvailabilityMsg.EnumType.CONT -> org.somda.protosdc.biceps.model.MetricAvailability.EnumType.Cont
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_MetricAvailabilityMsg(source: org.somda.protosdc.proto.model.biceps.MetricAvailabilityMsg): org.somda.protosdc.biceps.model.MetricAvailability {
        return org.somda.protosdc.biceps.model.MetricAvailability(
            enumType = map_org_somda_protosdc_proto_model_biceps_MetricAvailabilityMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ContextAssociationMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.ContextAssociationMsg.EnumType): org.somda.protosdc.biceps.model.ContextAssociation.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.ContextAssociationMsg.EnumType.NO -> org.somda.protosdc.biceps.model.ContextAssociation.EnumType.No
            org.somda.protosdc.proto.model.biceps.ContextAssociationMsg.EnumType.PRE -> org.somda.protosdc.biceps.model.ContextAssociation.EnumType.Pre
            org.somda.protosdc.proto.model.biceps.ContextAssociationMsg.EnumType.ASSOC -> org.somda.protosdc.biceps.model.ContextAssociation.EnumType.Assoc
            org.somda.protosdc.proto.model.biceps.ContextAssociationMsg.EnumType.DIS -> org.somda.protosdc.biceps.model.ContextAssociation.EnumType.Dis
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_ContextAssociationMsg(source: org.somda.protosdc.proto.model.biceps.ContextAssociationMsg): org.somda.protosdc.biceps.model.ContextAssociation {
        return org.somda.protosdc.biceps.model.ContextAssociation(
            enumType = map_org_somda_protosdc_proto_model_biceps_ContextAssociationMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertSignalManifestationMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.AlertSignalManifestationMsg.EnumType): org.somda.protosdc.biceps.model.AlertSignalManifestation.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.AlertSignalManifestationMsg.EnumType.AUD -> org.somda.protosdc.biceps.model.AlertSignalManifestation.EnumType.Aud
            org.somda.protosdc.proto.model.biceps.AlertSignalManifestationMsg.EnumType.VIS -> org.somda.protosdc.biceps.model.AlertSignalManifestation.EnumType.Vis
            org.somda.protosdc.proto.model.biceps.AlertSignalManifestationMsg.EnumType.TAN -> org.somda.protosdc.biceps.model.AlertSignalManifestation.EnumType.Tan
            org.somda.protosdc.proto.model.biceps.AlertSignalManifestationMsg.EnumType.OTH -> org.somda.protosdc.biceps.model.AlertSignalManifestation.EnumType.Oth
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertSignalManifestationMsg(source: org.somda.protosdc.proto.model.biceps.AlertSignalManifestationMsg): org.somda.protosdc.biceps.model.AlertSignalManifestation {
        return org.somda.protosdc.biceps.model.AlertSignalManifestation(
            enumType = map_org_somda_protosdc_proto_model_biceps_AlertSignalManifestationMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_CalibrationTypeMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.CalibrationTypeMsg.EnumType): org.somda.protosdc.biceps.model.CalibrationType.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.CalibrationTypeMsg.EnumType.OFFSET -> org.somda.protosdc.biceps.model.CalibrationType.EnumType.Offset
            org.somda.protosdc.proto.model.biceps.CalibrationTypeMsg.EnumType.GAIN -> org.somda.protosdc.biceps.model.CalibrationType.EnumType.Gain
            org.somda.protosdc.proto.model.biceps.CalibrationTypeMsg.EnumType.TP -> org.somda.protosdc.biceps.model.CalibrationType.EnumType.TP
            org.somda.protosdc.proto.model.biceps.CalibrationTypeMsg.EnumType.UNSPEC -> org.somda.protosdc.biceps.model.CalibrationType.EnumType.Unspec
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_CalibrationTypeMsg(source: org.somda.protosdc.proto.model.biceps.CalibrationTypeMsg): org.somda.protosdc.biceps.model.CalibrationType {
        return org.somda.protosdc.biceps.model.CalibrationType(
            enumType = map_org_somda_protosdc_proto_model_biceps_CalibrationTypeMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_LocalizedTextWidthMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.LocalizedTextWidthMsg.EnumType): org.somda.protosdc.biceps.model.LocalizedTextWidth.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.LocalizedTextWidthMsg.EnumType.XS -> org.somda.protosdc.biceps.model.LocalizedTextWidth.EnumType.xs
            org.somda.protosdc.proto.model.biceps.LocalizedTextWidthMsg.EnumType.S -> org.somda.protosdc.biceps.model.LocalizedTextWidth.EnumType.s
            org.somda.protosdc.proto.model.biceps.LocalizedTextWidthMsg.EnumType.M -> org.somda.protosdc.biceps.model.LocalizedTextWidth.EnumType.m
            org.somda.protosdc.proto.model.biceps.LocalizedTextWidthMsg.EnumType.L -> org.somda.protosdc.biceps.model.LocalizedTextWidth.EnumType.l
            org.somda.protosdc.proto.model.biceps.LocalizedTextWidthMsg.EnumType.XL -> org.somda.protosdc.biceps.model.LocalizedTextWidth.EnumType.xl
            org.somda.protosdc.proto.model.biceps.LocalizedTextWidthMsg.EnumType.XXL -> org.somda.protosdc.biceps.model.LocalizedTextWidth.EnumType.xxl
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_LocalizedTextWidthMsg(source: org.somda.protosdc.proto.model.biceps.LocalizedTextWidthMsg): org.somda.protosdc.biceps.model.LocalizedTextWidth {
        return org.somda.protosdc.biceps.model.LocalizedTextWidth(
            enumType = map_org_somda_protosdc_proto_model_biceps_LocalizedTextWidthMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_DerivationMethodMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.DerivationMethodMsg.EnumType): org.somda.protosdc.biceps.model.DerivationMethod.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.DerivationMethodMsg.EnumType.AUTO -> org.somda.protosdc.biceps.model.DerivationMethod.EnumType.Auto
            org.somda.protosdc.proto.model.biceps.DerivationMethodMsg.EnumType.MAN -> org.somda.protosdc.biceps.model.DerivationMethod.EnumType.Man
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_DerivationMethodMsg(source: org.somda.protosdc.proto.model.biceps.DerivationMethodMsg): org.somda.protosdc.biceps.model.DerivationMethod {
        return org.somda.protosdc.biceps.model.DerivationMethod(
            enumType = map_org_somda_protosdc_proto_model_biceps_DerivationMethodMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_InvocationStateMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.InvocationStateMsg.EnumType): org.somda.protosdc.biceps.model.InvocationState.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.InvocationStateMsg.EnumType.WAIT -> org.somda.protosdc.biceps.model.InvocationState.EnumType.Wait
            org.somda.protosdc.proto.model.biceps.InvocationStateMsg.EnumType.START -> org.somda.protosdc.biceps.model.InvocationState.EnumType.Start
            org.somda.protosdc.proto.model.biceps.InvocationStateMsg.EnumType.CNCLLD -> org.somda.protosdc.biceps.model.InvocationState.EnumType.Cnclld
            org.somda.protosdc.proto.model.biceps.InvocationStateMsg.EnumType.CNCLLD_MAN -> org.somda.protosdc.biceps.model.InvocationState.EnumType.CnclldMan
            org.somda.protosdc.proto.model.biceps.InvocationStateMsg.EnumType.FIN -> org.somda.protosdc.biceps.model.InvocationState.EnumType.Fin
            org.somda.protosdc.proto.model.biceps.InvocationStateMsg.EnumType.FIN_MOD -> org.somda.protosdc.biceps.model.InvocationState.EnumType.FinMod
            org.somda.protosdc.proto.model.biceps.InvocationStateMsg.EnumType.FAIL -> org.somda.protosdc.biceps.model.InvocationState.EnumType.Fail
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_InvocationStateMsg(source: org.somda.protosdc.proto.model.biceps.InvocationStateMsg): org.somda.protosdc.biceps.model.InvocationState {
        return org.somda.protosdc.biceps.model.InvocationState(
            enumType = map_org_somda_protosdc_proto_model_biceps_InvocationStateMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SafetyClassificationMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.SafetyClassificationMsg.EnumType): org.somda.protosdc.biceps.model.SafetyClassification.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.SafetyClassificationMsg.EnumType.INF -> org.somda.protosdc.biceps.model.SafetyClassification.EnumType.Inf
            org.somda.protosdc.proto.model.biceps.SafetyClassificationMsg.EnumType.MED_A -> org.somda.protosdc.biceps.model.SafetyClassification.EnumType.MedA
            org.somda.protosdc.proto.model.biceps.SafetyClassificationMsg.EnumType.MED_B -> org.somda.protosdc.biceps.model.SafetyClassification.EnumType.MedB
            org.somda.protosdc.proto.model.biceps.SafetyClassificationMsg.EnumType.MED_C -> org.somda.protosdc.biceps.model.SafetyClassification.EnumType.MedC
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_SafetyClassificationMsg(source: org.somda.protosdc.proto.model.biceps.SafetyClassificationMsg): org.somda.protosdc.biceps.model.SafetyClassification {
        return org.somda.protosdc.biceps.model.SafetyClassification(
            enumType = map_org_somda_protosdc_proto_model_biceps_SafetyClassificationMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_TimeZoneMsg(source: org.somda.protosdc.proto.model.biceps.TimeZoneMsg): org.somda.protosdc.biceps.model.TimeZone {
        return org.somda.protosdc.biceps.model.TimeZone(
            string = source.string,
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertConditionKindMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.AlertConditionKindMsg.EnumType): org.somda.protosdc.biceps.model.AlertConditionKind.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.AlertConditionKindMsg.EnumType.PHY -> org.somda.protosdc.biceps.model.AlertConditionKind.EnumType.Phy
            org.somda.protosdc.proto.model.biceps.AlertConditionKindMsg.EnumType.TEC -> org.somda.protosdc.biceps.model.AlertConditionKind.EnumType.Tec
            org.somda.protosdc.proto.model.biceps.AlertConditionKindMsg.EnumType.OTH -> org.somda.protosdc.biceps.model.AlertConditionKind.EnumType.Oth
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertConditionKindMsg(source: org.somda.protosdc.proto.model.biceps.AlertConditionKindMsg): org.somda.protosdc.biceps.model.AlertConditionKind {
        return org.somda.protosdc.biceps.model.AlertConditionKind(
            enumType = map_org_somda_protosdc_proto_model_biceps_AlertConditionKindMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_MeasurementValidityMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType): org.somda.protosdc.biceps.model.MeasurementValidity.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType.VLD -> org.somda.protosdc.biceps.model.MeasurementValidity.EnumType.Vld
            org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType.VLDATED -> org.somda.protosdc.biceps.model.MeasurementValidity.EnumType.Vldated
            org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType.ONG -> org.somda.protosdc.biceps.model.MeasurementValidity.EnumType.Ong
            org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType.QST -> org.somda.protosdc.biceps.model.MeasurementValidity.EnumType.Qst
            org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType.CALIB -> org.somda.protosdc.biceps.model.MeasurementValidity.EnumType.Calib
            org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType.INV -> org.somda.protosdc.biceps.model.MeasurementValidity.EnumType.Inv
            org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType.OFLW -> org.somda.protosdc.biceps.model.MeasurementValidity.EnumType.Oflw
            org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType.UFLW -> org.somda.protosdc.biceps.model.MeasurementValidity.EnumType.Uflw
            org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg.EnumType.NA -> org.somda.protosdc.biceps.model.MeasurementValidity.EnumType.NA
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_MeasurementValidityMsg(source: org.somda.protosdc.proto.model.biceps.MeasurementValidityMsg): org.somda.protosdc.biceps.model.MeasurementValidity {
        return org.somda.protosdc.biceps.model.MeasurementValidity(
            enumType = map_org_somda_protosdc_proto_model_biceps_MeasurementValidityMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_HandleMsg(source: org.somda.protosdc.proto.model.biceps.HandleMsg): org.somda.protosdc.biceps.model.Handle {
        return org.somda.protosdc.biceps.model.Handle(
            string = source.string,
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(source: org.somda.protosdc.proto.model.biceps.HandleRefMsg): org.somda.protosdc.biceps.model.HandleRef {
        return org.somda.protosdc.biceps.model.HandleRef(
            string = source.string,
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_OperatingModeMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.OperatingModeMsg.EnumType): org.somda.protosdc.biceps.model.OperatingMode.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.OperatingModeMsg.EnumType.DIS -> org.somda.protosdc.biceps.model.OperatingMode.EnumType.Dis
            org.somda.protosdc.proto.model.biceps.OperatingModeMsg.EnumType.EN -> org.somda.protosdc.biceps.model.OperatingMode.EnumType.En
            org.somda.protosdc.proto.model.biceps.OperatingModeMsg.EnumType.NA -> org.somda.protosdc.biceps.model.OperatingMode.EnumType.NA
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_OperatingModeMsg(source: org.somda.protosdc.proto.model.biceps.OperatingModeMsg): org.somda.protosdc.biceps.model.OperatingMode {
        return org.somda.protosdc.biceps.model.OperatingMode(
            enumType = map_org_somda_protosdc_proto_model_biceps_OperatingModeMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_LocalizedTextContentMsg(source: org.somda.protosdc.proto.model.biceps.LocalizedTextContentMsg): org.somda.protosdc.biceps.model.LocalizedTextContent {
        return org.somda.protosdc.biceps.model.LocalizedTextContent(
            string = source.string,
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_TransactionIdMsg(source: org.somda.protosdc.proto.model.biceps.TransactionIdMsg): org.somda.protosdc.biceps.model.TransactionId {
        return org.somda.protosdc.biceps.model.TransactionId(
            unsignedInt = source.unsignedInt,
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_RetrievabilityMethodMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.RetrievabilityMethodMsg.EnumType): org.somda.protosdc.biceps.model.RetrievabilityMethod.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.RetrievabilityMethodMsg.EnumType.GET -> org.somda.protosdc.biceps.model.RetrievabilityMethod.EnumType.Get
            org.somda.protosdc.proto.model.biceps.RetrievabilityMethodMsg.EnumType.PER -> org.somda.protosdc.biceps.model.RetrievabilityMethod.EnumType.Per
            org.somda.protosdc.proto.model.biceps.RetrievabilityMethodMsg.EnumType.EP -> org.somda.protosdc.biceps.model.RetrievabilityMethod.EnumType.Ep
            org.somda.protosdc.proto.model.biceps.RetrievabilityMethodMsg.EnumType.STRM -> org.somda.protosdc.biceps.model.RetrievabilityMethod.EnumType.Strm
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_RetrievabilityMethodMsg(source: org.somda.protosdc.proto.model.biceps.RetrievabilityMethodMsg): org.somda.protosdc.biceps.model.RetrievabilityMethod {
        return org.somda.protosdc.biceps.model.RetrievabilityMethod(
            enumType = map_org_somda_protosdc_proto_model_biceps_RetrievabilityMethodMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_CalibrationStateMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.CalibrationStateMsg.EnumType): org.somda.protosdc.biceps.model.CalibrationState.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.CalibrationStateMsg.EnumType.NO -> org.somda.protosdc.biceps.model.CalibrationState.EnumType.No
            org.somda.protosdc.proto.model.biceps.CalibrationStateMsg.EnumType.REQ -> org.somda.protosdc.biceps.model.CalibrationState.EnumType.Req
            org.somda.protosdc.proto.model.biceps.CalibrationStateMsg.EnumType.RUN -> org.somda.protosdc.biceps.model.CalibrationState.EnumType.Run
            org.somda.protosdc.proto.model.biceps.CalibrationStateMsg.EnumType.CAL -> org.somda.protosdc.biceps.model.CalibrationState.EnumType.Cal
            org.somda.protosdc.proto.model.biceps.CalibrationStateMsg.EnumType.OTH -> org.somda.protosdc.biceps.model.CalibrationState.EnumType.Oth
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_CalibrationStateMsg(source: org.somda.protosdc.proto.model.biceps.CalibrationStateMsg): org.somda.protosdc.biceps.model.CalibrationState {
        return org.somda.protosdc.biceps.model.CalibrationState(
            enumType = map_org_somda_protosdc_proto_model_biceps_CalibrationStateMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertConditionReferenceMsg(source: org.somda.protosdc.proto.model.biceps.AlertConditionReferenceMsg): org.somda.protosdc.biceps.model.AlertConditionReference {
        return org.somda.protosdc.biceps.model.AlertConditionReference(
            handleRef = source.handleRefList.toList().map { map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_MetricCategoryMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.MetricCategoryMsg.EnumType): org.somda.protosdc.biceps.model.MetricCategory.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.MetricCategoryMsg.EnumType.UNSPEC -> org.somda.protosdc.biceps.model.MetricCategory.EnumType.Unspec
            org.somda.protosdc.proto.model.biceps.MetricCategoryMsg.EnumType.MSRMT -> org.somda.protosdc.biceps.model.MetricCategory.EnumType.Msrmt
            org.somda.protosdc.proto.model.biceps.MetricCategoryMsg.EnumType.CLC -> org.somda.protosdc.biceps.model.MetricCategory.EnumType.Clc
            org.somda.protosdc.proto.model.biceps.MetricCategoryMsg.EnumType.SET -> org.somda.protosdc.biceps.model.MetricCategory.EnumType.Set
            org.somda.protosdc.proto.model.biceps.MetricCategoryMsg.EnumType.PRESET -> org.somda.protosdc.biceps.model.MetricCategory.EnumType.Preset
            org.somda.protosdc.proto.model.biceps.MetricCategoryMsg.EnumType.RCMM -> org.somda.protosdc.biceps.model.MetricCategory.EnumType.Rcmm
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_MetricCategoryMsg(source: org.somda.protosdc.proto.model.biceps.MetricCategoryMsg): org.somda.protosdc.biceps.model.MetricCategory {
        return org.somda.protosdc.biceps.model.MetricCategory(
            enumType = map_org_somda_protosdc_proto_model_biceps_MetricCategoryMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertConditionPriorityMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.AlertConditionPriorityMsg.EnumType): org.somda.protosdc.biceps.model.AlertConditionPriority.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.AlertConditionPriorityMsg.EnumType.LO -> org.somda.protosdc.biceps.model.AlertConditionPriority.EnumType.Lo
            org.somda.protosdc.proto.model.biceps.AlertConditionPriorityMsg.EnumType.ME -> org.somda.protosdc.biceps.model.AlertConditionPriority.EnumType.Me
            org.somda.protosdc.proto.model.biceps.AlertConditionPriorityMsg.EnumType.HI -> org.somda.protosdc.biceps.model.AlertConditionPriority.EnumType.Hi
            org.somda.protosdc.proto.model.biceps.AlertConditionPriorityMsg.EnumType.NONE -> org.somda.protosdc.biceps.model.AlertConditionPriority.EnumType.None
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertConditionPriorityMsg(source: org.somda.protosdc.proto.model.biceps.AlertConditionPriorityMsg): org.somda.protosdc.biceps.model.AlertConditionPriority {
        return org.somda.protosdc.biceps.model.AlertConditionPriority(
            enumType = map_org_somda_protosdc_proto_model_biceps_AlertConditionPriorityMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertSignalPresenceMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.AlertSignalPresenceMsg.EnumType): org.somda.protosdc.biceps.model.AlertSignalPresence.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.AlertSignalPresenceMsg.EnumType.ON -> org.somda.protosdc.biceps.model.AlertSignalPresence.EnumType.On
            org.somda.protosdc.proto.model.biceps.AlertSignalPresenceMsg.EnumType.OFF -> org.somda.protosdc.biceps.model.AlertSignalPresence.EnumType.Off
            org.somda.protosdc.proto.model.biceps.AlertSignalPresenceMsg.EnumType.LATCH -> org.somda.protosdc.biceps.model.AlertSignalPresence.EnumType.Latch
            org.somda.protosdc.proto.model.biceps.AlertSignalPresenceMsg.EnumType.ACK -> org.somda.protosdc.biceps.model.AlertSignalPresence.EnumType.Ack
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertSignalPresenceMsg(source: org.somda.protosdc.proto.model.biceps.AlertSignalPresenceMsg): org.somda.protosdc.biceps.model.AlertSignalPresence {
        return org.somda.protosdc.biceps.model.AlertSignalPresence(
            enumType = map_org_somda_protosdc_proto_model_biceps_AlertSignalPresenceMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_TimestampMsg(source: org.somda.protosdc.proto.model.biceps.TimestampMsg): org.somda.protosdc.biceps.model.Timestamp {
        return org.somda.protosdc.biceps.model.Timestamp(
            unsignedLong = source.unsignedLong,
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_RealTimeValueTypeMsg(source: org.somda.protosdc.proto.model.biceps.RealTimeValueTypeMsg): org.somda.protosdc.biceps.model.RealTimeValueType {
        return org.somda.protosdc.biceps.model.RealTimeValueType(
            decimal = source.decimalList.toList().map { mapProtoDecimalToBigDecimal(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_LocalizedTextRefMsg(source: org.somda.protosdc.proto.model.biceps.LocalizedTextRefMsg): org.somda.protosdc.biceps.model.LocalizedTextRef {
        return org.somda.protosdc.biceps.model.LocalizedTextRef(
            string = source.string,
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_InvocationErrorMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.InvocationErrorMsg.EnumType): org.somda.protosdc.biceps.model.InvocationError.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.InvocationErrorMsg.EnumType.UNSPEC -> org.somda.protosdc.biceps.model.InvocationError.EnumType.Unspec
            org.somda.protosdc.proto.model.biceps.InvocationErrorMsg.EnumType.UNKN -> org.somda.protosdc.biceps.model.InvocationError.EnumType.Unkn
            org.somda.protosdc.proto.model.biceps.InvocationErrorMsg.EnumType.INV -> org.somda.protosdc.biceps.model.InvocationError.EnumType.Inv
            org.somda.protosdc.proto.model.biceps.InvocationErrorMsg.EnumType.OTH -> org.somda.protosdc.biceps.model.InvocationError.EnumType.Oth
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_InvocationErrorMsg(source: org.somda.protosdc.proto.model.biceps.InvocationErrorMsg): org.somda.protosdc.biceps.model.InvocationError {
        return org.somda.protosdc.biceps.model.InvocationError(
            enumType = map_org_somda_protosdc_proto_model_biceps_InvocationErrorMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_QualityIndicatorMsg(source: org.somda.protosdc.proto.model.biceps.QualityIndicatorMsg): org.somda.protosdc.biceps.model.QualityIndicator {
        return org.somda.protosdc.biceps.model.QualityIndicator(
            decimal = mapProtoDecimalToBigDecimal(source.decimal),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SexMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.SexMsg.EnumType): org.somda.protosdc.biceps.model.Sex.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.SexMsg.EnumType.UNSPEC -> org.somda.protosdc.biceps.model.Sex.EnumType.Unspec
            org.somda.protosdc.proto.model.biceps.SexMsg.EnumType.M -> org.somda.protosdc.biceps.model.Sex.EnumType.M
            org.somda.protosdc.proto.model.biceps.SexMsg.EnumType.F -> org.somda.protosdc.biceps.model.Sex.EnumType.F
            org.somda.protosdc.proto.model.biceps.SexMsg.EnumType.UNKN -> org.somda.protosdc.biceps.model.Sex.EnumType.Unkn
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_SexMsg(source: org.somda.protosdc.proto.model.biceps.SexMsg): org.somda.protosdc.biceps.model.Sex {
        return org.somda.protosdc.biceps.model.Sex(
            enumType = map_org_somda_protosdc_proto_model_biceps_SexMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SymbolicCodeNameMsg(source: org.somda.protosdc.proto.model.biceps.SymbolicCodeNameMsg): org.somda.protosdc.biceps.model.SymbolicCodeName {
        return org.somda.protosdc.biceps.model.SymbolicCodeName(
            string = source.string,
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertConditionMonitoredLimitsMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.AlertConditionMonitoredLimitsMsg.EnumType): org.somda.protosdc.biceps.model.AlertConditionMonitoredLimits.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.AlertConditionMonitoredLimitsMsg.EnumType.ALL -> org.somda.protosdc.biceps.model.AlertConditionMonitoredLimits.EnumType.All
            org.somda.protosdc.proto.model.biceps.AlertConditionMonitoredLimitsMsg.EnumType.LO_OFF -> org.somda.protosdc.biceps.model.AlertConditionMonitoredLimits.EnumType.LoOff
            org.somda.protosdc.proto.model.biceps.AlertConditionMonitoredLimitsMsg.EnumType.HI_OFF -> org.somda.protosdc.biceps.model.AlertConditionMonitoredLimits.EnumType.HiOff
            org.somda.protosdc.proto.model.biceps.AlertConditionMonitoredLimitsMsg.EnumType.NONE -> org.somda.protosdc.biceps.model.AlertConditionMonitoredLimits.EnumType.None
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertConditionMonitoredLimitsMsg(source: org.somda.protosdc.proto.model.biceps.AlertConditionMonitoredLimitsMsg): org.somda.protosdc.biceps.model.AlertConditionMonitoredLimits {
        return org.somda.protosdc.biceps.model.AlertConditionMonitoredLimits(
            enumType = map_org_somda_protosdc_proto_model_biceps_AlertConditionMonitoredLimitsMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_PatientTypeMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.PatientTypeMsg.EnumType): org.somda.protosdc.biceps.model.PatientType.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.PatientTypeMsg.EnumType.UNSPEC -> org.somda.protosdc.biceps.model.PatientType.EnumType.Unspec
            org.somda.protosdc.proto.model.biceps.PatientTypeMsg.EnumType.AD -> org.somda.protosdc.biceps.model.PatientType.EnumType.Ad
            org.somda.protosdc.proto.model.biceps.PatientTypeMsg.EnumType.ADO -> org.somda.protosdc.biceps.model.PatientType.EnumType.Ado
            org.somda.protosdc.proto.model.biceps.PatientTypeMsg.EnumType.PED -> org.somda.protosdc.biceps.model.PatientType.EnumType.Ped
            org.somda.protosdc.proto.model.biceps.PatientTypeMsg.EnumType.INF -> org.somda.protosdc.biceps.model.PatientType.EnumType.Inf
            org.somda.protosdc.proto.model.biceps.PatientTypeMsg.EnumType.NEO -> org.somda.protosdc.biceps.model.PatientType.EnumType.Neo
            org.somda.protosdc.proto.model.biceps.PatientTypeMsg.EnumType.OTH -> org.somda.protosdc.biceps.model.PatientType.EnumType.Oth
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_PatientTypeMsg(source: org.somda.protosdc.proto.model.biceps.PatientTypeMsg): org.somda.protosdc.biceps.model.PatientType {
        return org.somda.protosdc.biceps.model.PatientType(
            enumType = map_org_somda_protosdc_proto_model_biceps_PatientTypeMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GenerationModeMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.GenerationModeMsg.EnumType): org.somda.protosdc.biceps.model.GenerationMode.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.GenerationModeMsg.EnumType.REAL -> org.somda.protosdc.biceps.model.GenerationMode.EnumType.Real
            org.somda.protosdc.proto.model.biceps.GenerationModeMsg.EnumType.TEST -> org.somda.protosdc.biceps.model.GenerationMode.EnumType.Test
            org.somda.protosdc.proto.model.biceps.GenerationModeMsg.EnumType.DEMO -> org.somda.protosdc.biceps.model.GenerationMode.EnumType.Demo
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_GenerationModeMsg(source: org.somda.protosdc.proto.model.biceps.GenerationModeMsg): org.somda.protosdc.biceps.model.GenerationMode {
        return org.somda.protosdc.biceps.model.GenerationMode(
            enumType = map_org_somda_protosdc_proto_model_biceps_GenerationModeMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_VersionCounterMsg(source: org.somda.protosdc.proto.model.biceps.VersionCounterMsg): org.somda.protosdc.biceps.model.VersionCounter {
        return org.somda.protosdc.biceps.model.VersionCounter(
            unsignedLong = source.unsignedLong,
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_CodeIdentifierMsg(source: org.somda.protosdc.proto.model.biceps.CodeIdentifierMsg): org.somda.protosdc.biceps.model.CodeIdentifier {
        return org.somda.protosdc.biceps.model.CodeIdentifier(
            string = source.string,
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ComponentActivationMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.ComponentActivationMsg.EnumType): org.somda.protosdc.biceps.model.ComponentActivation.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.ComponentActivationMsg.EnumType.ON -> org.somda.protosdc.biceps.model.ComponentActivation.EnumType.On
            org.somda.protosdc.proto.model.biceps.ComponentActivationMsg.EnumType.NOT_RDY -> org.somda.protosdc.biceps.model.ComponentActivation.EnumType.NotRdy
            org.somda.protosdc.proto.model.biceps.ComponentActivationMsg.EnumType.STND_BY -> org.somda.protosdc.biceps.model.ComponentActivation.EnumType.StndBy
            org.somda.protosdc.proto.model.biceps.ComponentActivationMsg.EnumType.OFF -> org.somda.protosdc.biceps.model.ComponentActivation.EnumType.Off
            org.somda.protosdc.proto.model.biceps.ComponentActivationMsg.EnumType.SHTDN -> org.somda.protosdc.biceps.model.ComponentActivation.EnumType.Shtdn
            org.somda.protosdc.proto.model.biceps.ComponentActivationMsg.EnumType.FAIL -> org.somda.protosdc.biceps.model.ComponentActivation.EnumType.Fail
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_ComponentActivationMsg(source: org.somda.protosdc.proto.model.biceps.ComponentActivationMsg): org.somda.protosdc.biceps.model.ComponentActivation {
        return org.somda.protosdc.biceps.model.ComponentActivation(
            enumType = map_org_somda_protosdc_proto_model_biceps_ComponentActivationMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertActivationMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.AlertActivationMsg.EnumType): org.somda.protosdc.biceps.model.AlertActivation.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.AlertActivationMsg.EnumType.ON -> org.somda.protosdc.biceps.model.AlertActivation.EnumType.On
            org.somda.protosdc.proto.model.biceps.AlertActivationMsg.EnumType.OFF -> org.somda.protosdc.biceps.model.AlertActivation.EnumType.Off
            org.somda.protosdc.proto.model.biceps.AlertActivationMsg.EnumType.PSD -> org.somda.protosdc.biceps.model.AlertActivation.EnumType.Psd
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertActivationMsg(source: org.somda.protosdc.proto.model.biceps.AlertActivationMsg): org.somda.protosdc.biceps.model.AlertActivation {
        return org.somda.protosdc.biceps.model.AlertActivation(
            enumType = map_org_somda_protosdc_proto_model_biceps_AlertActivationMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_TimeFrameMsg(source: org.somda.protosdc.proto.model.biceps.TimeFrameMsg): org.somda.protosdc.biceps.model.TimeFrame {
        return org.somda.protosdc.biceps.model.TimeFrame(
            startAttr = when (source.hasStartAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_TimestampMsg(source.startAttr)
                false -> null
            },
            endAttr = when (source.hasEndAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_TimestampMsg(source.endAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SystemSignalActivationMsg(source: org.somda.protosdc.proto.model.biceps.SystemSignalActivationMsg): org.somda.protosdc.biceps.model.SystemSignalActivation {
        return org.somda.protosdc.biceps.model.SystemSignalActivation(
            manifestationAttr = map_org_somda_protosdc_proto_model_biceps_AlertSignalManifestationMsg(source.manifestationAttr),
            stateAttr = map_org_somda_protosdc_proto_model_biceps_AlertActivationMsg(source.stateAttr),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_MdibVersionGroupMsg(source: org.somda.protosdc.proto.model.biceps.MdibVersionGroupMsg): org.somda.protosdc.biceps.model.MdibVersionGroup {
        return org.somda.protosdc.biceps.model.MdibVersionGroup(
            mdibVersionAttr = when (source.hasMdibVersionAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_VersionCounterMsg(source.mdibVersionAttr)
                false -> null
            },
            sequenceIdAttr = source.sequenceIdAttr,
            instanceIdAttr = when (source.hasInstanceIdAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapUInt64Value(source.instanceIdAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ContainmentTreeInfoMsg(source: org.somda.protosdc.proto.model.biceps.ContainmentTreeInfoMsg): org.somda.protosdc.biceps.model.ContainmentTreeInfo {
        return org.somda.protosdc.biceps.model.ContainmentTreeInfo(
            handleRefAttr = when (source.hasHandleRefAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(source.handleRefAttr)
                false -> null
            },
            parentHandleRefAttr = when (source.hasParentHandleRefAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(source.parentHandleRefAttr)
                false -> null
            },
            entryTypeAttr = when (source.hasEntryTypeAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_QualifiedNameMsg(source.entryTypeAttr)
                false -> null
            },
            childrenCountAttr = when (source.hasChildrenCountAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapInt32Value(source.childrenCountAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_EntryRefMsg(source: org.somda.protosdc.proto.model.biceps.EntryRefMsg): org.somda.protosdc.biceps.model.EntryRef {
        return org.somda.protosdc.biceps.model.EntryRef(
            handleRef = source.handleRefList.toList().map { map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ReferencedVersionMsg(source: org.somda.protosdc.proto.model.biceps.ReferencedVersionMsg): org.somda.protosdc.biceps.model.ReferencedVersion {
        return org.somda.protosdc.biceps.model.ReferencedVersion(
            versionCounter = map_org_somda_protosdc_proto_model_biceps_VersionCounterMsg(source.versionCounter),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_OperationRefMsg(source: org.somda.protosdc.proto.model.biceps.OperationRefMsg): org.somda.protosdc.biceps.model.OperationRef {
        return org.somda.protosdc.biceps.model.OperationRef(
            handleRef = source.handleRefList.toList().map { map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractReportMsg(source: org.somda.protosdc.proto.model.biceps.AbstractReportMsg): org.somda.protosdc.biceps.model.AbstractReport {
        return org.somda.protosdc.biceps.model.AbstractReport(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            mdibVersionGroupAttr = map_org_somda_protosdc_proto_model_biceps_MdibVersionGroupMsg(source.mdibVersionGroupAttr),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractReportPartMsg(source: org.somda.protosdc.proto.model.biceps.AbstractReportPartMsg): org.somda.protosdc.biceps.model.AbstractReportPart {
        return org.somda.protosdc.biceps.model.AbstractReportPart(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            sourceMds = when (source.hasSourceMds()) {
                true -> map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(source.sourceMds)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_LocationDetailMsg(source: org.somda.protosdc.proto.model.biceps.LocationDetailMsg): org.somda.protosdc.biceps.model.LocationDetail {
        return org.somda.protosdc.biceps.model.LocationDetail(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            poCAttr = when (source.hasPoCAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.poCAttr)
                false -> null
            },
            roomAttr = when (source.hasRoomAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.roomAttr)
                false -> null
            },
            bedAttr = when (source.hasBedAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.bedAttr)
                false -> null
            },
            facilityAttr = when (source.hasFacilityAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.facilityAttr)
                false -> null
            },
            buildingAttr = when (source.hasBuildingAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.buildingAttr)
                false -> null
            },
            floorAttr = when (source.hasFloorAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.floorAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_VersionFrameMsg(source: org.somda.protosdc.proto.model.biceps.VersionFrameMsg): org.somda.protosdc.biceps.model.VersionFrame {
        return org.somda.protosdc.biceps.model.VersionFrame(
            startAttr = when (source.hasStartAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ReferencedVersionMsg(source.startAttr)
                false -> null
            },
            endAttr = when (source.hasEndAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ReferencedVersionMsg(source.endAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_LocalizedTextMsg(source: org.somda.protosdc.proto.model.biceps.LocalizedTextMsg): org.somda.protosdc.biceps.model.LocalizedText {
        return org.somda.protosdc.biceps.model.LocalizedText(
            localizedTextContent = map_org_somda_protosdc_proto_model_biceps_LocalizedTextContentMsg(source.localizedTextContent),
            refAttr = when (source.hasRefAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_LocalizedTextRefMsg(source.refAttr)
                false -> null
            },
            langAttr = when (source.hasLangAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.langAttr)
                false -> null
            },
            versionAttr = when (source.hasVersionAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ReferencedVersionMsg(source.versionAttr)
                false -> null
            },
            textWidthAttr = when (source.hasTextWidthAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_LocalizedTextWidthMsg(source.textWidthAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_RetrievabilityInfoMsg(source: org.somda.protosdc.proto.model.biceps.RetrievabilityInfoMsg): org.somda.protosdc.biceps.model.RetrievabilityInfo {
        return org.somda.protosdc.biceps.model.RetrievabilityInfo(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            methodAttr = map_org_somda_protosdc_proto_model_biceps_RetrievabilityMethodMsg(source.methodAttr),
            updatePeriodAttr = when (source.hasUpdatePeriodAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.updatePeriodAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractGetMsg(source: org.somda.protosdc.proto.model.biceps.AbstractGetMsg): org.somda.protosdc.biceps.model.AbstractGet {
        return org.somda.protosdc.biceps.model.AbstractGet(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractStateMsg(source: org.somda.protosdc.proto.model.biceps.AbstractStateMsg): org.somda.protosdc.biceps.model.AbstractState {
        return org.somda.protosdc.biceps.model.AbstractState(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            stateVersionAttr = when (source.hasStateVersionAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_VersionCounterMsg(source.stateVersionAttr)
                false -> null
            },
            descriptorHandleAttr = map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(source.descriptorHandleAttr),
            descriptorVersionAttr = when (source.hasDescriptorVersionAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ReferencedVersionMsg(source.descriptorVersionAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractGetResponseMsg(source: org.somda.protosdc.proto.model.biceps.AbstractGetResponseMsg): org.somda.protosdc.biceps.model.AbstractGetResponse {
        return org.somda.protosdc.biceps.model.AbstractGetResponse(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            mdibVersionGroupAttr = map_org_somda_protosdc_proto_model_biceps_MdibVersionGroupMsg(source.mdibVersionGroupAttr),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_RangeMsg(source: org.somda.protosdc.proto.model.biceps.RangeMsg): org.somda.protosdc.biceps.model.Range {
        return org.somda.protosdc.biceps.model.Range(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            lowerAttr = when (source.hasLowerAttr()) {
                true -> mapProtoDecimalToBigDecimal(source.lowerAttr)
                false -> null
            },
            upperAttr = when (source.hasUpperAttr()) {
                true -> mapProtoDecimalToBigDecimal(source.upperAttr)
                false -> null
            },
            stepWidthAttr = when (source.hasStepWidthAttr()) {
                true -> mapProtoDecimalToBigDecimal(source.stepWidthAttr)
                false -> null
            },
            relativeAccuracyAttr = when (source.hasRelativeAccuracyAttr()) {
                true -> mapProtoDecimalToBigDecimal(source.relativeAccuracyAttr)
                false -> null
            },
            absoluteAccuracyAttr = when (source.hasAbsoluteAccuracyAttr()) {
                true -> mapProtoDecimalToBigDecimal(source.absoluteAccuracyAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractSetMsg(source: org.somda.protosdc.proto.model.biceps.AbstractSetMsg): org.somda.protosdc.biceps.model.AbstractSet {
        return org.somda.protosdc.biceps.model.AbstractSet(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            operationHandleRef = map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(source.operationHandleRef),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_BaseDemographicsMsg(source: org.somda.protosdc.proto.model.biceps.BaseDemographicsMsg): org.somda.protosdc.biceps.model.BaseDemographics {
        return org.somda.protosdc.biceps.model.BaseDemographics(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            givenname = when (source.hasGivenname()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.givenname)
                false -> null
            },
            middlename = source.middlenameList.toList().map { it }.toList(),
            familyname = when (source.hasFamilyname()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.familyname)
                false -> null
            },
            birthname = when (source.hasBirthname()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.birthname)
                false -> null
            },
            title = when (source.hasTitle()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.title)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractOperationStateMsg(source: org.somda.protosdc.proto.model.biceps.AbstractOperationStateMsg): org.somda.protosdc.biceps.model.AbstractOperationState {
        return org.somda.protosdc.biceps.model.AbstractOperationState(
            abstractState = map_org_somda_protosdc_proto_model_biceps_AbstractStateMsg(source.abstractState),
            operatingModeAttr = map_org_somda_protosdc_proto_model_biceps_OperatingModeMsg(source.operatingModeAttr),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_CodedValueMsg_TranslationMsg(source: org.somda.protosdc.proto.model.biceps.CodedValueMsg.TranslationMsg): org.somda.protosdc.biceps.model.CodedValue.Translation {
        return org.somda.protosdc.biceps.model.CodedValue.Translation(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            codeAttr = map_org_somda_protosdc_proto_model_biceps_CodeIdentifierMsg(source.codeAttr),
            codingSystemAttr = when (source.hasCodingSystemAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.codingSystemAttr)
                false -> null
            },
            codingSystemVersionAttr = when (source.hasCodingSystemVersionAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.codingSystemVersionAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source: org.somda.protosdc.proto.model.biceps.CodedValueMsg): org.somda.protosdc.biceps.model.CodedValue {
        return org.somda.protosdc.biceps.model.CodedValue(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            codingSystemName = source.codingSystemNameList.toList().map { map_org_somda_protosdc_proto_model_biceps_LocalizedTextMsg(it) }.toList(),
            conceptDescription = source.conceptDescriptionList.toList().map { map_org_somda_protosdc_proto_model_biceps_LocalizedTextMsg(it) }.toList(),
            translation = source.translationList.toList().map { map_org_somda_protosdc_proto_model_biceps_CodedValueMsg_TranslationMsg(it) }.toList(),
            codeAttr = map_org_somda_protosdc_proto_model_biceps_CodeIdentifierMsg(source.codeAttr),
            codingSystemAttr = when (source.hasCodingSystemAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.codingSystemAttr)
                false -> null
            },
            codingSystemVersionAttr = when (source.hasCodingSystemVersionAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.codingSystemVersionAttr)
                false -> null
            },
            symbolicCodeNameAttr = when (source.hasSymbolicCodeNameAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_SymbolicCodeNameMsg(source.symbolicCodeNameAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetMdStateMsg(source: org.somda.protosdc.proto.model.biceps.GetMdStateMsg): org.somda.protosdc.biceps.model.GetMdState {
        return org.somda.protosdc.biceps.model.GetMdState(
            abstractGet = map_org_somda_protosdc_proto_model_biceps_AbstractGetMsg(source.abstractGet),
            handleRef = source.handleRefList.toList().map { map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ActivateMsg_ArgumentMsg(source: org.somda.protosdc.proto.model.biceps.ActivateMsg.ArgumentMsg): org.somda.protosdc.biceps.model.Activate.Argument {
        return org.somda.protosdc.biceps.model.Activate.Argument(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            argValue = source.argValue,
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ActivateMsg(source: org.somda.protosdc.proto.model.biceps.ActivateMsg): org.somda.protosdc.biceps.model.Activate {
        return org.somda.protosdc.biceps.model.Activate(
            abstractSet = map_org_somda_protosdc_proto_model_biceps_AbstractSetMsg(source.abstractSet),
            argument = source.argumentList.toList().map { map_org_somda_protosdc_proto_model_biceps_ActivateMsg_ArgumentMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetMdDescriptionMsg(source: org.somda.protosdc.proto.model.biceps.GetMdDescriptionMsg): org.somda.protosdc.biceps.model.GetMdDescription {
        return org.somda.protosdc.biceps.model.GetMdDescription(
            abstractGet = map_org_somda_protosdc_proto_model_biceps_AbstractGetMsg(source.abstractGet),
            handleRef = source.handleRefList.toList().map { map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetStatesFromArchiveMsg(source: org.somda.protosdc.proto.model.biceps.GetStatesFromArchiveMsg): org.somda.protosdc.biceps.model.GetStatesFromArchive {
        return org.somda.protosdc.biceps.model.GetStatesFromArchive(
            abstractGet = map_org_somda_protosdc_proto_model_biceps_AbstractGetMsg(source.abstractGet),
            stateRevisions = when (source.hasStateRevisions()) {
                true -> map_org_somda_protosdc_proto_model_biceps_VersionFrameMsg(source.stateRevisions)
                false -> null
            },
            timeFrame = when (source.hasTimeFrame()) {
                true -> map_org_somda_protosdc_proto_model_biceps_TimeFrameMsg(source.timeFrame)
                false -> null
            },
            handle = source.handleList.toList().map { map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SystemErrorReportMsg_ReportPartMsg(source: org.somda.protosdc.proto.model.biceps.SystemErrorReportMsg.ReportPartMsg): org.somda.protosdc.biceps.model.SystemErrorReport.ReportPart {
        return org.somda.protosdc.biceps.model.SystemErrorReport.ReportPart(
            abstractReportPart = map_org_somda_protosdc_proto_model_biceps_AbstractReportPartMsg(source.abstractReportPart),
            errorCode = map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.errorCode),
            errorInfo = when (source.hasErrorInfo()) {
                true -> map_org_somda_protosdc_proto_model_biceps_LocalizedTextMsg(source.errorInfo)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SystemErrorReportMsg(source: org.somda.protosdc.proto.model.biceps.SystemErrorReportMsg): org.somda.protosdc.biceps.model.SystemErrorReport {
        return org.somda.protosdc.biceps.model.SystemErrorReport(
            abstractReport = map_org_somda_protosdc_proto_model_biceps_AbstractReportMsg(source.abstractReport),
            reportPart = source.reportPartList.toList().map { map_org_somda_protosdc_proto_model_biceps_SystemErrorReportMsg_ReportPartMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetLocalizedTextMsg(source: org.somda.protosdc.proto.model.biceps.GetLocalizedTextMsg): org.somda.protosdc.biceps.model.GetLocalizedText {
        return org.somda.protosdc.biceps.model.GetLocalizedText(
            abstractGet = map_org_somda_protosdc_proto_model_biceps_AbstractGetMsg(source.abstractGet),
            ref = source.refList.toList().map { map_org_somda_protosdc_proto_model_biceps_LocalizedTextRefMsg(it) }.toList(),
            version = when (source.hasVersion()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ReferencedVersionMsg(source.version)
                false -> null
            },
            lang = source.langList.toList().map { it }.toList(),
            textWidth = source.textWidthList.toList().map { map_org_somda_protosdc_proto_model_biceps_LocalizedTextWidthMsg(it) }.toList(),
            numberOfLines = source.numberOfLinesList.toList().map { it }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetDescriptorsFromArchiveMsg(source: org.somda.protosdc.proto.model.biceps.GetDescriptorsFromArchiveMsg): org.somda.protosdc.biceps.model.GetDescriptorsFromArchive {
        return org.somda.protosdc.biceps.model.GetDescriptorsFromArchive(
            abstractGet = map_org_somda_protosdc_proto_model_biceps_AbstractGetMsg(source.abstractGet),
            descriptorRevisions = when (source.hasDescriptorRevisions()) {
                true -> map_org_somda_protosdc_proto_model_biceps_VersionFrameMsg(source.descriptorRevisions)
                false -> null
            },
            timeFrame = when (source.hasTimeFrame()) {
                true -> map_org_somda_protosdc_proto_model_biceps_TimeFrameMsg(source.timeFrame)
                false -> null
            },
            handle = source.handleList.toList().map { map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.GetDescriptorMsg): org.somda.protosdc.biceps.model.GetDescriptor {
        return org.somda.protosdc.biceps.model.GetDescriptor(
            abstractGet = map_org_somda_protosdc_proto_model_biceps_AbstractGetMsg(source.abstractGet),
            handleRef = source.handleRefList.toList().map { map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetContextStatesMsg(source: org.somda.protosdc.proto.model.biceps.GetContextStatesMsg): org.somda.protosdc.biceps.model.GetContextStates {
        return org.somda.protosdc.biceps.model.GetContextStates(
            abstractGet = map_org_somda_protosdc_proto_model_biceps_AbstractGetMsg(source.abstractGet),
            handleRef = source.handleRefList.toList().map { map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_RetrievabilityMsg(source: org.somda.protosdc.proto.model.biceps.RetrievabilityMsg): org.somda.protosdc.biceps.model.Retrievability {
        return org.somda.protosdc.biceps.model.Retrievability(
            by = source.byList.toList().map { map_org_somda_protosdc_proto_model_biceps_RetrievabilityInfoMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetLocalizedTextResponseMsg(source: org.somda.protosdc.proto.model.biceps.GetLocalizedTextResponseMsg): org.somda.protosdc.biceps.model.GetLocalizedTextResponse {
        return org.somda.protosdc.biceps.model.GetLocalizedTextResponse(
            abstractGetResponse = map_org_somda_protosdc_proto_model_biceps_AbstractGetResponseMsg(source.abstractGetResponse),
            text = source.textList.toList().map { map_org_somda_protosdc_proto_model_biceps_LocalizedTextMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetSupportedLanguagesMsg(source: org.somda.protosdc.proto.model.biceps.GetSupportedLanguagesMsg): org.somda.protosdc.biceps.model.GetSupportedLanguages {
        return org.somda.protosdc.biceps.model.GetSupportedLanguages(
            abstractGet = map_org_somda_protosdc_proto_model_biceps_AbstractGetMsg(source.abstractGet),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetMdibMsg(source: org.somda.protosdc.proto.model.biceps.GetMdibMsg): org.somda.protosdc.biceps.model.GetMdib {
        return org.somda.protosdc.biceps.model.GetMdib(
            abstractGet = map_org_somda_protosdc_proto_model_biceps_AbstractGetMsg(source.abstractGet),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetValueMsg(source: org.somda.protosdc.proto.model.biceps.SetValueMsg): org.somda.protosdc.biceps.model.SetValue {
        return org.somda.protosdc.biceps.model.SetValue(
            abstractSet = map_org_somda_protosdc_proto_model_biceps_AbstractSetMsg(source.abstractSet),
            requestedNumericValue = mapProtoDecimalToBigDecimal(source.requestedNumericValue),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetContextStatesByFilterMsg(source: org.somda.protosdc.proto.model.biceps.GetContextStatesByFilterMsg): org.somda.protosdc.biceps.model.GetContextStatesByFilter {
        return org.somda.protosdc.biceps.model.GetContextStatesByFilter(
            abstractGet = map_org_somda_protosdc_proto_model_biceps_AbstractGetMsg(source.abstractGet),
            filter = source.filterList.toList().map { it }.toList(),
            contextTypeAttr = when (source.hasContextTypeAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_QualifiedNameMsg(source.contextTypeAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetStringMsg(source: org.somda.protosdc.proto.model.biceps.SetStringMsg): org.somda.protosdc.biceps.model.SetString {
        return org.somda.protosdc.biceps.model.SetString(
            abstractSet = map_org_somda_protosdc_proto_model_biceps_AbstractSetMsg(source.abstractSet),
            requestedStringValue = source.requestedStringValue,
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetSupportedLanguagesResponseMsg(source: org.somda.protosdc.proto.model.biceps.GetSupportedLanguagesResponseMsg): org.somda.protosdc.biceps.model.GetSupportedLanguagesResponse {
        return org.somda.protosdc.biceps.model.GetSupportedLanguagesResponse(
            abstractGetResponse = map_org_somda_protosdc_proto_model_biceps_AbstractGetResponseMsg(source.abstractGetResponse),
            lang = source.langList.toList().map { it }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetContainmentTreeMsg(source: org.somda.protosdc.proto.model.biceps.GetContainmentTreeMsg): org.somda.protosdc.biceps.model.GetContainmentTree {
        return org.somda.protosdc.biceps.model.GetContainmentTree(
            abstractGet = map_org_somda_protosdc_proto_model_biceps_AbstractGetMsg(source.abstractGet),
            handleRef = source.handleRefList.toList().map { map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetContextStateOperationStateMsg(source: org.somda.protosdc.proto.model.biceps.SetContextStateOperationStateMsg): org.somda.protosdc.biceps.model.SetContextStateOperationState {
        return org.somda.protosdc.biceps.model.SetContextStateOperationState(
            abstractOperationState = map_org_somda_protosdc_proto_model_biceps_AbstractOperationStateMsg(source.abstractOperationState),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_RemedyInfoMsg(source: org.somda.protosdc.proto.model.biceps.RemedyInfoMsg): org.somda.protosdc.biceps.model.RemedyInfo {
        return org.somda.protosdc.biceps.model.RemedyInfo(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            description = source.descriptionList.toList().map { map_org_somda_protosdc_proto_model_biceps_LocalizedTextMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_InvocationInfoMsg(source: org.somda.protosdc.proto.model.biceps.InvocationInfoMsg): org.somda.protosdc.biceps.model.InvocationInfo {
        return org.somda.protosdc.biceps.model.InvocationInfo(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            transactionId = map_org_somda_protosdc_proto_model_biceps_TransactionIdMsg(source.transactionId),
            invocationState = map_org_somda_protosdc_proto_model_biceps_InvocationStateMsg(source.invocationState),
            invocationError = when (source.hasInvocationError()) {
                true -> map_org_somda_protosdc_proto_model_biceps_InvocationErrorMsg(source.invocationError)
                false -> null
            },
            invocationErrorMessage = source.invocationErrorMessageList.toList().map { map_org_somda_protosdc_proto_model_biceps_LocalizedTextMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ContainmentTreeEntryMsg(source: org.somda.protosdc.proto.model.biceps.ContainmentTreeEntryMsg): org.somda.protosdc.biceps.model.ContainmentTreeEntry {
        return org.somda.protosdc.biceps.model.ContainmentTreeEntry(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            type = when (source.hasType()) {
                true -> map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.type)
                false -> null
            },
            containmentTreeInfoAttr = map_org_somda_protosdc_proto_model_biceps_ContainmentTreeInfoMsg(source.containmentTreeInfoAttr),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractMetricValueMsg_MetricQualityMsg(source: org.somda.protosdc.proto.model.biceps.AbstractMetricValueMsg.MetricQualityMsg): org.somda.protosdc.biceps.model.AbstractMetricValue.MetricQuality {
        return org.somda.protosdc.biceps.model.AbstractMetricValue.MetricQuality(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            validityAttr = map_org_somda_protosdc_proto_model_biceps_MeasurementValidityMsg(source.validityAttr),
            modeAttr = when (source.hasModeAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_GenerationModeMsg(source.modeAttr)
                false -> null
            },
            qiAttr = when (source.hasQiAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_QualityIndicatorMsg(source.qiAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractMetricValueMsg_AnnotationMsg(source: org.somda.protosdc.proto.model.biceps.AbstractMetricValueMsg.AnnotationMsg): org.somda.protosdc.biceps.model.AbstractMetricValue.Annotation {
        return org.somda.protosdc.biceps.model.AbstractMetricValue.Annotation(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            type = map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.type),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractMetricValueMsg(source: org.somda.protosdc.proto.model.biceps.AbstractMetricValueMsg): org.somda.protosdc.biceps.model.AbstractMetricValue {
        return org.somda.protosdc.biceps.model.AbstractMetricValue(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            metricQuality = map_org_somda_protosdc_proto_model_biceps_AbstractMetricValueMsg_MetricQualityMsg(source.metricQuality),
            annotation = source.annotationList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractMetricValueMsg_AnnotationMsg(it) }.toList(),
            startTimeAttr = when (source.hasStartTimeAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_TimestampMsg(source.startTimeAttr)
                false -> null
            },
            stopTimeAttr = when (source.hasStopTimeAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_TimestampMsg(source.stopTimeAttr)
                false -> null
            },
            determinationTimeAttr = when (source.hasDeterminationTimeAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_TimestampMsg(source.determinationTimeAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_StringMetricValueMsg(source: org.somda.protosdc.proto.model.biceps.StringMetricValueMsg): org.somda.protosdc.biceps.model.StringMetricValue {
        return org.somda.protosdc.biceps.model.StringMetricValue(
            abstractMetricValue = map_org_somda_protosdc_proto_model_biceps_AbstractMetricValueMsg(source.abstractMetricValue),
            valueAttr = when (source.hasValueAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.valueAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_NumericMetricValueMsg(source: org.somda.protosdc.proto.model.biceps.NumericMetricValueMsg): org.somda.protosdc.biceps.model.NumericMetricValue {
        return org.somda.protosdc.biceps.model.NumericMetricValue(
            abstractMetricValue = map_org_somda_protosdc_proto_model_biceps_AbstractMetricValueMsg(source.abstractMetricValue),
            valueAttr = when (source.hasValueAttr()) {
                true -> mapProtoDecimalToBigDecimal(source.valueAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetValueOperationStateMsg(source: org.somda.protosdc.proto.model.biceps.SetValueOperationStateMsg): org.somda.protosdc.biceps.model.SetValueOperationState {
        return org.somda.protosdc.biceps.model.SetValueOperationState(
            abstractOperationState = map_org_somda_protosdc_proto_model_biceps_AbstractOperationStateMsg(source.abstractOperationState),
            allowedRange = source.allowedRangeList.toList().map { map_org_somda_protosdc_proto_model_biceps_RangeMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetComponentStateOperationStateMsg(source: org.somda.protosdc.proto.model.biceps.SetComponentStateOperationStateMsg): org.somda.protosdc.biceps.model.SetComponentStateOperationState {
        return org.somda.protosdc.biceps.model.SetComponentStateOperationState(
            abstractOperationState = map_org_somda_protosdc_proto_model_biceps_AbstractOperationStateMsg(source.abstractOperationState),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractAlertStateMsg(source: org.somda.protosdc.proto.model.biceps.AbstractAlertStateMsg): org.somda.protosdc.biceps.model.AbstractAlertState {
        return org.somda.protosdc.biceps.model.AbstractAlertState(
            abstractState = map_org_somda_protosdc_proto_model_biceps_AbstractStateMsg(source.abstractState),
            activationStateAttr = map_org_somda_protosdc_proto_model_biceps_AlertActivationMsg(source.activationStateAttr),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_PhysicalConnectorInfoMsg(source: org.somda.protosdc.proto.model.biceps.PhysicalConnectorInfoMsg): org.somda.protosdc.biceps.model.PhysicalConnectorInfo {
        return org.somda.protosdc.biceps.model.PhysicalConnectorInfo(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            label = source.labelList.toList().map { map_org_somda_protosdc_proto_model_biceps_LocalizedTextMsg(it) }.toList(),
            numberAttr = when (source.hasNumberAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapInt32Value(source.numberAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetMetricStateOperationStateMsg(source: org.somda.protosdc.proto.model.biceps.SetMetricStateOperationStateMsg): org.somda.protosdc.biceps.model.SetMetricStateOperationState {
        return org.somda.protosdc.biceps.model.SetMetricStateOperationState(
            abstractOperationState = map_org_somda_protosdc_proto_model_biceps_AbstractOperationStateMsg(source.abstractOperationState),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierMsg_RootAttrMsg(source: org.somda.protosdc.proto.model.biceps.InstanceIdentifierMsg.RootAttrMsg): org.somda.protosdc.biceps.model.InstanceIdentifier.RootAttr {
        return org.somda.protosdc.biceps.model.InstanceIdentifier.RootAttr(
            anyURI = source.anyURI,
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierMsg_ExtensionAttrMsg(source: org.somda.protosdc.proto.model.biceps.InstanceIdentifierMsg.ExtensionAttrMsg): org.somda.protosdc.biceps.model.InstanceIdentifier.ExtensionAttr {
        return org.somda.protosdc.biceps.model.InstanceIdentifier.ExtensionAttr(
            string = source.string,
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierMsg(source: org.somda.protosdc.proto.model.biceps.InstanceIdentifierMsg): org.somda.protosdc.biceps.model.InstanceIdentifier {
        return org.somda.protosdc.biceps.model.InstanceIdentifier(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            type = when (source.hasType()) {
                true -> map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.type)
                false -> null
            },
            identifierName = source.identifierNameList.toList().map { map_org_somda_protosdc_proto_model_biceps_LocalizedTextMsg(it) }.toList(),
            rootAttr = when (source.hasRootAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierMsg_RootAttrMsg(source.rootAttr)
                false -> null
            },
            extensionAttr = when (source.hasExtensionAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierMsg_ExtensionAttrMsg(source.extensionAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertConditionStateMsg(source: org.somda.protosdc.proto.model.biceps.AlertConditionStateMsg): org.somda.protosdc.biceps.model.AlertConditionState {
        return org.somda.protosdc.biceps.model.AlertConditionState(
            abstractAlertState = map_org_somda_protosdc_proto_model_biceps_AbstractAlertStateMsg(source.abstractAlertState),
            actualConditionGenerationDelayAttr = when (source.hasActualConditionGenerationDelayAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.actualConditionGenerationDelayAttr)
                false -> null
            },
            actualPriorityAttr = when (source.hasActualPriorityAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_AlertConditionPriorityMsg(source.actualPriorityAttr)
                false -> null
            },
            rankAttr = when (source.hasRankAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapInt32Value(source.rankAttr)
                false -> null
            },
            presenceAttr = when (source.hasPresenceAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapBoolValue(source.presenceAttr)
                false -> null
            },
            determinationTimeAttr = when (source.hasDeterminationTimeAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_TimestampMsg(source.determinationTimeAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertSystemStateMsg(source: org.somda.protosdc.proto.model.biceps.AlertSystemStateMsg): org.somda.protosdc.biceps.model.AlertSystemState {
        return org.somda.protosdc.biceps.model.AlertSystemState(
            abstractAlertState = map_org_somda_protosdc_proto_model_biceps_AbstractAlertStateMsg(source.abstractAlertState),
            systemSignalActivation = source.systemSignalActivationList.toList().map { map_org_somda_protosdc_proto_model_biceps_SystemSignalActivationMsg(it) }.toList(),
            lastSelfCheckAttr = when (source.hasLastSelfCheckAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_TimestampMsg(source.lastSelfCheckAttr)
                false -> null
            },
            selfCheckCountAttr = when (source.hasSelfCheckCountAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapInt64Value(source.selfCheckCountAttr)
                false -> null
            },
            presentPhysiologicalAlarmConditionsAttr = when (source.hasPresentPhysiologicalAlarmConditionsAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_AlertConditionReferenceMsg(source.presentPhysiologicalAlarmConditionsAttr)
                false -> null
            },
            presentTechnicalAlarmConditionsAttr = when (source.hasPresentTechnicalAlarmConditionsAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_AlertConditionReferenceMsg(source.presentTechnicalAlarmConditionsAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_CauseInfoMsg(source: org.somda.protosdc.proto.model.biceps.CauseInfoMsg): org.somda.protosdc.biceps.model.CauseInfo {
        return org.somda.protosdc.biceps.model.CauseInfo(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            remedyInfo = when (source.hasRemedyInfo()) {
                true -> map_org_somda_protosdc_proto_model_biceps_RemedyInfoMsg(source.remedyInfo)
                false -> null
            },
            description = source.descriptionList.toList().map { map_org_somda_protosdc_proto_model_biceps_LocalizedTextMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractSetResponseMsg(source: org.somda.protosdc.proto.model.biceps.AbstractSetResponseMsg): org.somda.protosdc.biceps.model.AbstractSetResponse {
        return org.somda.protosdc.biceps.model.AbstractSetResponse(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            invocationInfo = map_org_somda_protosdc_proto_model_biceps_InvocationInfoMsg(source.invocationInfo),
            mdibVersionGroupAttr = map_org_somda_protosdc_proto_model_biceps_MdibVersionGroupMsg(source.mdibVersionGroupAttr),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractMultiStateMsg(source: org.somda.protosdc.proto.model.biceps.AbstractMultiStateMsg): org.somda.protosdc.biceps.model.AbstractMultiState {
        return org.somda.protosdc.biceps.model.AbstractMultiState(
            abstractState = map_org_somda_protosdc_proto_model_biceps_AbstractStateMsg(source.abstractState),
            category = when (source.hasCategory()) {
                true -> map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.category)
                false -> null
            },
            handleAttr = map_org_somda_protosdc_proto_model_biceps_HandleMsg(source.handleAttr),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_MeasurementMsg(source: org.somda.protosdc.proto.model.biceps.MeasurementMsg): org.somda.protosdc.biceps.model.Measurement {
        return org.somda.protosdc.biceps.model.Measurement(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            measurementUnit = map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.measurementUnit),
            measuredValueAttr = mapProtoDecimalToBigDecimal(source.measuredValueAttr),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetAlertStateOperationStateMsg(source: org.somda.protosdc.proto.model.biceps.SetAlertStateOperationStateMsg): org.somda.protosdc.biceps.model.SetAlertStateOperationState {
        return org.somda.protosdc.biceps.model.SetAlertStateOperationState(
            abstractOperationState = map_org_somda_protosdc_proto_model_biceps_AbstractOperationStateMsg(source.abstractOperationState),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.AbstractDescriptorMsg): org.somda.protosdc.biceps.model.AbstractDescriptor {
        return org.somda.protosdc.biceps.model.AbstractDescriptor(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            type = when (source.hasType()) {
                true -> map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.type)
                false -> null
            },
            handleAttr = map_org_somda_protosdc_proto_model_biceps_HandleMsg(source.handleAttr),
            descriptorVersionAttr = when (source.hasDescriptorVersionAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_VersionCounterMsg(source.descriptorVersionAttr)
                false -> null
            },
            safetyClassificationAttr = when (source.hasSafetyClassificationAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_SafetyClassificationMsg(source.safetyClassificationAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetStringOperationStateMsg_AllowedValuesMsg(source: org.somda.protosdc.proto.model.biceps.SetStringOperationStateMsg.AllowedValuesMsg): org.somda.protosdc.biceps.model.SetStringOperationState.AllowedValues {
        return org.somda.protosdc.biceps.model.SetStringOperationState.AllowedValues(
            value = source.valueList.toList().map { it }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetStringOperationStateMsg(source: org.somda.protosdc.proto.model.biceps.SetStringOperationStateMsg): org.somda.protosdc.biceps.model.SetStringOperationState {
        return org.somda.protosdc.biceps.model.SetStringOperationState(
            abstractOperationState = map_org_somda_protosdc_proto_model_biceps_AbstractOperationStateMsg(source.abstractOperationState),
            allowedValues = when (source.hasAllowedValues()) {
                true -> map_org_somda_protosdc_proto_model_biceps_SetStringOperationStateMsg_AllowedValuesMsg(source.allowedValues)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_PatientDemographicsCoreDataMsg_DateOfBirthMsg(source: org.somda.protosdc.proto.model.biceps.PatientDemographicsCoreDataMsg.DateOfBirthMsg): org.somda.protosdc.biceps.model.PatientDemographicsCoreData.DateOfBirth {
        return when (source.dateOfBirthCase) {
            org.somda.protosdc.proto.model.biceps.PatientDemographicsCoreDataMsg.DateOfBirthMsg.DateOfBirthCase.DATE_TIME -> org.somda.protosdc.biceps.model.PatientDemographicsCoreData.DateOfBirth.ChoiceLocalDateTime(org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapLocalDateTime(source.dateTime))
            org.somda.protosdc.proto.model.biceps.PatientDemographicsCoreDataMsg.DateOfBirthMsg.DateOfBirthCase.DATE -> org.somda.protosdc.biceps.model.PatientDemographicsCoreData.DateOfBirth.ChoiceLocalDate(org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapLocalDate(source.date))
            org.somda.protosdc.proto.model.biceps.PatientDemographicsCoreDataMsg.DateOfBirthMsg.DateOfBirthCase.G_YEAR_MONTH -> org.somda.protosdc.biceps.model.PatientDemographicsCoreData.DateOfBirth.ChoiceYearMonth(org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapYearMonth(source.gYearMonth))
            org.somda.protosdc.proto.model.biceps.PatientDemographicsCoreDataMsg.DateOfBirthMsg.DateOfBirthCase.G_YEAR -> org.somda.protosdc.biceps.model.PatientDemographicsCoreData.DateOfBirth.ChoiceYear(org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapYear(source.gYear))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_PatientDemographicsCoreDataMsg(source: org.somda.protosdc.proto.model.biceps.PatientDemographicsCoreDataMsg): org.somda.protosdc.biceps.model.PatientDemographicsCoreData {
        return org.somda.protosdc.biceps.model.PatientDemographicsCoreData(
            baseDemographics = map_org_somda_protosdc_proto_model_biceps_BaseDemographicsMsg(source.baseDemographics),
            sex = when (source.hasSex()) {
                true -> map_org_somda_protosdc_proto_model_biceps_SexMsg(source.sex)
                false -> null
            },
            patientType = when (source.hasPatientType()) {
                true -> map_org_somda_protosdc_proto_model_biceps_PatientTypeMsg(source.patientType)
                false -> null
            },
            dateOfBirth = when (source.hasDateOfBirth()) {
                true -> map_org_somda_protosdc_proto_model_biceps_PatientDemographicsCoreDataMsg_DateOfBirthMsg(source.dateOfBirth)
                false -> null
            },
            height = when (source.hasHeight()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MeasurementMsg(source.height)
                false -> null
            },
            weight = when (source.hasWeight()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MeasurementMsg(source.weight)
                false -> null
            },
            race = when (source.hasRace()) {
                true -> map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.race)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ActivateOperationStateMsg(source: org.somda.protosdc.proto.model.biceps.ActivateOperationStateMsg): org.somda.protosdc.biceps.model.ActivateOperationState {
        return org.somda.protosdc.biceps.model.ActivateOperationState(
            abstractOperationState = map_org_somda_protosdc_proto_model_biceps_AbstractOperationStateMsg(source.abstractOperationState),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractMetricStateMsg(source: org.somda.protosdc.proto.model.biceps.AbstractMetricStateMsg): org.somda.protosdc.biceps.model.AbstractMetricState {
        return org.somda.protosdc.biceps.model.AbstractMetricState(
            abstractState = map_org_somda_protosdc_proto_model_biceps_AbstractStateMsg(source.abstractState),
            bodySite = source.bodySiteList.toList().map { map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(it) }.toList(),
            physicalConnector = when (source.hasPhysicalConnector()) {
                true -> map_org_somda_protosdc_proto_model_biceps_PhysicalConnectorInfoMsg(source.physicalConnector)
                false -> null
            },
            activationStateAttr = when (source.hasActivationStateAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ComponentActivationMsg(source.activationStateAttr)
                false -> null
            },
            activeDeterminationPeriodAttr = when (source.hasActiveDeterminationPeriodAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.activeDeterminationPeriodAttr)
                false -> null
            },
            lifeTimePeriodAttr = when (source.hasLifeTimePeriodAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.lifeTimePeriodAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ActivateResponseMsg(source: org.somda.protosdc.proto.model.biceps.ActivateResponseMsg): org.somda.protosdc.biceps.model.ActivateResponse {
        return org.somda.protosdc.biceps.model.ActivateResponse(
            abstractSetResponse = map_org_somda_protosdc_proto_model_biceps_AbstractSetResponseMsg(source.abstractSetResponse),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetStringResponseMsg(source: org.somda.protosdc.proto.model.biceps.SetStringResponseMsg): org.somda.protosdc.biceps.model.SetStringResponse {
        return org.somda.protosdc.biceps.model.SetStringResponse(
            abstractSetResponse = map_org_somda_protosdc_proto_model_biceps_AbstractSetResponseMsg(source.abstractSetResponse),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetValueResponseMsg(source: org.somda.protosdc.proto.model.biceps.SetValueResponseMsg): org.somda.protosdc.biceps.model.SetValueResponse {
        return org.somda.protosdc.biceps.model.SetValueResponse(
            abstractSetResponse = map_org_somda_protosdc_proto_model_biceps_AbstractSetResponseMsg(source.abstractSetResponse),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetComponentStateResponseMsg(source: org.somda.protosdc.proto.model.biceps.SetComponentStateResponseMsg): org.somda.protosdc.biceps.model.SetComponentStateResponse {
        return org.somda.protosdc.biceps.model.SetComponentStateResponse(
            abstractSetResponse = map_org_somda_protosdc_proto_model_biceps_AbstractSetResponseMsg(source.abstractSetResponse),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetMetricStateResponseMsg(source: org.somda.protosdc.proto.model.biceps.SetMetricStateResponseMsg): org.somda.protosdc.biceps.model.SetMetricStateResponse {
        return org.somda.protosdc.biceps.model.SetMetricStateResponse(
            abstractSetResponse = map_org_somda_protosdc_proto_model_biceps_AbstractSetResponseMsg(source.abstractSetResponse),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetContextStateResponseMsg(source: org.somda.protosdc.proto.model.biceps.SetContextStateResponseMsg): org.somda.protosdc.biceps.model.SetContextStateResponse {
        return org.somda.protosdc.biceps.model.SetContextStateResponse(
            abstractSetResponse = map_org_somda_protosdc_proto_model_biceps_AbstractSetResponseMsg(source.abstractSetResponse),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetAlertStateResponseMsg(source: org.somda.protosdc.proto.model.biceps.SetAlertStateResponseMsg): org.somda.protosdc.biceps.model.SetAlertStateResponse {
        return org.somda.protosdc.biceps.model.SetAlertStateResponse(
            abstractSetResponse = map_org_somda_protosdc_proto_model_biceps_AbstractSetResponseMsg(source.abstractSetResponse),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ClinicalInfoMsg_CriticalityMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.ClinicalInfoMsg.CriticalityMsg.EnumType): org.somda.protosdc.biceps.model.ClinicalInfo.Criticality.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.ClinicalInfoMsg.CriticalityMsg.EnumType.LO -> org.somda.protosdc.biceps.model.ClinicalInfo.Criticality.EnumType.Lo
            org.somda.protosdc.proto.model.biceps.ClinicalInfoMsg.CriticalityMsg.EnumType.HI -> org.somda.protosdc.biceps.model.ClinicalInfo.Criticality.EnumType.Hi
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_ClinicalInfoMsg_CriticalityMsg(source: org.somda.protosdc.proto.model.biceps.ClinicalInfoMsg.CriticalityMsg): org.somda.protosdc.biceps.model.ClinicalInfo.Criticality {
        return org.somda.protosdc.biceps.model.ClinicalInfo.Criticality(
            enumType = map_org_somda_protosdc_proto_model_biceps_ClinicalInfoMsg_CriticalityMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ClinicalInfoMsg_RelatedMeasurementMsg_ReferenceRangeMsg(source: org.somda.protosdc.proto.model.biceps.ClinicalInfoMsg.RelatedMeasurementMsg.ReferenceRangeMsg): org.somda.protosdc.biceps.model.ClinicalInfo.RelatedMeasurement.ReferenceRange {
        return org.somda.protosdc.biceps.model.ClinicalInfo.RelatedMeasurement.ReferenceRange(
            range = map_org_somda_protosdc_proto_model_biceps_RangeMsg(source.range),
            meaning = when (source.hasMeaning()) {
                true -> map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.meaning)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ClinicalInfoMsg_RelatedMeasurementMsg(source: org.somda.protosdc.proto.model.biceps.ClinicalInfoMsg.RelatedMeasurementMsg): org.somda.protosdc.biceps.model.ClinicalInfo.RelatedMeasurement {
        return org.somda.protosdc.biceps.model.ClinicalInfo.RelatedMeasurement(
            value = map_org_somda_protosdc_proto_model_biceps_MeasurementMsg(source.value),
            referenceRange = source.referenceRangeList.toList().map { map_org_somda_protosdc_proto_model_biceps_ClinicalInfoMsg_RelatedMeasurementMsg_ReferenceRangeMsg(it) }.toList(),
            validityAttr = when (source.hasValidityAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MeasurementValidityMsg(source.validityAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ClinicalInfoMsg(source: org.somda.protosdc.proto.model.biceps.ClinicalInfoMsg): org.somda.protosdc.biceps.model.ClinicalInfo {
        return org.somda.protosdc.biceps.model.ClinicalInfo(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            type = when (source.hasType()) {
                true -> map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.type)
                false -> null
            },
            code = when (source.hasCode()) {
                true -> map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.code)
                false -> null
            },
            criticality = when (source.hasCriticality()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ClinicalInfoMsg_CriticalityMsg(source.criticality)
                false -> null
            },
            description = source.descriptionList.toList().map { map_org_somda_protosdc_proto_model_biceps_LocalizedTextMsg(it) }.toList(),
            relatedMeasurement = source.relatedMeasurementList.toList().map { map_org_somda_protosdc_proto_model_biceps_ClinicalInfoMsg_RelatedMeasurementMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_OperatingJurisdictionMsg(source: org.somda.protosdc.proto.model.biceps.OperatingJurisdictionMsg): org.somda.protosdc.biceps.model.OperatingJurisdiction {
        return org.somda.protosdc.biceps.model.OperatingJurisdiction(
            instanceIdentifier = map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierMsg(source.instanceIdentifier),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractAlertDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.AbstractAlertDescriptorMsg): org.somda.protosdc.biceps.model.AbstractAlertDescriptor {
        return org.somda.protosdc.biceps.model.AbstractAlertDescriptor(
            abstractDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractDescriptorMsg(source.abstractDescriptor),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SampleArrayValueMsg_ApplyAnnotationMsg(source: org.somda.protosdc.proto.model.biceps.SampleArrayValueMsg.ApplyAnnotationMsg): org.somda.protosdc.biceps.model.SampleArrayValue.ApplyAnnotation {
        return org.somda.protosdc.biceps.model.SampleArrayValue.ApplyAnnotation(
            annotationIndexAttr = source.annotationIndexAttr,
            sampleIndexAttr = source.sampleIndexAttr,
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SampleArrayValueMsg(source: org.somda.protosdc.proto.model.biceps.SampleArrayValueMsg): org.somda.protosdc.biceps.model.SampleArrayValue {
        return org.somda.protosdc.biceps.model.SampleArrayValue(
            abstractMetricValue = map_org_somda_protosdc_proto_model_biceps_AbstractMetricValueMsg(source.abstractMetricValue),
            applyAnnotation = source.applyAnnotationList.toList().map { map_org_somda_protosdc_proto_model_biceps_SampleArrayValueMsg_ApplyAnnotationMsg(it) }.toList(),
            samplesAttr = when (source.hasSamplesAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_RealTimeValueTypeMsg(source.samplesAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ContainmentTreeMsg(source: org.somda.protosdc.proto.model.biceps.ContainmentTreeMsg): org.somda.protosdc.biceps.model.ContainmentTree {
        return org.somda.protosdc.biceps.model.ContainmentTree(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            entry = source.entryList.toList().map { map_org_somda_protosdc_proto_model_biceps_ContainmentTreeEntryMsg(it) }.toList(),
            containmentTreeInfoAttr = map_org_somda_protosdc_proto_model_biceps_ContainmentTreeInfoMsg(source.containmentTreeInfoAttr),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_LimitAlertConditionStateMsg(source: org.somda.protosdc.proto.model.biceps.LimitAlertConditionStateMsg): org.somda.protosdc.biceps.model.LimitAlertConditionState {
        return org.somda.protosdc.biceps.model.LimitAlertConditionState(
            alertConditionState = map_org_somda_protosdc_proto_model_biceps_AlertConditionStateMsg(source.alertConditionState),
            limits = map_org_somda_protosdc_proto_model_biceps_RangeMsg(source.limits),
            monitoredAlertLimitsAttr = map_org_somda_protosdc_proto_model_biceps_AlertConditionMonitoredLimitsMsg(source.monitoredAlertLimitsAttr),
            autoLimitActivationStateAttr = when (source.hasAutoLimitActivationStateAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_AlertActivationMsg(source.autoLimitActivationStateAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_RealTimeSampleArrayMetricStateMsg(source: org.somda.protosdc.proto.model.biceps.RealTimeSampleArrayMetricStateMsg): org.somda.protosdc.biceps.model.RealTimeSampleArrayMetricState {
        return org.somda.protosdc.biceps.model.RealTimeSampleArrayMetricState(
            abstractMetricState = map_org_somda_protosdc_proto_model_biceps_AbstractMetricStateMsg(source.abstractMetricState),
            metricValue = when (source.hasMetricValue()) {
                true -> map_org_somda_protosdc_proto_model_biceps_SampleArrayValueMsg(source.metricValue)
                false -> null
            },
            physiologicalRange = source.physiologicalRangeList.toList().map { map_org_somda_protosdc_proto_model_biceps_RangeMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_CalibrationInfoMsg_CalibrationDocumentationMsg_CalibrationResultMsg(source: org.somda.protosdc.proto.model.biceps.CalibrationInfoMsg.CalibrationDocumentationMsg.CalibrationResultMsg): org.somda.protosdc.biceps.model.CalibrationInfo.CalibrationDocumentation.CalibrationResult {
        return org.somda.protosdc.biceps.model.CalibrationInfo.CalibrationDocumentation.CalibrationResult(
            code = map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.code),
            value = map_org_somda_protosdc_proto_model_biceps_MeasurementMsg(source.value),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_CalibrationInfoMsg_CalibrationDocumentationMsg(source: org.somda.protosdc.proto.model.biceps.CalibrationInfoMsg.CalibrationDocumentationMsg): org.somda.protosdc.biceps.model.CalibrationInfo.CalibrationDocumentation {
        return org.somda.protosdc.biceps.model.CalibrationInfo.CalibrationDocumentation(
            documentation = source.documentationList.toList().map { map_org_somda_protosdc_proto_model_biceps_LocalizedTextMsg(it) }.toList(),
            calibrationResult = source.calibrationResultList.toList().map { map_org_somda_protosdc_proto_model_biceps_CalibrationInfoMsg_CalibrationDocumentationMsg_CalibrationResultMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_CalibrationInfoMsg(source: org.somda.protosdc.proto.model.biceps.CalibrationInfoMsg): org.somda.protosdc.biceps.model.CalibrationInfo {
        return org.somda.protosdc.biceps.model.CalibrationInfo(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            calibrationDocumentation = source.calibrationDocumentationList.toList().map { map_org_somda_protosdc_proto_model_biceps_CalibrationInfoMsg_CalibrationDocumentationMsg(it) }.toList(),
            componentCalibrationStateAttr = when (source.hasComponentCalibrationStateAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_CalibrationStateMsg(source.componentCalibrationStateAttr)
                false -> null
            },
            typeAttr = when (source.hasTypeAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_CalibrationTypeMsg(source.typeAttr)
                false -> null
            },
            timeAttr = when (source.hasTimeAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_TimestampMsg(source.timeAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertSignalStateMsg(source: org.somda.protosdc.proto.model.biceps.AlertSignalStateMsg): org.somda.protosdc.biceps.model.AlertSignalState {
        return org.somda.protosdc.biceps.model.AlertSignalState(
            abstractAlertState = map_org_somda_protosdc_proto_model_biceps_AbstractAlertStateMsg(source.abstractAlertState),
            actualSignalGenerationDelayAttr = when (source.hasActualSignalGenerationDelayAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.actualSignalGenerationDelayAttr)
                false -> null
            },
            presenceAttr = when (source.hasPresenceAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_AlertSignalPresenceMsg(source.presenceAttr)
                false -> null
            },
            locationAttr = when (source.hasLocationAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_AlertSignalPrimaryLocationMsg(source.locationAttr)
                false -> null
            },
            slotAttr = when (source.hasSlotAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapUInt32Value(source.slotAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractOperationDescriptorMsg_AccessLevelAttrMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorMsg.AccessLevelAttrMsg.EnumType): org.somda.protosdc.biceps.model.AbstractOperationDescriptor.AccessLevelAttr.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorMsg.AccessLevelAttrMsg.EnumType.USR -> org.somda.protosdc.biceps.model.AbstractOperationDescriptor.AccessLevelAttr.EnumType.Usr
            org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorMsg.AccessLevelAttrMsg.EnumType.CS_USR -> org.somda.protosdc.biceps.model.AbstractOperationDescriptor.AccessLevelAttr.EnumType.CSUsr
            org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorMsg.AccessLevelAttrMsg.EnumType.RO -> org.somda.protosdc.biceps.model.AbstractOperationDescriptor.AccessLevelAttr.EnumType.RO
            org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorMsg.AccessLevelAttrMsg.EnumType.SP -> org.somda.protosdc.biceps.model.AbstractOperationDescriptor.AccessLevelAttr.EnumType.SP
            org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorMsg.AccessLevelAttrMsg.EnumType.OTH -> org.somda.protosdc.biceps.model.AbstractOperationDescriptor.AccessLevelAttr.EnumType.Oth
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractOperationDescriptorMsg_AccessLevelAttrMsg(source: org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorMsg.AccessLevelAttrMsg): org.somda.protosdc.biceps.model.AbstractOperationDescriptor.AccessLevelAttr {
        return org.somda.protosdc.biceps.model.AbstractOperationDescriptor.AccessLevelAttr(
            enumType = map_org_somda_protosdc_proto_model_biceps_AbstractOperationDescriptorMsg_AccessLevelAttrMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractOperationDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorMsg): org.somda.protosdc.biceps.model.AbstractOperationDescriptor {
        return org.somda.protosdc.biceps.model.AbstractOperationDescriptor(
            abstractDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractDescriptorMsg(source.abstractDescriptor),
            operationTargetAttr = map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(source.operationTargetAttr),
            maxTimeToFinishAttr = when (source.hasMaxTimeToFinishAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.maxTimeToFinishAttr)
                false -> null
            },
            invocationEffectiveTimeoutAttr = when (source.hasInvocationEffectiveTimeoutAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.invocationEffectiveTimeoutAttr)
                false -> null
            },
            retriggerableAttr = when (source.hasRetriggerableAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapBoolValue(source.retriggerableAttr)
                false -> null
            },
            accessLevelAttr = when (source.hasAccessLevelAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_AbstractOperationDescriptorMsg_AccessLevelAttrMsg(source.accessLevelAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_NumericMetricStateMsg(source: org.somda.protosdc.proto.model.biceps.NumericMetricStateMsg): org.somda.protosdc.biceps.model.NumericMetricState {
        return org.somda.protosdc.biceps.model.NumericMetricState(
            abstractMetricState = map_org_somda_protosdc_proto_model_biceps_AbstractMetricStateMsg(source.abstractMetricState),
            metricValue = when (source.hasMetricValue()) {
                true -> map_org_somda_protosdc_proto_model_biceps_NumericMetricValueMsg(source.metricValue)
                false -> null
            },
            physiologicalRange = source.physiologicalRangeList.toList().map { map_org_somda_protosdc_proto_model_biceps_RangeMsg(it) }.toList(),
            activeAveragingPeriodAttr = when (source.hasActiveAveragingPeriodAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.activeAveragingPeriodAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractContextDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.AbstractContextDescriptorMsg): org.somda.protosdc.biceps.model.AbstractContextDescriptor {
        return org.somda.protosdc.biceps.model.AbstractContextDescriptor(
            abstractDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractDescriptorMsg(source.abstractDescriptor),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_MeansContextDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.MeansContextDescriptorMsg): org.somda.protosdc.biceps.model.MeansContextDescriptor {
        return org.somda.protosdc.biceps.model.MeansContextDescriptor(
            abstractContextDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractContextDescriptorMsg(source.abstractContextDescriptor),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_WorkflowContextDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.WorkflowContextDescriptorMsg): org.somda.protosdc.biceps.model.WorkflowContextDescriptor {
        return org.somda.protosdc.biceps.model.WorkflowContextDescriptor(
            abstractContextDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractContextDescriptorMsg(source.abstractContextDescriptor),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertConditionDescriptorMsg_CanEscalateAttrMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanEscalateAttrMsg.EnumType): org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanEscalateAttr.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanEscalateAttrMsg.EnumType.LO -> org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanEscalateAttr.EnumType.Lo
            org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanEscalateAttrMsg.EnumType.ME -> org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanEscalateAttr.EnumType.Me
            org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanEscalateAttrMsg.EnumType.HI -> org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanEscalateAttr.EnumType.Hi
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertConditionDescriptorMsg_CanEscalateAttrMsg(source: org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanEscalateAttrMsg): org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanEscalateAttr {
        return org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanEscalateAttr(
            enumType = map_org_somda_protosdc_proto_model_biceps_AlertConditionDescriptorMsg_CanEscalateAttrMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertConditionDescriptorMsg_CanDeescalateAttrMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanDeescalateAttrMsg.EnumType): org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanDeescalateAttr.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanDeescalateAttrMsg.EnumType.ME -> org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanDeescalateAttr.EnumType.Me
            org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanDeescalateAttrMsg.EnumType.LO -> org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanDeescalateAttr.EnumType.Lo
            org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanDeescalateAttrMsg.EnumType.NONE -> org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanDeescalateAttr.EnumType.None
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertConditionDescriptorMsg_CanDeescalateAttrMsg(source: org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg.CanDeescalateAttrMsg): org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanDeescalateAttr {
        return org.somda.protosdc.biceps.model.AlertConditionDescriptor.CanDeescalateAttr(
            enumType = map_org_somda_protosdc_proto_model_biceps_AlertConditionDescriptorMsg_CanDeescalateAttrMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertConditionDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorMsg): org.somda.protosdc.biceps.model.AlertConditionDescriptor {
        return org.somda.protosdc.biceps.model.AlertConditionDescriptor(
            abstractAlertDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractAlertDescriptorMsg(source.abstractAlertDescriptor),
            source = source.sourceList.toList().map { map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(it) }.toList(),
            causeInfo = source.causeInfoList.toList().map { map_org_somda_protosdc_proto_model_biceps_CauseInfoMsg(it) }.toList(),
            kindAttr = map_org_somda_protosdc_proto_model_biceps_AlertConditionKindMsg(source.kindAttr),
            priorityAttr = map_org_somda_protosdc_proto_model_biceps_AlertConditionPriorityMsg(source.priorityAttr),
            defaultConditionGenerationDelayAttr = when (source.hasDefaultConditionGenerationDelayAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.defaultConditionGenerationDelayAttr)
                false -> null
            },
            canEscalateAttr = when (source.hasCanEscalateAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_AlertConditionDescriptorMsg_CanEscalateAttrMsg(source.canEscalateAttr)
                false -> null
            },
            canDeescalateAttr = when (source.hasCanDeescalateAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_AlertConditionDescriptorMsg_CanDeescalateAttrMsg(source.canDeescalateAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_DistributionSampleArrayMetricStateMsg(source: org.somda.protosdc.proto.model.biceps.DistributionSampleArrayMetricStateMsg): org.somda.protosdc.biceps.model.DistributionSampleArrayMetricState {
        return org.somda.protosdc.biceps.model.DistributionSampleArrayMetricState(
            abstractMetricState = map_org_somda_protosdc_proto_model_biceps_AbstractMetricStateMsg(source.abstractMetricState),
            metricValue = when (source.hasMetricValue()) {
                true -> map_org_somda_protosdc_proto_model_biceps_SampleArrayValueMsg(source.metricValue)
                false -> null
            },
            physiologicalRange = source.physiologicalRangeList.toList().map { map_org_somda_protosdc_proto_model_biceps_RangeMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_PatientContextDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.PatientContextDescriptorMsg): org.somda.protosdc.biceps.model.PatientContextDescriptor {
        return org.somda.protosdc.biceps.model.PatientContextDescriptor(
            abstractContextDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractContextDescriptorMsg(source.abstractContextDescriptor),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertSignalDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.AlertSignalDescriptorMsg): org.somda.protosdc.biceps.model.AlertSignalDescriptor {
        return org.somda.protosdc.biceps.model.AlertSignalDescriptor(
            abstractAlertDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractAlertDescriptorMsg(source.abstractAlertDescriptor),
            conditionSignaledAttr = when (source.hasConditionSignaledAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(source.conditionSignaledAttr)
                false -> null
            },
            manifestationAttr = map_org_somda_protosdc_proto_model_biceps_AlertSignalManifestationMsg(source.manifestationAttr),
            latchingAttr = source.latchingAttr,
            defaultSignalGenerationDelayAttr = when (source.hasDefaultSignalGenerationDelayAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.defaultSignalGenerationDelayAttr)
                false -> null
            },
            minSignalGenerationDelayAttr = when (source.hasMinSignalGenerationDelayAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.minSignalGenerationDelayAttr)
                false -> null
            },
            maxSignalGenerationDelayAttr = when (source.hasMaxSignalGenerationDelayAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.maxSignalGenerationDelayAttr)
                false -> null
            },
            signalDelegationSupportedAttr = when (source.hasSignalDelegationSupportedAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapBoolValue(source.signalDelegationSupportedAttr)
                false -> null
            },
            acknowledgementSupportedAttr = when (source.hasAcknowledgementSupportedAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapBoolValue(source.acknowledgementSupportedAttr)
                false -> null
            },
            acknowledgeTimeoutAttr = when (source.hasAcknowledgeTimeoutAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.acknowledgeTimeoutAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_StringMetricStateMsg(source: org.somda.protosdc.proto.model.biceps.StringMetricStateMsg): org.somda.protosdc.biceps.model.StringMetricState {
        return org.somda.protosdc.biceps.model.StringMetricState(
            abstractMetricState = map_org_somda_protosdc_proto_model_biceps_AbstractMetricStateMsg(source.abstractMetricState),
            metricValue = when (source.hasMetricValue()) {
                true -> map_org_somda_protosdc_proto_model_biceps_StringMetricValueMsg(source.metricValue)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ObservedValueStreamMsg_ValueMsg(source: org.somda.protosdc.proto.model.biceps.ObservedValueStreamMsg.ValueMsg): org.somda.protosdc.biceps.model.ObservedValueStream.Value {
        return org.somda.protosdc.biceps.model.ObservedValueStream.Value(
            value = when (source.hasValue()) {
                true -> map_org_somda_protosdc_proto_model_biceps_SampleArrayValueMsg(source.value)
                false -> null
            },
            metricAttr = map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(source.metricAttr),
            stateVersionAttr = when (source.hasStateVersionAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_VersionCounterMsg(source.stateVersionAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ObservedValueStreamMsg(source: org.somda.protosdc.proto.model.biceps.ObservedValueStreamMsg): org.somda.protosdc.biceps.model.ObservedValueStream {
        return org.somda.protosdc.biceps.model.ObservedValueStream(
            abstractReport = map_org_somda_protosdc_proto_model_biceps_AbstractReportMsg(source.abstractReport),
            value = source.valueList.toList().map { map_org_somda_protosdc_proto_model_biceps_ObservedValueStreamMsg_ValueMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_WaveformStreamMsg(source: org.somda.protosdc.proto.model.biceps.WaveformStreamMsg): org.somda.protosdc.biceps.model.WaveformStream {
        return org.somda.protosdc.biceps.model.WaveformStream(
            abstractReport = map_org_somda_protosdc_proto_model_biceps_AbstractReportMsg(source.abstractReport),
            state = source.stateList.toList().map { map_org_somda_protosdc_proto_model_biceps_RealTimeSampleArrayMetricStateMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetContainmentTreeResponseMsg(source: org.somda.protosdc.proto.model.biceps.GetContainmentTreeResponseMsg): org.somda.protosdc.biceps.model.GetContainmentTreeResponse {
        return org.somda.protosdc.biceps.model.GetContainmentTreeResponse(
            abstractGetResponse = map_org_somda_protosdc_proto_model_biceps_AbstractGetResponseMsg(source.abstractGetResponse),
            containmentTree = map_org_somda_protosdc_proto_model_biceps_ContainmentTreeMsg(source.containmentTree),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_LimitAlertConditionDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.LimitAlertConditionDescriptorMsg): org.somda.protosdc.biceps.model.LimitAlertConditionDescriptor {
        return org.somda.protosdc.biceps.model.LimitAlertConditionDescriptor(
            alertConditionDescriptor = map_org_somda_protosdc_proto_model_biceps_AlertConditionDescriptorMsg(source.alertConditionDescriptor),
            maxLimits = map_org_somda_protosdc_proto_model_biceps_RangeMsg(source.maxLimits),
            autoLimitSupportedAttr = when (source.hasAutoLimitSupportedAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapBoolValue(source.autoLimitSupportedAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_OperatorContextDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.OperatorContextDescriptorMsg): org.somda.protosdc.biceps.model.OperatorContextDescriptor {
        return org.somda.protosdc.biceps.model.OperatorContextDescriptor(
            abstractContextDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractContextDescriptorMsg(source.abstractContextDescriptor),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentStateMsg(source: org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateMsg): org.somda.protosdc.biceps.model.AbstractDeviceComponentState {
        return org.somda.protosdc.biceps.model.AbstractDeviceComponentState(
            abstractState = map_org_somda_protosdc_proto_model_biceps_AbstractStateMsg(source.abstractState),
            calibrationInfo = when (source.hasCalibrationInfo()) {
                true -> map_org_somda_protosdc_proto_model_biceps_CalibrationInfoMsg(source.calibrationInfo)
                false -> null
            },
            nextCalibration = when (source.hasNextCalibration()) {
                true -> map_org_somda_protosdc_proto_model_biceps_CalibrationInfoMsg(source.nextCalibration)
                false -> null
            },
            physicalConnector = when (source.hasPhysicalConnector()) {
                true -> map_org_somda_protosdc_proto_model_biceps_PhysicalConnectorInfoMsg(source.physicalConnector)
                false -> null
            },
            activationStateAttr = when (source.hasActivationStateAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ComponentActivationMsg(source.activationStateAttr)
                false -> null
            },
            operatingHoursAttr = when (source.hasOperatingHoursAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapUInt32Value(source.operatingHoursAttr)
                false -> null
            },
            operatingCyclesAttr = when (source.hasOperatingCyclesAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapInt32Value(source.operatingCyclesAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ChannelStateMsg(source: org.somda.protosdc.proto.model.biceps.ChannelStateMsg): org.somda.protosdc.biceps.model.ChannelState {
        return org.somda.protosdc.biceps.model.ChannelState(
            abstractDeviceComponentState = map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentStateMsg(source.abstractDeviceComponentState),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetStringOperationDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.SetStringOperationDescriptorMsg): org.somda.protosdc.biceps.model.SetStringOperationDescriptor {
        return org.somda.protosdc.biceps.model.SetStringOperationDescriptor(
            abstractOperationDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractOperationDescriptorMsg(source.abstractOperationDescriptor),
            maxLengthAttr = when (source.hasMaxLengthAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapUInt64Value(source.maxLengthAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ClockStateMsg(source: org.somda.protosdc.proto.model.biceps.ClockStateMsg): org.somda.protosdc.biceps.model.ClockState {
        return org.somda.protosdc.biceps.model.ClockState(
            abstractDeviceComponentState = map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentStateMsg(source.abstractDeviceComponentState),
            activeSyncProtocol = when (source.hasActiveSyncProtocol()) {
                true -> map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.activeSyncProtocol)
                false -> null
            },
            referenceSource = source.referenceSourceList.toList().map { it }.toList(),
            dateAndTimeAttr = when (source.hasDateAndTimeAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_TimestampMsg(source.dateAndTimeAttr)
                false -> null
            },
            remoteSyncAttr = source.remoteSyncAttr,
            accuracyAttr = when (source.hasAccuracyAttr()) {
                true -> mapProtoDecimalToBigDecimal(source.accuracyAttr)
                false -> null
            },
            lastSetAttr = when (source.hasLastSetAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_TimestampMsg(source.lastSetAttr)
                false -> null
            },
            timeZoneAttr = when (source.hasTimeZoneAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_TimeZoneMsg(source.timeZoneAttr)
                false -> null
            },
            criticalUseAttr = when (source.hasCriticalUseAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapBoolValue(source.criticalUseAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractSetStateOperationDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.AbstractSetStateOperationDescriptorMsg): org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptor {
        return org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptor(
            abstractOperationDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractOperationDescriptorMsg(source.abstractOperationDescriptor),
            modifiableData = source.modifiableDataList.toList().map { it }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_EnsembleContextDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.EnsembleContextDescriptorMsg): org.somda.protosdc.biceps.model.EnsembleContextDescriptor {
        return org.somda.protosdc.biceps.model.EnsembleContextDescriptor(
            abstractContextDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractContextDescriptorMsg(source.abstractContextDescriptor),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_EnumStringMetricStateMsg(source: org.somda.protosdc.proto.model.biceps.EnumStringMetricStateMsg): org.somda.protosdc.biceps.model.EnumStringMetricState {
        return org.somda.protosdc.biceps.model.EnumStringMetricState(
            stringMetricState = map_org_somda_protosdc_proto_model_biceps_StringMetricStateMsg(source.stringMetricState),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetComponentStateOperationDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.SetComponentStateOperationDescriptorMsg): org.somda.protosdc.biceps.model.SetComponentStateOperationDescriptor {
        return org.somda.protosdc.biceps.model.SetComponentStateOperationDescriptor(
            abstractSetStateOperationDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractSetStateOperationDescriptorMsg(source.abstractSetStateOperationDescriptor),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SystemContextStateMsg(source: org.somda.protosdc.proto.model.biceps.SystemContextStateMsg): org.somda.protosdc.biceps.model.SystemContextState {
        return org.somda.protosdc.biceps.model.SystemContextState(
            abstractDeviceComponentState = map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentStateMsg(source.abstractDeviceComponentState),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractComplexDeviceComponentStateMsg(source: org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentStateMsg): org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentState {
        return org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentState(
            abstractDeviceComponentState = map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentStateMsg(source.abstractDeviceComponentState),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetAlertStateOperationDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.SetAlertStateOperationDescriptorMsg): org.somda.protosdc.biceps.model.SetAlertStateOperationDescriptor {
        return org.somda.protosdc.biceps.model.SetAlertStateOperationDescriptor(
            abstractSetStateOperationDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractSetStateOperationDescriptorMsg(source.abstractSetStateOperationDescriptor),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetValueOperationDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.SetValueOperationDescriptorMsg): org.somda.protosdc.biceps.model.SetValueOperationDescriptor {
        return org.somda.protosdc.biceps.model.SetValueOperationDescriptor(
            abstractOperationDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractOperationDescriptorMsg(source.abstractOperationDescriptor),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_LocationContextDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.LocationContextDescriptorMsg): org.somda.protosdc.biceps.model.LocationContextDescriptor {
        return org.somda.protosdc.biceps.model.LocationContextDescriptor(
            abstractContextDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractContextDescriptorMsg(source.abstractContextDescriptor),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetMetricStateOperationDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.SetMetricStateOperationDescriptorMsg): org.somda.protosdc.biceps.model.SetMetricStateOperationDescriptor {
        return org.somda.protosdc.biceps.model.SetMetricStateOperationDescriptor(
            abstractSetStateOperationDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractSetStateOperationDescriptorMsg(source.abstractSetStateOperationDescriptor),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_VmdStateMsg(source: org.somda.protosdc.proto.model.biceps.VmdStateMsg): org.somda.protosdc.biceps.model.VmdState {
        return org.somda.protosdc.biceps.model.VmdState(
            abstractComplexDeviceComponentState = map_org_somda_protosdc_proto_model_biceps_AbstractComplexDeviceComponentStateMsg(source.abstractComplexDeviceComponentState),
            operatingJurisdiction = when (source.hasOperatingJurisdiction()) {
                true -> map_org_somda_protosdc_proto_model_biceps_OperatingJurisdictionMsg(source.operatingJurisdiction)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetContextStateOperationDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.SetContextStateOperationDescriptorMsg): org.somda.protosdc.biceps.model.SetContextStateOperationDescriptor {
        return org.somda.protosdc.biceps.model.SetContextStateOperationDescriptor(
            abstractSetStateOperationDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractSetStateOperationDescriptorMsg(source.abstractSetStateOperationDescriptor),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ActivateOperationDescriptorMsg_ArgumentMsg(source: org.somda.protosdc.proto.model.biceps.ActivateOperationDescriptorMsg.ArgumentMsg): org.somda.protosdc.biceps.model.ActivateOperationDescriptor.Argument {
        return org.somda.protosdc.biceps.model.ActivateOperationDescriptor.Argument(
            argName = map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.argName),
            arg = map_org_somda_protosdc_proto_model_biceps_QualifiedNameMsg(source.arg),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ActivateOperationDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.ActivateOperationDescriptorMsg): org.somda.protosdc.biceps.model.ActivateOperationDescriptor {
        return org.somda.protosdc.biceps.model.ActivateOperationDescriptor(
            abstractSetStateOperationDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractSetStateOperationDescriptorMsg(source.abstractSetStateOperationDescriptor),
            argument = source.argumentList.toList().map { map_org_somda_protosdc_proto_model_biceps_ActivateOperationDescriptorMsg_ArgumentMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_BatteryStateMsg_ChargeStatusAttrMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.BatteryStateMsg.ChargeStatusAttrMsg.EnumType): org.somda.protosdc.biceps.model.BatteryState.ChargeStatusAttr.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.BatteryStateMsg.ChargeStatusAttrMsg.EnumType.FUL -> org.somda.protosdc.biceps.model.BatteryState.ChargeStatusAttr.EnumType.Ful
            org.somda.protosdc.proto.model.biceps.BatteryStateMsg.ChargeStatusAttrMsg.EnumType.CH_B -> org.somda.protosdc.biceps.model.BatteryState.ChargeStatusAttr.EnumType.ChB
            org.somda.protosdc.proto.model.biceps.BatteryStateMsg.ChargeStatusAttrMsg.EnumType.DIS_CH_B -> org.somda.protosdc.biceps.model.BatteryState.ChargeStatusAttr.EnumType.DisChB
            org.somda.protosdc.proto.model.biceps.BatteryStateMsg.ChargeStatusAttrMsg.EnumType.DEB -> org.somda.protosdc.biceps.model.BatteryState.ChargeStatusAttr.EnumType.DEB
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_BatteryStateMsg_ChargeStatusAttrMsg(source: org.somda.protosdc.proto.model.biceps.BatteryStateMsg.ChargeStatusAttrMsg): org.somda.protosdc.biceps.model.BatteryState.ChargeStatusAttr {
        return org.somda.protosdc.biceps.model.BatteryState.ChargeStatusAttr(
            enumType = map_org_somda_protosdc_proto_model_biceps_BatteryStateMsg_ChargeStatusAttrMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_BatteryStateMsg(source: org.somda.protosdc.proto.model.biceps.BatteryStateMsg): org.somda.protosdc.biceps.model.BatteryState {
        return org.somda.protosdc.biceps.model.BatteryState(
            abstractDeviceComponentState = map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentStateMsg(source.abstractDeviceComponentState),
            capacityRemaining = when (source.hasCapacityRemaining()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MeasurementMsg(source.capacityRemaining)
                false -> null
            },
            voltage = when (source.hasVoltage()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MeasurementMsg(source.voltage)
                false -> null
            },
            current = when (source.hasCurrent()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MeasurementMsg(source.current)
                false -> null
            },
            temperature = when (source.hasTemperature()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MeasurementMsg(source.temperature)
                false -> null
            },
            remainingBatteryTime = when (source.hasRemainingBatteryTime()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MeasurementMsg(source.remainingBatteryTime)
                false -> null
            },
            chargeStatusAttr = when (source.hasChargeStatusAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_BatteryStateMsg_ChargeStatusAttrMsg(source.chargeStatusAttr)
                false -> null
            },
            chargeCyclesAttr = when (source.hasChargeCyclesAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapUInt32Value(source.chargeCyclesAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_MdsStateMsg(source: org.somda.protosdc.proto.model.biceps.MdsStateMsg): org.somda.protosdc.biceps.model.MdsState {
        return org.somda.protosdc.biceps.model.MdsState(
            abstractComplexDeviceComponentState = map_org_somda_protosdc_proto_model_biceps_AbstractComplexDeviceComponentStateMsg(source.abstractComplexDeviceComponentState),
            operatingJurisdiction = when (source.hasOperatingJurisdiction()) {
                true -> map_org_somda_protosdc_proto_model_biceps_OperatingJurisdictionMsg(source.operatingJurisdiction)
                false -> null
            },
            langAttr = when (source.hasLangAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.langAttr)
                false -> null
            },
            operatingModeAttr = when (source.hasOperatingModeAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MdsOperatingModeMsg(source.operatingModeAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ScoStateMsg_OperationGroupMsg(source: org.somda.protosdc.proto.model.biceps.ScoStateMsg.OperationGroupMsg): org.somda.protosdc.biceps.model.ScoState.OperationGroup {
        return org.somda.protosdc.biceps.model.ScoState.OperationGroup(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            type = map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.type),
            operatingModeAttr = when (source.hasOperatingModeAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_OperatingModeMsg(source.operatingModeAttr)
                false -> null
            },
            operationsAttr = when (source.hasOperationsAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_OperationRefMsg(source.operationsAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ScoStateMsg(source: org.somda.protosdc.proto.model.biceps.ScoStateMsg): org.somda.protosdc.biceps.model.ScoState {
        return org.somda.protosdc.biceps.model.ScoState(
            abstractDeviceComponentState = map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentStateMsg(source.abstractDeviceComponentState),
            operationGroup = source.operationGroupList.toList().map { map_org_somda_protosdc_proto_model_biceps_ScoStateMsg_OperationGroupMsg(it) }.toList(),
            invocationRequestedAttr = when (source.hasInvocationRequestedAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_OperationRefMsg(source.invocationRequestedAttr)
                false -> null
            },
            invocationRequiredAttr = when (source.hasInvocationRequiredAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_OperationRefMsg(source.invocationRequiredAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_LocalizedTextContentOneOfMsg(source: org.somda.protosdc.proto.model.biceps.LocalizedTextContentOneOfMsg): org.somda.protosdc.biceps.model.LocalizedTextContentOneOf {
        return when (source.localizedTextContentOneOfCase) {
            org.somda.protosdc.proto.model.biceps.LocalizedTextContentOneOfMsg.LocalizedTextContentOneOfCase.LOCALIZED_TEXT_CONTENT -> org.somda.protosdc.biceps.model.LocalizedTextContentOneOf.ChoiceLocalizedTextContent(map_org_somda_protosdc_proto_model_biceps_LocalizedTextContentMsg(source.localizedTextContent))
            org.somda.protosdc.proto.model.biceps.LocalizedTextContentOneOfMsg.LocalizedTextContentOneOfCase.LOCALIZED_TEXT -> org.somda.protosdc.biceps.model.LocalizedTextContentOneOf.ChoiceLocalizedText(map_org_somda_protosdc_proto_model_biceps_LocalizedTextMsg(source.localizedText))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractOperationStateOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractOperationStateOneOfMsg): org.somda.protosdc.biceps.model.AbstractOperationStateOneOf {
        return when (source.abstractOperationStateOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractOperationStateOneOfMsg.AbstractOperationStateOneOfCase.ABSTRACT_OPERATION_STATE -> org.somda.protosdc.biceps.model.AbstractOperationStateOneOf.ChoiceAbstractOperationState(map_org_somda_protosdc_proto_model_biceps_AbstractOperationStateMsg(source.abstractOperationState))
            org.somda.protosdc.proto.model.biceps.AbstractOperationStateOneOfMsg.AbstractOperationStateOneOfCase.ACTIVATE_OPERATION_STATE -> org.somda.protosdc.biceps.model.AbstractOperationStateOneOf.ChoiceActivateOperationState(map_org_somda_protosdc_proto_model_biceps_ActivateOperationStateMsg(source.activateOperationState))
            org.somda.protosdc.proto.model.biceps.AbstractOperationStateOneOfMsg.AbstractOperationStateOneOfCase.SET_ALERT_STATE_OPERATION_STATE -> org.somda.protosdc.biceps.model.AbstractOperationStateOneOf.ChoiceSetAlertStateOperationState(map_org_somda_protosdc_proto_model_biceps_SetAlertStateOperationStateMsg(source.setAlertStateOperationState))
            org.somda.protosdc.proto.model.biceps.AbstractOperationStateOneOfMsg.AbstractOperationStateOneOfCase.SET_COMPONENT_STATE_OPERATION_STATE -> org.somda.protosdc.biceps.model.AbstractOperationStateOneOf.ChoiceSetComponentStateOperationState(map_org_somda_protosdc_proto_model_biceps_SetComponentStateOperationStateMsg(source.setComponentStateOperationState))
            org.somda.protosdc.proto.model.biceps.AbstractOperationStateOneOfMsg.AbstractOperationStateOneOfCase.SET_CONTEXT_STATE_OPERATION_STATE -> org.somda.protosdc.biceps.model.AbstractOperationStateOneOf.ChoiceSetContextStateOperationState(map_org_somda_protosdc_proto_model_biceps_SetContextStateOperationStateMsg(source.setContextStateOperationState))
            org.somda.protosdc.proto.model.biceps.AbstractOperationStateOneOfMsg.AbstractOperationStateOneOfCase.SET_METRIC_STATE_OPERATION_STATE -> org.somda.protosdc.biceps.model.AbstractOperationStateOneOf.ChoiceSetMetricStateOperationState(map_org_somda_protosdc_proto_model_biceps_SetMetricStateOperationStateMsg(source.setMetricStateOperationState))
            org.somda.protosdc.proto.model.biceps.AbstractOperationStateOneOfMsg.AbstractOperationStateOneOfCase.SET_STRING_OPERATION_STATE -> org.somda.protosdc.biceps.model.AbstractOperationStateOneOf.ChoiceSetStringOperationState(map_org_somda_protosdc_proto_model_biceps_SetStringOperationStateMsg(source.setStringOperationState))
            org.somda.protosdc.proto.model.biceps.AbstractOperationStateOneOfMsg.AbstractOperationStateOneOfCase.SET_VALUE_OPERATION_STATE -> org.somda.protosdc.biceps.model.AbstractOperationStateOneOf.ChoiceSetValueOperationState(map_org_somda_protosdc_proto_model_biceps_SetValueOperationStateMsg(source.setValueOperationState))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractMetricValueOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractMetricValueOneOfMsg): org.somda.protosdc.biceps.model.AbstractMetricValueOneOf {
        return when (source.abstractMetricValueOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractMetricValueOneOfMsg.AbstractMetricValueOneOfCase.ABSTRACT_METRIC_VALUE -> org.somda.protosdc.biceps.model.AbstractMetricValueOneOf.ChoiceAbstractMetricValue(map_org_somda_protosdc_proto_model_biceps_AbstractMetricValueMsg(source.abstractMetricValue))
            org.somda.protosdc.proto.model.biceps.AbstractMetricValueOneOfMsg.AbstractMetricValueOneOfCase.NUMERIC_METRIC_VALUE -> org.somda.protosdc.biceps.model.AbstractMetricValueOneOf.ChoiceNumericMetricValue(map_org_somda_protosdc_proto_model_biceps_NumericMetricValueMsg(source.numericMetricValue))
            org.somda.protosdc.proto.model.biceps.AbstractMetricValueOneOfMsg.AbstractMetricValueOneOfCase.SAMPLE_ARRAY_VALUE -> org.somda.protosdc.biceps.model.AbstractMetricValueOneOf.ChoiceSampleArrayValue(map_org_somda_protosdc_proto_model_biceps_SampleArrayValueMsg(source.sampleArrayValue))
            org.somda.protosdc.proto.model.biceps.AbstractMetricValueOneOfMsg.AbstractMetricValueOneOfCase.STRING_METRIC_VALUE -> org.somda.protosdc.biceps.model.AbstractMetricValueOneOf.ChoiceStringMetricValue(map_org_somda_protosdc_proto_model_biceps_StringMetricValueMsg(source.stringMetricValue))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractAlertStateOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractAlertStateOneOfMsg): org.somda.protosdc.biceps.model.AbstractAlertStateOneOf {
        return when (source.abstractAlertStateOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractAlertStateOneOfMsg.AbstractAlertStateOneOfCase.ABSTRACT_ALERT_STATE -> org.somda.protosdc.biceps.model.AbstractAlertStateOneOf.ChoiceAbstractAlertState(map_org_somda_protosdc_proto_model_biceps_AbstractAlertStateMsg(source.abstractAlertState))
            org.somda.protosdc.proto.model.biceps.AbstractAlertStateOneOfMsg.AbstractAlertStateOneOfCase.ALERT_CONDITION_STATE -> org.somda.protosdc.biceps.model.AbstractAlertStateOneOf.ChoiceAlertConditionState(map_org_somda_protosdc_proto_model_biceps_AlertConditionStateMsg(source.alertConditionState))
            org.somda.protosdc.proto.model.biceps.AbstractAlertStateOneOfMsg.AbstractAlertStateOneOfCase.ALERT_SIGNAL_STATE -> org.somda.protosdc.biceps.model.AbstractAlertStateOneOf.ChoiceAlertSignalState(map_org_somda_protosdc_proto_model_biceps_AlertSignalStateMsg(source.alertSignalState))
            org.somda.protosdc.proto.model.biceps.AbstractAlertStateOneOfMsg.AbstractAlertStateOneOfCase.ALERT_SYSTEM_STATE -> org.somda.protosdc.biceps.model.AbstractAlertStateOneOf.ChoiceAlertSystemState(map_org_somda_protosdc_proto_model_biceps_AlertSystemStateMsg(source.alertSystemState))
            org.somda.protosdc.proto.model.biceps.AbstractAlertStateOneOfMsg.AbstractAlertStateOneOfCase.LIMIT_ALERT_CONDITION_STATE -> org.somda.protosdc.biceps.model.AbstractAlertStateOneOf.ChoiceLimitAlertConditionState(map_org_somda_protosdc_proto_model_biceps_LimitAlertConditionStateMsg(source.limitAlertConditionState))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractSetResponseOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractSetResponseOneOfMsg): org.somda.protosdc.biceps.model.AbstractSetResponseOneOf {
        return when (source.abstractSetResponseOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractSetResponseOneOfMsg.AbstractSetResponseOneOfCase.ABSTRACT_SET_RESPONSE -> org.somda.protosdc.biceps.model.AbstractSetResponseOneOf.ChoiceAbstractSetResponse(map_org_somda_protosdc_proto_model_biceps_AbstractSetResponseMsg(source.abstractSetResponse))
            org.somda.protosdc.proto.model.biceps.AbstractSetResponseOneOfMsg.AbstractSetResponseOneOfCase.ACTIVATE_RESPONSE -> org.somda.protosdc.biceps.model.AbstractSetResponseOneOf.ChoiceActivateResponse(map_org_somda_protosdc_proto_model_biceps_ActivateResponseMsg(source.activateResponse))
            org.somda.protosdc.proto.model.biceps.AbstractSetResponseOneOfMsg.AbstractSetResponseOneOfCase.SET_ALERT_STATE_RESPONSE -> org.somda.protosdc.biceps.model.AbstractSetResponseOneOf.ChoiceSetAlertStateResponse(map_org_somda_protosdc_proto_model_biceps_SetAlertStateResponseMsg(source.setAlertStateResponse))
            org.somda.protosdc.proto.model.biceps.AbstractSetResponseOneOfMsg.AbstractSetResponseOneOfCase.SET_COMPONENT_STATE_RESPONSE -> org.somda.protosdc.biceps.model.AbstractSetResponseOneOf.ChoiceSetComponentStateResponse(map_org_somda_protosdc_proto_model_biceps_SetComponentStateResponseMsg(source.setComponentStateResponse))
            org.somda.protosdc.proto.model.biceps.AbstractSetResponseOneOfMsg.AbstractSetResponseOneOfCase.SET_CONTEXT_STATE_RESPONSE -> org.somda.protosdc.biceps.model.AbstractSetResponseOneOf.ChoiceSetContextStateResponse(map_org_somda_protosdc_proto_model_biceps_SetContextStateResponseMsg(source.setContextStateResponse))
            org.somda.protosdc.proto.model.biceps.AbstractSetResponseOneOfMsg.AbstractSetResponseOneOfCase.SET_METRIC_STATE_RESPONSE -> org.somda.protosdc.biceps.model.AbstractSetResponseOneOf.ChoiceSetMetricStateResponse(map_org_somda_protosdc_proto_model_biceps_SetMetricStateResponseMsg(source.setMetricStateResponse))
            org.somda.protosdc.proto.model.biceps.AbstractSetResponseOneOfMsg.AbstractSetResponseOneOfCase.SET_STRING_RESPONSE -> org.somda.protosdc.biceps.model.AbstractSetResponseOneOf.ChoiceSetStringResponse(map_org_somda_protosdc_proto_model_biceps_SetStringResponseMsg(source.setStringResponse))
            org.somda.protosdc.proto.model.biceps.AbstractSetResponseOneOfMsg.AbstractSetResponseOneOfCase.SET_VALUE_RESPONSE -> org.somda.protosdc.biceps.model.AbstractSetResponseOneOf.ChoiceSetValueResponse(map_org_somda_protosdc_proto_model_biceps_SetValueResponseMsg(source.setValueResponse))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(source: org.somda.protosdc.proto.model.biceps.InstanceIdentifierOneOfMsg): org.somda.protosdc.biceps.model.InstanceIdentifierOneOf {
        return when (source.instanceIdentifierOneOfCase) {
            org.somda.protosdc.proto.model.biceps.InstanceIdentifierOneOfMsg.InstanceIdentifierOneOfCase.INSTANCE_IDENTIFIER -> org.somda.protosdc.biceps.model.InstanceIdentifierOneOf.ChoiceInstanceIdentifier(map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierMsg(source.instanceIdentifier))
            org.somda.protosdc.proto.model.biceps.InstanceIdentifierOneOfMsg.InstanceIdentifierOneOfCase.OPERATING_JURISDICTION -> org.somda.protosdc.biceps.model.InstanceIdentifierOneOf.ChoiceOperatingJurisdiction(map_org_somda_protosdc_proto_model_biceps_OperatingJurisdictionMsg(source.operatingJurisdiction))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertConditionStateOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AlertConditionStateOneOfMsg): org.somda.protosdc.biceps.model.AlertConditionStateOneOf {
        return when (source.alertConditionStateOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AlertConditionStateOneOfMsg.AlertConditionStateOneOfCase.ALERT_CONDITION_STATE -> org.somda.protosdc.biceps.model.AlertConditionStateOneOf.ChoiceAlertConditionState(map_org_somda_protosdc_proto_model_biceps_AlertConditionStateMsg(source.alertConditionState))
            org.somda.protosdc.proto.model.biceps.AlertConditionStateOneOfMsg.AlertConditionStateOneOfCase.LIMIT_ALERT_CONDITION_STATE -> org.somda.protosdc.biceps.model.AlertConditionStateOneOf.ChoiceLimitAlertConditionState(map_org_somda_protosdc_proto_model_biceps_LimitAlertConditionStateMsg(source.limitAlertConditionState))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractMetricStateOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractMetricStateOneOfMsg): org.somda.protosdc.biceps.model.AbstractMetricStateOneOf {
        return when (source.abstractMetricStateOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractMetricStateOneOfMsg.AbstractMetricStateOneOfCase.ABSTRACT_METRIC_STATE -> org.somda.protosdc.biceps.model.AbstractMetricStateOneOf.ChoiceAbstractMetricState(map_org_somda_protosdc_proto_model_biceps_AbstractMetricStateMsg(source.abstractMetricState))
            org.somda.protosdc.proto.model.biceps.AbstractMetricStateOneOfMsg.AbstractMetricStateOneOfCase.DISTRIBUTION_SAMPLE_ARRAY_METRIC_STATE -> org.somda.protosdc.biceps.model.AbstractMetricStateOneOf.ChoiceDistributionSampleArrayMetricState(map_org_somda_protosdc_proto_model_biceps_DistributionSampleArrayMetricStateMsg(source.distributionSampleArrayMetricState))
            org.somda.protosdc.proto.model.biceps.AbstractMetricStateOneOfMsg.AbstractMetricStateOneOfCase.ENUM_STRING_METRIC_STATE -> org.somda.protosdc.biceps.model.AbstractMetricStateOneOf.ChoiceEnumStringMetricState(map_org_somda_protosdc_proto_model_biceps_EnumStringMetricStateMsg(source.enumStringMetricState))
            org.somda.protosdc.proto.model.biceps.AbstractMetricStateOneOfMsg.AbstractMetricStateOneOfCase.NUMERIC_METRIC_STATE -> org.somda.protosdc.biceps.model.AbstractMetricStateOneOf.ChoiceNumericMetricState(map_org_somda_protosdc_proto_model_biceps_NumericMetricStateMsg(source.numericMetricState))
            org.somda.protosdc.proto.model.biceps.AbstractMetricStateOneOfMsg.AbstractMetricStateOneOfCase.REAL_TIME_SAMPLE_ARRAY_METRIC_STATE -> org.somda.protosdc.biceps.model.AbstractMetricStateOneOf.ChoiceRealTimeSampleArrayMetricState(map_org_somda_protosdc_proto_model_biceps_RealTimeSampleArrayMetricStateMsg(source.realTimeSampleArrayMetricState))
            org.somda.protosdc.proto.model.biceps.AbstractMetricStateOneOfMsg.AbstractMetricStateOneOfCase.STRING_METRIC_STATE -> org.somda.protosdc.biceps.model.AbstractMetricStateOneOf.ChoiceStringMetricState(map_org_somda_protosdc_proto_model_biceps_StringMetricStateMsg(source.stringMetricState))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractContextDescriptorOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractContextDescriptorOneOfMsg): org.somda.protosdc.biceps.model.AbstractContextDescriptorOneOf {
        return when (source.abstractContextDescriptorOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractContextDescriptorOneOfMsg.AbstractContextDescriptorOneOfCase.ABSTRACT_CONTEXT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractContextDescriptorOneOf.ChoiceAbstractContextDescriptor(map_org_somda_protosdc_proto_model_biceps_AbstractContextDescriptorMsg(source.abstractContextDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractContextDescriptorOneOfMsg.AbstractContextDescriptorOneOfCase.ENSEMBLE_CONTEXT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractContextDescriptorOneOf.ChoiceEnsembleContextDescriptor(map_org_somda_protosdc_proto_model_biceps_EnsembleContextDescriptorMsg(source.ensembleContextDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractContextDescriptorOneOfMsg.AbstractContextDescriptorOneOfCase.LOCATION_CONTEXT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractContextDescriptorOneOf.ChoiceLocationContextDescriptor(map_org_somda_protosdc_proto_model_biceps_LocationContextDescriptorMsg(source.locationContextDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractContextDescriptorOneOfMsg.AbstractContextDescriptorOneOfCase.MEANS_CONTEXT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractContextDescriptorOneOf.ChoiceMeansContextDescriptor(map_org_somda_protosdc_proto_model_biceps_MeansContextDescriptorMsg(source.meansContextDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractContextDescriptorOneOfMsg.AbstractContextDescriptorOneOfCase.OPERATOR_CONTEXT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractContextDescriptorOneOf.ChoiceOperatorContextDescriptor(map_org_somda_protosdc_proto_model_biceps_OperatorContextDescriptorMsg(source.operatorContextDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractContextDescriptorOneOfMsg.AbstractContextDescriptorOneOfCase.PATIENT_CONTEXT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractContextDescriptorOneOf.ChoicePatientContextDescriptor(map_org_somda_protosdc_proto_model_biceps_PatientContextDescriptorMsg(source.patientContextDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractContextDescriptorOneOfMsg.AbstractContextDescriptorOneOfCase.WORKFLOW_CONTEXT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractContextDescriptorOneOf.ChoiceWorkflowContextDescriptor(map_org_somda_protosdc_proto_model_biceps_WorkflowContextDescriptorMsg(source.workflowContextDescriptor))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertConditionDescriptorOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorOneOfMsg): org.somda.protosdc.biceps.model.AlertConditionDescriptorOneOf {
        return when (source.alertConditionDescriptorOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorOneOfMsg.AlertConditionDescriptorOneOfCase.ALERT_CONDITION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AlertConditionDescriptorOneOf.ChoiceAlertConditionDescriptor(map_org_somda_protosdc_proto_model_biceps_AlertConditionDescriptorMsg(source.alertConditionDescriptor))
            org.somda.protosdc.proto.model.biceps.AlertConditionDescriptorOneOfMsg.AlertConditionDescriptorOneOfCase.LIMIT_ALERT_CONDITION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AlertConditionDescriptorOneOf.ChoiceLimitAlertConditionDescriptor(map_org_somda_protosdc_proto_model_biceps_LimitAlertConditionDescriptorMsg(source.limitAlertConditionDescriptor))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentStateOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg): org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf {
        return when (source.abstractDeviceComponentStateOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg.AbstractDeviceComponentStateOneOfCase.ABSTRACT_DEVICE_COMPONENT_STATE -> org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf.ChoiceAbstractDeviceComponentState(map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentStateMsg(source.abstractDeviceComponentState))
            org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg.AbstractDeviceComponentStateOneOfCase.ABSTRACT_COMPLEX_DEVICE_COMPONENT_STATE -> org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf.ChoiceAbstractComplexDeviceComponentState(map_org_somda_protosdc_proto_model_biceps_AbstractComplexDeviceComponentStateMsg(source.abstractComplexDeviceComponentState))
            org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg.AbstractDeviceComponentStateOneOfCase.BATTERY_STATE -> org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf.ChoiceBatteryState(map_org_somda_protosdc_proto_model_biceps_BatteryStateMsg(source.batteryState))
            org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg.AbstractDeviceComponentStateOneOfCase.CHANNEL_STATE -> org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf.ChoiceChannelState(map_org_somda_protosdc_proto_model_biceps_ChannelStateMsg(source.channelState))
            org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg.AbstractDeviceComponentStateOneOfCase.CLOCK_STATE -> org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf.ChoiceClockState(map_org_somda_protosdc_proto_model_biceps_ClockStateMsg(source.clockState))
            org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg.AbstractDeviceComponentStateOneOfCase.MDS_STATE -> org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf.ChoiceMdsState(map_org_somda_protosdc_proto_model_biceps_MdsStateMsg(source.mdsState))
            org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg.AbstractDeviceComponentStateOneOfCase.SCO_STATE -> org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf.ChoiceScoState(map_org_somda_protosdc_proto_model_biceps_ScoStateMsg(source.scoState))
            org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg.AbstractDeviceComponentStateOneOfCase.SYSTEM_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf.ChoiceSystemContextState(map_org_somda_protosdc_proto_model_biceps_SystemContextStateMsg(source.systemContextState))
            org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentStateOneOfMsg.AbstractDeviceComponentStateOneOfCase.VMD_STATE -> org.somda.protosdc.biceps.model.AbstractDeviceComponentStateOneOf.ChoiceVmdState(map_org_somda_protosdc_proto_model_biceps_VmdStateMsg(source.vmdState))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractOperationDescriptorOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg): org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf {
        return when (source.abstractOperationDescriptorOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg.AbstractOperationDescriptorOneOfCase.ABSTRACT_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf.ChoiceAbstractOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_AbstractOperationDescriptorMsg(source.abstractOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg.AbstractOperationDescriptorOneOfCase.ABSTRACT_SET_STATE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf.ChoiceAbstractSetStateOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_AbstractSetStateOperationDescriptorMsg(source.abstractSetStateOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg.AbstractOperationDescriptorOneOfCase.ACTIVATE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf.ChoiceActivateOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_ActivateOperationDescriptorMsg(source.activateOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg.AbstractOperationDescriptorOneOfCase.SET_ALERT_STATE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf.ChoiceSetAlertStateOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_SetAlertStateOperationDescriptorMsg(source.setAlertStateOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg.AbstractOperationDescriptorOneOfCase.SET_COMPONENT_STATE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf.ChoiceSetComponentStateOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_SetComponentStateOperationDescriptorMsg(source.setComponentStateOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg.AbstractOperationDescriptorOneOfCase.SET_CONTEXT_STATE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf.ChoiceSetContextStateOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_SetContextStateOperationDescriptorMsg(source.setContextStateOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg.AbstractOperationDescriptorOneOfCase.SET_METRIC_STATE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf.ChoiceSetMetricStateOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_SetMetricStateOperationDescriptorMsg(source.setMetricStateOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg.AbstractOperationDescriptorOneOfCase.SET_STRING_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf.ChoiceSetStringOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_SetStringOperationDescriptorMsg(source.setStringOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractOperationDescriptorOneOfMsg.AbstractOperationDescriptorOneOfCase.SET_VALUE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractOperationDescriptorOneOf.ChoiceSetValueOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_SetValueOperationDescriptorMsg(source.setValueOperationDescriptor))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_StringMetricStateOneOfMsg(source: org.somda.protosdc.proto.model.biceps.StringMetricStateOneOfMsg): org.somda.protosdc.biceps.model.StringMetricStateOneOf {
        return when (source.stringMetricStateOneOfCase) {
            org.somda.protosdc.proto.model.biceps.StringMetricStateOneOfMsg.StringMetricStateOneOfCase.STRING_METRIC_STATE -> org.somda.protosdc.biceps.model.StringMetricStateOneOf.ChoiceStringMetricState(map_org_somda_protosdc_proto_model_biceps_StringMetricStateMsg(source.stringMetricState))
            org.somda.protosdc.proto.model.biceps.StringMetricStateOneOfMsg.StringMetricStateOneOfCase.ENUM_STRING_METRIC_STATE -> org.somda.protosdc.biceps.model.StringMetricStateOneOf.ChoiceEnumStringMetricState(map_org_somda_protosdc_proto_model_biceps_EnumStringMetricStateMsg(source.enumStringMetricState))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractSetStateOperationDescriptorOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractSetStateOperationDescriptorOneOfMsg): org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptorOneOf {
        return when (source.abstractSetStateOperationDescriptorOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractSetStateOperationDescriptorOneOfMsg.AbstractSetStateOperationDescriptorOneOfCase.ABSTRACT_SET_STATE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptorOneOf.ChoiceAbstractSetStateOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_AbstractSetStateOperationDescriptorMsg(source.abstractSetStateOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractSetStateOperationDescriptorOneOfMsg.AbstractSetStateOperationDescriptorOneOfCase.ACTIVATE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptorOneOf.ChoiceActivateOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_ActivateOperationDescriptorMsg(source.activateOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractSetStateOperationDescriptorOneOfMsg.AbstractSetStateOperationDescriptorOneOfCase.SET_ALERT_STATE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptorOneOf.ChoiceSetAlertStateOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_SetAlertStateOperationDescriptorMsg(source.setAlertStateOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractSetStateOperationDescriptorOneOfMsg.AbstractSetStateOperationDescriptorOneOfCase.SET_COMPONENT_STATE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptorOneOf.ChoiceSetComponentStateOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_SetComponentStateOperationDescriptorMsg(source.setComponentStateOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractSetStateOperationDescriptorOneOfMsg.AbstractSetStateOperationDescriptorOneOfCase.SET_CONTEXT_STATE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptorOneOf.ChoiceSetContextStateOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_SetContextStateOperationDescriptorMsg(source.setContextStateOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractSetStateOperationDescriptorOneOfMsg.AbstractSetStateOperationDescriptorOneOfCase.SET_METRIC_STATE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractSetStateOperationDescriptorOneOf.ChoiceSetMetricStateOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_SetMetricStateOperationDescriptorMsg(source.setMetricStateOperationDescriptor))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractComplexDeviceComponentStateOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentStateOneOfMsg): org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentStateOneOf {
        return when (source.abstractComplexDeviceComponentStateOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentStateOneOfMsg.AbstractComplexDeviceComponentStateOneOfCase.ABSTRACT_COMPLEX_DEVICE_COMPONENT_STATE -> org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentStateOneOf.ChoiceAbstractComplexDeviceComponentState(map_org_somda_protosdc_proto_model_biceps_AbstractComplexDeviceComponentStateMsg(source.abstractComplexDeviceComponentState))
            org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentStateOneOfMsg.AbstractComplexDeviceComponentStateOneOfCase.MDS_STATE -> org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentStateOneOf.ChoiceMdsState(map_org_somda_protosdc_proto_model_biceps_MdsStateMsg(source.mdsState))
            org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentStateOneOfMsg.AbstractComplexDeviceComponentStateOneOfCase.VMD_STATE -> org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentStateOneOf.ChoiceVmdState(map_org_somda_protosdc_proto_model_biceps_VmdStateMsg(source.vmdState))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractOperationalStateReportMsg_ReportPartMsg(source: org.somda.protosdc.proto.model.biceps.AbstractOperationalStateReportMsg.ReportPartMsg): org.somda.protosdc.biceps.model.AbstractOperationalStateReport.ReportPart {
        return org.somda.protosdc.biceps.model.AbstractOperationalStateReport.ReportPart(
            abstractReportPart = map_org_somda_protosdc_proto_model_biceps_AbstractReportPartMsg(source.abstractReportPart),
            operationState = source.operationStateList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractOperationStateOneOfMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractOperationalStateReportMsg(source: org.somda.protosdc.proto.model.biceps.AbstractOperationalStateReportMsg): org.somda.protosdc.biceps.model.AbstractOperationalStateReport {
        return org.somda.protosdc.biceps.model.AbstractOperationalStateReport(
            abstractReport = map_org_somda_protosdc_proto_model_biceps_AbstractReportMsg(source.abstractReport),
            reportPart = source.reportPartList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractOperationalStateReportMsg_ReportPartMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractAlertReportMsg_ReportPartMsg(source: org.somda.protosdc.proto.model.biceps.AbstractAlertReportMsg.ReportPartMsg): org.somda.protosdc.biceps.model.AbstractAlertReport.ReportPart {
        return org.somda.protosdc.biceps.model.AbstractAlertReport.ReportPart(
            abstractReportPart = map_org_somda_protosdc_proto_model_biceps_AbstractReportPartMsg(source.abstractReportPart),
            alertState = source.alertStateList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractAlertStateOneOfMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractAlertReportMsg(source: org.somda.protosdc.proto.model.biceps.AbstractAlertReportMsg): org.somda.protosdc.biceps.model.AbstractAlertReport {
        return org.somda.protosdc.biceps.model.AbstractAlertReport(
            abstractReport = map_org_somda_protosdc_proto_model_biceps_AbstractReportMsg(source.abstractReport),
            reportPart = source.reportPartList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractAlertReportMsg_ReportPartMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ImagingProcedureMsg(source: org.somda.protosdc.proto.model.biceps.ImagingProcedureMsg): org.somda.protosdc.biceps.model.ImagingProcedure {
        return org.somda.protosdc.biceps.model.ImagingProcedure(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            accessionIdentifier = map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(source.accessionIdentifier),
            requestedProcedureId = map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(source.requestedProcedureId),
            studyInstanceUid = map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(source.studyInstanceUid),
            scheduledProcedureStepId = map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(source.scheduledProcedureStepId),
            modality = when (source.hasModality()) {
                true -> map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.modality)
                false -> null
            },
            protocolCode = when (source.hasProtocolCode()) {
                true -> map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.protocolCode)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ApprovedJurisdictionsMsg(source: org.somda.protosdc.proto.model.biceps.ApprovedJurisdictionsMsg): org.somda.protosdc.biceps.model.ApprovedJurisdictions {
        return org.somda.protosdc.biceps.model.ApprovedJurisdictions(
            approvedJurisdiction = source.approvedJurisdictionList.toList().map { map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetContextStatesByIdentificationMsg(source: org.somda.protosdc.proto.model.biceps.GetContextStatesByIdentificationMsg): org.somda.protosdc.biceps.model.GetContextStatesByIdentification {
        return org.somda.protosdc.biceps.model.GetContextStatesByIdentification(
            abstractGet = map_org_somda_protosdc_proto_model_biceps_AbstractGetMsg(source.abstractGet),
            identification = source.identificationList.toList().map { map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(it) }.toList(),
            contextTypeAttr = when (source.hasContextTypeAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_QualifiedNameMsg(source.contextTypeAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetAlertStateMsg(source: org.somda.protosdc.proto.model.biceps.SetAlertStateMsg): org.somda.protosdc.biceps.model.SetAlertState {
        return org.somda.protosdc.biceps.model.SetAlertState(
            abstractSet = map_org_somda_protosdc_proto_model_biceps_AbstractSetMsg(source.abstractSet),
            proposedAlertState = map_org_somda_protosdc_proto_model_biceps_AbstractAlertStateOneOfMsg(source.proposedAlertState),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_PeriodicAlertReportMsg(source: org.somda.protosdc.proto.model.biceps.PeriodicAlertReportMsg): org.somda.protosdc.biceps.model.PeriodicAlertReport {
        return org.somda.protosdc.biceps.model.PeriodicAlertReport(
            abstractAlertReport = map_org_somda_protosdc_proto_model_biceps_AbstractAlertReportMsg(source.abstractAlertReport),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_PeriodicOperationalStateReportMsg(source: org.somda.protosdc.proto.model.biceps.PeriodicOperationalStateReportMsg): org.somda.protosdc.biceps.model.PeriodicOperationalStateReport {
        return org.somda.protosdc.biceps.model.PeriodicOperationalStateReport(
            abstractOperationalStateReport = map_org_somda_protosdc_proto_model_biceps_AbstractOperationalStateReportMsg(source.abstractOperationalStateReport),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetMetricStateMsg(source: org.somda.protosdc.proto.model.biceps.SetMetricStateMsg): org.somda.protosdc.biceps.model.SetMetricState {
        return org.somda.protosdc.biceps.model.SetMetricState(
            abstractSet = map_org_somda_protosdc_proto_model_biceps_AbstractSetMsg(source.abstractSet),
            proposedMetricState = source.proposedMetricStateList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractMetricStateOneOfMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_EpisodicAlertReportMsg(source: org.somda.protosdc.proto.model.biceps.EpisodicAlertReportMsg): org.somda.protosdc.biceps.model.EpisodicAlertReport {
        return org.somda.protosdc.biceps.model.EpisodicAlertReport(
            abstractAlertReport = map_org_somda_protosdc_proto_model_biceps_AbstractAlertReportMsg(source.abstractAlertReport),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_EpisodicOperationalStateReportMsg(source: org.somda.protosdc.proto.model.biceps.EpisodicOperationalStateReportMsg): org.somda.protosdc.biceps.model.EpisodicOperationalStateReport {
        return org.somda.protosdc.biceps.model.EpisodicOperationalStateReport(
            abstractOperationalStateReport = map_org_somda_protosdc_proto_model_biceps_AbstractOperationalStateReportMsg(source.abstractOperationalStateReport),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_OperationInvokedReportMsg_ReportPartMsg(source: org.somda.protosdc.proto.model.biceps.OperationInvokedReportMsg.ReportPartMsg): org.somda.protosdc.biceps.model.OperationInvokedReport.ReportPart {
        return org.somda.protosdc.biceps.model.OperationInvokedReport.ReportPart(
            abstractReportPart = map_org_somda_protosdc_proto_model_biceps_AbstractReportPartMsg(source.abstractReportPart),
            invocationInfo = map_org_somda_protosdc_proto_model_biceps_InvocationInfoMsg(source.invocationInfo),
            invocationSource = map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(source.invocationSource),
            operationHandleRefAttr = map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(source.operationHandleRefAttr),
            operationTargetAttr = when (source.hasOperationTargetAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(source.operationTargetAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_OperationInvokedReportMsg(source: org.somda.protosdc.proto.model.biceps.OperationInvokedReportMsg): org.somda.protosdc.biceps.model.OperationInvokedReport {
        return org.somda.protosdc.biceps.model.OperationInvokedReport(
            abstractReport = map_org_somda_protosdc_proto_model_biceps_AbstractReportMsg(source.abstractReport),
            reportPart = source.reportPartList.toList().map { map_org_somda_protosdc_proto_model_biceps_OperationInvokedReportMsg_ReportPartMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentDescriptorMsg_ProductionSpecificationMsg(source: org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorMsg.ProductionSpecificationMsg): org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptor.ProductionSpecification {
        return org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptor.ProductionSpecification(
            specType = map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.specType),
            productionSpec = source.productionSpec,
            componentId = when (source.hasComponentId()) {
                true -> map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(source.componentId)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorMsg): org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptor {
        return org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptor(
            abstractDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractDescriptorMsg(source.abstractDescriptor),
            productionSpecification = source.productionSpecificationList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentDescriptorMsg_ProductionSpecificationMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractContextStateMsg(source: org.somda.protosdc.proto.model.biceps.AbstractContextStateMsg): org.somda.protosdc.biceps.model.AbstractContextState {
        return org.somda.protosdc.biceps.model.AbstractContextState(
            abstractMultiState = map_org_somda_protosdc_proto_model_biceps_AbstractMultiStateMsg(source.abstractMultiState),
            validator = source.validatorList.toList().map { map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(it) }.toList(),
            identification = source.identificationList.toList().map { map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(it) }.toList(),
            contextAssociationAttr = when (source.hasContextAssociationAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ContextAssociationMsg(source.contextAssociationAttr)
                false -> null
            },
            bindingMdibVersionAttr = when (source.hasBindingMdibVersionAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ReferencedVersionMsg(source.bindingMdibVersionAttr)
                false -> null
            },
            unbindingMdibVersionAttr = when (source.hasUnbindingMdibVersionAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ReferencedVersionMsg(source.unbindingMdibVersionAttr)
                false -> null
            },
            bindingStartTimeAttr = when (source.hasBindingStartTimeAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_TimestampMsg(source.bindingStartTimeAttr)
                false -> null
            },
            bindingEndTimeAttr = when (source.hasBindingEndTimeAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_TimestampMsg(source.bindingEndTimeAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractMetricDescriptorMsg_RelationMsg_KindAttrMsg_EnumType(source: org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg.KindAttrMsg.EnumType): org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation.KindAttr.EnumType {
        return when (source) {
            org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg.KindAttrMsg.EnumType.RCM -> org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation.KindAttr.EnumType.Rcm
            org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg.KindAttrMsg.EnumType.PS -> org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation.KindAttr.EnumType.PS
            org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg.KindAttrMsg.EnumType.SST -> org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation.KindAttr.EnumType.SST
            org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg.KindAttrMsg.EnumType.ECE -> org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation.KindAttr.EnumType.ECE
            org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg.KindAttrMsg.EnumType.DCE -> org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation.KindAttr.EnumType.DCE
            org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg.KindAttrMsg.EnumType.OTH -> org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation.KindAttr.EnumType.Oth
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractMetricDescriptorMsg_RelationMsg_KindAttrMsg(source: org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg.KindAttrMsg): org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation.KindAttr {
        return org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation.KindAttr(
            enumType = map_org_somda_protosdc_proto_model_biceps_AbstractMetricDescriptorMsg_RelationMsg_KindAttrMsg_EnumType(source.enumType),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractMetricDescriptorMsg_RelationMsg(source: org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg.RelationMsg): org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation {
        return org.somda.protosdc.biceps.model.AbstractMetricDescriptor.Relation(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            code = when (source.hasCode()) {
                true -> map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.code)
                false -> null
            },
            identification = when (source.hasIdentification()) {
                true -> map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(source.identification)
                false -> null
            },
            kindAttr = map_org_somda_protosdc_proto_model_biceps_AbstractMetricDescriptorMsg_RelationMsg_KindAttrMsg(source.kindAttr),
            entriesAttr = map_org_somda_protosdc_proto_model_biceps_EntryRefMsg(source.entriesAttr),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractMetricDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorMsg): org.somda.protosdc.biceps.model.AbstractMetricDescriptor {
        return org.somda.protosdc.biceps.model.AbstractMetricDescriptor(
            abstractDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractDescriptorMsg(source.abstractDescriptor),
            unit = map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.unit),
            bodySite = source.bodySiteList.toList().map { map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(it) }.toList(),
            relation = source.relationList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractMetricDescriptorMsg_RelationMsg(it) }.toList(),
            metricCategoryAttr = map_org_somda_protosdc_proto_model_biceps_MetricCategoryMsg(source.metricCategoryAttr),
            derivationMethodAttr = when (source.hasDerivationMethodAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_DerivationMethodMsg(source.derivationMethodAttr)
                false -> null
            },
            metricAvailabilityAttr = map_org_somda_protosdc_proto_model_biceps_MetricAvailabilityMsg(source.metricAvailabilityAttr),
            maxMeasurementTimeAttr = when (source.hasMaxMeasurementTimeAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.maxMeasurementTimeAttr)
                false -> null
            },
            maxDelayTimeAttr = when (source.hasMaxDelayTimeAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.maxDelayTimeAttr)
                false -> null
            },
            determinationPeriodAttr = when (source.hasDeterminationPeriodAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.determinationPeriodAttr)
                false -> null
            },
            lifeTimePeriodAttr = when (source.hasLifeTimePeriodAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.lifeTimePeriodAttr)
                false -> null
            },
            activationDurationAttr = when (source.hasActivationDurationAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.activationDurationAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ClockDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.ClockDescriptorMsg): org.somda.protosdc.biceps.model.ClockDescriptor {
        return org.somda.protosdc.biceps.model.ClockDescriptor(
            abstractDeviceComponentDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentDescriptorMsg(source.abstractDeviceComponentDescriptor),
            timeProtocol = source.timeProtocolList.toList().map { map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(it) }.toList(),
            resolutionAttr = when (source.hasResolutionAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.resolutionAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_NumericMetricDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.NumericMetricDescriptorMsg): org.somda.protosdc.biceps.model.NumericMetricDescriptor {
        return org.somda.protosdc.biceps.model.NumericMetricDescriptor(
            abstractMetricDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractMetricDescriptorMsg(source.abstractMetricDescriptor),
            technicalRange = source.technicalRangeList.toList().map { map_org_somda_protosdc_proto_model_biceps_RangeMsg(it) }.toList(),
            resolutionAttr = mapProtoDecimalToBigDecimal(source.resolutionAttr),
            averagingPeriodAttr = when (source.hasAveragingPeriodAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.averagingPeriodAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_BatteryDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.BatteryDescriptorMsg): org.somda.protosdc.biceps.model.BatteryDescriptor {
        return org.somda.protosdc.biceps.model.BatteryDescriptor(
            abstractDeviceComponentDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentDescriptorMsg(source.abstractDeviceComponentDescriptor),
            capacityFullCharge = when (source.hasCapacityFullCharge()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MeasurementMsg(source.capacityFullCharge)
                false -> null
            },
            capacitySpecified = when (source.hasCapacitySpecified()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MeasurementMsg(source.capacitySpecified)
                false -> null
            },
            voltageSpecified = when (source.hasVoltageSpecified()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MeasurementMsg(source.voltageSpecified)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_LocationReferenceMsg(source: org.somda.protosdc.proto.model.biceps.LocationReferenceMsg): org.somda.protosdc.biceps.model.LocationReference {
        return org.somda.protosdc.biceps.model.LocationReference(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            identification = source.identificationList.toList().map { map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(it) }.toList(),
            locationDetail = when (source.hasLocationDetail()) {
                true -> map_org_somda_protosdc_proto_model_biceps_LocationDetailMsg(source.locationDetail)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractMetricReportMsg_ReportPartMsg(source: org.somda.protosdc.proto.model.biceps.AbstractMetricReportMsg.ReportPartMsg): org.somda.protosdc.biceps.model.AbstractMetricReport.ReportPart {
        return org.somda.protosdc.biceps.model.AbstractMetricReport.ReportPart(
            abstractReportPart = map_org_somda_protosdc_proto_model_biceps_AbstractReportPartMsg(source.abstractReportPart),
            metricState = source.metricStateList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractMetricStateOneOfMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractMetricReportMsg(source: org.somda.protosdc.proto.model.biceps.AbstractMetricReportMsg): org.somda.protosdc.biceps.model.AbstractMetricReport {
        return org.somda.protosdc.biceps.model.AbstractMetricReport(
            abstractReport = map_org_somda_protosdc_proto_model_biceps_AbstractReportMsg(source.abstractReport),
            reportPart = source.reportPartList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractMetricReportMsg_ReportPartMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_EnsembleContextStateMsg(source: org.somda.protosdc.proto.model.biceps.EnsembleContextStateMsg): org.somda.protosdc.biceps.model.EnsembleContextState {
        return org.somda.protosdc.biceps.model.EnsembleContextState(
            abstractContextState = map_org_somda_protosdc_proto_model_biceps_AbstractContextStateMsg(source.abstractContextState),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_PeriodicMetricReportMsg(source: org.somda.protosdc.proto.model.biceps.PeriodicMetricReportMsg): org.somda.protosdc.biceps.model.PeriodicMetricReport {
        return org.somda.protosdc.biceps.model.PeriodicMetricReport(
            abstractMetricReport = map_org_somda_protosdc_proto_model_biceps_AbstractMetricReportMsg(source.abstractMetricReport),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_EpisodicMetricReportMsg(source: org.somda.protosdc.proto.model.biceps.EpisodicMetricReportMsg): org.somda.protosdc.biceps.model.EpisodicMetricReport {
        return org.somda.protosdc.biceps.model.EpisodicMetricReport(
            abstractMetricReport = map_org_somda_protosdc_proto_model_biceps_AbstractMetricReportMsg(source.abstractMetricReport),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_DistributionSampleArrayMetricDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.DistributionSampleArrayMetricDescriptorMsg): org.somda.protosdc.biceps.model.DistributionSampleArrayMetricDescriptor {
        return org.somda.protosdc.biceps.model.DistributionSampleArrayMetricDescriptor(
            abstractMetricDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractMetricDescriptorMsg(source.abstractMetricDescriptor),
            technicalRange = source.technicalRangeList.toList().map { map_org_somda_protosdc_proto_model_biceps_RangeMsg(it) }.toList(),
            domainUnit = map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.domainUnit),
            distributionRange = map_org_somda_protosdc_proto_model_biceps_RangeMsg(source.distributionRange),
            resolutionAttr = mapProtoDecimalToBigDecimal(source.resolutionAttr),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_RealTimeSampleArrayMetricDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.RealTimeSampleArrayMetricDescriptorMsg): org.somda.protosdc.biceps.model.RealTimeSampleArrayMetricDescriptor {
        return org.somda.protosdc.biceps.model.RealTimeSampleArrayMetricDescriptor(
            abstractMetricDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractMetricDescriptorMsg(source.abstractMetricDescriptor),
            technicalRange = source.technicalRangeList.toList().map { map_org_somda_protosdc_proto_model_biceps_RangeMsg(it) }.toList(),
            resolutionAttr = mapProtoDecimalToBigDecimal(source.resolutionAttr),
            samplePeriodAttr = org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.samplePeriodAttr),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AlertSystemDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.AlertSystemDescriptorMsg): org.somda.protosdc.biceps.model.AlertSystemDescriptor {
        return org.somda.protosdc.biceps.model.AlertSystemDescriptor(
            abstractAlertDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractAlertDescriptorMsg(source.abstractAlertDescriptor),
            alertCondition = source.alertConditionList.toList().map { map_org_somda_protosdc_proto_model_biceps_AlertConditionDescriptorOneOfMsg(it) }.toList(),
            alertSignal = source.alertSignalList.toList().map { map_org_somda_protosdc_proto_model_biceps_AlertSignalDescriptorMsg(it) }.toList(),
            maxPhysiologicalParallelAlarmsAttr = when (source.hasMaxPhysiologicalParallelAlarmsAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapUInt32Value(source.maxPhysiologicalParallelAlarmsAttr)
                false -> null
            },
            maxTechnicalParallelAlarmsAttr = when (source.hasMaxTechnicalParallelAlarmsAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapUInt32Value(source.maxTechnicalParallelAlarmsAttr)
                false -> null
            },
            selfCheckPeriodAttr = when (source.hasSelfCheckPeriodAttr()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapDuration(source.selfCheckPeriodAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_LocationContextStateMsg(source: org.somda.protosdc.proto.model.biceps.LocationContextStateMsg): org.somda.protosdc.biceps.model.LocationContextState {
        return org.somda.protosdc.biceps.model.LocationContextState(
            abstractContextState = map_org_somda_protosdc_proto_model_biceps_AbstractContextStateMsg(source.abstractContextState),
            locationDetail = when (source.hasLocationDetail()) {
                true -> map_org_somda_protosdc_proto_model_biceps_LocationDetailMsg(source.locationDetail)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_StringMetricDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.StringMetricDescriptorMsg): org.somda.protosdc.biceps.model.StringMetricDescriptor {
        return org.somda.protosdc.biceps.model.StringMetricDescriptor(
            abstractMetricDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractMetricDescriptorMsg(source.abstractMetricDescriptor),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_MeansContextStateMsg(source: org.somda.protosdc.proto.model.biceps.MeansContextStateMsg): org.somda.protosdc.biceps.model.MeansContextState {
        return org.somda.protosdc.biceps.model.MeansContextState(
            abstractContextState = map_org_somda_protosdc_proto_model_biceps_AbstractContextStateMsg(source.abstractContextState),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_ScoDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.ScoDescriptorMsg): org.somda.protosdc.biceps.model.ScoDescriptor {
        return org.somda.protosdc.biceps.model.ScoDescriptor(
            abstractDeviceComponentDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentDescriptorMsg(source.abstractDeviceComponentDescriptor),
            operation = source.operationList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractOperationDescriptorOneOfMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetComponentStateMsg(source: org.somda.protosdc.proto.model.biceps.SetComponentStateMsg): org.somda.protosdc.biceps.model.SetComponentState {
        return org.somda.protosdc.biceps.model.SetComponentState(
            abstractSet = map_org_somda_protosdc_proto_model_biceps_AbstractSetMsg(source.abstractSet),
            proposedComponentState = source.proposedComponentStateList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentStateOneOfMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractComponentReportMsg_ReportPartMsg(source: org.somda.protosdc.proto.model.biceps.AbstractComponentReportMsg.ReportPartMsg): org.somda.protosdc.biceps.model.AbstractComponentReport.ReportPart {
        return org.somda.protosdc.biceps.model.AbstractComponentReport.ReportPart(
            abstractReportPart = map_org_somda_protosdc_proto_model_biceps_AbstractReportPartMsg(source.abstractReportPart),
            componentState = source.componentStateList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentStateOneOfMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractComponentReportMsg(source: org.somda.protosdc.proto.model.biceps.AbstractComponentReportMsg): org.somda.protosdc.biceps.model.AbstractComponentReport {
        return org.somda.protosdc.biceps.model.AbstractComponentReport(
            abstractReport = map_org_somda_protosdc_proto_model_biceps_AbstractReportMsg(source.abstractReport),
            reportPart = source.reportPartList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractComponentReportMsg_ReportPartMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SystemContextDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.SystemContextDescriptorMsg): org.somda.protosdc.biceps.model.SystemContextDescriptor {
        return org.somda.protosdc.biceps.model.SystemContextDescriptor(
            abstractDeviceComponentDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentDescriptorMsg(source.abstractDeviceComponentDescriptor),
            patientContext = when (source.hasPatientContext()) {
                true -> map_org_somda_protosdc_proto_model_biceps_PatientContextDescriptorMsg(source.patientContext)
                false -> null
            },
            locationContext = when (source.hasLocationContext()) {
                true -> map_org_somda_protosdc_proto_model_biceps_LocationContextDescriptorMsg(source.locationContext)
                false -> null
            },
            ensembleContext = source.ensembleContextList.toList().map { map_org_somda_protosdc_proto_model_biceps_EnsembleContextDescriptorMsg(it) }.toList(),
            operatorContext = source.operatorContextList.toList().map { map_org_somda_protosdc_proto_model_biceps_OperatorContextDescriptorMsg(it) }.toList(),
            workflowContext = source.workflowContextList.toList().map { map_org_somda_protosdc_proto_model_biceps_WorkflowContextDescriptorMsg(it) }.toList(),
            meansContext = source.meansContextList.toList().map { map_org_somda_protosdc_proto_model_biceps_MeansContextDescriptorMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractComplexDeviceComponentDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentDescriptorMsg): org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentDescriptor {
        return org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentDescriptor(
            abstractDeviceComponentDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentDescriptorMsg(source.abstractDeviceComponentDescriptor),
            alertSystem = when (source.hasAlertSystem()) {
                true -> map_org_somda_protosdc_proto_model_biceps_AlertSystemDescriptorMsg(source.alertSystem)
                false -> null
            },
            sco = when (source.hasSco()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ScoDescriptorMsg(source.sco)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_EnumStringMetricDescriptorMsg_AllowedValueMsg(source: org.somda.protosdc.proto.model.biceps.EnumStringMetricDescriptorMsg.AllowedValueMsg): org.somda.protosdc.biceps.model.EnumStringMetricDescriptor.AllowedValue {
        return org.somda.protosdc.biceps.model.EnumStringMetricDescriptor.AllowedValue(
            value = source.value,
            type = when (source.hasType()) {
                true -> map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(source.type)
                false -> null
            },
            identification = when (source.hasIdentification()) {
                true -> map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(source.identification)
                false -> null
            },
            characteristic = when (source.hasCharacteristic()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MeasurementMsg(source.characteristic)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_EnumStringMetricDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.EnumStringMetricDescriptorMsg): org.somda.protosdc.biceps.model.EnumStringMetricDescriptor {
        return org.somda.protosdc.biceps.model.EnumStringMetricDescriptor(
            stringMetricDescriptor = map_org_somda_protosdc_proto_model_biceps_StringMetricDescriptorMsg(source.stringMetricDescriptor),
            allowedValue = source.allowedValueList.toList().map { map_org_somda_protosdc_proto_model_biceps_EnumStringMetricDescriptorMsg_AllowedValueMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_PeriodicComponentReportMsg(source: org.somda.protosdc.proto.model.biceps.PeriodicComponentReportMsg): org.somda.protosdc.biceps.model.PeriodicComponentReport {
        return org.somda.protosdc.biceps.model.PeriodicComponentReport(
            abstractComponentReport = map_org_somda_protosdc_proto_model_biceps_AbstractComponentReportMsg(source.abstractComponentReport),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_EpisodicComponentReportMsg(source: org.somda.protosdc.proto.model.biceps.EpisodicComponentReportMsg): org.somda.protosdc.biceps.model.EpisodicComponentReport {
        return org.somda.protosdc.biceps.model.EpisodicComponentReport(
            abstractComponentReport = map_org_somda_protosdc_proto_model_biceps_AbstractComponentReportMsg(source.abstractComponentReport),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractGetOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg): org.somda.protosdc.biceps.model.AbstractGetOneOf {
        return when (source.abstractGetOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.AbstractGetOneOfCase.ABSTRACT_GET -> org.somda.protosdc.biceps.model.AbstractGetOneOf.ChoiceAbstractGet(map_org_somda_protosdc_proto_model_biceps_AbstractGetMsg(source.abstractGet))
            org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.AbstractGetOneOfCase.GET_CONTAINMENT_TREE -> org.somda.protosdc.biceps.model.AbstractGetOneOf.ChoiceGetContainmentTree(map_org_somda_protosdc_proto_model_biceps_GetContainmentTreeMsg(source.getContainmentTree))
            org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.AbstractGetOneOfCase.GET_CONTEXT_STATES -> org.somda.protosdc.biceps.model.AbstractGetOneOf.ChoiceGetContextStates(map_org_somda_protosdc_proto_model_biceps_GetContextStatesMsg(source.getContextStates))
            org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.AbstractGetOneOfCase.GET_CONTEXT_STATES_BY_FILTER -> org.somda.protosdc.biceps.model.AbstractGetOneOf.ChoiceGetContextStatesByFilter(map_org_somda_protosdc_proto_model_biceps_GetContextStatesByFilterMsg(source.getContextStatesByFilter))
            org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.AbstractGetOneOfCase.GET_CONTEXT_STATES_BY_IDENTIFICATION -> org.somda.protosdc.biceps.model.AbstractGetOneOf.ChoiceGetContextStatesByIdentification(map_org_somda_protosdc_proto_model_biceps_GetContextStatesByIdentificationMsg(source.getContextStatesByIdentification))
            org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.AbstractGetOneOfCase.GET_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractGetOneOf.ChoiceGetDescriptor(map_org_somda_protosdc_proto_model_biceps_GetDescriptorMsg(source.getDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.AbstractGetOneOfCase.GET_DESCRIPTORS_FROM_ARCHIVE -> org.somda.protosdc.biceps.model.AbstractGetOneOf.ChoiceGetDescriptorsFromArchive(map_org_somda_protosdc_proto_model_biceps_GetDescriptorsFromArchiveMsg(source.getDescriptorsFromArchive))
            org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.AbstractGetOneOfCase.GET_LOCALIZED_TEXT -> org.somda.protosdc.biceps.model.AbstractGetOneOf.ChoiceGetLocalizedText(map_org_somda_protosdc_proto_model_biceps_GetLocalizedTextMsg(source.getLocalizedText))
            org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.AbstractGetOneOfCase.GET_MD_DESCRIPTION -> org.somda.protosdc.biceps.model.AbstractGetOneOf.ChoiceGetMdDescription(map_org_somda_protosdc_proto_model_biceps_GetMdDescriptionMsg(source.getMdDescription))
            org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.AbstractGetOneOfCase.GET_MD_STATE -> org.somda.protosdc.biceps.model.AbstractGetOneOf.ChoiceGetMdState(map_org_somda_protosdc_proto_model_biceps_GetMdStateMsg(source.getMdState))
            org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.AbstractGetOneOfCase.GET_MDIB -> org.somda.protosdc.biceps.model.AbstractGetOneOf.ChoiceGetMdib(map_org_somda_protosdc_proto_model_biceps_GetMdibMsg(source.getMdib))
            org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.AbstractGetOneOfCase.GET_STATES_FROM_ARCHIVE -> org.somda.protosdc.biceps.model.AbstractGetOneOf.ChoiceGetStatesFromArchive(map_org_somda_protosdc_proto_model_biceps_GetStatesFromArchiveMsg(source.getStatesFromArchive))
            org.somda.protosdc.proto.model.biceps.AbstractGetOneOfMsg.AbstractGetOneOfCase.GET_SUPPORTED_LANGUAGES -> org.somda.protosdc.biceps.model.AbstractGetOneOf.ChoiceGetSupportedLanguages(map_org_somda_protosdc_proto_model_biceps_GetSupportedLanguagesMsg(source.getSupportedLanguages))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractAlertReportOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractAlertReportOneOfMsg): org.somda.protosdc.biceps.model.AbstractAlertReportOneOf {
        return when (source.abstractAlertReportOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractAlertReportOneOfMsg.AbstractAlertReportOneOfCase.ABSTRACT_ALERT_REPORT -> org.somda.protosdc.biceps.model.AbstractAlertReportOneOf.ChoiceAbstractAlertReport(map_org_somda_protosdc_proto_model_biceps_AbstractAlertReportMsg(source.abstractAlertReport))
            org.somda.protosdc.proto.model.biceps.AbstractAlertReportOneOfMsg.AbstractAlertReportOneOfCase.EPISODIC_ALERT_REPORT -> org.somda.protosdc.biceps.model.AbstractAlertReportOneOf.ChoiceEpisodicAlertReport(map_org_somda_protosdc_proto_model_biceps_EpisodicAlertReportMsg(source.episodicAlertReport))
            org.somda.protosdc.proto.model.biceps.AbstractAlertReportOneOfMsg.AbstractAlertReportOneOfCase.PERIODIC_ALERT_REPORT -> org.somda.protosdc.biceps.model.AbstractAlertReportOneOf.ChoicePeriodicAlertReport(map_org_somda_protosdc_proto_model_biceps_PeriodicAlertReportMsg(source.periodicAlertReport))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractOperationalStateReportOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractOperationalStateReportOneOfMsg): org.somda.protosdc.biceps.model.AbstractOperationalStateReportOneOf {
        return when (source.abstractOperationalStateReportOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractOperationalStateReportOneOfMsg.AbstractOperationalStateReportOneOfCase.ABSTRACT_OPERATIONAL_STATE_REPORT -> org.somda.protosdc.biceps.model.AbstractOperationalStateReportOneOf.ChoiceAbstractOperationalStateReport(map_org_somda_protosdc_proto_model_biceps_AbstractOperationalStateReportMsg(source.abstractOperationalStateReport))
            org.somda.protosdc.proto.model.biceps.AbstractOperationalStateReportOneOfMsg.AbstractOperationalStateReportOneOfCase.EPISODIC_OPERATIONAL_STATE_REPORT -> org.somda.protosdc.biceps.model.AbstractOperationalStateReportOneOf.ChoiceEpisodicOperationalStateReport(map_org_somda_protosdc_proto_model_biceps_EpisodicOperationalStateReportMsg(source.episodicOperationalStateReport))
            org.somda.protosdc.proto.model.biceps.AbstractOperationalStateReportOneOfMsg.AbstractOperationalStateReportOneOfCase.PERIODIC_OPERATIONAL_STATE_REPORT -> org.somda.protosdc.biceps.model.AbstractOperationalStateReportOneOf.ChoicePeriodicOperationalStateReport(map_org_somda_protosdc_proto_model_biceps_PeriodicOperationalStateReportMsg(source.periodicOperationalStateReport))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractMetricDescriptorOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorOneOfMsg): org.somda.protosdc.biceps.model.AbstractMetricDescriptorOneOf {
        return when (source.abstractMetricDescriptorOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorOneOfMsg.AbstractMetricDescriptorOneOfCase.ABSTRACT_METRIC_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractMetricDescriptorOneOf.ChoiceAbstractMetricDescriptor(map_org_somda_protosdc_proto_model_biceps_AbstractMetricDescriptorMsg(source.abstractMetricDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorOneOfMsg.AbstractMetricDescriptorOneOfCase.DISTRIBUTION_SAMPLE_ARRAY_METRIC_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractMetricDescriptorOneOf.ChoiceDistributionSampleArrayMetricDescriptor(map_org_somda_protosdc_proto_model_biceps_DistributionSampleArrayMetricDescriptorMsg(source.distributionSampleArrayMetricDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorOneOfMsg.AbstractMetricDescriptorOneOfCase.ENUM_STRING_METRIC_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractMetricDescriptorOneOf.ChoiceEnumStringMetricDescriptor(map_org_somda_protosdc_proto_model_biceps_EnumStringMetricDescriptorMsg(source.enumStringMetricDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorOneOfMsg.AbstractMetricDescriptorOneOfCase.NUMERIC_METRIC_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractMetricDescriptorOneOf.ChoiceNumericMetricDescriptor(map_org_somda_protosdc_proto_model_biceps_NumericMetricDescriptorMsg(source.numericMetricDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorOneOfMsg.AbstractMetricDescriptorOneOfCase.REAL_TIME_SAMPLE_ARRAY_METRIC_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractMetricDescriptorOneOf.ChoiceRealTimeSampleArrayMetricDescriptor(map_org_somda_protosdc_proto_model_biceps_RealTimeSampleArrayMetricDescriptorMsg(source.realTimeSampleArrayMetricDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractMetricDescriptorOneOfMsg.AbstractMetricDescriptorOneOfCase.STRING_METRIC_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractMetricDescriptorOneOf.ChoiceStringMetricDescriptor(map_org_somda_protosdc_proto_model_biceps_StringMetricDescriptorMsg(source.stringMetricDescriptor))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractAlertDescriptorOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractAlertDescriptorOneOfMsg): org.somda.protosdc.biceps.model.AbstractAlertDescriptorOneOf {
        return when (source.abstractAlertDescriptorOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractAlertDescriptorOneOfMsg.AbstractAlertDescriptorOneOfCase.ABSTRACT_ALERT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractAlertDescriptorOneOf.ChoiceAbstractAlertDescriptor(map_org_somda_protosdc_proto_model_biceps_AbstractAlertDescriptorMsg(source.abstractAlertDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractAlertDescriptorOneOfMsg.AbstractAlertDescriptorOneOfCase.ALERT_CONDITION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractAlertDescriptorOneOf.ChoiceAlertConditionDescriptor(map_org_somda_protosdc_proto_model_biceps_AlertConditionDescriptorMsg(source.alertConditionDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractAlertDescriptorOneOfMsg.AbstractAlertDescriptorOneOfCase.ALERT_SIGNAL_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractAlertDescriptorOneOf.ChoiceAlertSignalDescriptor(map_org_somda_protosdc_proto_model_biceps_AlertSignalDescriptorMsg(source.alertSignalDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractAlertDescriptorOneOfMsg.AbstractAlertDescriptorOneOfCase.ALERT_SYSTEM_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractAlertDescriptorOneOf.ChoiceAlertSystemDescriptor(map_org_somda_protosdc_proto_model_biceps_AlertSystemDescriptorMsg(source.alertSystemDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractAlertDescriptorOneOfMsg.AbstractAlertDescriptorOneOfCase.LIMIT_ALERT_CONDITION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractAlertDescriptorOneOf.ChoiceLimitAlertConditionDescriptor(map_org_somda_protosdc_proto_model_biceps_LimitAlertConditionDescriptorMsg(source.limitAlertConditionDescriptor))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractMetricReportOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractMetricReportOneOfMsg): org.somda.protosdc.biceps.model.AbstractMetricReportOneOf {
        return when (source.abstractMetricReportOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractMetricReportOneOfMsg.AbstractMetricReportOneOfCase.ABSTRACT_METRIC_REPORT -> org.somda.protosdc.biceps.model.AbstractMetricReportOneOf.ChoiceAbstractMetricReport(map_org_somda_protosdc_proto_model_biceps_AbstractMetricReportMsg(source.abstractMetricReport))
            org.somda.protosdc.proto.model.biceps.AbstractMetricReportOneOfMsg.AbstractMetricReportOneOfCase.EPISODIC_METRIC_REPORT -> org.somda.protosdc.biceps.model.AbstractMetricReportOneOf.ChoiceEpisodicMetricReport(map_org_somda_protosdc_proto_model_biceps_EpisodicMetricReportMsg(source.episodicMetricReport))
            org.somda.protosdc.proto.model.biceps.AbstractMetricReportOneOfMsg.AbstractMetricReportOneOfCase.PERIODIC_METRIC_REPORT -> org.somda.protosdc.biceps.model.AbstractMetricReportOneOf.ChoicePeriodicMetricReport(map_org_somda_protosdc_proto_model_biceps_PeriodicMetricReportMsg(source.periodicMetricReport))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_StringMetricDescriptorOneOfMsg(source: org.somda.protosdc.proto.model.biceps.StringMetricDescriptorOneOfMsg): org.somda.protosdc.biceps.model.StringMetricDescriptorOneOf {
        return when (source.stringMetricDescriptorOneOfCase) {
            org.somda.protosdc.proto.model.biceps.StringMetricDescriptorOneOfMsg.StringMetricDescriptorOneOfCase.STRING_METRIC_DESCRIPTOR -> org.somda.protosdc.biceps.model.StringMetricDescriptorOneOf.ChoiceStringMetricDescriptor(map_org_somda_protosdc_proto_model_biceps_StringMetricDescriptorMsg(source.stringMetricDescriptor))
            org.somda.protosdc.proto.model.biceps.StringMetricDescriptorOneOfMsg.StringMetricDescriptorOneOfCase.ENUM_STRING_METRIC_DESCRIPTOR -> org.somda.protosdc.biceps.model.StringMetricDescriptorOneOf.ChoiceEnumStringMetricDescriptor(map_org_somda_protosdc_proto_model_biceps_EnumStringMetricDescriptorMsg(source.enumStringMetricDescriptor))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractComponentReportOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractComponentReportOneOfMsg): org.somda.protosdc.biceps.model.AbstractComponentReportOneOf {
        return when (source.abstractComponentReportOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractComponentReportOneOfMsg.AbstractComponentReportOneOfCase.ABSTRACT_COMPONENT_REPORT -> org.somda.protosdc.biceps.model.AbstractComponentReportOneOf.ChoiceAbstractComponentReport(map_org_somda_protosdc_proto_model_biceps_AbstractComponentReportMsg(source.abstractComponentReport))
            org.somda.protosdc.proto.model.biceps.AbstractComponentReportOneOfMsg.AbstractComponentReportOneOfCase.EPISODIC_COMPONENT_REPORT -> org.somda.protosdc.biceps.model.AbstractComponentReportOneOf.ChoiceEpisodicComponentReport(map_org_somda_protosdc_proto_model_biceps_EpisodicComponentReportMsg(source.episodicComponentReport))
            org.somda.protosdc.proto.model.biceps.AbstractComponentReportOneOfMsg.AbstractComponentReportOneOfCase.PERIODIC_COMPONENT_REPORT -> org.somda.protosdc.biceps.model.AbstractComponentReportOneOf.ChoicePeriodicComponentReport(map_org_somda_protosdc_proto_model_biceps_PeriodicComponentReportMsg(source.periodicComponentReport))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_ChannelDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.ChannelDescriptorMsg): org.somda.protosdc.biceps.model.ChannelDescriptor {
        return org.somda.protosdc.biceps.model.ChannelDescriptor(
            abstractDeviceComponentDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentDescriptorMsg(source.abstractDeviceComponentDescriptor),
            metric = source.metricList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractMetricDescriptorOneOfMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_VmdDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.VmdDescriptorMsg): org.somda.protosdc.biceps.model.VmdDescriptor {
        return org.somda.protosdc.biceps.model.VmdDescriptor(
            abstractComplexDeviceComponentDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractComplexDeviceComponentDescriptorMsg(source.abstractComplexDeviceComponentDescriptor),
            approvedJurisdictions = when (source.hasApprovedJurisdictions()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ApprovedJurisdictionsMsg(source.approvedJurisdictions)
                false -> null
            },
            channel = source.channelList.toList().map { map_org_somda_protosdc_proto_model_biceps_ChannelDescriptorMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_MdsDescriptorMsg_MetaDataMsg_UdiMsg(source: org.somda.protosdc.proto.model.biceps.MdsDescriptorMsg.MetaDataMsg.UdiMsg): org.somda.protosdc.biceps.model.MdsDescriptor.MetaData.Udi {
        return org.somda.protosdc.biceps.model.MdsDescriptor.MetaData.Udi(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            deviceIdentifier = source.deviceIdentifier,
            humanReadableForm = source.humanReadableForm,
            issuer = map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(source.issuer),
            jurisdiction = when (source.hasJurisdiction()) {
                true -> map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(source.jurisdiction)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_MdsDescriptorMsg_MetaDataMsg(source: org.somda.protosdc.proto.model.biceps.MdsDescriptorMsg.MetaDataMsg): org.somda.protosdc.biceps.model.MdsDescriptor.MetaData {
        return org.somda.protosdc.biceps.model.MdsDescriptor.MetaData(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            udi = source.udiList.toList().map { map_org_somda_protosdc_proto_model_biceps_MdsDescriptorMsg_MetaDataMsg_UdiMsg(it) }.toList(),
            lotNumber = when (source.hasLotNumber()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.lotNumber)
                false -> null
            },
            manufacturer = source.manufacturerList.toList().map { map_org_somda_protosdc_proto_model_biceps_LocalizedTextMsg(it) }.toList(),
            manufactureDate = when (source.hasManufactureDate()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapOptionalLocalDateTime(source.manufactureDate)
                false -> null
            },
            expirationDate = when (source.hasExpirationDate()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapOptionalLocalDateTime(source.expirationDate)
                false -> null
            },
            modelName = source.modelNameList.toList().map { map_org_somda_protosdc_proto_model_biceps_LocalizedTextMsg(it) }.toList(),
            modelNumber = when (source.hasModelNumber()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.modelNumber)
                false -> null
            },
            serialNumber = source.serialNumberList.toList().map { it }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_MdsDescriptorMsg(source: org.somda.protosdc.proto.model.biceps.MdsDescriptorMsg): org.somda.protosdc.biceps.model.MdsDescriptor {
        return org.somda.protosdc.biceps.model.MdsDescriptor(
            abstractComplexDeviceComponentDescriptor = map_org_somda_protosdc_proto_model_biceps_AbstractComplexDeviceComponentDescriptorMsg(source.abstractComplexDeviceComponentDescriptor),
            metaData = when (source.hasMetaData()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MdsDescriptorMsg_MetaDataMsg(source.metaData)
                false -> null
            },
            systemContext = when (source.hasSystemContext()) {
                true -> map_org_somda_protosdc_proto_model_biceps_SystemContextDescriptorMsg(source.systemContext)
                false -> null
            },
            clock = when (source.hasClock()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ClockDescriptorMsg(source.clock)
                false -> null
            },
            battery = source.batteryList.toList().map { map_org_somda_protosdc_proto_model_biceps_BatteryDescriptorMsg(it) }.toList(),
            approvedJurisdictions = when (source.hasApprovedJurisdictions()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ApprovedJurisdictionsMsg(source.approvedJurisdictions)
                false -> null
            },
            vmd = source.vmdList.toList().map { map_org_somda_protosdc_proto_model_biceps_VmdDescriptorMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_MdDescriptionMsg(source: org.somda.protosdc.proto.model.biceps.MdDescriptionMsg): org.somda.protosdc.biceps.model.MdDescription {
        return org.somda.protosdc.biceps.model.MdDescription(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            mds = source.mdsList.toList().map { map_org_somda_protosdc_proto_model_biceps_MdsDescriptorMsg(it) }.toList(),
            descriptionVersionAttr = when (source.hasDescriptionVersionAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_VersionCounterMsg(source.descriptionVersionAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetMdDescriptionResponseMsg(source: org.somda.protosdc.proto.model.biceps.GetMdDescriptionResponseMsg): org.somda.protosdc.biceps.model.GetMdDescriptionResponse {
        return org.somda.protosdc.biceps.model.GetMdDescriptionResponse(
            abstractGetResponse = map_org_somda_protosdc_proto_model_biceps_AbstractGetResponseMsg(source.abstractGetResponse),
            mdDescription = map_org_somda_protosdc_proto_model_biceps_MdDescriptionMsg(source.mdDescription),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractDescriptorOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg): org.somda.protosdc.biceps.model.AbstractDescriptorOneOf {
        return when (source.abstractDescriptorOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.ABSTRACT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceAbstractDescriptor(map_org_somda_protosdc_proto_model_biceps_AbstractDescriptorMsg(source.abstractDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.ABSTRACT_ALERT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceAbstractAlertDescriptor(map_org_somda_protosdc_proto_model_biceps_AbstractAlertDescriptorMsg(source.abstractAlertDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.ABSTRACT_COMPLEX_DEVICE_COMPONENT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceAbstractComplexDeviceComponentDescriptor(map_org_somda_protosdc_proto_model_biceps_AbstractComplexDeviceComponentDescriptorMsg(source.abstractComplexDeviceComponentDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.ABSTRACT_CONTEXT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceAbstractContextDescriptor(map_org_somda_protosdc_proto_model_biceps_AbstractContextDescriptorMsg(source.abstractContextDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.ABSTRACT_DEVICE_COMPONENT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceAbstractDeviceComponentDescriptor(map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentDescriptorMsg(source.abstractDeviceComponentDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.ABSTRACT_METRIC_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceAbstractMetricDescriptor(map_org_somda_protosdc_proto_model_biceps_AbstractMetricDescriptorMsg(source.abstractMetricDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.ABSTRACT_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceAbstractOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_AbstractOperationDescriptorMsg(source.abstractOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.ABSTRACT_SET_STATE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceAbstractSetStateOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_AbstractSetStateOperationDescriptorMsg(source.abstractSetStateOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.ACTIVATE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceActivateOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_ActivateOperationDescriptorMsg(source.activateOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.ALERT_CONDITION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceAlertConditionDescriptor(map_org_somda_protosdc_proto_model_biceps_AlertConditionDescriptorMsg(source.alertConditionDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.ALERT_SIGNAL_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceAlertSignalDescriptor(map_org_somda_protosdc_proto_model_biceps_AlertSignalDescriptorMsg(source.alertSignalDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.ALERT_SYSTEM_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceAlertSystemDescriptor(map_org_somda_protosdc_proto_model_biceps_AlertSystemDescriptorMsg(source.alertSystemDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.BATTERY_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceBatteryDescriptor(map_org_somda_protosdc_proto_model_biceps_BatteryDescriptorMsg(source.batteryDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.CHANNEL_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceChannelDescriptor(map_org_somda_protosdc_proto_model_biceps_ChannelDescriptorMsg(source.channelDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.CLOCK_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceClockDescriptor(map_org_somda_protosdc_proto_model_biceps_ClockDescriptorMsg(source.clockDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.DISTRIBUTION_SAMPLE_ARRAY_METRIC_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceDistributionSampleArrayMetricDescriptor(map_org_somda_protosdc_proto_model_biceps_DistributionSampleArrayMetricDescriptorMsg(source.distributionSampleArrayMetricDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.ENSEMBLE_CONTEXT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceEnsembleContextDescriptor(map_org_somda_protosdc_proto_model_biceps_EnsembleContextDescriptorMsg(source.ensembleContextDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.ENUM_STRING_METRIC_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceEnumStringMetricDescriptor(map_org_somda_protosdc_proto_model_biceps_EnumStringMetricDescriptorMsg(source.enumStringMetricDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.LIMIT_ALERT_CONDITION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceLimitAlertConditionDescriptor(map_org_somda_protosdc_proto_model_biceps_LimitAlertConditionDescriptorMsg(source.limitAlertConditionDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.LOCATION_CONTEXT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceLocationContextDescriptor(map_org_somda_protosdc_proto_model_biceps_LocationContextDescriptorMsg(source.locationContextDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.MDS_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceMdsDescriptor(map_org_somda_protosdc_proto_model_biceps_MdsDescriptorMsg(source.mdsDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.MEANS_CONTEXT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceMeansContextDescriptor(map_org_somda_protosdc_proto_model_biceps_MeansContextDescriptorMsg(source.meansContextDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.NUMERIC_METRIC_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceNumericMetricDescriptor(map_org_somda_protosdc_proto_model_biceps_NumericMetricDescriptorMsg(source.numericMetricDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.OPERATOR_CONTEXT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceOperatorContextDescriptor(map_org_somda_protosdc_proto_model_biceps_OperatorContextDescriptorMsg(source.operatorContextDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.PATIENT_CONTEXT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoicePatientContextDescriptor(map_org_somda_protosdc_proto_model_biceps_PatientContextDescriptorMsg(source.patientContextDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.REAL_TIME_SAMPLE_ARRAY_METRIC_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceRealTimeSampleArrayMetricDescriptor(map_org_somda_protosdc_proto_model_biceps_RealTimeSampleArrayMetricDescriptorMsg(source.realTimeSampleArrayMetricDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.SCO_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceScoDescriptor(map_org_somda_protosdc_proto_model_biceps_ScoDescriptorMsg(source.scoDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.SET_ALERT_STATE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceSetAlertStateOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_SetAlertStateOperationDescriptorMsg(source.setAlertStateOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.SET_COMPONENT_STATE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceSetComponentStateOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_SetComponentStateOperationDescriptorMsg(source.setComponentStateOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.SET_CONTEXT_STATE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceSetContextStateOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_SetContextStateOperationDescriptorMsg(source.setContextStateOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.SET_METRIC_STATE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceSetMetricStateOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_SetMetricStateOperationDescriptorMsg(source.setMetricStateOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.SET_STRING_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceSetStringOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_SetStringOperationDescriptorMsg(source.setStringOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.SET_VALUE_OPERATION_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceSetValueOperationDescriptor(map_org_somda_protosdc_proto_model_biceps_SetValueOperationDescriptorMsg(source.setValueOperationDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.STRING_METRIC_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceStringMetricDescriptor(map_org_somda_protosdc_proto_model_biceps_StringMetricDescriptorMsg(source.stringMetricDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.SYSTEM_CONTEXT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceSystemContextDescriptor(map_org_somda_protosdc_proto_model_biceps_SystemContextDescriptorMsg(source.systemContextDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.VMD_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceVmdDescriptor(map_org_somda_protosdc_proto_model_biceps_VmdDescriptorMsg(source.vmdDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDescriptorOneOfMsg.AbstractDescriptorOneOfCase.WORKFLOW_CONTEXT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDescriptorOneOf.ChoiceWorkflowContextDescriptor(map_org_somda_protosdc_proto_model_biceps_WorkflowContextDescriptorMsg(source.workflowContextDescriptor))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentDescriptorOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg): org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf {
        return when (source.abstractDeviceComponentDescriptorOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg.AbstractDeviceComponentDescriptorOneOfCase.ABSTRACT_DEVICE_COMPONENT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf.ChoiceAbstractDeviceComponentDescriptor(map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentDescriptorMsg(source.abstractDeviceComponentDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg.AbstractDeviceComponentDescriptorOneOfCase.ABSTRACT_COMPLEX_DEVICE_COMPONENT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf.ChoiceAbstractComplexDeviceComponentDescriptor(map_org_somda_protosdc_proto_model_biceps_AbstractComplexDeviceComponentDescriptorMsg(source.abstractComplexDeviceComponentDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg.AbstractDeviceComponentDescriptorOneOfCase.BATTERY_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf.ChoiceBatteryDescriptor(map_org_somda_protosdc_proto_model_biceps_BatteryDescriptorMsg(source.batteryDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg.AbstractDeviceComponentDescriptorOneOfCase.CHANNEL_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf.ChoiceChannelDescriptor(map_org_somda_protosdc_proto_model_biceps_ChannelDescriptorMsg(source.channelDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg.AbstractDeviceComponentDescriptorOneOfCase.CLOCK_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf.ChoiceClockDescriptor(map_org_somda_protosdc_proto_model_biceps_ClockDescriptorMsg(source.clockDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg.AbstractDeviceComponentDescriptorOneOfCase.MDS_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf.ChoiceMdsDescriptor(map_org_somda_protosdc_proto_model_biceps_MdsDescriptorMsg(source.mdsDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg.AbstractDeviceComponentDescriptorOneOfCase.SCO_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf.ChoiceScoDescriptor(map_org_somda_protosdc_proto_model_biceps_ScoDescriptorMsg(source.scoDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg.AbstractDeviceComponentDescriptorOneOfCase.SYSTEM_CONTEXT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf.ChoiceSystemContextDescriptor(map_org_somda_protosdc_proto_model_biceps_SystemContextDescriptorMsg(source.systemContextDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractDeviceComponentDescriptorOneOfMsg.AbstractDeviceComponentDescriptorOneOfCase.VMD_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractDeviceComponentDescriptorOneOf.ChoiceVmdDescriptor(map_org_somda_protosdc_proto_model_biceps_VmdDescriptorMsg(source.vmdDescriptor))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractComplexDeviceComponentDescriptorOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentDescriptorOneOfMsg): org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentDescriptorOneOf {
        return when (source.abstractComplexDeviceComponentDescriptorOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentDescriptorOneOfMsg.AbstractComplexDeviceComponentDescriptorOneOfCase.ABSTRACT_COMPLEX_DEVICE_COMPONENT_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentDescriptorOneOf.ChoiceAbstractComplexDeviceComponentDescriptor(map_org_somda_protosdc_proto_model_biceps_AbstractComplexDeviceComponentDescriptorMsg(source.abstractComplexDeviceComponentDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentDescriptorOneOfMsg.AbstractComplexDeviceComponentDescriptorOneOfCase.MDS_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentDescriptorOneOf.ChoiceMdsDescriptor(map_org_somda_protosdc_proto_model_biceps_MdsDescriptorMsg(source.mdsDescriptor))
            org.somda.protosdc.proto.model.biceps.AbstractComplexDeviceComponentDescriptorOneOfMsg.AbstractComplexDeviceComponentDescriptorOneOfCase.VMD_DESCRIPTOR -> org.somda.protosdc.biceps.model.AbstractComplexDeviceComponentDescriptorOneOf.ChoiceVmdDescriptor(map_org_somda_protosdc_proto_model_biceps_VmdDescriptorMsg(source.vmdDescriptor))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetDescriptorResponseMsg(source: org.somda.protosdc.proto.model.biceps.GetDescriptorResponseMsg): org.somda.protosdc.biceps.model.GetDescriptorResponse {
        return org.somda.protosdc.biceps.model.GetDescriptorResponse(
            abstractGetResponse = map_org_somda_protosdc_proto_model_biceps_AbstractGetResponseMsg(source.abstractGetResponse),
            descriptor = source.pDescriptorList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractDescriptorOneOfMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetDescriptorsFromArchiveResponseMsg(source: org.somda.protosdc.proto.model.biceps.GetDescriptorsFromArchiveResponseMsg): org.somda.protosdc.biceps.model.GetDescriptorsFromArchiveResponse {
        return org.somda.protosdc.biceps.model.GetDescriptorsFromArchiveResponse(
            abstractGetResponse = map_org_somda_protosdc_proto_model_biceps_AbstractGetResponseMsg(source.abstractGetResponse),
            descriptor = source.pDescriptorList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractDescriptorOneOfMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_BaseDemographicsOneOfMsg(source: org.somda.protosdc.proto.model.biceps.BaseDemographicsOneOfMsg): org.somda.protosdc.biceps.model.BaseDemographicsOneOf {
        return when (source.baseDemographicsOneOfCase) {
            org.somda.protosdc.proto.model.biceps.BaseDemographicsOneOfMsg.BaseDemographicsOneOfCase.BASE_DEMOGRAPHICS -> org.somda.protosdc.biceps.model.BaseDemographicsOneOf.ChoiceBaseDemographics(map_org_somda_protosdc_proto_model_biceps_BaseDemographicsMsg(source.baseDemographics))
            org.somda.protosdc.proto.model.biceps.BaseDemographicsOneOfMsg.BaseDemographicsOneOfCase.NEONATAL_PATIENT_DEMOGRAPHICS_CORE_DATA -> org.somda.protosdc.biceps.model.BaseDemographicsOneOf.ChoiceNeonatalPatientDemographicsCoreData(map_org_somda_protosdc_biceps_model_NeonatalPatientDemographicsCoreData(source.neonatalPatientDemographicsCoreData))
            org.somda.protosdc.proto.model.biceps.BaseDemographicsOneOfMsg.BaseDemographicsOneOfCase.PATIENT_DEMOGRAPHICS_CORE_DATA -> org.somda.protosdc.biceps.model.BaseDemographicsOneOf.ChoicePatientDemographicsCoreData(map_org_somda_protosdc_proto_model_biceps_PatientDemographicsCoreDataMsg(source.patientDemographicsCoreData))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_PersonReferenceMsg(source: org.somda.protosdc.proto.model.biceps.PersonReferenceMsg): org.somda.protosdc.biceps.model.PersonReference {
        return org.somda.protosdc.biceps.model.PersonReference(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            identification = source.identificationList.toList().map { map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(it) }.toList(),
            name = when (source.hasName()) {
                true -> map_org_somda_protosdc_proto_model_biceps_BaseDemographicsOneOfMsg(source.name)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_PersonParticipationMsg(source: org.somda.protosdc.proto.model.biceps.PersonParticipationMsg): org.somda.protosdc.biceps.model.PersonParticipation {
        return org.somda.protosdc.biceps.model.PersonParticipation(
            personReference = map_org_somda_protosdc_proto_model_biceps_PersonReferenceMsg(source.personReference),
            role = source.roleList.toList().map { map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_OrderDetailMsg(source: org.somda.protosdc.proto.model.biceps.OrderDetailMsg): org.somda.protosdc.biceps.model.OrderDetail {
        return org.somda.protosdc.biceps.model.OrderDetail(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            start = when (source.hasStart()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapOptionalLocalDateTime(source.start)
                false -> null
            },
            end = when (source.hasEnd()) {
                true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapOptionalLocalDateTime(source.end)
                false -> null
            },
            performer = source.performerList.toList().map { map_org_somda_protosdc_proto_model_biceps_PersonParticipationMsg(it) }.toList(),
            service = source.serviceList.toList().map { map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(it) }.toList(),
            imagingProcedure = source.imagingProcedureList.toList().map { map_org_somda_protosdc_proto_model_biceps_ImagingProcedureMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_OperatorContextStateMsg(source: org.somda.protosdc.proto.model.biceps.OperatorContextStateMsg): org.somda.protosdc.biceps.model.OperatorContextState {
        return org.somda.protosdc.biceps.model.OperatorContextState(
            abstractContextState = map_org_somda_protosdc_proto_model_biceps_AbstractContextStateMsg(source.abstractContextState),
            operatorDetails = when (source.hasOperatorDetails()) {
                true -> map_org_somda_protosdc_proto_model_biceps_BaseDemographicsOneOfMsg(source.operatorDetails)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_PersonReferenceOneOfMsg(source: org.somda.protosdc.proto.model.biceps.PersonReferenceOneOfMsg): org.somda.protosdc.biceps.model.PersonReferenceOneOf {
        return when (source.personReferenceOneOfCase) {
            org.somda.protosdc.proto.model.biceps.PersonReferenceOneOfMsg.PersonReferenceOneOfCase.PERSON_REFERENCE -> org.somda.protosdc.biceps.model.PersonReferenceOneOf.ChoicePersonReference(map_org_somda_protosdc_proto_model_biceps_PersonReferenceMsg(source.personReference))
            org.somda.protosdc.proto.model.biceps.PersonReferenceOneOfMsg.PersonReferenceOneOfCase.PERSON_PARTICIPATION -> org.somda.protosdc.biceps.model.PersonReferenceOneOf.ChoicePersonParticipation(map_org_somda_protosdc_proto_model_biceps_PersonParticipationMsg(source.personParticipation))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_NeonatalPatientDemographicsCoreDataMsg(source: org.somda.protosdc.proto.model.biceps.NeonatalPatientDemographicsCoreDataMsg): org.somda.protosdc.biceps.model.NeonatalPatientDemographicsCoreData {
        return org.somda.protosdc.biceps.model.NeonatalPatientDemographicsCoreData(
            patientDemographicsCoreData = map_org_somda_protosdc_proto_model_biceps_PatientDemographicsCoreDataMsg(source.patientDemographicsCoreData),
            gestationalAge = when (source.hasGestationalAge()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MeasurementMsg(source.gestationalAge)
                false -> null
            },
            birthLength = when (source.hasBirthLength()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MeasurementMsg(source.birthLength)
                false -> null
            },
            birthWeight = when (source.hasBirthWeight()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MeasurementMsg(source.birthWeight)
                false -> null
            },
            headCircumference = when (source.hasHeadCircumference()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MeasurementMsg(source.headCircumference)
                false -> null
            },
            mother = when (source.hasMother()) {
                true -> map_org_somda_protosdc_proto_model_biceps_PersonReferenceOneOfMsg(source.mother)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_WorkflowContextStateMsg_WorkflowDetailMsg_RequestedOrderDetailMsg(source: org.somda.protosdc.proto.model.biceps.WorkflowContextStateMsg.WorkflowDetailMsg.RequestedOrderDetailMsg): org.somda.protosdc.biceps.model.WorkflowContextState.WorkflowDetail.RequestedOrderDetail {
        return org.somda.protosdc.biceps.model.WorkflowContextState.WorkflowDetail.RequestedOrderDetail(
            orderDetail = map_org_somda_protosdc_proto_model_biceps_OrderDetailMsg(source.orderDetail),
            referringPhysician = when (source.hasReferringPhysician()) {
                true -> map_org_somda_protosdc_proto_model_biceps_PersonReferenceOneOfMsg(source.referringPhysician)
                false -> null
            },
            requestingPhysician = when (source.hasRequestingPhysician()) {
                true -> map_org_somda_protosdc_proto_model_biceps_PersonReferenceOneOfMsg(source.requestingPhysician)
                false -> null
            },
            placerOrderNumber = map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(source.placerOrderNumber),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_WorkflowContextStateMsg_WorkflowDetailMsg_PerformedOrderDetailMsg(source: org.somda.protosdc.proto.model.biceps.WorkflowContextStateMsg.WorkflowDetailMsg.PerformedOrderDetailMsg): org.somda.protosdc.biceps.model.WorkflowContextState.WorkflowDetail.PerformedOrderDetail {
        return org.somda.protosdc.biceps.model.WorkflowContextState.WorkflowDetail.PerformedOrderDetail(
            orderDetail = map_org_somda_protosdc_proto_model_biceps_OrderDetailMsg(source.orderDetail),
            fillerOrderNumber = when (source.hasFillerOrderNumber()) {
                true -> map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(source.fillerOrderNumber)
                false -> null
            },
            resultingClinicalInfo = source.resultingClinicalInfoList.toList().map { map_org_somda_protosdc_proto_model_biceps_ClinicalInfoMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_WorkflowContextStateMsg_WorkflowDetailMsg(source: org.somda.protosdc.proto.model.biceps.WorkflowContextStateMsg.WorkflowDetailMsg): org.somda.protosdc.biceps.model.WorkflowContextState.WorkflowDetail {
        return org.somda.protosdc.biceps.model.WorkflowContextState.WorkflowDetail(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            patient = map_org_somda_protosdc_proto_model_biceps_PersonReferenceOneOfMsg(source.patient),
            assignedLocation = when (source.hasAssignedLocation()) {
                true -> map_org_somda_protosdc_proto_model_biceps_LocationReferenceMsg(source.assignedLocation)
                false -> null
            },
            visitNumber = when (source.hasVisitNumber()) {
                true -> map_org_somda_protosdc_proto_model_biceps_InstanceIdentifierOneOfMsg(source.visitNumber)
                false -> null
            },
            dangerCode = source.dangerCodeList.toList().map { map_org_somda_protosdc_proto_model_biceps_CodedValueMsg(it) }.toList(),
            relevantClinicalInfo = source.relevantClinicalInfoList.toList().map { map_org_somda_protosdc_proto_model_biceps_ClinicalInfoMsg(it) }.toList(),
            requestedOrderDetail = when (source.hasRequestedOrderDetail()) {
                true -> map_org_somda_protosdc_proto_model_biceps_WorkflowContextStateMsg_WorkflowDetailMsg_RequestedOrderDetailMsg(source.requestedOrderDetail)
                false -> null
            },
            performedOrderDetail = when (source.hasPerformedOrderDetail()) {
                true -> map_org_somda_protosdc_proto_model_biceps_WorkflowContextStateMsg_WorkflowDetailMsg_PerformedOrderDetailMsg(source.performedOrderDetail)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_WorkflowContextStateMsg(source: org.somda.protosdc.proto.model.biceps.WorkflowContextStateMsg): org.somda.protosdc.biceps.model.WorkflowContextState {
        return org.somda.protosdc.biceps.model.WorkflowContextState(
            abstractContextState = map_org_somda_protosdc_proto_model_biceps_AbstractContextStateMsg(source.abstractContextState),
            workflowDetail = when (source.hasWorkflowDetail()) {
                true -> map_org_somda_protosdc_proto_model_biceps_WorkflowContextStateMsg_WorkflowDetailMsg(source.workflowDetail)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_PatientDemographicsCoreDataOneOfMsg(source: org.somda.protosdc.proto.model.biceps.PatientDemographicsCoreDataOneOfMsg): org.somda.protosdc.biceps.model.PatientDemographicsCoreDataOneOf {
        return when (source.patientDemographicsCoreDataOneOfCase) {
            org.somda.protosdc.proto.model.biceps.PatientDemographicsCoreDataOneOfMsg.PatientDemographicsCoreDataOneOfCase.PATIENT_DEMOGRAPHICS_CORE_DATA -> org.somda.protosdc.biceps.model.PatientDemographicsCoreDataOneOf.ChoicePatientDemographicsCoreData(map_org_somda_protosdc_proto_model_biceps_PatientDemographicsCoreDataMsg(source.patientDemographicsCoreData))
            org.somda.protosdc.proto.model.biceps.PatientDemographicsCoreDataOneOfMsg.PatientDemographicsCoreDataOneOfCase.NEONATAL_PATIENT_DEMOGRAPHICS_CORE_DATA -> org.somda.protosdc.biceps.model.PatientDemographicsCoreDataOneOf.ChoiceNeonatalPatientDemographicsCoreData(map_org_somda_protosdc_proto_model_biceps_NeonatalPatientDemographicsCoreDataMsg(source.neonatalPatientDemographicsCoreData))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_PatientContextStateMsg(source: org.somda.protosdc.proto.model.biceps.PatientContextStateMsg): org.somda.protosdc.biceps.model.PatientContextState {
        return org.somda.protosdc.biceps.model.PatientContextState(
            abstractContextState = map_org_somda_protosdc_proto_model_biceps_AbstractContextStateMsg(source.abstractContextState),
            coreData = when (source.hasCoreData()) {
                true -> map_org_somda_protosdc_proto_model_biceps_PatientDemographicsCoreDataOneOfMsg(source.coreData)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractStateOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg): org.somda.protosdc.biceps.model.AbstractStateOneOf {
        return when (source.abstractStateOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.ABSTRACT_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceAbstractState(map_org_somda_protosdc_proto_model_biceps_AbstractStateMsg(source.abstractState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.ABSTRACT_ALERT_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceAbstractAlertState(map_org_somda_protosdc_proto_model_biceps_AbstractAlertStateMsg(source.abstractAlertState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.ABSTRACT_COMPLEX_DEVICE_COMPONENT_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceAbstractComplexDeviceComponentState(map_org_somda_protosdc_proto_model_biceps_AbstractComplexDeviceComponentStateMsg(source.abstractComplexDeviceComponentState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.ABSTRACT_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceAbstractContextState(map_org_somda_protosdc_proto_model_biceps_AbstractContextStateMsg(source.abstractContextState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.ABSTRACT_DEVICE_COMPONENT_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceAbstractDeviceComponentState(map_org_somda_protosdc_proto_model_biceps_AbstractDeviceComponentStateMsg(source.abstractDeviceComponentState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.ABSTRACT_METRIC_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceAbstractMetricState(map_org_somda_protosdc_proto_model_biceps_AbstractMetricStateMsg(source.abstractMetricState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.ABSTRACT_MULTI_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceAbstractMultiState(map_org_somda_protosdc_proto_model_biceps_AbstractMultiStateMsg(source.abstractMultiState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.ABSTRACT_OPERATION_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceAbstractOperationState(map_org_somda_protosdc_proto_model_biceps_AbstractOperationStateMsg(source.abstractOperationState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.ACTIVATE_OPERATION_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceActivateOperationState(map_org_somda_protosdc_proto_model_biceps_ActivateOperationStateMsg(source.activateOperationState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.ALERT_CONDITION_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceAlertConditionState(map_org_somda_protosdc_proto_model_biceps_AlertConditionStateMsg(source.alertConditionState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.ALERT_SIGNAL_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceAlertSignalState(map_org_somda_protosdc_proto_model_biceps_AlertSignalStateMsg(source.alertSignalState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.ALERT_SYSTEM_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceAlertSystemState(map_org_somda_protosdc_proto_model_biceps_AlertSystemStateMsg(source.alertSystemState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.BATTERY_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceBatteryState(map_org_somda_protosdc_proto_model_biceps_BatteryStateMsg(source.batteryState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.CHANNEL_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceChannelState(map_org_somda_protosdc_proto_model_biceps_ChannelStateMsg(source.channelState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.CLOCK_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceClockState(map_org_somda_protosdc_proto_model_biceps_ClockStateMsg(source.clockState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.DISTRIBUTION_SAMPLE_ARRAY_METRIC_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceDistributionSampleArrayMetricState(map_org_somda_protosdc_proto_model_biceps_DistributionSampleArrayMetricStateMsg(source.distributionSampleArrayMetricState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.ENSEMBLE_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceEnsembleContextState(map_org_somda_protosdc_proto_model_biceps_EnsembleContextStateMsg(source.ensembleContextState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.ENUM_STRING_METRIC_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceEnumStringMetricState(map_org_somda_protosdc_proto_model_biceps_EnumStringMetricStateMsg(source.enumStringMetricState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.LIMIT_ALERT_CONDITION_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceLimitAlertConditionState(map_org_somda_protosdc_proto_model_biceps_LimitAlertConditionStateMsg(source.limitAlertConditionState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.LOCATION_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceLocationContextState(map_org_somda_protosdc_proto_model_biceps_LocationContextStateMsg(source.locationContextState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.MDS_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceMdsState(map_org_somda_protosdc_proto_model_biceps_MdsStateMsg(source.mdsState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.MEANS_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceMeansContextState(map_org_somda_protosdc_proto_model_biceps_MeansContextStateMsg(source.meansContextState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.NUMERIC_METRIC_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceNumericMetricState(map_org_somda_protosdc_proto_model_biceps_NumericMetricStateMsg(source.numericMetricState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.OPERATOR_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceOperatorContextState(map_org_somda_protosdc_proto_model_biceps_OperatorContextStateMsg(source.operatorContextState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.PATIENT_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoicePatientContextState(map_org_somda_protosdc_proto_model_biceps_PatientContextStateMsg(source.patientContextState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.REAL_TIME_SAMPLE_ARRAY_METRIC_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceRealTimeSampleArrayMetricState(map_org_somda_protosdc_proto_model_biceps_RealTimeSampleArrayMetricStateMsg(source.realTimeSampleArrayMetricState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.SCO_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceScoState(map_org_somda_protosdc_proto_model_biceps_ScoStateMsg(source.scoState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.SET_ALERT_STATE_OPERATION_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceSetAlertStateOperationState(map_org_somda_protosdc_proto_model_biceps_SetAlertStateOperationStateMsg(source.setAlertStateOperationState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.SET_COMPONENT_STATE_OPERATION_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceSetComponentStateOperationState(map_org_somda_protosdc_proto_model_biceps_SetComponentStateOperationStateMsg(source.setComponentStateOperationState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.SET_CONTEXT_STATE_OPERATION_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceSetContextStateOperationState(map_org_somda_protosdc_proto_model_biceps_SetContextStateOperationStateMsg(source.setContextStateOperationState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.SET_METRIC_STATE_OPERATION_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceSetMetricStateOperationState(map_org_somda_protosdc_proto_model_biceps_SetMetricStateOperationStateMsg(source.setMetricStateOperationState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.SET_STRING_OPERATION_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceSetStringOperationState(map_org_somda_protosdc_proto_model_biceps_SetStringOperationStateMsg(source.setStringOperationState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.SET_VALUE_OPERATION_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceSetValueOperationState(map_org_somda_protosdc_proto_model_biceps_SetValueOperationStateMsg(source.setValueOperationState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.STRING_METRIC_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceStringMetricState(map_org_somda_protosdc_proto_model_biceps_StringMetricStateMsg(source.stringMetricState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.SYSTEM_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceSystemContextState(map_org_somda_protosdc_proto_model_biceps_SystemContextStateMsg(source.systemContextState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.VMD_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceVmdState(map_org_somda_protosdc_proto_model_biceps_VmdStateMsg(source.vmdState))
            org.somda.protosdc.proto.model.biceps.AbstractStateOneOfMsg.AbstractStateOneOfCase.WORKFLOW_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractStateOneOf.ChoiceWorkflowContextState(map_org_somda_protosdc_proto_model_biceps_WorkflowContextStateMsg(source.workflowContextState))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractMultiStateOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractMultiStateOneOfMsg): org.somda.protosdc.biceps.model.AbstractMultiStateOneOf {
        return when (source.abstractMultiStateOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractMultiStateOneOfMsg.AbstractMultiStateOneOfCase.ABSTRACT_MULTI_STATE -> org.somda.protosdc.biceps.model.AbstractMultiStateOneOf.ChoiceAbstractMultiState(map_org_somda_protosdc_proto_model_biceps_AbstractMultiStateMsg(source.abstractMultiState))
            org.somda.protosdc.proto.model.biceps.AbstractMultiStateOneOfMsg.AbstractMultiStateOneOfCase.ABSTRACT_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractMultiStateOneOf.ChoiceAbstractContextState(map_org_somda_protosdc_proto_model_biceps_AbstractContextStateMsg(source.abstractContextState))
            org.somda.protosdc.proto.model.biceps.AbstractMultiStateOneOfMsg.AbstractMultiStateOneOfCase.ENSEMBLE_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractMultiStateOneOf.ChoiceEnsembleContextState(map_org_somda_protosdc_proto_model_biceps_EnsembleContextStateMsg(source.ensembleContextState))
            org.somda.protosdc.proto.model.biceps.AbstractMultiStateOneOfMsg.AbstractMultiStateOneOfCase.LOCATION_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractMultiStateOneOf.ChoiceLocationContextState(map_org_somda_protosdc_proto_model_biceps_LocationContextStateMsg(source.locationContextState))
            org.somda.protosdc.proto.model.biceps.AbstractMultiStateOneOfMsg.AbstractMultiStateOneOfCase.MEANS_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractMultiStateOneOf.ChoiceMeansContextState(map_org_somda_protosdc_proto_model_biceps_MeansContextStateMsg(source.meansContextState))
            org.somda.protosdc.proto.model.biceps.AbstractMultiStateOneOfMsg.AbstractMultiStateOneOfCase.OPERATOR_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractMultiStateOneOf.ChoiceOperatorContextState(map_org_somda_protosdc_proto_model_biceps_OperatorContextStateMsg(source.operatorContextState))
            org.somda.protosdc.proto.model.biceps.AbstractMultiStateOneOfMsg.AbstractMultiStateOneOfCase.PATIENT_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractMultiStateOneOf.ChoicePatientContextState(map_org_somda_protosdc_proto_model_biceps_PatientContextStateMsg(source.patientContextState))
            org.somda.protosdc.proto.model.biceps.AbstractMultiStateOneOfMsg.AbstractMultiStateOneOfCase.WORKFLOW_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractMultiStateOneOf.ChoiceWorkflowContextState(map_org_somda_protosdc_proto_model_biceps_WorkflowContextStateMsg(source.workflowContextState))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractContextStateOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractContextStateOneOfMsg): org.somda.protosdc.biceps.model.AbstractContextStateOneOf {
        return when (source.abstractContextStateOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractContextStateOneOfMsg.AbstractContextStateOneOfCase.ABSTRACT_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractContextStateOneOf.ChoiceAbstractContextState(map_org_somda_protosdc_proto_model_biceps_AbstractContextStateMsg(source.abstractContextState))
            org.somda.protosdc.proto.model.biceps.AbstractContextStateOneOfMsg.AbstractContextStateOneOfCase.ENSEMBLE_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractContextStateOneOf.ChoiceEnsembleContextState(map_org_somda_protosdc_proto_model_biceps_EnsembleContextStateMsg(source.ensembleContextState))
            org.somda.protosdc.proto.model.biceps.AbstractContextStateOneOfMsg.AbstractContextStateOneOfCase.LOCATION_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractContextStateOneOf.ChoiceLocationContextState(map_org_somda_protosdc_proto_model_biceps_LocationContextStateMsg(source.locationContextState))
            org.somda.protosdc.proto.model.biceps.AbstractContextStateOneOfMsg.AbstractContextStateOneOfCase.MEANS_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractContextStateOneOf.ChoiceMeansContextState(map_org_somda_protosdc_proto_model_biceps_MeansContextStateMsg(source.meansContextState))
            org.somda.protosdc.proto.model.biceps.AbstractContextStateOneOfMsg.AbstractContextStateOneOfCase.OPERATOR_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractContextStateOneOf.ChoiceOperatorContextState(map_org_somda_protosdc_proto_model_biceps_OperatorContextStateMsg(source.operatorContextState))
            org.somda.protosdc.proto.model.biceps.AbstractContextStateOneOfMsg.AbstractContextStateOneOfCase.PATIENT_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractContextStateOneOf.ChoicePatientContextState(map_org_somda_protosdc_proto_model_biceps_PatientContextStateMsg(source.patientContextState))
            org.somda.protosdc.proto.model.biceps.AbstractContextStateOneOfMsg.AbstractContextStateOneOfCase.WORKFLOW_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractContextStateOneOf.ChoiceWorkflowContextState(map_org_somda_protosdc_proto_model_biceps_WorkflowContextStateMsg(source.workflowContextState))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_MdStateMsg(source: org.somda.protosdc.proto.model.biceps.MdStateMsg): org.somda.protosdc.biceps.model.MdState {
        return org.somda.protosdc.biceps.model.MdState(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            state = source.stateList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractStateOneOfMsg(it) }.toList(),
            stateVersionAttr = when (source.hasStateVersionAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_VersionCounterMsg(source.stateVersionAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetStatesFromArchiveResponseMsg(source: org.somda.protosdc.proto.model.biceps.GetStatesFromArchiveResponseMsg): org.somda.protosdc.biceps.model.GetStatesFromArchiveResponse {
        return org.somda.protosdc.biceps.model.GetStatesFromArchiveResponse(
            abstractGetResponse = map_org_somda_protosdc_proto_model_biceps_AbstractGetResponseMsg(source.abstractGetResponse),
            state = source.stateList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractStateOneOfMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetMdStateResponseMsg(source: org.somda.protosdc.proto.model.biceps.GetMdStateResponseMsg): org.somda.protosdc.biceps.model.GetMdStateResponse {
        return org.somda.protosdc.biceps.model.GetMdStateResponse(
            abstractGetResponse = map_org_somda_protosdc_proto_model_biceps_AbstractGetResponseMsg(source.abstractGetResponse),
            mdState = map_org_somda_protosdc_proto_model_biceps_MdStateMsg(source.mdState),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_DescriptionModificationReportMsg_ReportPartMsg(source: org.somda.protosdc.proto.model.biceps.DescriptionModificationReportMsg.ReportPartMsg): org.somda.protosdc.biceps.model.DescriptionModificationReport.ReportPart {
        return org.somda.protosdc.biceps.model.DescriptionModificationReport.ReportPart(
            abstractReportPart = map_org_somda_protosdc_proto_model_biceps_AbstractReportPartMsg(source.abstractReportPart),
            descriptor = source.pDescriptorList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractDescriptorOneOfMsg(it) }.toList(),
            state = source.stateList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractStateOneOfMsg(it) }.toList(),
            parentDescriptorAttr = when (source.hasParentDescriptorAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_HandleRefMsg(source.parentDescriptorAttr)
                false -> null
            },
            modificationTypeAttr = when (source.hasModificationTypeAttr()) {
                true -> map_org_somda_protosdc_proto_model_biceps_DescriptionModificationTypeMsg(source.modificationTypeAttr)
                false -> null
            },
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_DescriptionModificationReportMsg(source: org.somda.protosdc.proto.model.biceps.DescriptionModificationReportMsg): org.somda.protosdc.biceps.model.DescriptionModificationReport {
        return org.somda.protosdc.biceps.model.DescriptionModificationReport(
            abstractReport = map_org_somda_protosdc_proto_model_biceps_AbstractReportMsg(source.abstractReport),
            reportPart = source.reportPartList.toList().map { map_org_somda_protosdc_proto_model_biceps_DescriptionModificationReportMsg_ReportPartMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetContextStatesByIdentificationResponseMsg(source: org.somda.protosdc.proto.model.biceps.GetContextStatesByIdentificationResponseMsg): org.somda.protosdc.biceps.model.GetContextStatesByIdentificationResponse {
        return org.somda.protosdc.biceps.model.GetContextStatesByIdentificationResponse(
            abstractGetResponse = map_org_somda_protosdc_proto_model_biceps_AbstractGetResponseMsg(source.abstractGetResponse),
            contextState = source.contextStateList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractContextStateOneOfMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetContextStatesResponseMsg(source: org.somda.protosdc.proto.model.biceps.GetContextStatesResponseMsg): org.somda.protosdc.biceps.model.GetContextStatesResponse {
        return org.somda.protosdc.biceps.model.GetContextStatesResponse(
            abstractGetResponse = map_org_somda_protosdc_proto_model_biceps_AbstractGetResponseMsg(source.abstractGetResponse),
            contextState = source.contextStateList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractContextStateOneOfMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_SetContextStateMsg(source: org.somda.protosdc.proto.model.biceps.SetContextStateMsg): org.somda.protosdc.biceps.model.SetContextState {
        return org.somda.protosdc.biceps.model.SetContextState(
            abstractSet = map_org_somda_protosdc_proto_model_biceps_AbstractSetMsg(source.abstractSet),
            proposedContextState = source.proposedContextStateList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractContextStateOneOfMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetContextStatesByFilterResponseMsg(source: org.somda.protosdc.proto.model.biceps.GetContextStatesByFilterResponseMsg): org.somda.protosdc.biceps.model.GetContextStatesByFilterResponse {
        return org.somda.protosdc.biceps.model.GetContextStatesByFilterResponse(
            abstractGetResponse = map_org_somda_protosdc_proto_model_biceps_AbstractGetResponseMsg(source.abstractGetResponse),
            contextState = source.contextStateList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractContextStateOneOfMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractContextReportMsg_ReportPartMsg(source: org.somda.protosdc.proto.model.biceps.AbstractContextReportMsg.ReportPartMsg): org.somda.protosdc.biceps.model.AbstractContextReport.ReportPart {
        return org.somda.protosdc.biceps.model.AbstractContextReport.ReportPart(
            abstractReportPart = map_org_somda_protosdc_proto_model_biceps_AbstractReportPartMsg(source.abstractReportPart),
            contextState = source.contextStateList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractContextStateOneOfMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractContextReportMsg(source: org.somda.protosdc.proto.model.biceps.AbstractContextReportMsg): org.somda.protosdc.biceps.model.AbstractContextReport {
        return org.somda.protosdc.biceps.model.AbstractContextReport(
            abstractReport = map_org_somda_protosdc_proto_model_biceps_AbstractReportMsg(source.abstractReport),
            reportPart = source.reportPartList.toList().map { map_org_somda_protosdc_proto_model_biceps_AbstractContextReportMsg_ReportPartMsg(it) }.toList(),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_PeriodicContextReportMsg(source: org.somda.protosdc.proto.model.biceps.PeriodicContextReportMsg): org.somda.protosdc.biceps.model.PeriodicContextReport {
        return org.somda.protosdc.biceps.model.PeriodicContextReport(
            abstractContextReport = map_org_somda_protosdc_proto_model_biceps_AbstractContextReportMsg(source.abstractContextReport),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_EpisodicContextReportMsg(source: org.somda.protosdc.proto.model.biceps.EpisodicContextReportMsg): org.somda.protosdc.biceps.model.EpisodicContextReport {
        return org.somda.protosdc.biceps.model.EpisodicContextReport(
            abstractContextReport = map_org_somda_protosdc_proto_model_biceps_AbstractContextReportMsg(source.abstractContextReport),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_MdibMsg(source: org.somda.protosdc.proto.model.biceps.MdibMsg): org.somda.protosdc.biceps.model.Mdib {
        return org.somda.protosdc.biceps.model.Mdib(
            extensionElement = when (source.hasExtensionElement()) {
                true -> map_org_somda_protosdc_proto_model_biceps_ExtensionMsg(source.extensionElement)
                false -> null
            },
            mdDescription = when (source.hasMdDescription()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MdDescriptionMsg(source.mdDescription)
                false -> null
            },
            mdState = when (source.hasMdState()) {
                true -> map_org_somda_protosdc_proto_model_biceps_MdStateMsg(source.mdState)
                false -> null
            },
            mdibVersionGroupAttr = map_org_somda_protosdc_proto_model_biceps_MdibVersionGroupMsg(source.mdibVersionGroupAttr),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_GetMdibResponseMsg(source: org.somda.protosdc.proto.model.biceps.GetMdibResponseMsg): org.somda.protosdc.biceps.model.GetMdibResponse {
        return org.somda.protosdc.biceps.model.GetMdibResponse(
            abstractGetResponse = map_org_somda_protosdc_proto_model_biceps_AbstractGetResponseMsg(source.abstractGetResponse),
            mdib = map_org_somda_protosdc_proto_model_biceps_MdibMsg(source.mdib),
        )
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractGetResponseOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg): org.somda.protosdc.biceps.model.AbstractGetResponseOneOf {
        return when (source.abstractGetResponseOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.AbstractGetResponseOneOfCase.ABSTRACT_GET_RESPONSE -> org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.ChoiceAbstractGetResponse(map_org_somda_protosdc_proto_model_biceps_AbstractGetResponseMsg(source.abstractGetResponse))
            org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.AbstractGetResponseOneOfCase.GET_CONTAINMENT_TREE_RESPONSE -> org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.ChoiceGetContainmentTreeResponse(map_org_somda_protosdc_proto_model_biceps_GetContainmentTreeResponseMsg(source.getContainmentTreeResponse))
            org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.AbstractGetResponseOneOfCase.GET_CONTEXT_STATES_BY_FILTER_RESPONSE -> org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.ChoiceGetContextStatesByFilterResponse(map_org_somda_protosdc_proto_model_biceps_GetContextStatesByFilterResponseMsg(source.getContextStatesByFilterResponse))
            org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.AbstractGetResponseOneOfCase.GET_CONTEXT_STATES_BY_IDENTIFICATION_RESPONSE -> org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.ChoiceGetContextStatesByIdentificationResponse(map_org_somda_protosdc_proto_model_biceps_GetContextStatesByIdentificationResponseMsg(source.getContextStatesByIdentificationResponse))
            org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.AbstractGetResponseOneOfCase.GET_CONTEXT_STATES_RESPONSE -> org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.ChoiceGetContextStatesResponse(map_org_somda_protosdc_proto_model_biceps_GetContextStatesResponseMsg(source.getContextStatesResponse))
            org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.AbstractGetResponseOneOfCase.GET_DESCRIPTOR_RESPONSE -> org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.ChoiceGetDescriptorResponse(map_org_somda_protosdc_proto_model_biceps_GetDescriptorResponseMsg(source.getDescriptorResponse))
            org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.AbstractGetResponseOneOfCase.GET_DESCRIPTORS_FROM_ARCHIVE_RESPONSE -> org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.ChoiceGetDescriptorsFromArchiveResponse(map_org_somda_protosdc_proto_model_biceps_GetDescriptorsFromArchiveResponseMsg(source.getDescriptorsFromArchiveResponse))
            org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.AbstractGetResponseOneOfCase.GET_LOCALIZED_TEXT_RESPONSE -> org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.ChoiceGetLocalizedTextResponse(map_org_somda_protosdc_proto_model_biceps_GetLocalizedTextResponseMsg(source.getLocalizedTextResponse))
            org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.AbstractGetResponseOneOfCase.GET_MD_DESCRIPTION_RESPONSE -> org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.ChoiceGetMdDescriptionResponse(map_org_somda_protosdc_proto_model_biceps_GetMdDescriptionResponseMsg(source.getMdDescriptionResponse))
            org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.AbstractGetResponseOneOfCase.GET_MD_STATE_RESPONSE -> org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.ChoiceGetMdStateResponse(map_org_somda_protosdc_proto_model_biceps_GetMdStateResponseMsg(source.getMdStateResponse))
            org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.AbstractGetResponseOneOfCase.GET_MDIB_RESPONSE -> org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.ChoiceGetMdibResponse(map_org_somda_protosdc_proto_model_biceps_GetMdibResponseMsg(source.getMdibResponse))
            org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.AbstractGetResponseOneOfCase.GET_STATES_FROM_ARCHIVE_RESPONSE -> org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.ChoiceGetStatesFromArchiveResponse(map_org_somda_protosdc_proto_model_biceps_GetStatesFromArchiveResponseMsg(source.getStatesFromArchiveResponse))
            org.somda.protosdc.proto.model.biceps.AbstractGetResponseOneOfMsg.AbstractGetResponseOneOfCase.GET_SUPPORTED_LANGUAGES_RESPONSE -> org.somda.protosdc.biceps.model.AbstractGetResponseOneOf.ChoiceGetSupportedLanguagesResponse(map_org_somda_protosdc_proto_model_biceps_GetSupportedLanguagesResponseMsg(source.getSupportedLanguagesResponse))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractSetOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractSetOneOfMsg): org.somda.protosdc.biceps.model.AbstractSetOneOf {
        return when (source.abstractSetOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractSetOneOfMsg.AbstractSetOneOfCase.ABSTRACT_SET -> org.somda.protosdc.biceps.model.AbstractSetOneOf.ChoiceAbstractSet(map_org_somda_protosdc_proto_model_biceps_AbstractSetMsg(source.abstractSet))
            org.somda.protosdc.proto.model.biceps.AbstractSetOneOfMsg.AbstractSetOneOfCase.ACTIVATE -> org.somda.protosdc.biceps.model.AbstractSetOneOf.ChoiceActivate(map_org_somda_protosdc_proto_model_biceps_ActivateMsg(source.activate))
            org.somda.protosdc.proto.model.biceps.AbstractSetOneOfMsg.AbstractSetOneOfCase.SET_ALERT_STATE -> org.somda.protosdc.biceps.model.AbstractSetOneOf.ChoiceSetAlertState(map_org_somda_protosdc_proto_model_biceps_SetAlertStateMsg(source.setAlertState))
            org.somda.protosdc.proto.model.biceps.AbstractSetOneOfMsg.AbstractSetOneOfCase.SET_COMPONENT_STATE -> org.somda.protosdc.biceps.model.AbstractSetOneOf.ChoiceSetComponentState(map_org_somda_protosdc_proto_model_biceps_SetComponentStateMsg(source.setComponentState))
            org.somda.protosdc.proto.model.biceps.AbstractSetOneOfMsg.AbstractSetOneOfCase.SET_CONTEXT_STATE -> org.somda.protosdc.biceps.model.AbstractSetOneOf.ChoiceSetContextState(map_org_somda_protosdc_proto_model_biceps_SetContextStateMsg(source.setContextState))
            org.somda.protosdc.proto.model.biceps.AbstractSetOneOfMsg.AbstractSetOneOfCase.SET_METRIC_STATE -> org.somda.protosdc.biceps.model.AbstractSetOneOf.ChoiceSetMetricState(map_org_somda_protosdc_proto_model_biceps_SetMetricStateMsg(source.setMetricState))
            org.somda.protosdc.proto.model.biceps.AbstractSetOneOfMsg.AbstractSetOneOfCase.SET_STRING -> org.somda.protosdc.biceps.model.AbstractSetOneOf.ChoiceSetString(map_org_somda_protosdc_proto_model_biceps_SetStringMsg(source.setString))
            org.somda.protosdc.proto.model.biceps.AbstractSetOneOfMsg.AbstractSetOneOfCase.SET_VALUE -> org.somda.protosdc.biceps.model.AbstractSetOneOf.ChoiceSetValue(map_org_somda_protosdc_proto_model_biceps_SetValueMsg(source.setValue))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractReportOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg): org.somda.protosdc.biceps.model.AbstractReportOneOf {
        return when (source.abstractReportOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.ABSTRACT_REPORT -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoiceAbstractReport(map_org_somda_protosdc_proto_model_biceps_AbstractReportMsg(source.abstractReport))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.ABSTRACT_ALERT_REPORT -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoiceAbstractAlertReport(map_org_somda_protosdc_proto_model_biceps_AbstractAlertReportMsg(source.abstractAlertReport))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.ABSTRACT_COMPONENT_REPORT -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoiceAbstractComponentReport(map_org_somda_protosdc_proto_model_biceps_AbstractComponentReportMsg(source.abstractComponentReport))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.ABSTRACT_CONTEXT_REPORT -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoiceAbstractContextReport(map_org_somda_protosdc_proto_model_biceps_AbstractContextReportMsg(source.abstractContextReport))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.ABSTRACT_METRIC_REPORT -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoiceAbstractMetricReport(map_org_somda_protosdc_proto_model_biceps_AbstractMetricReportMsg(source.abstractMetricReport))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.ABSTRACT_OPERATIONAL_STATE_REPORT -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoiceAbstractOperationalStateReport(map_org_somda_protosdc_proto_model_biceps_AbstractOperationalStateReportMsg(source.abstractOperationalStateReport))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.DESCRIPTION_MODIFICATION_REPORT -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoiceDescriptionModificationReport(map_org_somda_protosdc_proto_model_biceps_DescriptionModificationReportMsg(source.descriptionModificationReport))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.EPISODIC_ALERT_REPORT -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoiceEpisodicAlertReport(map_org_somda_protosdc_proto_model_biceps_EpisodicAlertReportMsg(source.episodicAlertReport))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.EPISODIC_COMPONENT_REPORT -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoiceEpisodicComponentReport(map_org_somda_protosdc_proto_model_biceps_EpisodicComponentReportMsg(source.episodicComponentReport))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.EPISODIC_CONTEXT_REPORT -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoiceEpisodicContextReport(map_org_somda_protosdc_proto_model_biceps_EpisodicContextReportMsg(source.episodicContextReport))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.EPISODIC_METRIC_REPORT -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoiceEpisodicMetricReport(map_org_somda_protosdc_proto_model_biceps_EpisodicMetricReportMsg(source.episodicMetricReport))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.EPISODIC_OPERATIONAL_STATE_REPORT -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoiceEpisodicOperationalStateReport(map_org_somda_protosdc_proto_model_biceps_EpisodicOperationalStateReportMsg(source.episodicOperationalStateReport))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.OBSERVED_VALUE_STREAM -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoiceObservedValueStream(map_org_somda_protosdc_proto_model_biceps_ObservedValueStreamMsg(source.observedValueStream))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.OPERATION_INVOKED_REPORT -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoiceOperationInvokedReport(map_org_somda_protosdc_proto_model_biceps_OperationInvokedReportMsg(source.operationInvokedReport))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.PERIODIC_ALERT_REPORT -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoicePeriodicAlertReport(map_org_somda_protosdc_proto_model_biceps_PeriodicAlertReportMsg(source.periodicAlertReport))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.PERIODIC_COMPONENT_REPORT -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoicePeriodicComponentReport(map_org_somda_protosdc_proto_model_biceps_PeriodicComponentReportMsg(source.periodicComponentReport))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.PERIODIC_CONTEXT_REPORT -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoicePeriodicContextReport(map_org_somda_protosdc_proto_model_biceps_PeriodicContextReportMsg(source.periodicContextReport))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.PERIODIC_METRIC_REPORT -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoicePeriodicMetricReport(map_org_somda_protosdc_proto_model_biceps_PeriodicMetricReportMsg(source.periodicMetricReport))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.PERIODIC_OPERATIONAL_STATE_REPORT -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoicePeriodicOperationalStateReport(map_org_somda_protosdc_proto_model_biceps_PeriodicOperationalStateReportMsg(source.periodicOperationalStateReport))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.SYSTEM_ERROR_REPORT -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoiceSystemErrorReport(map_org_somda_protosdc_proto_model_biceps_SystemErrorReportMsg(source.systemErrorReport))
            org.somda.protosdc.proto.model.biceps.AbstractReportOneOfMsg.AbstractReportOneOfCase.WAVEFORM_STREAM -> org.somda.protosdc.biceps.model.AbstractReportOneOf.ChoiceWaveformStream(map_org_somda_protosdc_proto_model_biceps_WaveformStreamMsg(source.waveformStream))
            else -> throw Exception("Unknown enum value $source")
        }
    }
    fun map_org_somda_protosdc_proto_model_biceps_AbstractContextReportOneOfMsg(source: org.somda.protosdc.proto.model.biceps.AbstractContextReportOneOfMsg): org.somda.protosdc.biceps.model.AbstractContextReportOneOf {
        return when (source.abstractContextReportOneOfCase) {
            org.somda.protosdc.proto.model.biceps.AbstractContextReportOneOfMsg.AbstractContextReportOneOfCase.ABSTRACT_CONTEXT_REPORT -> org.somda.protosdc.biceps.model.AbstractContextReportOneOf.ChoiceAbstractContextReport(map_org_somda_protosdc_proto_model_biceps_AbstractContextReportMsg(source.abstractContextReport))
            org.somda.protosdc.proto.model.biceps.AbstractContextReportOneOfMsg.AbstractContextReportOneOfCase.EPISODIC_CONTEXT_REPORT -> org.somda.protosdc.biceps.model.AbstractContextReportOneOf.ChoiceEpisodicContextReport(map_org_somda_protosdc_proto_model_biceps_EpisodicContextReportMsg(source.episodicContextReport))
            org.somda.protosdc.proto.model.biceps.AbstractContextReportOneOfMsg.AbstractContextReportOneOfCase.PERIODIC_CONTEXT_REPORT -> org.somda.protosdc.biceps.model.AbstractContextReportOneOf.ChoicePeriodicContextReport(map_org_somda_protosdc_proto_model_biceps_PeriodicContextReportMsg(source.periodicContextReport))
            else -> throw Exception("Unknown enum value $source")
        }
    }
}
