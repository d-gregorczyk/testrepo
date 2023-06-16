package org.somda.protosdc.proto.extensions.mapping

class ProtoToKotlin {
    companion object {

        fun mapProtoDecimalToBigDecimal(value: org.somda.protosdc.proto.model.common.Decimal): java.math.BigDecimal {
            return java.math.BigDecimal.valueOf(value.value, value.scale)
        }

        fun map_org_somda_protosdc_proto_extensions_codedattribute_EquipmentIdentifierTypeMsg(source: org.somda.protosdc.proto.extensions.codedattribute.EquipmentIdentifierTypeMsg): org.somda.protosdc.extensions.codedattribute.EquipmentIdentifierType {
            return org.somda.protosdc.extensions.codedattribute.EquipmentIdentifierType(
                anyURI = source.anyURI,
            )
        }
        fun map_org_somda_protosdc_proto_extensions_codedattribute_GenderTypeMsg_EnumType(source: org.somda.protosdc.proto.extensions.codedattribute.GenderTypeMsg.EnumType): org.somda.protosdc.extensions.codedattribute.GenderType.EnumType {
            return when (source) {
                org.somda.protosdc.proto.extensions.codedattribute.GenderTypeMsg.EnumType.MALE -> org.somda.protosdc.extensions.codedattribute.GenderType.EnumType.Male
                org.somda.protosdc.proto.extensions.codedattribute.GenderTypeMsg.EnumType.FEMALE -> org.somda.protosdc.extensions.codedattribute.GenderType.EnumType.Female
                org.somda.protosdc.proto.extensions.codedattribute.GenderTypeMsg.EnumType.OTHER -> org.somda.protosdc.extensions.codedattribute.GenderType.EnumType.Other
                org.somda.protosdc.proto.extensions.codedattribute.GenderTypeMsg.EnumType.UNKNOWN -> org.somda.protosdc.extensions.codedattribute.GenderType.EnumType.Unknown
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_proto_extensions_codedattribute_GenderTypeMsg(source: org.somda.protosdc.proto.extensions.codedattribute.GenderTypeMsg): org.somda.protosdc.extensions.codedattribute.GenderType {
            return org.somda.protosdc.extensions.codedattribute.GenderType(
                enumType = map_org_somda_protosdc_proto_extensions_codedattribute_GenderTypeMsg_EnumType(source.enumType),
            )
        }
        fun map_org_somda_protosdc_proto_extensions_codedattribute_MdcAttributeTypeMsg(source: org.somda.protosdc.proto.extensions.codedattribute.MdcAttributeTypeMsg): org.somda.protosdc.extensions.codedattribute.MdcAttributeType {
            return org.somda.protosdc.extensions.codedattribute.MdcAttributeType(
                codeAttr = org.somda.protosdc.proto.mapping.ProtoToKotlin.map_org_somda_protosdc_proto_model_biceps_CodeIdentifierMsg(source.codeAttr),
                codingSystemAttr = when (source.hasCodingSystemAttr()) {
                    true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.codingSystemAttr)
                    false -> null
                },
                codingSystemVersionAttr = when (source.hasCodingSystemVersionAttr()) {
                    true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapStringValue(source.codingSystemVersionAttr)
                    false -> null
                },
                symbolicCodeNameAttr = when (source.hasSymbolicCodeNameAttr()) {
                    true -> org.somda.protosdc.proto.mapping.ProtoToKotlin.map_org_somda_protosdc_proto_model_biceps_SymbolicCodeNameMsg(source.symbolicCodeNameAttr)
                    false -> null
                },
            )
        }
        fun map_org_somda_protosdc_proto_extensions_codedattribute_MdcAttributeMsg(source: org.somda.protosdc.proto.extensions.codedattribute.MdcAttributeMsg): org.somda.protosdc.extensions.codedattribute.MdcAttribute {
            return org.somda.protosdc.extensions.codedattribute.MdcAttribute(
                mdcAttribute = map_org_somda_protosdc_proto_extensions_codedattribute_MdcAttributeTypeMsg(source.mdcAttribute),
            )
        }
        fun map_org_somda_protosdc_proto_extensions_codedattribute_CodedStringAttributeTypeMsg(source: org.somda.protosdc.proto.extensions.codedattribute.CodedStringAttributeTypeMsg): org.somda.protosdc.extensions.codedattribute.CodedStringAttributeType {
            return org.somda.protosdc.extensions.codedattribute.CodedStringAttributeType(
                mdcAttributeElement = map_org_somda_protosdc_proto_extensions_codedattribute_MdcAttributeMsg(source.mdcAttributeElement),
                value = source.value,
            )
        }
        fun map_org_somda_protosdc_proto_extensions_codedattribute_CodedIntegerAttributeTypeMsg(source: org.somda.protosdc.proto.extensions.codedattribute.CodedIntegerAttributeTypeMsg): org.somda.protosdc.extensions.codedattribute.CodedIntegerAttributeType {
            return org.somda.protosdc.extensions.codedattribute.CodedIntegerAttributeType(
                mdcAttributeElement = map_org_somda_protosdc_proto_extensions_codedattribute_MdcAttributeMsg(source.mdcAttributeElement),
                value = source.value,
            )
        }
        fun map_org_somda_protosdc_proto_extensions_codedattribute_CodedDecimalAttributeTypeMsg(source: org.somda.protosdc.proto.extensions.codedattribute.CodedDecimalAttributeTypeMsg): org.somda.protosdc.extensions.codedattribute.CodedDecimalAttributeType {
            return org.somda.protosdc.extensions.codedattribute.CodedDecimalAttributeType(
                mdcAttributeElement = map_org_somda_protosdc_proto_extensions_codedattribute_MdcAttributeMsg(source.mdcAttributeElement),
                value = mapProtoDecimalToBigDecimal(source.value),
            )
        }
        fun map_org_somda_protosdc_proto_extensions_codedattribute_CodedStringAttributeMsg(source: org.somda.protosdc.proto.extensions.codedattribute.CodedStringAttributeMsg): org.somda.protosdc.extensions.codedattribute.CodedStringAttribute {
            return org.somda.protosdc.extensions.codedattribute.CodedStringAttribute(
                codedStringAttribute = map_org_somda_protosdc_proto_extensions_codedattribute_CodedStringAttributeTypeMsg(source.codedStringAttribute),
            )
        }
        fun map_org_somda_protosdc_proto_extensions_codedattribute_CodedDecimalAttributeMsg(source: org.somda.protosdc.proto.extensions.codedattribute.CodedDecimalAttributeMsg): org.somda.protosdc.extensions.codedattribute.CodedDecimalAttribute {
            return org.somda.protosdc.extensions.codedattribute.CodedDecimalAttribute(
                codedDecimalAttribute = map_org_somda_protosdc_proto_extensions_codedattribute_CodedDecimalAttributeTypeMsg(source.codedDecimalAttribute),
            )
        }
        fun map_org_somda_protosdc_proto_extensions_codedattribute_GenderMsg(source: org.somda.protosdc.proto.extensions.codedattribute.GenderMsg): org.somda.protosdc.extensions.codedattribute.Gender {
            return org.somda.protosdc.extensions.codedattribute.Gender(
                genderType = map_org_somda_protosdc_proto_extensions_codedattribute_GenderTypeMsg(source.genderType),
                mustUnderstandAttr = when (source.hasMustUnderstandAttr()) {
                    true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapBoolValue(source.mustUnderstandAttr)
                    false -> null
                },
            )
        }
        fun map_org_somda_protosdc_proto_extensions_codedattribute_CodedIntegerAttributeMsg(source: org.somda.protosdc.proto.extensions.codedattribute.CodedIntegerAttributeMsg): org.somda.protosdc.extensions.codedattribute.CodedIntegerAttribute {
            return org.somda.protosdc.extensions.codedattribute.CodedIntegerAttribute(
                codedIntegerAttribute = map_org_somda_protosdc_proto_extensions_codedattribute_CodedIntegerAttributeTypeMsg(source.codedIntegerAttribute),
            )
        }
        fun map_org_somda_protosdc_proto_extensions_codedattribute_EquipmentIdentifierMsg(source: org.somda.protosdc.proto.extensions.codedattribute.EquipmentIdentifierMsg): org.somda.protosdc.extensions.codedattribute.EquipmentIdentifier {
            return org.somda.protosdc.extensions.codedattribute.EquipmentIdentifier(
                equipmentIdentifierType = map_org_somda_protosdc_proto_extensions_codedattribute_EquipmentIdentifierTypeMsg(source.equipmentIdentifierType),
                mustUnderstandAttr = when (source.hasMustUnderstandAttr()) {
                    true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapBoolValue(source.mustUnderstandAttr)
                    false -> null
                },
            )
        }
        fun map_org_somda_protosdc_proto_extensions_codedattribute_CodedAttributesTypeMsg(source: org.somda.protosdc.proto.extensions.codedattribute.CodedAttributesTypeMsg): org.somda.protosdc.extensions.codedattribute.CodedAttributesType {
            return org.somda.protosdc.extensions.codedattribute.CodedAttributesType(
                codedStringAttributeElement = source.codedStringAttributeElementList.toList().map { map_org_somda_protosdc_proto_extensions_codedattribute_CodedStringAttributeMsg(it) }.toList(),
                codedIntegerAttributeElement = source.codedIntegerAttributeElementList.toList().map { map_org_somda_protosdc_proto_extensions_codedattribute_CodedIntegerAttributeMsg(it) }.toList(),
                codedDecimalAttributeElement = source.codedDecimalAttributeElementList.toList().map { map_org_somda_protosdc_proto_extensions_codedattribute_CodedDecimalAttributeMsg(it) }.toList(),
                mustUnderstandAttr = when (source.hasMustUnderstandAttr()) {
                    true -> org.somda.sdc.protosdc.mapping.base.ProtoToKotlinBaseTypes.mapBoolValue(source.mustUnderstandAttr)
                    false -> null
                },
            )
        }
        fun map_org_somda_protosdc_proto_extensions_codedattribute_CodedAttributesMsg(source: org.somda.protosdc.proto.extensions.codedattribute.CodedAttributesMsg): org.somda.protosdc.extensions.codedattribute.CodedAttributes {
            return org.somda.protosdc.extensions.codedattribute.CodedAttributes(
                codedAttributes = map_org_somda_protosdc_proto_extensions_codedattribute_CodedAttributesTypeMsg(source.codedAttributes),
            )
        }
        fun map_org_somda_protosdc_proto_extensions_codedattribute_GenderTypeOneOfMsg(source: org.somda.protosdc.proto.extensions.codedattribute.GenderTypeOneOfMsg): org.somda.protosdc.extensions.codedattribute.GenderTypeOneOf {
            return when (source.genderTypeOneOfCase) {
                org.somda.protosdc.proto.extensions.codedattribute.GenderTypeOneOfMsg.GenderTypeOneOfCase.GENDER_TYPE -> org.somda.protosdc.extensions.codedattribute.GenderTypeOneOf.ChoiceGenderType(map_org_somda_protosdc_proto_extensions_codedattribute_GenderTypeMsg(source.genderType))
                org.somda.protosdc.proto.extensions.codedattribute.GenderTypeOneOfMsg.GenderTypeOneOfCase.GENDER -> org.somda.protosdc.extensions.codedattribute.GenderTypeOneOf.ChoiceGender(map_org_somda_protosdc_proto_extensions_codedattribute_GenderMsg(source.gender))
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_proto_extensions_codedattribute_EquipmentIdentifierTypeOneOfMsg(source: org.somda.protosdc.proto.extensions.codedattribute.EquipmentIdentifierTypeOneOfMsg): org.somda.protosdc.extensions.codedattribute.EquipmentIdentifierTypeOneOf {
            return when (source.equipmentIdentifierTypeOneOfCase) {
                org.somda.protosdc.proto.extensions.codedattribute.EquipmentIdentifierTypeOneOfMsg.EquipmentIdentifierTypeOneOfCase.EQUIPMENT_IDENTIFIER_TYPE -> org.somda.protosdc.extensions.codedattribute.EquipmentIdentifierTypeOneOf.ChoiceEquipmentIdentifierType(map_org_somda_protosdc_proto_extensions_codedattribute_EquipmentIdentifierTypeMsg(source.equipmentIdentifierType))
                org.somda.protosdc.proto.extensions.codedattribute.EquipmentIdentifierTypeOneOfMsg.EquipmentIdentifierTypeOneOfCase.EQUIPMENT_IDENTIFIER -> org.somda.protosdc.extensions.codedattribute.EquipmentIdentifierTypeOneOf.ChoiceEquipmentIdentifier(map_org_somda_protosdc_proto_extensions_codedattribute_EquipmentIdentifierMsg(source.equipmentIdentifier))
                else -> throw Exception("Unknown enum value $source")
            }
        }
    }
}
