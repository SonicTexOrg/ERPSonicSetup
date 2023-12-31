package STP.model.eo;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jun 10 18:03:53 PKT 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SizesEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        SizeId,
        SizeName,
        SizeDesc,
        Active,
        EnteredBy,
        EnteredOn,
        LastEditedBy,
        LastEditedOn;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int SIZEID = AttributesEnum.SizeId.index();
    public static final int SIZENAME = AttributesEnum.SizeName.index();
    public static final int SIZEDESC = AttributesEnum.SizeDesc.index();
    public static final int ACTIVE = AttributesEnum.Active.index();
    public static final int ENTEREDBY = AttributesEnum.EnteredBy.index();
    public static final int ENTEREDON = AttributesEnum.EnteredOn.index();
    public static final int LASTEDITEDBY = AttributesEnum.LastEditedBy.index();
    public static final int LASTEDITEDON = AttributesEnum.LastEditedOn.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SizesEOImpl() {
    }

    /**
     * Gets the attribute value for SizeId, using the alias name SizeId.
     * @return the value of SizeId
     */
    public Number getSizeId() {
        return (Number) getAttributeInternal(SIZEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SizeId.
     * @param value value to set the SizeId
     */
    public void setSizeId(Number value) {
        setAttributeInternal(SIZEID, value);
    }

    /**
     * Gets the attribute value for SizeName, using the alias name SizeName.
     * @return the value of SizeName
     */
    public String getSizeName() {
        return (String) getAttributeInternal(SIZENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for SizeName.
     * @param value value to set the SizeName
     */
    public void setSizeName(String value) {
        setAttributeInternal(SIZENAME, value);
    }

    /**
     * Gets the attribute value for SizeDesc, using the alias name SizeDesc.
     * @return the value of SizeDesc
     */
    public String getSizeDesc() {
        return (String) getAttributeInternal(SIZEDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for SizeDesc.
     * @param value value to set the SizeDesc
     */
    public void setSizeDesc(String value) {
        setAttributeInternal(SIZEDESC, value);
    }

    /**
     * Gets the attribute value for Active, using the alias name Active.
     * @return the value of Active
     */
    public String getActive() {
        return (String) getAttributeInternal(ACTIVE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Active.
     * @param value value to set the Active
     */
    public void setActive(String value) {
        setAttributeInternal(ACTIVE, value);
    }

    /**
     * Gets the attribute value for EnteredBy, using the alias name EnteredBy.
     * @return the value of EnteredBy
     */
    public Number getEnteredBy() {
        return (Number) getAttributeInternal(ENTEREDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for EnteredBy.
     * @param value value to set the EnteredBy
     */
    public void setEnteredBy(Number value) {
        setAttributeInternal(ENTEREDBY, value);
    }

    /**
     * Gets the attribute value for EnteredOn, using the alias name EnteredOn.
     * @return the value of EnteredOn
     */
    public Date getEnteredOn() {
        return (Date) getAttributeInternal(ENTEREDON);
    }

    /**
     * Sets <code>value</code> as the attribute value for EnteredOn.
     * @param value value to set the EnteredOn
     */
    public void setEnteredOn(Date value) {
        setAttributeInternal(ENTEREDON, value);
    }

    /**
     * Gets the attribute value for LastEditedBy, using the alias name LastEditedBy.
     * @return the value of LastEditedBy
     */
    public Number getLastEditedBy() {
        return (Number) getAttributeInternal(LASTEDITEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastEditedBy.
     * @param value value to set the LastEditedBy
     */
    public void setLastEditedBy(Number value) {
        setAttributeInternal(LASTEDITEDBY, value);
    }

    /**
     * Gets the attribute value for LastEditedOn, using the alias name LastEditedOn.
     * @return the value of LastEditedOn
     */
    public Date getLastEditedOn() {
        return (Date) getAttributeInternal(LASTEDITEDON);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastEditedOn.
     * @param value value to set the LastEditedOn
     */
    public void setLastEditedOn(Date value) {
        setAttributeInternal(LASTEDITEDON, value);
    }

    /**
     * @param sizeId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number sizeId) {
        return new Key(new Object[] { sizeId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("STP.model.eo.SizesEO");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq = new SequenceImpl("SIZES_S", getDBTransaction());
        setSizeId(seq.getSequenceNumber());

    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}

