/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.core.model.pattern.impl;

import de.dfki.iui.mmds.core.model.pattern.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import de.dfki.iui.mmds.core.model.pattern.Computation;
import de.dfki.iui.mmds.core.model.pattern.PBooleanRestriction;
import de.dfki.iui.mmds.core.model.pattern.PBooleanRestrictionEnum;
import de.dfki.iui.mmds.core.model.pattern.PByteRestriction;
import de.dfki.iui.mmds.core.model.pattern.PCharRestriction;
import de.dfki.iui.mmds.core.model.pattern.PCharRestrictionEnum;
import de.dfki.iui.mmds.core.model.pattern.PDateRestriction;
import de.dfki.iui.mmds.core.model.pattern.PDoubleRestriction;
import de.dfki.iui.mmds.core.model.pattern.PEmptySlot;
import de.dfki.iui.mmds.core.model.pattern.PEnumRestriction;
import de.dfki.iui.mmds.core.model.pattern.PEnumRestrictionEnum;
import de.dfki.iui.mmds.core.model.pattern.PEnumRestrictionType;
import de.dfki.iui.mmds.core.model.pattern.PFloatRestriction;
import de.dfki.iui.mmds.core.model.pattern.PIntegerRestriction;
import de.dfki.iui.mmds.core.model.pattern.PLongRestriction;
import de.dfki.iui.mmds.core.model.pattern.PNumberRestrictionEnum;
import de.dfki.iui.mmds.core.model.pattern.PObject;
import de.dfki.iui.mmds.core.model.pattern.PQuantorEnum;
import de.dfki.iui.mmds.core.model.pattern.PRestrictions;
import de.dfki.iui.mmds.core.model.pattern.PRestrictionsEnum;
import de.dfki.iui.mmds.core.model.pattern.PShortRestriction;
import de.dfki.iui.mmds.core.model.pattern.PSlot;
import de.dfki.iui.mmds.core.model.pattern.PStringRestriction;
import de.dfki.iui.mmds.core.model.pattern.PStringRestrictionEnum;
import de.dfki.iui.mmds.core.model.pattern.PSubscription;
import de.dfki.iui.mmds.core.model.pattern.PValue;
import de.dfki.iui.mmds.core.model.pattern.PValueObject;
import de.dfki.iui.mmds.core.model.pattern.PatternFactory;
import de.dfki.iui.mmds.core.model.pattern.PatternPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class PatternFactoryImpl extends EFactoryImpl implements PatternFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static PatternFactory init() {
		try {
			PatternFactory thePatternFactory = (PatternFactory)EPackage.Registry.INSTANCE.getEFactory(PatternPackage.eNS_URI);
			if (thePatternFactory != null) {
				return thePatternFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PatternFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public PatternFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PatternPackage.PEMPTY_SLOT: return createPEmptySlot();
			case PatternPackage.PLOGICAL_FORMULA: return createPLogicalFormula();
			case PatternPackage.POBJECT: return createPObject();
			case PatternPackage.PSLOT: return createPSlot();
			case PatternPackage.PSUBSCRIPTION: return createPSubscription();
			case PatternPackage.PVALUE: return createPValue();
			case PatternPackage.PVALUE_OBJECT: return createPValueObject();
			case PatternPackage.PRESTRICTIONS: return createPRestrictions();
			case PatternPackage.PBOOLEAN_RESTRICTION: return createPBooleanRestriction();
			case PatternPackage.PENUM_RESTRICTION: return createPEnumRestriction();
			case PatternPackage.PCHAR_RESTRICTION: return createPCharRestriction();
			case PatternPackage.PSTRING_RESTRICTION: return createPStringRestriction();
			case PatternPackage.PBYTE_RESTRICTION: return createPByteRestriction();
			case PatternPackage.PSHORT_RESTRICTION: return createPShortRestriction();
			case PatternPackage.PINTEGER_RESTRICTION: return createPIntegerRestriction();
			case PatternPackage.PLONG_RESTRICTION: return createPLongRestriction();
			case PatternPackage.PFLOAT_RESTRICTION: return createPFloatRestriction();
			case PatternPackage.PDOUBLE_RESTRICTION: return createPDoubleRestriction();
			case PatternPackage.PDATE_RESTRICTION: return createPDateRestriction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PatternPackage.COMPUTATION:
				return createComputationFromString(eDataType, initialValue);
			case PatternPackage.PBOOLEAN_RESTRICTION_ENUM:
				return createPBooleanRestrictionEnumFromString(eDataType, initialValue);
			case PatternPackage.PNUMBER_RESTRICTION_ENUM:
				return createPNumberRestrictionEnumFromString(eDataType, initialValue);
			case PatternPackage.PENUM_RESTRICTION_ENUM:
				return createPEnumRestrictionEnumFromString(eDataType, initialValue);
			case PatternPackage.PENUM_RESTRICTION_TYPE:
				return createPEnumRestrictionTypeFromString(eDataType, initialValue);
			case PatternPackage.PSTRING_RESTRICTION_ENUM:
				return createPStringRestrictionEnumFromString(eDataType, initialValue);
			case PatternPackage.PCHAR_RESTRICTION_ENUM:
				return createPCharRestrictionEnumFromString(eDataType, initialValue);
			case PatternPackage.PRESTRICTIONS_ENUM:
				return createPRestrictionsEnumFromString(eDataType, initialValue);
			case PatternPackage.PQUANTOR_ENUM:
				return createPQuantorEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PatternPackage.COMPUTATION:
				return convertComputationToString(eDataType, instanceValue);
			case PatternPackage.PBOOLEAN_RESTRICTION_ENUM:
				return convertPBooleanRestrictionEnumToString(eDataType, instanceValue);
			case PatternPackage.PNUMBER_RESTRICTION_ENUM:
				return convertPNumberRestrictionEnumToString(eDataType, instanceValue);
			case PatternPackage.PENUM_RESTRICTION_ENUM:
				return convertPEnumRestrictionEnumToString(eDataType, instanceValue);
			case PatternPackage.PENUM_RESTRICTION_TYPE:
				return convertPEnumRestrictionTypeToString(eDataType, instanceValue);
			case PatternPackage.PSTRING_RESTRICTION_ENUM:
				return convertPStringRestrictionEnumToString(eDataType, instanceValue);
			case PatternPackage.PCHAR_RESTRICTION_ENUM:
				return convertPCharRestrictionEnumToString(eDataType, instanceValue);
			case PatternPackage.PRESTRICTIONS_ENUM:
				return convertPRestrictionsEnumToString(eDataType, instanceValue);
			case PatternPackage.PQUANTOR_ENUM:
				return convertPQuantorEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PEmptySlot createPEmptySlot() {
		PEmptySlotImpl pEmptySlot = new PEmptySlotImpl();
		return pEmptySlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLogicalFormula createPLogicalFormula() {
		PLogicalFormulaImpl pLogicalFormula = new PLogicalFormulaImpl();
		return pLogicalFormula;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PObject createPObject() {
		PObjectImpl pObject = new PObjectImpl();
		return pObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PSlot createPSlot() {
		PSlotImpl pSlot = new PSlotImpl();
		return pSlot;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PValue createPValue() {
		PValueImpl pValue = new PValueImpl();
		return pValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PValueObject createPValueObject() {
		PValueObjectImpl pValueObject = new PValueObjectImpl();
		return pValueObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRestrictions createPRestrictions() {
		PRestrictionsImpl pRestrictions = new PRestrictionsImpl();
		return pRestrictions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PBooleanRestriction createPBooleanRestriction() {
		PBooleanRestrictionImpl pBooleanRestriction = new PBooleanRestrictionImpl();
		return pBooleanRestriction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PEnumRestriction createPEnumRestriction() {
		PEnumRestrictionImpl pEnumRestriction = new PEnumRestrictionImpl();
		return pEnumRestriction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCharRestriction createPCharRestriction() {
		PCharRestrictionImpl pCharRestriction = new PCharRestrictionImpl();
		return pCharRestriction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PStringRestriction createPStringRestriction() {
		PStringRestrictionImpl pStringRestriction = new PStringRestrictionImpl();
		return pStringRestriction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PByteRestriction createPByteRestriction() {
		PByteRestrictionImpl pByteRestriction = new PByteRestrictionImpl();
		return pByteRestriction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PShortRestriction createPShortRestriction() {
		PShortRestrictionImpl pShortRestriction = new PShortRestrictionImpl();
		return pShortRestriction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PDateRestriction createPDateRestriction() {
		PDateRestrictionImpl pDateRestriction = new PDateRestrictionImpl();
		return pDateRestriction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PFloatRestriction createPFloatRestriction() {
		PFloatRestrictionImpl pFloatRestriction = new PFloatRestrictionImpl();
		return pFloatRestriction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PDoubleRestriction createPDoubleRestriction() {
		PDoubleRestrictionImpl pDoubleRestriction = new PDoubleRestrictionImpl();
		return pDoubleRestriction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PLongRestriction createPLongRestriction() {
		PLongRestrictionImpl pLongRestriction = new PLongRestrictionImpl();
		return pLongRestriction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PIntegerRestriction createPIntegerRestriction() {
		PIntegerRestrictionImpl pIntegerRestriction = new PIntegerRestrictionImpl();
		return pIntegerRestriction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PSubscription createPSubscription() {
		PSubscriptionImpl pSubscription = new PSubscriptionImpl();
		return pSubscription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Computation createComputationFromString(EDataType eDataType, String initialValue) {
		Computation result = Computation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComputationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PBooleanRestrictionEnum createPBooleanRestrictionEnumFromString(EDataType eDataType, String initialValue) {
		PBooleanRestrictionEnum result = PBooleanRestrictionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPBooleanRestrictionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PNumberRestrictionEnum createPNumberRestrictionEnumFromString(EDataType eDataType, String initialValue) {
		PNumberRestrictionEnum result = PNumberRestrictionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPNumberRestrictionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PEnumRestrictionEnum createPEnumRestrictionEnumFromString(EDataType eDataType, String initialValue) {
		PEnumRestrictionEnum result = PEnumRestrictionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPEnumRestrictionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PEnumRestrictionType createPEnumRestrictionTypeFromString(EDataType eDataType, String initialValue) {
		PEnumRestrictionType result = PEnumRestrictionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPEnumRestrictionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PStringRestrictionEnum createPStringRestrictionEnumFromString(EDataType eDataType, String initialValue) {
		PStringRestrictionEnum result = PStringRestrictionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPStringRestrictionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PCharRestrictionEnum createPCharRestrictionEnumFromString(EDataType eDataType, String initialValue) {
		PCharRestrictionEnum result = PCharRestrictionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPCharRestrictionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PRestrictionsEnum createPRestrictionsEnumFromString(EDataType eDataType, String initialValue) {
		PRestrictionsEnum result = PRestrictionsEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPRestrictionsEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PQuantorEnum createPQuantorEnumFromString(EDataType eDataType, String initialValue) {
		PQuantorEnum result = PQuantorEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPQuantorEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatternPackage getPatternPackage() {
		return (PatternPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PatternPackage getPackage() {
		return PatternPackage.eINSTANCE;
	}

} // PatternFactoryImpl
