/*
 * This file is generated by jOOQ.
 */
package eu.macphail.yutani.game.schema.tables;


import eu.macphail.yutani.game.schema.Keys;
import eu.macphail.yutani.game.schema.Public;
import eu.macphail.yutani.game.schema.tables.records.GameRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.JSONB;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Game extends TableImpl<GameRecord> {

    private static final long serialVersionUID = 1686809209;

    /**
     * The reference instance of <code>public.game</code>
     */
    public static final Game GAME = new Game();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GameRecord> getRecordType() {
        return GameRecord.class;
    }

    /**
     * The column <code>public.game.id</code>.
     */
    public final TableField<GameRecord, UUID> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.game.data</code>.
     */
    public final TableField<GameRecord, JSONB> DATA = createField(DSL.name("data"), org.jooq.impl.SQLDataType.JSONB.nullable(false), this, "");

    /**
     * The column <code>public.game.creation_date</code>.
     */
    public final TableField<GameRecord, OffsetDateTime> CREATION_DATE = createField(DSL.name("creation_date"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false), this, "");

    /**
     * The column <code>public.game.completed</code>.
     */
    public final TableField<GameRecord, Boolean> COMPLETED = createField(DSL.name("completed"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.game.version</code>.
     */
    public final TableField<GameRecord, String> VERSION = createField(DSL.name("version"), org.jooq.impl.SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * Create a <code>public.game</code> table reference
     */
    public Game() {
        this(DSL.name("game"), null);
    }

    /**
     * Create an aliased <code>public.game</code> table reference
     */
    public Game(String alias) {
        this(DSL.name(alias), GAME);
    }

    /**
     * Create an aliased <code>public.game</code> table reference
     */
    public Game(Name alias) {
        this(alias, GAME);
    }

    private Game(Name alias, Table<GameRecord> aliased) {
        this(alias, aliased, null);
    }

    private Game(Name alias, Table<GameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Game(Table<O> child, ForeignKey<O, GameRecord> key) {
        super(child, key, GAME);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<GameRecord> getPrimaryKey() {
        return Keys.GAME_PK;
    }

    @Override
    public List<UniqueKey<GameRecord>> getKeys() {
        return Arrays.<UniqueKey<GameRecord>>asList(Keys.GAME_PK);
    }

    @Override
    public Game as(String alias) {
        return new Game(DSL.name(alias), this);
    }

    @Override
    public Game as(Name alias) {
        return new Game(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Game rename(String name) {
        return new Game(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Game rename(Name name) {
        return new Game(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<UUID, JSONB, OffsetDateTime, Boolean, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}