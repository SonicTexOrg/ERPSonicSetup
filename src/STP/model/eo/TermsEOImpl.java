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
// ---    Sat Jun 17 10:28:31 PKT 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TermsEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        TermsId,
        TermsDescription,
        TermsDays,
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
    public static final int TERMSID = AttributesEnum.TermsId.index();
    public static final int TERMSDESCRIPTION = AttributesEnum.TermsDescription.index();
    public static final int TERMSDAYS = AttributesEnum.TermsDays.index();
    public static final int ACTIVE = AttributesEnum.Active.index();
    public static final int ENTEREDBY = AttributesEnum.EnteredBy.index();
    public static final int ENTEREDON = AttributesEnum.EnteredOn.index();
    public static final int LASTEDITEDBY = AttributesEnum.LastEditedBy.index();
    public static final int LASTEDITEDON = AttributesEnum.LastEditedOn.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TermsEOImpl() {
    }

    /**
     * Gets the attribute value for TermsId, using the alias name TermsId.
     * @return the value of TermsId
     */
    public Number getTermsId() {
        return (Number) getAttributeInternal(TERMSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TermsId.
     * @param value value to set the TermsId
     */
    public void setTermsId(Number value) {
        setAttributeInternal(TERMSID, value);
    }

    /**
     * Gets the attribute value for TermsDescription, using the alias name TermsDescription.
     * @return the value of TermsDescription
     */
    public String getTermsDescription() {
        return (String) getAttributeInternal(TERMSDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for TermsDescription.
     * @param value value to set the TermsDescription
     */
    public void setTermsDescription(String value) {
        setAttributeInternal(TERMSDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for TermsDays, using the alias name TermsDays.
     * @return the value of TermsDays
     */
    public Number getTermsDays() {
        return (Number) getAttributeInternal(TERMSDAYS);
    }

    /**
     * Sets <code>value</code> as the attribute value for TermsDays.
     * @param value value to set the TermsDays
     */
    public void setTermsDays(Number value) {
        setAttributeInternal(TERMSDAYS, value);
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
     * @param termsId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number termsId) {
        return new Key(new Object[] { termsId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("STP.model.eo.TermsEO");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq = new SequenceImpl("TERMS_S", getDBTransaction());
        setTermsId(seq.getSequenceNumber());

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

