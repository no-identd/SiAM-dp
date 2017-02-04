/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>History Type Datatype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getHistoryTypeDatatype()
 * @model
 * @generated
 */
public enum HistoryTypeDatatype implements Enumerator {
	/**
	 * The '<em><b>Shallow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHALLOW_VALUE
	 * @generated
	 * @ordered
	 */
	SHALLOW(0, "shallow", "shallow"),

	/**
	 * The '<em><b>Deep</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEEP_VALUE
	 * @generated
	 * @ordered
	 */
	DEEP(1, "deep", "deep");

	/**
	 * The '<em><b>Shallow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shallow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHALLOW
	 * @model name="shallow"
	 * @generated
	 * @ordered
	 */
	public static final int SHALLOW_VALUE = 0;

	/**
	 * The '<em><b>Deep</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deep</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEEP
	 * @model name="deep"
	 * @generated
	 * @ordered
	 */
	public static final int DEEP_VALUE = 1;

	/**
	 * An array of all the '<em><b>History Type Datatype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HistoryTypeDatatype[] VALUES_ARRAY =
		new HistoryTypeDatatype[] {
			SHALLOW,
			DEEP,
		};

	/**
	 * A public read-only list of all the '<em><b>History Type Datatype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HistoryTypeDatatype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>History Type Datatype</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HistoryTypeDatatype get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HistoryTypeDatatype result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>History Type Datatype</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HistoryTypeDatatype getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HistoryTypeDatatype result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>History Type Datatype</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HistoryTypeDatatype get(int value) {
		switch (value) {
			case SHALLOW_VALUE: return SHALLOW;
			case DEEP_VALUE: return DEEP;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private HistoryTypeDatatype(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //HistoryTypeDatatype
