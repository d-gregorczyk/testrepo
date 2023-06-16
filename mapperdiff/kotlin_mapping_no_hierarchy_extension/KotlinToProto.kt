package org.somda.protosdc.proto.extensions.mapping

class KotlinToProto {
    companion object {

        fun mapProtoDecimalToBigDecimal(value: java.math.BigDecimal): org.somda.protosdc.proto.model.common.Decimal {
            return org.somda.protosdc.proto.model.common.Decimal.newBuilder()
                .setValue(value.unscaledValue().longValueExact())
                .setScale(value.scale())
                .build()
        }

        fun map_org_somda_protosdc_extensions_codedattribute_EquipmentIdentifierType(source: org.somda.protosdc.extensions.codedattribute.EquipmentIdentifierType): org.somda.protosdc.proto.extensions.codedattribute.EquipmentIdentifierTypeMsg {
            val builder = org.somda.protosdc.proto.extensions.codedattribute.EquipmentIdentifierTypeMsg.newBuilder()
            builder.anyURI = source.anyURI
            return builder.build()
        }
        fun map_org_somda_protosdc_extensions_codedattribute_GenderType_EnumType(source: org.somda.protosdc.extensions.codedattribute.GenderType.EnumType): org.somda.protosdc.proto.extensions.codedattribute.GenderTypeMsg.EnumType {
            return when (source) {
                org.somda.protosdc.extensions.codedattribute.GenderType.EnumType.Male -> org.somda.protosdc.proto.extensions.codedattribute.GenderTypeMsg.EnumType.MALE
                org.somda.protosdc.extensions.codedattribute.GenderType.EnumType.Female -> org.somda.protosdc.proto.extensions.codedattribute.GenderTypeMsg.EnumType.FEMALE
                org.somda.protosdc.extensions.codedattribute.GenderType.EnumType.Other -> org.somda.protosdc.proto.extensions.codedattribute.GenderTypeMsg.EnumType.OTHER
                org.somda.protosdc.extensions.codedattribute.GenderType.EnumType.Unknown -> org.somda.protosdc.proto.extensions.codedattribute.GenderTypeMsg.EnumType.UNKNOWN
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_extensions_codedattribute_GenderType(source: org.somda.protosdc.extensions.codedattribute.GenderType): org.somda.protosdc.proto.extensions.codedattribute.GenderTypeMsg {
            val builder = org.somda.protosdc.proto.extensions.codedattribute.GenderTypeMsg.newBuilder()
            builder.enumType = map_org_somda_protosdc_extensions_codedattribute_GenderType_EnumType(source.enumType)
            return builder.build()
        }
        fun map_org_somda_protosdc_extensions_codedattribute_MdcAttributeType(source: org.somda.protosdc.extensions.codedattribute.MdcAttributeType): org.somda.protosdc.proto.extensions.codedattribute.MdcAttributeTypeMsg {
            val builder = org.somda.protosdc.proto.extensions.codedattribute.MdcAttributeTypeMsg.newBuilder()
            builder.codeAttr = org.somda.protosdc.proto.mapping.KotlinToProto.map_org_somda_protosdc_biceps_model_CodeIdentifier(source.codeAttr)
            source.codingSystemAttr?.let { field -> builder.codingSystemAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            source.codingSystemVersionAttr?.let { field -> builder.codingSystemVersionAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToStringValue(field) }
            source.symbolicCodeNameAttr?.let { field -> builder.symbolicCodeNameAttr = org.somda.protosdc.proto.mapping.KotlinToProto.map_org_somda_protosdc_biceps_model_SymbolicCodeName(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_extensions_codedattribute_MdcAttribute(source: org.somda.protosdc.extensions.codedattribute.MdcAttribute): org.somda.protosdc.proto.extensions.codedattribute.MdcAttributeMsg {
            val builder = org.somda.protosdc.proto.extensions.codedattribute.MdcAttributeMsg.newBuilder()
            builder.mdcAttribute = map_org_somda_protosdc_extensions_codedattribute_MdcAttributeType(source.mdcAttribute)
            return builder.build()
        }
        fun map_org_somda_protosdc_extensions_codedattribute_CodedStringAttributeType(source: org.somda.protosdc.extensions.codedattribute.CodedStringAttributeType): org.somda.protosdc.proto.extensions.codedattribute.CodedStringAttributeTypeMsg {
            val builder = org.somda.protosdc.proto.extensions.codedattribute.CodedStringAttributeTypeMsg.newBuilder()
            builder.mdcAttributeElement = map_org_somda_protosdc_extensions_codedattribute_MdcAttribute(source.mdcAttributeElement)
            builder.value = source.value
            return builder.build()
        }
        fun map_org_somda_protosdc_extensions_codedattribute_CodedIntegerAttributeType(source: org.somda.protosdc.extensions.codedattribute.CodedIntegerAttributeType): org.somda.protosdc.proto.extensions.codedattribute.CodedIntegerAttributeTypeMsg {
            val builder = org.somda.protosdc.proto.extensions.codedattribute.CodedIntegerAttributeTypeMsg.newBuilder()
            builder.mdcAttributeElement = map_org_somda_protosdc_extensions_codedattribute_MdcAttribute(source.mdcAttributeElement)
            builder.value = source.value
            return builder.build()
        }
        fun map_org_somda_protosdc_extensions_codedattribute_CodedDecimalAttributeType(source: org.somda.protosdc.extensions.codedattribute.CodedDecimalAttributeType): org.somda.protosdc.proto.extensions.codedattribute.CodedDecimalAttributeTypeMsg {
            val builder = org.somda.protosdc.proto.extensions.codedattribute.CodedDecimalAttributeTypeMsg.newBuilder()
            builder.mdcAttributeElement = map_org_somda_protosdc_extensions_codedattribute_MdcAttribute(source.mdcAttributeElement)
            builder.value = mapProtoDecimalToBigDecimal(source.value)
            return builder.build()
        }
        fun map_org_somda_protosdc_extensions_codedattribute_CodedStringAttribute(source: org.somda.protosdc.extensions.codedattribute.CodedStringAttribute): org.somda.protosdc.proto.extensions.codedattribute.CodedStringAttributeMsg {
            val builder = org.somda.protosdc.proto.extensions.codedattribute.CodedStringAttributeMsg.newBuilder()
            builder.codedStringAttribute = map_org_somda_protosdc_extensions_codedattribute_CodedStringAttributeType(source.codedStringAttribute)
            return builder.build()
        }
        fun map_org_somda_protosdc_extensions_codedattribute_CodedDecimalAttribute(source: org.somda.protosdc.extensions.codedattribute.CodedDecimalAttribute): org.somda.protosdc.proto.extensions.codedattribute.CodedDecimalAttributeMsg {
            val builder = org.somda.protosdc.proto.extensions.codedattribute.CodedDecimalAttributeMsg.newBuilder()
            builder.codedDecimalAttribute = map_org_somda_protosdc_extensions_codedattribute_CodedDecimalAttributeType(source.codedDecimalAttribute)
            return builder.build()
        }
        fun map_org_somda_protosdc_extensions_codedattribute_Gender(source: org.somda.protosdc.extensions.codedattribute.Gender): org.somda.protosdc.proto.extensions.codedattribute.GenderMsg {
            val builder = org.somda.protosdc.proto.extensions.codedattribute.GenderMsg.newBuilder()
            builder.genderType = map_org_somda_protosdc_extensions_codedattribute_GenderType(source.genderType)
            source.mustUnderstandAttr?.let { field -> builder.mustUnderstandAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToBoolValue(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_extensions_codedattribute_CodedIntegerAttribute(source: org.somda.protosdc.extensions.codedattribute.CodedIntegerAttribute): org.somda.protosdc.proto.extensions.codedattribute.CodedIntegerAttributeMsg {
            val builder = org.somda.protosdc.proto.extensions.codedattribute.CodedIntegerAttributeMsg.newBuilder()
            builder.codedIntegerAttribute = map_org_somda_protosdc_extensions_codedattribute_CodedIntegerAttributeType(source.codedIntegerAttribute)
            return builder.build()
        }
        fun map_org_somda_protosdc_extensions_codedattribute_EquipmentIdentifier(source: org.somda.protosdc.extensions.codedattribute.EquipmentIdentifier): org.somda.protosdc.proto.extensions.codedattribute.EquipmentIdentifierMsg {
            val builder = org.somda.protosdc.proto.extensions.codedattribute.EquipmentIdentifierMsg.newBuilder()
            builder.equipmentIdentifierType = map_org_somda_protosdc_extensions_codedattribute_EquipmentIdentifierType(source.equipmentIdentifierType)
            source.mustUnderstandAttr?.let { field -> builder.mustUnderstandAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToBoolValue(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_extensions_codedattribute_CodedAttributesType(source: org.somda.protosdc.extensions.codedattribute.CodedAttributesType): org.somda.protosdc.proto.extensions.codedattribute.CodedAttributesTypeMsg {
            val builder = org.somda.protosdc.proto.extensions.codedattribute.CodedAttributesTypeMsg.newBuilder()
            builder.addAllCodedStringAttributeElement(source.codedStringAttributeElement.map { map_org_somda_protosdc_extensions_codedattribute_CodedStringAttribute(it) }.toList())
            builder.addAllCodedIntegerAttributeElement(source.codedIntegerAttributeElement.map { map_org_somda_protosdc_extensions_codedattribute_CodedIntegerAttribute(it) }.toList())
            builder.addAllCodedDecimalAttributeElement(source.codedDecimalAttributeElement.map { map_org_somda_protosdc_extensions_codedattribute_CodedDecimalAttribute(it) }.toList())
            source.mustUnderstandAttr?.let { field -> builder.mustUnderstandAttr = org.somda.sdc.protosdc.mapping.base.KotlinToProtoBaseTypes.mapToBoolValue(field) }
            return builder.build()
        }
        fun map_org_somda_protosdc_extensions_codedattribute_CodedAttributes(source: org.somda.protosdc.extensions.codedattribute.CodedAttributes): org.somda.protosdc.proto.extensions.codedattribute.CodedAttributesMsg {
            val builder = org.somda.protosdc.proto.extensions.codedattribute.CodedAttributesMsg.newBuilder()
            builder.codedAttributes = map_org_somda_protosdc_extensions_codedattribute_CodedAttributesType(source.codedAttributes)
            return builder.build()
        }
        fun map_org_somda_protosdc_extensions_codedattribute_GenderTypeOneOf(source: org.somda.protosdc.extensions.codedattribute.GenderTypeOneOf): org.somda.protosdc.proto.extensions.codedattribute.GenderTypeOneOfMsg {
            return when (source) {
                is org.somda.protosdc.extensions.codedattribute.GenderTypeOneOf.valueGenderType -> org.somda.protosdc.proto.extensions.codedattribute.GenderTypeOneOfMsg.newBuilder().setGenderType(map_org_somda_protosdc_extensions_codedattribute_GenderType(source.value)).build()
                is org.somda.protosdc.extensions.codedattribute.GenderTypeOneOf.valueGender -> org.somda.protosdc.proto.extensions.codedattribute.GenderTypeOneOfMsg.newBuilder().setGender(map_org_somda_protosdc_extensions_codedattribute_Gender(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
        fun map_org_somda_protosdc_extensions_codedattribute_EquipmentIdentifierTypeOneOf(source: org.somda.protosdc.extensions.codedattribute.EquipmentIdentifierTypeOneOf): org.somda.protosdc.proto.extensions.codedattribute.EquipmentIdentifierTypeOneOfMsg {
            return when (source) {
                is org.somda.protosdc.extensions.codedattribute.EquipmentIdentifierTypeOneOf.valueEquipmentIdentifierType -> org.somda.protosdc.proto.extensions.codedattribute.EquipmentIdentifierTypeOneOfMsg.newBuilder().setEquipmentIdentifierType(map_org_somda_protosdc_extensions_codedattribute_EquipmentIdentifierType(source.value)).build()
                is org.somda.protosdc.extensions.codedattribute.EquipmentIdentifierTypeOneOf.valueEquipmentIdentifier -> org.somda.protosdc.proto.extensions.codedattribute.EquipmentIdentifierTypeOneOfMsg.newBuilder().setEquipmentIdentifier(map_org_somda_protosdc_extensions_codedattribute_EquipmentIdentifier(source.value)).build()
                else -> throw Exception("Unknown enum value $source")
            }
        }
    }
}
