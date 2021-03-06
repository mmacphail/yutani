/*
 * This file is generated by jOOQ.
 */
package eu.macphail.yutani.game.schema.tables.records;


import eu.macphail.yutani.game.schema.tables.Player;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlayerRecord extends UpdatableRecordImpl<PlayerRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 2099783169;

    /**
     * Setter for <code>public.player.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.player.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.player.pseudo</code>.
     */
    public void setPseudo(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.player.pseudo</code>.
     */
    public String getPseudo() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Player.PLAYER.ID;
    }

    @Override
    public Field<String> field2() {
        return Player.PLAYER.PSEUDO;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getPseudo();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getPseudo();
    }

    @Override
    public PlayerRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public PlayerRecord value2(String value) {
        setPseudo(value);
        return this;
    }

    @Override
    public PlayerRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PlayerRecord
     */
    public PlayerRecord() {
        super(Player.PLAYER);
    }

    /**
     * Create a detached, initialised PlayerRecord
     */
    public PlayerRecord(String id, String pseudo) {
        super(Player.PLAYER);

        set(0, id);
        set(1, pseudo);
    }
}
